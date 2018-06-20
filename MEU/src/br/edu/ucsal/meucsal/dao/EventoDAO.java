package br.edu.ucsal.meucsal.dao;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import br.edu.ucsal.meucsal.model.Encarregado;
import br.edu.ucsal.meucsal.model.Evento;
import conexao.Conexao;

public class EventoDAO {

	private Conexao conexao;

	public EventoDAO() {
		this.conexao = Conexao.getConexao();
	}

	public void inserir(Evento evt1) {
		try {
			PreparedStatement stmt = conexao.getConnection()
					.prepareStatement("insert into evento(nome,data,tema,encarregadoId)VALUES(?,?,?,?)");
			stmt.setString(1, evt1.getNomeEvento());
			stmt.setDate(2, Date.valueOf(evt1.getData()));
			stmt.setString(3, evt1.getNomeEvento());
			stmt.setInt(4, evt1.getEnc().getEncarregadoId());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public List<Evento> listar() {
		Statement stmt;
		List<Evento> eventos = new ArrayList<>();
		try {
			stmt = conexao.getConnection().createStatement();
			ResultSet rs = stmt.executeQuery(
					"select eventoId, evento.nome,data,tema, encarregado.encarregadoId, encarregado.nome,encarregado.cargo,encarregado.login,encarregado.senha from evento,encarregado where evento.encarregadoId = encarregado.encarregadoId");
			while (rs.next()) {
				
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
				
				eventos.add(evt);
			}
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return eventos;
	}

	public Evento getByID(int id) {
		Evento evt= null;
		try {
			PreparedStatement ps = conexao.getConnection().prepareStatement("select nome,data,tema,encarregadoId from local where localId=?");
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
			    	evt = new Evento();
				evt.setNomeEvento(rs.getString("nome"));
				evt.setData(rs.getDate("data").toLocalDate());
				evt.setTema(rs.getString("tema"));

				Encarregado enc = new Encarregado ();
				enc.setEncarregadoId(rs.getInt("encarregadoId "));
				
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return evt;
	}
	
	public void delete(int id) {
	PreparedStatement pstmt;
	try {
		pstmt = conexao.getConnection().prepareStatement("delete from evento where eventoId=?");
		pstmt.setInt(1, id);
		pstmt.execute();
		pstmt.close();
	} catch (SQLException e) {
		e.printStackTrace();
	}
	
	
	
}

	
}
