package br.edu.ucsal.meucsal.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import br.edu.ucsal.meucsal.model.Encarregado;
import conexao.Conexao;

public class EncarregadoDAO {
	
	
	private Conexao conexao;
	
	public EncarregadoDAO(){
		this.conexao = Conexao.getConexao();
		
	}
	
	public void inserir(Encarregado enc1) {
		try {			
			PreparedStatement stmt = conexao.getConnection().prepareStatement("insert into encarregado(nomeenc,cargo,login,senha)VALUES(?,?,?,?)");
			stmt.setString(1, enc1.getNomeEncarregado());
			stmt.setString(2, enc1.getCargo());
			stmt.setString(3, enc1.getLogin());
			stmt.setString(4, enc1.getSenha());		
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
	
	public List<Encarregado> listar() {
		Statement stmt;
		List<Encarregado> encarregados = new ArrayList<>();
		try {
			stmt = conexao.getConnection().createStatement();
			ResultSet rs = stmt.executeQuery("select encarregadoId, nomeenc ,cargo,login,senha from encarregado");
			while(rs.next()) {
				Encarregado e = new Encarregado();
				e.setEncarregadoId(rs.getInt("encarregadoId"));
				e.setNomeEncarregado(rs.getString("nomeenc"));
				e.setCargo(rs.getString("cargo"));
				e.setLogin(rs.getString("login"));
				e.setSenha(rs.getString("senha"));
				encarregados.add(e);
			}
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	
		return encarregados;
	}
	
	public Encarregado getByID(int id) {
		Encarregado enc= null;
		try {
			PreparedStatement ps = conexao.getConnection().prepareStatement("select nomeenc,cargo,login,senha from encarregado where encarregadoId=?");
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				enc= new Encarregado ();
				enc.setEncarregadoId(id);
				enc.setNomeEncarregado(rs.getString("nomeenc"));
				enc.setCargo(rs.getString("cargo"));		
				enc.setLogin(rs.getString("login"));
				enc.setSenha(rs.getString("senha"));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return enc;
	}
	
	public void delete(int id) {
		PreparedStatement pstmt;
		try {
			pstmt = conexao.getConnection().prepareStatement("delete from encarregado where encarregadoId=?");
			pstmt.setInt(1, id);
			pstmt.execute();
			pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
}

	public void update(Encarregado enc) {
		try {
			
			PreparedStatement pstmt = conexao.getConnection()
					.prepareStatement("update encarregado set nomeEnc=?,cargo=?, login=?, senha=? where encarregadoId =?");
			pstmt.setString(1, enc.getNomeEncarregado());
			pstmt.setString(2, enc.getCargo());
			pstmt.setString(3, enc.getLogin());
			pstmt.setString(4, enc.getSenha());
			pstmt.setInt(5, enc.getEncarregadoId());
			pstmt.executeUpdate();
			pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
