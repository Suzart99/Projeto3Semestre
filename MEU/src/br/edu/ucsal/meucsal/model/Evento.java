package br.edu.ucsal.meucsal.model;

import java.time.LocalDate;

public class Evento {

	private Integer eventoId;
	private String nomeEvento;
	private LocalDate data;
	private String tema;
	private Encarregado enc;

	
	public Evento() {

	}
	
	public Evento(String nomeEvento, LocalDate data, String tema, Encarregado enc) {
		this.nomeEvento = nomeEvento;
		this.data = data;
		this.tema = tema;
		this.enc = enc;
	}
	
	public Integer getEventoId() {
		return eventoId;
	}
	public void setEventoId(Integer eventoId) {
		this.eventoId = eventoId;
	}
	public String getNomeEvento() {
		return nomeEvento;
	}
	public void setNomeEvento(String nomeEvento) {
		this.nomeEvento = nomeEvento;
	}
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	public String getTema() {
		return tema;
	}
	public void setTema(String tema) {
		this.tema = tema;
	}
	public Encarregado getEnc() {
		return enc;
	}
	public void setEnc(Encarregado enc) {
		this.enc = enc;
	}
	
	
	

	
	
}
