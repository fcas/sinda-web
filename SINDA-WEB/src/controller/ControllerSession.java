package controller;

import model.Solicitacao;
import model.IServicoUsuario;
import model.ServicoUsuario;

public class ControllerSession {

	Solicitacao usuarioAtual;
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
	
	public Solicitacao getUsuarioAtual() {
		return usuarioAtual;
	}
	public String getLogin() {
		return login;
	}
	public String getSenha() {
		return senha;
	}
	public void setUsuarioAtual(Solicitacao usuarioAtual) {
		this.usuarioAtual = usuarioAtual;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
}
