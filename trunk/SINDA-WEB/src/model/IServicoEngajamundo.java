package model;

import exceptions.CadastroExcpetion;

public interface IServicoEngajamundo {
	
	void cadastrarEngajador(Engajador engajador) throws CadastroExcpetion;

}
