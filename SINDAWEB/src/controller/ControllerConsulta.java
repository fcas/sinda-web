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
	private PCD pcd;
	private List <PCD> list_pcds; 
	private Proprietario proprietario;
	private boolean buscou = false;
	IServicoConsulta servicoConsulta = ServicoConsulta.getInstance();
	FacesContext context = FacesContext.getCurrentInstance();

	public ControllerConsulta() throws DaoException,
			ConsultaSemResultadoException, JsonParseException, IOException,
			JSONException {
		uri = new URI();
		list_pcds = new ArrayList<PCD>();
	}

	public String buscar() {
		return "BUSCAR";
	}

	public String buscarPorPCD() {
		buscou = false;
		return "BUSCAR_POR_PCD";
	}

	public String consultar_pcd() throws DaoException,
			ConsultaSemResultadoException, JsonParseException, IOException,
			JSONException {
		list_pcds = servicoConsulta.consulta(uri);
		for (int i = 0; i < list_pcds.size(); i++) {
			for (int j = 0; j < list_pcds.get(0).getSensores().size(); j++) {
				System.out.println(list_pcds.get(i).getSensores().get(j).getSensor_id());
			}
			
		}
		
		return "Visualizar";
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

	public PCD getPcd() {
		return pcd;
	}

	public void setPcd(PCD pcd) {
		this.pcd = pcd;
	}

	public void setBuscou(boolean buscou) {
		this.buscou = buscou;
	}

	public Proprietario getProprietario() {
		return proprietario;
	}

	public void setProprietario(Proprietario proprietario) {
		this.proprietario = proprietario;
	}
	
	public List<PCD> getList_pcds() {
		return list_pcds;
	}
	
	public void setList_pcds(List<PCD> list_pcds) {
		this.list_pcds = list_pcds;
	}
	
}
