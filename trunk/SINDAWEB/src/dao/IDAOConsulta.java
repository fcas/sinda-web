package dao;

import model.Consulta;

public interface IDAOConsulta extends IDaoGenerico<Consulta> {
	
	public String consultaMeterologicos();
	public String consultaHidrologicos();
	public String consultaAgrometrologicos();
	public String consultaBoias();
	public String consultaRadiacaoBoia();
	public String consultaRadicaoSolar();

}
