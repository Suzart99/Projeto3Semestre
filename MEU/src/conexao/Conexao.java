package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class Conexao {
	
	private Connection connection = null;
	private static Conexao conexao;
	
	
 	private static String driver = "org.postgresql.Driver";
    private static String url = "jdbc:postgresql://localhost:6543/dbtrab";
    private static String user = "postgres";
    private static String pass = "postgresql";
	
	static {
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
		private Conexao() {
			try {
				connection = DriverManager.getConnection(url,user,pass);
			} catch (SQLException e) {
				System.out.println("Erro ao conectar com o banco: "+e.getMessage());
				e.printStackTrace();
			}
		}
		
		public Connection getConnection() {
			return connection;
		}
		
		public static  Conexao getConexao() {
			if(conexao == null) {
				conexao = new Conexao();
			}
			return conexao;
		}
		
		
		public void closeConnection() {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
}
