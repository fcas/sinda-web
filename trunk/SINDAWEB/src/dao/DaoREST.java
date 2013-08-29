package dao;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import model.Latitude;
import model.Longitude;
import model.PCD;
import model.Proprietario;
import model.Sensor;
import model.ServicoConsulta;
import model.URI;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.primefaces.json.JSONArray;
import org.primefaces.json.JSONException;
import org.primefaces.json.JSONObject;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.ObjectMapper;

import exceptions.DaoException;

@SuppressWarnings("unused")
public class DaoREST implements IDaoREST {

	private PCD pcd;
	private Sensor sensor = new Sensor();
	private List<PCD> pcds;
	private static DaoREST singleton = null;

	public DaoREST() {
		this.pcd = new PCD();
	}

	public static DaoREST getInstance() {

		if (singleton == null) {
			singleton = new DaoREST();
		}

		return singleton;

	}

	private static String readAll(Reader rd) throws IOException {
		StringBuilder sb = new StringBuilder();
		int cp;
		while ((cp = rd.read()) != -1) {
			sb.append((char) cp);
		}
		return sb.toString();
	}

	public PCD consulta(URI uri) throws JsonParseException, IOException,
			JSONException {

		InputStream is = new URL(uri.getURIpcd()).openStream();
		try {
			BufferedReader rd = new BufferedReader(new InputStreamReader(is,
					Charset.forName("UTF-8")));
			String jsonText = readAll(rd);
			JSONObject json = new JSONObject(jsonText);
			PCD pcds = processar_pcd(json);
			return pcds;
		} finally {
			is.close();
		}

	}

	private PCD processar_pcd(JSONObject json) throws JSONException {

		pcd.setPcd_id(json.getDouble("pcd_id"));
		pcd.setWmo_flu(json.getString("wmo_flu"));

		pcd.getProprietario().setProprietario(
				json.getJSONObject("proprietario").getString(("proprietario")));
		pcd.getProprietario().setResponsavel(
				json.getJSONObject("proprietario").getString("responsavel"));
		pcd.getProprietario().setCia_orgao(
				json.getJSONObject("proprietario").getString("cia_orgao"));
		pcd.getProprietario().setDepto_secao(
				json.getJSONObject("proprietario").getString("depto_secao"));
		pcd.getProprietario().setLogradouro(
				json.getJSONObject("proprietario").getString("logradouro"));
		pcd.getProprietario().setCriacao(
				json.getJSONObject("proprietario").getString("criacao"));

		pcd.setLocal(json.getString("local"));
		pcd.setEstado(json.getString("estado"));
		pcd.setEm_operacao(json.getBoolean("em_operacao"));

		pcd.setPotencia(json.getDouble("potencia"));
		pcd.setCanais(json.getDouble("canais"));

		pcd.getLatitude().setGrau(
				json.getJSONObject("latitude").getDouble(("grau")));
		pcd.getLatitude().setMinuto(
				json.getJSONObject("latitude").getDouble(("minuto")));
		pcd.getLatitude().setSegundo(
				json.getJSONObject("latitude").getDouble(("segundo")));
		pcd.getLatitude().setDirecao(
				(json.getJSONObject("latitude").getString(("direcao"))));

		pcd.getLongitude().setGrau(
				json.getJSONObject("longitude").getDouble(("grau")));
		pcd.getLongitude().setMininuto(
				json.getJSONObject("longitude").getDouble(("minuto")));
		pcd.getLongitude().setSegundo(
				json.getJSONObject("longitude").getDouble(("segundo")));
		pcd.getLongitude().setDirecao(
				(json.getJSONObject("longitude").getString(("direcao"))));

		pcd.setAltitude(json.getDouble("altitude"));
		pcd.setFabricante(((json.getString("fabricante"))));
		pcd.setModelo(((json.getString("modelo"))));
		pcd.setVersao(((json.getString("versao"))));
		pcd.setInfo(((json.getString("info"))));
		pcd.setCadastro(((json.getString("cadastro"))));

		processar_sensores(json.getJSONArray("sensores"));

		return pcd;
	}

	private Sensor processar_sensores(JSONArray sensores) throws JSONException {

		for (int i = 0; i < sensores.length(); i++) {
			sensor.setSensor_id(sensores.getJSONObject(i).getDouble(
					("sensor_id")));
			sensor.setDescricao(sensores.getJSONObject(i).getString(
					("descricao")));
			sensor.setUnidade(sensores.getJSONObject(i).getString(("unidade")));
			sensor.setBits(sensores.getJSONObject(i).getDouble(("bits")));
			sensor.setIntervalo(sensores.getJSONObject(i).getDouble(
					("intervalo")));
			sensor.setShift(sensores.getJSONObject(i).getDouble(("shift")));
			sensor.setInicioBits(sensores.getJSONObject(i).getDouble(
					("inicioBits")));
			sensor.setDataHoraReferencia(sensores.getJSONObject(i).getString(
					("dataHoraReferencia")));
			sensor.setPosicao(sensores.getJSONObject(i).getString(("posicao")));
			pcd.getSensores().put((double) i, sensor);
		}

		return sensor;
	}

	public static void main(String[] args) throws DaoException,
			ConsultaSemResultadoException, JsonParseException, IOException,
			JSONException {

		// JSONObject json = DaoREST.getInstance().consulta("30800", "sensor",
		// "start", "end", "formato");

	}

}
