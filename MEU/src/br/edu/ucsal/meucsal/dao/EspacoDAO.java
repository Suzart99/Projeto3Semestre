package br.edu.ucsal.meucsal.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import br.edu.ucsal.meucsal.model.Encarregado;
import br.edu.ucsal.meucsal.model.Espaco;
import br.edu.ucsal.meucsal.model.Evento;
import br.edu.ucsal.meucsal.model.Local;
import conexao.Conexao;

public class EspacoDAO {	

	private Conexao conexao;
	
	public EspacoDAO() {
		this.conexao = Conexao.getConexao();
	}
	
	
	public void inserir(Espaco e1) {
		try {			
			PreparedStatement stmt = conexao.getConnection().prepareStatement("insert into espaco(nome,capMax,status,localId,eventoId)VALUES(?,?,?,?,?)");
			stmt.setString(1, e1.getNomeEspaco());
			stmt.setInt(2, e1.getCapacidadeMax());
			stmt.setBoolean(3, false);
			stmt.setInt(4, e1.getLocal().getLocalId());
			stmt.setInt(5, e1.getEvento().getEventoId());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
	
	public List<Espaco> listar() {
		Statement stmt;
		List<Espaco> espacos = new ArrayList<>();
		try {
			stmt = conexao.getConnection().createStatement();
			ResultSet rs = stmt.executeQuery("select espacoId, espaco.nome, capMax, status, local.localId, local.campus, local.andar, local.bloco, evento.eventoId, evento.nome, evento.data, evento.tema, evento.encarregadoId where espaco.espacoId = local.espacoId and espaco.espacoId = evento.espacoId");
			while(rs.next()) {
				
				Espaco e = new Espaco();
				e.setEspacoId(rs.getInt("espacoId"));
				e.setNomeEspaco(rs.getString("nome"));
				e.setCapacidadeMax(rs.getInt("capMax"));
				e.setStatus(rs.getBoolean("status"));
				
				Evento evt = new Evento();
				evt.setNomeEvento(rs.getString("nome"));
				evt.setData(rs.getDate("dataEvt").toLocalDate());
				evt.setTema(rs.getString("tema"));
				Encarregado enc = new Encarregado();
				enc.setNomeEncarregado(rs.getString("nome"));
				enc.setCargo(rs.getString("cargo"));
				enc.setLogin(rs.getString("login"));
				enc.setSenha(rs.getString("senha"));
				evt.setEnc(enc);
		
				Local l1 = new Local();
				l1.setLocalId(rs.getInt("localId"));
				l1.setCampus(rs.getString("campus"));
				l1.setBloco(rs.getString("bloco"));	
				
				e.setEvento(evt);
				e.setLocal(l1);
				
				espacos.add(e);
			}
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	
		return espacos;
	}
	
	public Espaco getByID(int id) {
		Espaco esp = null;
		try {
			PreparedStatement ps = conexao.getConnection().prepareStatement("select nome,capMax,status from espaco where espacoId=?");
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				esp = new Espaco();
				esp.setEspacoId(id);
				esp.setNomeEspaco(rs.getString("nome"));
				esp.setCapacidadeMax(rs.getInt("capMax"));
				esp.setStatus(rs.getBoolean("status"));				
				
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return esp;
	}
	
	public void delete(int id) {
		PreparedStatement pstmt;
		try {
			pstmt = conexao.getConnection().prepareStatement("delete from espaco where espacoId=?");
			pstmt.setInt(1, id);
			pstmt.execute();
			pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
}
	
	public void update(Espaco e1) {
		try {
			
			PreparedStatement pstmt = conexao.getConnection()
					.prepareStatement("update espaco set nome=?,capMax = ? where espacoId =?");
			pstmt.setString(1, e1.getNomeEspaco());
			pstmt.setInt(2, e1.getCapacidadeMax());
			pstmt.setInt(3, e1.getEspacoId());
			pstmt.executeUpdate();
			pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
Integer  x;
}
	
	 