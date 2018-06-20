package br.edu.ucsal.meucsal.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import br.edu.ucsal.meucsal.model.Orador;
import conexao.Conexao;

public class OradorDAO {
	
	private Conexao conexao;
	
	public OradorDAO(){
		this.conexao = Conexao.getConexao();
	}

	public void inserir(Orador o) {
		try {			
			PreparedStatement stmt = conexao.getConnection().prepareStatement("insert into orador(nome,grauInstrucao,apresId)VALUES(?,?)");
			stmt.setString(1, o.getNomeOrador());
			stmt.setString(2, o.getGrauInstrucao());
			stmt.setInt(3, o.getApres().getApresId());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
	
	public List<Orador> listar() {
		Statement stmt;
		List<Orador> oradores = new ArrayList<>();
		try {
			stmt = conexao.getConnection().createStatement();
			ResultSet rs = stmt.executeQuery("select oradorId, nome,grauInstrucao from orador");
			while(rs.next()) {
				Orador o = new Orador ();
				o.setOradorId(rs.getInt("oradorId"));
				o.setNomeOrador(rs.getString("nome"));
				o.setGrauInstrucao(rs.getString("grauInstrucao"));
				oradores.add(o);
			}
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	
		return oradores;
	}
}
