package br.edu.ucsal.meucsal.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

import br.edu.ucsal.meucsal.model.Apresentacao;
import br.edu.ucsal.meucsal.model.Encarregado;
import br.edu.ucsal.meucsal.model.Evento;
import conexao.Conexao;

public class ApresentacaoDAO {
	
	
	private Conexao conexao;
	
	public ApresentacaoDAO(){
		this.conexao = Conexao.getConexao();
		
	}
	
	public void inserir(Apresentacao a) {
		try {
			PreparedStatement stmt = conexao.getConnection()
					.prepareStatement("insert into evento(sinopse,horario,eventoId)VALUES(?,?,?,?)");
			stmt.setString(1, a.getSinopse());
			stmt.setTime(2, Time.valueOf(a.getHorario()));
			stmt.setInt(3, a.getEvento().getEventoId());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
	
	public List<Apresentacao> listar() {
		Statement stmt;
		List<Apresentacao> apresentacoes = new ArrayList<>();
		try {
			stmt = conexao.getConnection().createStatement();
			ResultSet rs = stmt.executeQuery(
					"select apresId, apresentacao.sinopse,apresentacao.horario, evento.eventoId, evento.nome,evento.data,evento.tema, encarregado.encarregadoId, encarregado.nome,encarregado.cargo,encarregado.login,encarregado.senha from apresentacao,evento,encarregado where apresentacao.eventoId = evento.eventoId and evento.encarregadoId = encarregado.encarregadoId");
			while (rs.next()) {
					
				Apresentacao a = new Apresentacao();
				a.setApresId(rs.getInt("apresId"));
				a.setSinopse(rs.getString("sinopse"));
				a.setHorario(rs.getTime("horario").toLocalTime());
				
				Evento evt = new Evento();
				evt.setEventoId(rs.getInt("eventoId"));
				evt.setNomeEvento(rs.getString("nome"));
				evt.setData(rs.getDate("data").toLocalDate());
				evt.setTema(rs.getString("tema"));

				Encarregado enc = new Encarregado();
				enc.setEncarregadoId(rs.getInt("encarregadoId"));
				enc.setNomeEncarregado(rs.getString("nome"));
				enc.setCargo(rs.getString("cargo"));
				enc.setLogin(rs.getString("login"));
				enc.setSenha(rs.getString("senha"));
				
				evt.setEnc(enc);
				a.setEvento(evt);
				
				
				apresentacoes.add(a);
			}
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return apresentacoes ;
	}

	
	
	
	
	
	
	

}
