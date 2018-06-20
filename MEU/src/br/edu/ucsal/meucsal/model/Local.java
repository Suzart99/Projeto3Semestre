package br.edu.ucsal.meucsal.model;

public class Local {
	
	
	private Integer localId;
	private String campus;
	private String andar;
	private String bloco;
	
	
	public Local() {
	}
	
	public Local(String campus, String andar, String bloco) {
		this.campus = campus;
		this.andar = andar;
		this.bloco = bloco;
	}
	
	public Integer getLocalId() {
		return localId;
	}
	public void setLocalId(Integer localId) {
		this.localId = localId;
	}
	public String getCampus() {
		return campus;
	}
	public void setCampus(String campus) {
		this.campus = campus;
	}
	public String getAndar() {
		return andar;
	}
	public void setAndar(String andar) {
		this.andar = andar;
	}
	public String getBloco() {
		return bloco;
	}
	public void setBloco(String bloco) {
		this.bloco = bloco;
	}	
	

}
