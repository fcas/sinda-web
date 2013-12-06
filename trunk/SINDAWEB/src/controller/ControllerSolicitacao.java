package controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import services.IServicoSolicitacao;
import services.ServicoSolicitacao;
import exceptions.DaoException;
import model.Formulario;

/**
 * @author felipecordeiro
 * Controller responsável pelos formulários
 */
@SessionScoped
@ManagedBean(name = "controllerSolicitacao")
public class ControllerSolicitacao {
	
	private Formulario formulario;
	private String query;
	IServicoSolicitacao servicoUsuario = ServicoSolicitacao.getInstance();

	public ControllerSolicitacao() {
		formulario = new Formulario();
	}

	public String cadastrarSolicitacao() throws DaoException {

		String action = "";

		servicoUsuario.cadastrarSolicitacao(formulario);
		action = "sucesso";

		return action;

	}

	public String cadastrar() {
		return "cadastrar_solicitacao";
	}

	public Formulario getsolicitacao() {
		return formulario;
	}

	public void setsolicitacao(Formulario solicitacao) {
		this.formulario = solicitacao;
	}

	public String getQuery() {
		return query;
	}

	public void setQuery(String query) {
		this.query = query;
	}

}
