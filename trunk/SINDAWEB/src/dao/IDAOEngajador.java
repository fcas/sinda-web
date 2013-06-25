package dao;

import java.util.ArrayList;

import exceptions.DaoException;
import model.Solicitacao;

public interface IDAOEngajador {

	void cadastrarSolicitacao(Solicitacao engajador) throws DaoException;

	ArrayList<Solicitacao> getUsers();

	void saveUsers(ArrayList<Solicitacao> usuarios);

	ArrayList<Solicitacao> buscarEngajador(String query) throws DaoException;

	ArrayList<Solicitacao> buscarEngajadorPorPais(String query) throws DaoException;

	Solicitacao autenticar(String login, String senha);

}
