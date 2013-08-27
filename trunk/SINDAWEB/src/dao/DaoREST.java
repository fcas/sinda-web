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
import java.util.List;
import java.util.Map;

import model.PCD;
import model.Proprietario;
import model.ServicoConsulta;
import model.URI;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

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

	private List<PCD> pcds;
	private static DaoREST singleton = null;

	public DaoREST() {

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

	public List<PCD> consulta(URI uri) throws JsonParseException, IOException,
			JSONException {

		InputStream is = new URL(uri.getURIpcd()).openStream();
		try {
			BufferedReader rd = new BufferedReader(new InputStreamReader(is,
					Charset.forName("UTF-8")));
			String jsonText = readAll(rd);
			JSONObject json = new JSONObject(jsonText);
			List<PCD> pcds = processar(json);
			return pcds;
		} finally {
			is.close();
		}

	}
	
	private List<PCD> processar(JSONObject json) throws JSONException {
		
		PCD pcd = new PCD();
		Proprietario proprietario = new Proprietario();
		
		pcd.setPcd_id(Double.parseDouble(json.get("pcd_id").toString()));
		pcd.setWmo_flu(json.get("wmo_flu").toString());
		
		proprietario.setProprietario(json.getJSONObject("proprietario").getString(("proprietario")));
		proprietario.setResponsavel(json.getJSONObject("proprietario").getString("responsavel"));
		proprietario.setCia_orgao(json.getJSONObject("proprietario").getString("cia_orgao"));
		proprietario.setDepto_secao(json.getJSONObject("proprietario").getString("depto_secao"));
		proprietario.setLogradouro(json.getJSONObject("proprietario").getString("logradouro"));
		proprietario.setCriacao(json.getJSONObject("proprietario").getString("criacao"));
		
		pcd.setProprietario(proprietario);
		
		pcd.setLocal(json.get("local").toString());
		pcd.setEstado(json.get("estado").toString());
		pcd.setEm_operacao((Boolean.parseBoolean(json.get("em_operacao").toString())));
		
		pcd.setPotencia(Double.parseDouble((json.get("potencia").toString())));
		pcd.setCanais(Double.parseDouble(json.get("canais").toString()));
		
  
		return null;
	}

	public static void main(String[] args) throws DaoException,
			ConsultaSemResultadoException, JsonParseException, IOException,
			JSONException {

//		JSONObject json = DaoREST.getInstance().consulta("30800", "sensor",
//				"start", "end", "formato");
		
	}

}
