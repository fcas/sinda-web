package model;

import dao.DaoEmMemoria;
import dao.IDAOEngajador;
import exceptions.CadastroExcpetion;

public class ServicoEngajamundo implements IServicoEngajamundo {

	private static ServicoEngajamundo singleton = null; 
	
	private IDAOEngajador daoEngajador; 
	
	public ServicoEngajamundo() {
		this.daoEngajador = new DaoEmMemoria();
	}
	
	public static IServicoEngajamundo getInstance() {
		
		if (singleton == null){ 
			singleton = new ServicoEngajamundo();
		}
		
		return singleton;
		
	}

	@Override
	public void cadastrarEngajador(Engajador engajador) throws CadastroExcpetion {
		this.daoEngajador.cadastrarEngajador(engajador);
	}

}
