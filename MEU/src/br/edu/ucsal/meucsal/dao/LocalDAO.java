package br.edu.ucsal.meucsal.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


import br.edu.ucsal.meucsal.model.Local;
import conexao.Conexao;

public class LocalDAO {
	
	
	private Conexao conexao;
	
	public LocalDAO(){
		this.conexao = Conexao.getConexao();
		
	}
	
	public void inserir(Local l1) {
		try {			
			PreparedStatement stmt = conexao.getConnection().prepareStatement("insert into local(campus,andar,bloco)VALUES(?,?,?)");
			stmt.setString(1, l1.getCampus());
			stmt.setString(2, l1.getAndar());
			stmt.setString(3, l1.getBloco());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public List<Local> listar() {
		Statement stmt;
		List<Local> locais = new ArrayList<>();
		try {
			stmt = conexao.getConnection().createStatement();
			ResultSet rs = stmt.executeQuery("select localid,campus,andar,bloco from local");
			while(rs.next()) {
				
				Local l1 = new Local();
				l1.setLocalId(rs.getInt("localId"));
				l1.setCampus(rs.getString("campus"));
				l1.setBloco(rs.getString("bloco"));			
				locais.add(l1);
			}
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	
		return locais;
	}
	
	public Local getByID(int id) {
		Local local= null;
		try {
			PreparedStatement ps = conexao.getConnection().prepareStatement("select localId,campus,andar,bloco from local where localId=?");
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
			    local= new Local();
			    local.setLocalId(id);
				local.setLocalId(rs.getInt("localId"));
				local.setCampus(rs.getString("campus"));
				local.setBloco(rs.getString("bloco"));		
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return local;
	}

	public void update(Local l) {
		try {
			
			PreparedStatement pstmt = conexao.getConnection()
					.prepareStatement("update local set campus=?,andar =?, bloco=? where localId =?");
			pstmt.setString(1, l.getCampus());
			pstmt.setString(2, l.getAndar());
			pstmt.setString(3, l.getBloco());
			pstmt.setInt(4, l.getLocalId());
			pstmt.executeUpdate();
			pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
	
	public void delete(int id) {
		PreparedStatement pstmt;
		try {
			pstmt = conexao.getConnection().prepareStatement("delete from local where localId=?");
			pstmt.setInt(1, id);
			pstmt.execute();
			pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
}
}
