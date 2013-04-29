package dao;

import java.util.ArrayList;

import exceptions.CadastroExcpetion;

import model.Engajador;

public class DaoEmMemoria implements IDAOEngajador {

	private ArrayList<Engajador> engajadores;
	private String nome = "";

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public DaoEmMemoria() {
		this.engajadores = new ArrayList<Engajador>();
	}

	public String cadastrarEngajador(Engajador engajador) throws CadastroExcpetion {

		String action = null;

		try {

			engajadores.add(engajador);

			for (int i = 0; i < engajadores.size(); i++) {
				System.out.println(engajadores.get(i).getNome()
						+ " foi cadastrado com sucesso!!!");
			}

		} catch (Exception e) {
			throw new CadastroExcpetion();
		}

		return action;

	}

}
