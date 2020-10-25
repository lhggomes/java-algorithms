

package View;

import entity.Pessoa;
import entity.Telefone;
import java.util.Collection;
import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Principal {  
    public static void main(String [] args) {
        EntityManagerFactory fabrica;
        fabrica = Persistence.createEntityManagerFactory("ex2jpaA06162911PU");
        EntityManager gerenciadorEntidades = fabrica.createEntityManager();

        String nome, telefone;
        long id;
        Scanner scn = new Scanner(System.in);

        Collection<Pessoa> todosContatos;
        todosContatos = gerenciadorEntidades.createNamedQuery("Pessoa.findAll").getResultList();

        System.out.println("CONTATOS ARMAZENADOS:\n");
        for(Pessoa pess:todosContatos) {
            System.out.println(pess.getId()+ "\t"+ pess.getNome());
            for(Telefone tel:pess.getTelefones()) {
                System.out.println("\t"+tel.getTelefone());
            }
        }

        Pessoa p = new Pessoa();
        System.out.println("\nInserir novo contato");
        System.out.print("Digite o id do contato (valor inteiro):");
        id = Integer.valueOf(scn.next());
        p.setId(id);
        System.out.print("Digite o nome do contato (somente primeiro nome):");
        nome = scn.next();
        p.setNome(nome);
        System.out.print("Digite o telefone do contato (sem espaços em branco - FIM para parar):");
        telefone = scn.next();
        while ( ! telefone.equals("FIM") ) {
            p.getTelefones().add(new Telefone(telefone));
                System.out.print("Digite o telefone do contato (sem espaços em branco - FIM para parar):");
                telefone = scn.next();
        }
        
        try {                
            gerenciadorEntidades.getTransaction().begin(); 
            gerenciadorEntidades.persist(p);
            gerenciadorEntidades.getTransaction().commit();           
        } catch(Exception exc) {
            System.out.println("Erro ao persistir objeto" + exc.toString());
        } finally {
            gerenciadorEntidades.close();
        }        
    }
}
