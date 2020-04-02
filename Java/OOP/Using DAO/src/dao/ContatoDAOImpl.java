package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import conexao.ConexaoBD;
import javax.swing.JOptionPane;
import model.Contato;

public class ContatoDAOImpl implements ContatoDAO {

    @Override
    public Contato obtemContatoPorID(int id) {
        Connection c = ConexaoBD.getConexao();
        Contato con = null;
        try {
            Statement stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM contato WHERE id=" + id + ";");
            if (rs.next()) {
                con = new Contato(rs.getInt("id"), rs.getString("nome"), rs.getString("telefone"));
            }
        } catch (SQLException e) {
            System.out.println("Erro na consulta");
            System.exit(1);
        }
        return con;
    }

    @Override
    public void gravaContato(Contato c) {
        Connection conn = ConexaoBD.getConexao();
        try {
            Statement stmt = conn.createStatement();
            if (obtemContatoPorID(c.getId()) == null) {
                // contato n�o existe ==> inserir na tabela
                stmt.executeUpdate("INSERT INTO contato VALUES (" + c.getId() + ",'" + c.getNome() + "','" + c.getTelefone() + "');");
            } else {
                // contato j� existe ==> atualizar na tabela
                stmt.executeUpdate("UPDATE contato SET nome='" + c.getNome() + "', telefone='" + c.getTelefone() + "' WHERE id=" + c.getId() + ";");
            }
        } catch (SQLException e) {
            System.out.println("Erro na consulta");
            System.exit(1);
        }
    }

    @Override
    public Collection<Contato> obtemTodosContatos() {
        Connection c = ConexaoBD.getConexao();
        List<Contato> contatos = new LinkedList<Contato>();
        try {
            Statement stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM contato ORDER BY id;");
            while (rs.next()) {
                contatos.add(new Contato(rs.getInt("id"), rs.getString("nome"), rs.getString("telefone")));
            }
        } catch (SQLException e) {
            System.out.println("Erro na consulta");
            System.exit(1);
        }
        return contatos;
    }

    @Override
    public void apagaContato(Contato c) {

        try {
            Connection conn = ConexaoBD.getConexao();
            Statement stmt = conn.createStatement();
            stmt.executeUpdate("DELETE FROM contato WHERE id=" + c.getId() + ";");

        } catch(SQLException e){
            System.out.println("Erro na consulta");
            System.exit(1);
        }
    }

}
