package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;

import org.apache.tomcat.dbcp.dbcp2.ConnectionFactory;

import com.sun.istack.internal.logging.Logger;


public class Conexao {
	
	 	private static String driver = "org.postgresql.Driver";
	    private static String url = "jdbc:postgresql://localhost:5432/dbmercadinho";
	    private static String user = "root";
	    private static String pass = "";
	

	public static Connection getConnection(){
		try{
			Class.forName(driver);
			return DriverManager.getConnection(url, user, pass);
		}catch (ClassNotFoundException | SQLException ex){
			throw new RuntimeException("Erro na conexão: ", ex);
		}
	}
	
	public static void closeConnection(Connection con){
		try{
			if(con!=null){
				con.close();
			}
		}catch(SQLException ex){
            Logger.getLogger(ConnectionFactory.class.getName(), null).log(Level.SEVERE, null, ex);
	}
}
}
