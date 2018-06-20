package br.edu.ucsal.meucsal.model;

import java.time.LocalTime;

public class Apresentacao {
	
	private Integer apresId;
	private String sinopse;
	private LocalTime horario;
	private Evento evento;
	public Integer getApresId() {
		return apresId;
	}
	public void setApresId(Integer apresId) {
		this.apresId = apresId;
	}
	public String getSinopse() {
		return sinopse;
	}
	public void setSinopse(String sinopse) {
		this.sinopse = sinopse;
	}
	public LocalTime getHorario() {
		return horario;
	}
	public void setHorario(LocalTime horario) {
		this.horario = horario;
	}
	public Evento getEvento() {
		return evento;
	}
	public void setEvento(Evento evento) {
		this.evento = evento;
	}
	
	
	

	

}
