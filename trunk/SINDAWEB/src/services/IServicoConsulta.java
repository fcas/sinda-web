package services;

import java.io.IOException;
import java.util.List;

import model.PCD;
import model.URI;

import org.primefaces.json.JSONException;

import com.fasterxml.jackson.core.JsonParseException;

import exceptions.DaoException;
import gateway.ConsultaSemResultadoException;

public interface IServicoConsulta {

	public List<PCD> consulta(URI uri) throws DaoException, ConsultaSemResultadoException, JsonParseException, IOException, JSONException;

}
