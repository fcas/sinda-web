package dao;

import java.util.ArrayList;

import exceptions.DaoException;

import model.Solicitacao;

public class DaoEmMemoria implements IDAOEngajador {

	private ArrayList<Solicitacao> solicitacoes;
	private String nome = "";

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public DaoEmMemoria() {
		solicitacoes = new ArrayList<Solicitacao>();
		solicitacoes.add(new Solicitacao("Felipe", "UFRN", "Rua Tal", 12345678, "lucas@bol.com.br", "Nenhuma", 123456, "Agua", "01/07/1993", "01/07/1993", nome, nome, false));
	}

	public ArrayList<Solicitacao> getUsers(){
		return this.solicitacoes;
	}

	public void saveUsers(ArrayList<Solicitacao> usuarios) {
		this.solicitacoes = usuarios;
	}
	
	public void cadastrarSolicitacao(Solicitacao solicitacao)
			throws DaoException {

		try {

			solicitacoes.add(solicitacao);

			for (int i = 0; i < solicitacoes.size(); i++) {
				System.out.println(solicitacoes.get(i).getNome_fisico()
						+ " foi cadastrado com sucesso!!!");
			}
		} catch (Exception e) {
			throw new DaoException("Erro no cadastro");
		}

	}

	@Override
	public ArrayList<Solicitacao> buscarEngajador(String query) throws DaoException {

		ArrayList<Solicitacao> usuarios = new ArrayList<Solicitacao>();
//		for (int i = 0; i < solicitacoes.size(); i++) {
//			if (solicitacoes.get(i).getNome().equals(query)) {
//				System.out.println("Resultado:" + query);
//				usuarios.add(solicitacoes.get(i));
//			}
//
//		}
//		if (usuarios.size() == 0)
//			throw new DaoException("Usuário não encontrado");
//		else
			return usuarios;
	}
	
	@Override
	public ArrayList<Solicitacao> buscarEngajadorPorPais(String query) throws DaoException {

		ArrayList<Solicitacao> usuarios = new ArrayList<Solicitacao>();
//		for (int i = 0; i < solicitacoes.size(); i++) {
//			if (solicitacoes.get(i).getPais().equals(query)) {
//				System.out.println("Resultado:" + query);
//				usuarios.add(solicitacoes.get(i));
//			}
//
//		}
//		if (usuarios.size() == 0) {
//			System.out.println("array vazio");//throw new DaoException("Usuário não encontrado");
//		return new ArrayList();
//		}
//		else
			return usuarios;
	}
	
	@Override
	public Solicitacao autenticar(String login, String senha)
	{
		Solicitacao e = null;
		for (int i = 0; i < solicitacoes.size(); i++)
		{
			if (solicitacoes.get(i).getLogin().equals(login) && solicitacoes.get(i).getSenha().equals(senha))
			{
				e = solicitacoes.get(i);
				i = solicitacoes.size();
			}
		}
		return e;
	}
	
}
