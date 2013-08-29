package model;

import java.io.IOException;

import org.primefaces.json.JSONException;

import com.fasterxml.jackson.core.JsonParseException;

import dao.ConsultaSemResultadoException;
import dao.DaoREST;
import dao.IDaoREST;
import exceptions.DaoException;

public class ServicoConsulta implements IServicoConsulta {

	private static ServicoConsulta singleton = null;

	@SuppressWarnings("unused")
	private IDaoREST dao;

	public ServicoConsulta() {

	}

	public static ServicoConsulta getInstance() {

		if (singleton == null) {
			singleton = new ServicoConsulta();
		}

		return singleton;

	}

	@Override
	public PCD consulta(URI uri) throws DaoException,
			ConsultaSemResultadoException, JsonParseException, IOException, JSONException {

		return DaoREST.getInstance().consulta(uri);
	}

}
