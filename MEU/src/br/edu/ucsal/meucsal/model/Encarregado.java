package br.edu.ucsal.meucsal.model;

public class Encarregado {

	
	private Integer encarregadoId;
	private String nomeEncarregado;
	private String cargo;
	private String login;
	private String senha;
	
	
	public Encarregado(){
		
	}
	
	public Encarregado(String nomeEncarregado, String cargo, String login, String senha){
		this.nomeEncarregado = nomeEncarregado;
		this.cargo = cargo;
		this.login = login;
		this.senha = senha;
	}
	
	
	public Integer getEncarregadoId() {
		return encarregadoId;
	}
	public void setEncarregadoId(Integer encarregadoId) {
		this.encarregadoId = encarregadoId;
	}
	public String getNomeEncarregado() {
		return nomeEncarregado;
	}
	public void setNomeEncarregado(String nomeEncarregado) {
		this.nomeEncarregado = nomeEncarregado;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	

}
