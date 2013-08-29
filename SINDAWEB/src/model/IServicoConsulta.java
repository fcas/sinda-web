package model;

import java.io.IOException;

import org.primefaces.json.JSONException;

import com.fasterxml.jackson.core.JsonParseException;

import dao.ConsultaSemResultadoException;
import exceptions.DaoException;

public interface IServicoConsulta {

	public PCD consulta(URI uri) throws DaoException, ConsultaSemResultadoException, JsonParseException, IOException, JSONException;

}
