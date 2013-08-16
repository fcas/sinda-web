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

import model.Consulta;
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
public class DAOGenericoREST<T> implements IDaoGenerico<T> {

	private Class<T> entidade;

	public DAOGenericoREST() {
		
		
	}
	
	private static String readAll(Reader rd) throws IOException {
	    StringBuilder sb = new StringBuilder();
	    int cp;
	    while ((cp = rd.read()) != -1) {
	      sb.append((char) cp);
	    }
	    return sb.toString();
	  }

	@Override
	public List<T> consulta(String pcd, String sensor, String start,
			String end, String formato) throws JsonParseException, IOException, JSONException {
		
		URI uri = new URI();
		uri.setPcd(pcd);
//		
//	JsonFactory f = new JsonFactory();
//	JsonParser jp = f.createParser(new File ("uri.getURIpcd()"));
//		
//		System.out.println(jp.hasTextCharacters());
		
		InputStream is = new URL(uri.getURIpcd()).openStream();
	    try {
	      BufferedReader rd = new BufferedReader(new InputStreamReader(is, Charset.forName("UTF-8")));
	      String jsonText = readAll(rd);
	      JSONObject json = new JSONObject(jsonText);
	      System.out.println(json);
	    } finally {
	      is.close();
	    }
	    
	 

		return null;

	}

//	private Document getDocumentFromURI(String uri)
//			throws ParserConfigurationException, SAXException, IOException {
//		
//		return doc;
//	}
	
	public static void main(String[] args) throws DaoException, ConsultaSemResultadoException, JsonParseException, IOException, JSONException {
		DAOGenericoREST<Consulta> dao = new DAOGenericoREST<Consulta>();
		
		dao.consulta("30800", "sensor", "start", "end", "formato");
	}

}
