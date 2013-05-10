package model;

import java.util.ArrayList;

import exceptions.DaoException;

public interface IServicoUsuario {

	Object getUsers();

	void saveUsers(ArrayList<Solicitacao> usuarios);

	ArrayList<Solicitacao> buscarEngajador(String engajador) throws DaoException;

	ArrayList<Solicitacao> buscarEngajadorPorPais(String engajador) throws DaoException;

	Solicitacao autenticar(String login, String senha);

	void cadastrarSolicitacao(Solicitacao solicitacao) throws DaoException;
	
}