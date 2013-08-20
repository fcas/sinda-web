package dao;

import java.io.IOException;
import org.primefaces.json.JSONException;
import org.primefaces.json.JSONObject;

import com.fasterxml.jackson.core.JsonParseException;

import exceptions.DaoException;

public interface IDaoGenerico<T> {
	
	  /**
	   * public void cadastrar(T entidade) throws DaoException;
	   * @param id
	   * @throws DaoException
	   * Interface não implementada pela K2.
	   */
	
		/**
		 * public void deletar(String id) throws DaoException; 
		 * @param id
		 * @throws DaoException
		 * Interface não implementada pela K2. 
		 * @throws IOException 
		 * @throws JsonParseException 
		 * @throws JSONException 
		 */
	
      public JSONObject consulta(String pcd, String sensor, String start, String end, String formato) throws DaoException, ConsultaSemResultadoException, JsonParseException, IOException, JSONException;
      
}
