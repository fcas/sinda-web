package controller;

import model.Consulta;

public class ControllerSession {

	Consulta usuarioAtual;
	private String login, senha;
	IServicoUsuario servicoUsuario = ServicoUsuario
			.getInstance();
	
	public String autenticar()
	{
		usuarioAtual = servicoUsuario.autenticar(login, senha);
		if (usuarioAtual != null)
			return "sucesso";
		else
			return "erro";
	}
	
	public Consulta getUsuarioAtual() {
		return usuarioAtual;
	}
	public String getLogin() {
		return login;
	}
	public String getSenha() {
		return senha;
	}
	public void setUsuarioAtual(Consulta usuarioAtual) {
		this.usuarioAtual = usuarioAtual;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
}
