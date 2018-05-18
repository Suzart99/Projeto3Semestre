package br.edu.ucsal.meucsal.model;

public class Espaco {

	private Integer id;
	private String nome;
	private Integer capacidadeMax;
	private String local;
	private Boolean ocupado;

	public Espaco() {

	}
	
	

	public Espaco(String nome, Integer capacidadeMax, String local) {
		this.nome = nome;
		this.capacidadeMax = capacidadeMax;
		this.local = local;
	}



	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getCapacidadeMax() {
		return capacidadeMax;
	}

	public void setCapacidadeMax(Integer capacidadeMax) {
		this.capacidadeMax = capacidadeMax;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public Boolean getOcupado() {
		return ocupado;
	}

	public void setOcupado(Boolean ocupado) {
		this.ocupado = ocupado;
	}

}
