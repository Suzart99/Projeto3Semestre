package br.edu.ucsal.meucsal.model;

public class Orador {
	
	private Integer oradorId;
	private String nomeOrador;
	private String grauInstrucao;
	private Apresentacao apres;
	
	public Integer getOradorId() {
		return oradorId;
	}
	public void setOradorId(Integer oradorId) {
		this.oradorId = oradorId;
	}
	public String getNomeOrador() {
		return nomeOrador;
	}
	public void setNomeOrador(String nomeOrador) {
		this.nomeOrador = nomeOrador;
	}
	public String getGrauInstrucao() {
		return grauInstrucao;
	}
	public void setGrauInstrucao(String grauInstrucao) {
		this.grauInstrucao = grauInstrucao;
	}
	public Apresentacao getApres() {
		return apres;
	}
	public void setApres(Apresentacao apres) {
		this.apres = apres;
	}
	
	

}
