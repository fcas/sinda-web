package dao;

import java.io.IOException;
import java.util.List;

import model.PCD;
import model.URI;

import org.primefaces.json.JSONException;

import com.fasterxml.jackson.core.JsonParseException;

import exceptions.DaoException;

public interface IDaoREST {

	/**
	 * public void cadastrar(T entidade) throws DaoException;
	 * 
	 * @param id
	 * @throws DaoException
	 *             Interface não implementada pela K2.
	 */

	/**
	 * public void deletar(String id) throws DaoException;
	 * 
	 * @param id
	 * @throws DaoException
	 *             Interface não implementada pela K2.
	 * @throws IOException
	 * @throws JsonParseException
	 * @throws JSONException
	 */

	public List<PCD> consulta(URI uri) throws DaoException,
			ConsultaSemResultadoException, JsonParseException, IOException,
			JSONException;

}
