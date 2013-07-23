package controller;

import model.Consulta;

public interface IServicoUsuario {

	Consulta autenticar(String login, String senha);

}
