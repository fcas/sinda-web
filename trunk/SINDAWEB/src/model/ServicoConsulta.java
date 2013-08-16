package model;

import java.util.ArrayList;
import java.util.List;

import dao.ConsultaSemResultadoException;
import dao.DAOConsulta;
import dao.IDAOConsulta;
import exceptions.DaoException;

public class ServicoConsulta implements IServicoConsulta {

	private static ServicoConsulta singleton = null;

	@SuppressWarnings("unused")
	private IDAOConsulta daoConsulta;

	public ServicoConsulta() {
		this.daoConsulta = new DAOConsulta();
	}

	public static ServicoConsulta getInstance() {

		if (singleton == null) {
			singleton = new ServicoConsulta();
		}

		return singleton;

	}

	@SuppressWarnings("rawtypes")
	@Override
	public List consulta(String pcd, String sensor, String start, String end,
			String formato) throws DaoException, ConsultaSemResultadoException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String consultaRadicaoSolar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String consultaRadiacaoBoia() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String consultaMeterologicos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Consulta> consultaHidrologicos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String consultaBoias() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String consultaAgrometrologicos() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
