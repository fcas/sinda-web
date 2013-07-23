package controller;

import java.util.ArrayList;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import model.Consulta;
import model.IServicoConsulta;
import model.ServicoConsulta;

@SessionScoped
@ManagedBean(name="controllerServicos")
public class ControllerServicos {

	@SuppressWarnings("unused")
	private Consulta consulta;
	@SuppressWarnings("rawtypes")
	private ArrayList resultadoConsultas;
	private String query;
	IServicoConsulta servicoConsulta = ServicoConsulta
			.getInstance();
	
	public ControllerServicos() {
		consulta = new Consulta();
		resultadoConsultas = new ArrayList<Consulta>();
	}
	
	public String consultaHidrologica() {
		query = "";
		return "Hidrologica";
	}
	
	public String fazerConsultaHidrologica() {

		String action = "";
		resultadoConsultas = servicoConsulta.consultaHidrologicos();
		return action;
	}
	

	public void setConsulta(Consulta consulta) {
		this.consulta = consulta;
	}

	@SuppressWarnings("unchecked")
	public ArrayList<Consulta> getConsulta() {
		return resultadoConsultas;
	}

	public String getQuery() {
		return query;
	}

	public void setQuery(String query) {
		this.query = query;
	}

}
