package br.edu.ucsal.meucsal.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import br.edu.ucsal.meucsal.model.Espaco;
import conexao.Conexao;

public class EspacoDAO {	
	Connection con = Conexao.getConnection();
	public EspacoDAO() {
		
	}	
	public void inserir(Espaco e1) {
		try {			
			PreparedStatement stmt = con.prepareStatement("insert into espaco(nome, capMax,local)VALUES(?,?,?)");
			stmt.setString(1, e1.getNome());
			stmt.setInt(2, e1.getCapacidadeMax());
			stmt.setString(3, e1.getLocal());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
	
	 