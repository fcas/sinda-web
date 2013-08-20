package controller;

import model.Formulario;
import model.IServicoSolicitacao;
import model.ServicoSolicitacao;

/**
 * @author felipecordeiro
 * Controller responsável pelo gerenciamento de sessão do usuário
 */
public class ControllerSession {

	Formulario usuarioAtual;
	private String login, senha;
	IServicoSolicitacao servicoUsuario = ServicoSolicitacao.getInstance();

	public String autenticar() {
		usuarioAtual = servicoUsuario.autenticar(login, senha);
		if (usuarioAtual != null)
			return "sucesso";
		else
			return "erro";
	}

	public Formulario getUsuarioAtual() {
		return usuarioAtual;
	}

	public String getLogin() {
		return login;
	}

	public String getSenha() {
		return senha;
	}

	public void setUsuarioAtual(Formulario usuarioAtual) {
		this.usuarioAtual = usuarioAtual;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

}
