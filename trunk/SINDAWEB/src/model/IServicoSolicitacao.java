package model;

import java.util.ArrayList;

import exceptions.DaoException;

public interface IServicoSolicitacao {

	Formulario autenticar(String login, String senha);

	void cadastrarFormulario(Formulario Formulario) throws DaoException;

	ArrayList<Formulario> buscarFormulario(String query) throws DaoException;

	void cadastrarSolicitacao(Formulario formulario);

}
