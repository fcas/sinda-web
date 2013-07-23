package dao;

import java.util.List;
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
		 */
	
      public List<T> consulta(String pcd, String sensor, String start, String end, String formato) throws DaoException, ConsultaSemResultadoException;
      
}
