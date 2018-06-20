package br.edu.ucsal.meucsal.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import conexao.Conexao;

public class LoginDAO {
	
	
	private Conexao conexao;

	
	public LoginDAO(){
		this.conexao = Conexao.getConexao();
		
	}
	
	
	public boolean validar(String login, String senha){
		PreparedStatement stmt;
		try{
			stmt = conexao.getConnection().prepareStatement("select * from usuario where login=? and senha=?");
			stmt.setString(1, login);
			stmt.setString(2, senha);
			ResultSet rs = stmt.executeQuery();
			if(rs.next()){
				return true;
			}
			
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	
		
	}

}
