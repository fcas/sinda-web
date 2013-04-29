package dao;

import exceptions.CadastroExcpetion;
import model.Engajador;

public interface IDAOEngajador {

	String cadastrarEngajador(Engajador engajador) throws CadastroExcpetion;

}
