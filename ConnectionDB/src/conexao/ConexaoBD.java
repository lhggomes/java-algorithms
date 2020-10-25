package conexao;

import java.sql.*;

public class ConexaoBD {
	private static Connection con = null;
	private ConexaoBD() {}
	
	public static Connection getConexao() {
		try {
			if ( con == null ) {
			    Class.forName("com.mysql.jdbc.Driver");
			    con = DriverManager.getConnection("jdbc:mysql://localhost/agenda?useTimezone=true&serverTimezone=UTC", "root", "");
			}
		}
		catch(SQLException e) {
			System.out.println("Erro de conex�o com o banco");
			System.exit(1);
		}
		catch(ClassNotFoundException e) {
			System.out.println("Erro: driver do banco n�o encontrado");
			System.exit(1);
		}
		return con;
	}
}
