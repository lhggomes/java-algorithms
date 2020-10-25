package projetolivro;

public class ProjetoLivro {

    public static void main(String[] args) {

        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];

        p[0] = new Pessoa("Lucas", 20, "M");
        p[1] = new Pessoa("Fernada", 27, "F");

        l[0] = new Livro("Aprendendo POO", "Lucas H. Gomes", 300, p[1]);
        l[1] = new Livro("Python", "Gustavo Fernandes", 500, p[1]);
        l[2] = new Livro("Principios do C#", "Mario Quintana", 300, p[0]);
        
        System.out.println(l[0].detalhes());

    }

}
