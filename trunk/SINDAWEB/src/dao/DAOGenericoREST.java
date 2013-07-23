package dao;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

import model.URI;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import exceptions.DaoException;

@SuppressWarnings("unused")
public class DAOGenericoREST <T> implements IDaoGenerico <T> {
	
	private Class<T> entidade;

	public DAOGenericoREST(URI uri) {
//		try {

//			RestEventos events = new RestEventos();
//			List<EventoInfo> Eventos = new ArrayList<EventoInfo>();
//			Eventos = events.getNomeEventos(uri.getURI());
//
//			System.out.println("\n" + "Lista de eventos:" + "\n");
//			for (EventoInfo t : Eventos) {
//				System.out.println(t.title);
//			}
//			
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
////		}
//		this.entidade = (Class<T>) ((ParameterizedType) getClass()
//				.getGenericSuperclass()).getActualTypeArguments()[0];
	}


	@SuppressWarnings({ "null", "unchecked" })
	@Override
	public List<T> consulta(String pcd, String sensor, String start,
			String end, String formato) throws DaoException,
			ConsultaSemResultadoException {

		Query query = null;
		
		//em.createQuery("select f from " + tabela + " f where " + coluna + " like "+"'%"+parametro+"%'");
		//query.setParameter("parametro", parametro);
 
        return query.getResultList();

	}
}
	