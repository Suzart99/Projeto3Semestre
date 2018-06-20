package br.edu.ucsal.meucsal.model;

public class Espaco {

	private Integer espacoId;
	private String nomeEspaco;
	private Integer capacidadeMax;
	private Boolean status;
	private Local local;
	private Evento evento;
	
	
	public Espaco(){
	
	}
	
	public Espaco(String nome, Integer capacidadeMax){
		this.nomeEspaco = nome;
		this.capacidadeMax = capacidadeMax;
	}
	
	public Integer getEspacoId() {
		return espacoId;
	}
	public void setEspacoId(Integer espacoId) {
		this.espacoId = espacoId;
	}
	public String getNomeEspaco() {
		return nomeEspaco;
	}
	public void setNomeEspaco(String nome) {
		this.nomeEspaco = nome;
	}
	public Integer getCapacidadeMax() {
		return capacidadeMax;
	}
	public void setCapacidadeMax(Integer capacidadeMax) {
		this.capacidadeMax = capacidadeMax;
	}
	public Boolean getStatus() {
		return status;
	}
	public void setStatus(Boolean status) {
		this.status = status;
	}

	public Local getLocal() {
		return local;
	}

	public void setLocal(Local local) {
		this.local = local;
	}

	public Evento getEvento() {
		return evento;
	}

	public void setEvento(Evento evento) {
		this.evento = evento;
	}

	
	
	
}
