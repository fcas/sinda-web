package controller;

import model.Engajador;
import model.IServicoEngajamundo;
import model.ServicoEngajamundo;

public class ControllerEngajador {

	private Engajador engajador;

	public ControllerEngajador() {
		engajador = new Engajador();
	}
	
	public String controllerEngajador() {

		String action = "";

		IServicoEngajamundo servicoEngajamundo = ServicoEngajamundo
				.getInstance();

		try {
			if (engajador.getNome() != null) {
				servicoEngajamundo.cadastrarEngajador(engajador);
				action = "sucesso";
			} else
				action = "erro";

		} catch (Exception e) {
			System.out.println(e);
		}

		return action;

	}

	public Engajador getEngajador() {
		return engajador;
	}

	public void setEngajador(Engajador engajador) {
		this.engajador = engajador;
	}

}
