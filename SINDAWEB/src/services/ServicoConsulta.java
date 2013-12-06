package services;

import java.io.IOException;
import java.util.List;

import model.PCD;
import model.URI;

import org.primefaces.json.JSONException;

import com.fasterxml.jackson.core.JsonParseException;

import exceptions.DaoException;
import gateway.ConsultaSemResultadoException;
import gateway.GatewayRest;
import gateway.IGatewayRest;

public class ServicoConsulta implements IServicoConsulta {

	private static ServicoConsulta singleton = null;

	@SuppressWarnings("unused")
	private IGatewayRest dao;

	public ServicoConsulta() {

	}

	public static ServicoConsulta getInstance() {

		if (singleton == null) {
			singleton = new ServicoConsulta();
		}

		return singleton;

	}

	@Override
	public List<PCD> consulta(URI uri) throws DaoException,
			ConsultaSemResultadoException, JsonParseException, IOException, JSONException {

		return GatewayRest.getInstance().consulta(uri);
	}

}
