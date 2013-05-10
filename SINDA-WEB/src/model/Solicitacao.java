package model;

public class Solicitacao {
	
	private String nome_fisico;
	private String nome_juridico; 
	private String endereco;
	private int telefone; 
	private String email;
	private String finalidade;
	private int id_pcd; 
	private String sensor;
	private String periodo_inicio;
	private String periodo_fim;
	private String login;
	private String senha;
	private boolean selecionado;
	
	public Solicitacao(){
		
	}

	public Solicitacao(String nome_fisico, String nome_juridico, String endereco,
			int telefone, String email, String finalidade, int id_pcd,
			String sensores, String periodo_inicio, String periodo_fim,
			String login, String senha, boolean selecionado) {
		super();
		this.nome_fisico = nome_fisico;
		this.nome_juridico = nome_juridico;
		this.endereco = endereco;
		this.telefone = telefone;
		this.email = email;
		this.finalidade = finalidade;
		this.id_pcd = id_pcd;
		this.sensor = sensores;
		this.periodo_inicio = periodo_inicio;
		this.periodo_fim = periodo_fim;
		this.login = login;
		this.senha = senha;
		this.selecionado = selecionado;
	}

	public String getNome_fisico() {
		return nome_fisico;
	}

	public String getNome_juridico() {
		return nome_juridico;
	}

	public String getEndereco() {
		return endereco;
	}

	public int getTelefone() {
		return telefone;
	}

	public String getEmail() {
		return email;
	}

	public String getFinalidade() {
		return finalidade;
	}

	public int getID_PCD() {
		return id_pcd;
	}

	public String getSensores() {
		return sensor;
	}

	public String getPeriodo_inicio() {
		return periodo_inicio;
	}

	public String getPeriodo_fim() {
		return periodo_fim;
	}

	public String getLogin() {
		return login;
	}

	public String getSenha() {
		return senha;
	}

	public boolean isSelecionado() {
		return selecionado;
	}

	public void setNome_fisico(String nome_fisico) {
		this.nome_fisico = nome_fisico;
	}

	public void setNome_juridico(String nome_juridico) {
		this.nome_juridico = nome_juridico;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setFinalidade(String finalidade) {
		this.finalidade = finalidade;
	}

	public void setID_PCD(int id_pcd) {
		this.id_pcd = id_pcd;
	}

	public void setSensores(String sensores) {
		this.sensor = sensores;
	}

	public void setPeriodo_inicio(String periodo_inicio) {
		this.periodo_inicio = periodo_inicio;
	}

	public void setPeriodo_fim(String periodo_fim) {
		this.periodo_fim = periodo_fim;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public void setSelecionado(boolean selecionado) {
		this.selecionado = selecionado;
	}


	

}
