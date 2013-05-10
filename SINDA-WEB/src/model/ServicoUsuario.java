package model;

import java.util.ArrayList;

import dao.DaoEmMemoria;
import dao.IDAOEngajador;
import exceptions.DaoException;

public class ServicoUsuario implements IServicoUsuario {

	private static ServicoUsuario singleton = null;

	private IDAOEngajador daoEngajador;

	public ServicoUsuario() {
		this.daoEngajador = new DaoEmMemoria();
	}

	public static IServicoUsuario getInstance() {

		if (singleton == null) {
			singleton = new ServicoUsuario();
		}

		return singleton;

	}

	public ArrayList<Solicitacao> getUsers()
	{
		return daoEngajador.getUsers();
	}
	
	public void saveUsers(ArrayList<Solicitacao> usuarios)
	{
		daoEngajador.saveUsers(usuarios);
	}
	
	@Override
	public void cadastrarSolicitacao(Solicitacao solicitacao) {
		try {
			this.daoEngajador.cadastrarSolicitacao(solicitacao);
		} catch (DaoException e) {
			
		}
	}

	@Override
	public ArrayList<Solicitacao> buscarEngajador(String query) throws DaoException {
		return daoEngajador.buscarEngajador(query);		
	}
	
	@Override
	public ArrayList<Solicitacao> buscarEngajadorPorPais(String query) throws DaoException {
		return daoEngajador.buscarEngajadorPorPais(query);		
	}

	@Override
	public Solicitacao autenticar(String login, String senha)
	{
		return daoEngajador.autenticar(login, senha);
	}
}
