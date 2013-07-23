package dao;

import model.Consulta;
import model.URI;

public class DAOConsulta extends DAOGenericoREST<Consulta> implements IDAOConsulta{

	public DAOConsulta(URI uri) {
		super(uri);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String consultaMeterologicos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String consultaHidrologicos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String consultaAgrometrologicos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String consultaBoias() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String consultaRadiacaoBoia() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String consultaRadicaoSolar() {
		// TODO Auto-generated method stub
		return null;
	}

}
