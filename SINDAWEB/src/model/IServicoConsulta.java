package model;

import java.util.ArrayList;
import java.util.List;

import dao.ConsultaSemResultadoException;
import exceptions.DaoException;

public interface IServicoConsulta {

	@SuppressWarnings("rawtypes")
	public List consulta(String pcd, String sensor, String start, String end,
			String formato) throws DaoException, ConsultaSemResultadoException;

	public String consultaRadicaoSolar();

	public String consultaRadiacaoBoia();

	public String consultaMeterologicos();

	public ArrayList<Consulta> consultaHidrologicos();

	public String consultaBoias();

	public String consultaAgrometrologicos();

}
