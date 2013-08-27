package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import org.primefaces.json.JSONException;

import com.fasterxml.jackson.core.JsonParseException;

import dao.ConsultaSemResultadoException;
import exceptions.DaoException;
import model.IServicoConsulta;
import model.PCD;
import model.Proprietario;
import model.Sensor;
import model.ServicoConsulta;
import model.URI;

/**
 * @author felipecordeiro Controller responsável pelas consultas.
 * 
 */

@SessionScoped
@ManagedBean(name = "controllerConsulta")
public class ControllerConsulta {
	private URI uri;
	private List<PCD> pcds;
	private List<Sensor> sensoresSelecionados;
	private ArrayList<Boolean> selecionados;
	private Proprietario proprietario;
	private boolean buscou = false;
	IServicoConsulta servicoConsulta = ServicoConsulta.getInstance();
	FacesContext context = FacesContext.getCurrentInstance();

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void selecionados(int tam) {
		selecionados = new ArrayList();
		for (int i = 0; i < tam; i++)
			selecionados.add(false);
	}

	public ControllerConsulta() throws DaoException,
			ConsultaSemResultadoException, JsonParseException, IOException, JSONException {
		uri = new URI();
		sensoresSelecionados = new ArrayList<Sensor>();
	}

	public String buscar() {
		return "BUSCAR";
	}

	public String buscarPorPCD() {
		buscou = false;
		return "BUSCAR_POR_PCD";
	}

	@SuppressWarnings("unchecked")
	public String consultar_pcd() throws DaoException,
			ConsultaSemResultadoException, JsonParseException, IOException, JSONException {
		pcds = (List<PCD>) servicoConsulta.consulta(uri);
//		selecionados(pcds.size());
		return "Visualizar";
	}

	public List<Sensor> getSensoresSelecionados() {
		return sensoresSelecionados;
	}

	public boolean isBuscou() {
		return buscou;
	}

	public URI getURI() {
		return uri;
	}

	public void setURI(URI uri) {
		this.uri = uri;
	}

	public List<PCD> getPCDs() {
		return pcds;
	}

	public void setPCDs(List<PCD> pcds) {
		this.pcds = pcds;
	}

	public void setBuscou(boolean buscou) {
		this.buscou = buscou;
	}

	public void setUsuarioSelecionados(List<Sensor> sensoresSelecionados) {
		this.sensoresSelecionados = sensoresSelecionados;
	}
	
	public Proprietario getProprietario() {
		return proprietario;
	}

	public void setProprietario(Proprietario proprietario) {
		this.proprietario = proprietario;
	}
}
