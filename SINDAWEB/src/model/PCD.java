package model;

import java.util.HashMap;

public class PCD {

	private double pcd_id;
	private String wmo_flu;
	private Proprietario proprietario;
	private String local;
	private String estado;
	private boolean em_operacao;
	private double potencia;
	private double canais;
	private Latitude latitude;
	private Longitude longitude;
	private double altitude;
	private String fabricante;
	private String modelo;
	private String versao;
	private String info;
	private String cadastro;
	private HashMap<Integer, Sensor> sensores;

	public PCD() {
		this.proprietario = new Proprietario();
		this.latitude = new Latitude();
		this.longitude = new Longitude();
		this.sensores = new HashMap<Integer, Sensor>();

	}

	public double getPcd_id() {
		return pcd_id;
	}

	public void setPcd_id(double pcd_id) {
		this.pcd_id = pcd_id;
	}

	public String getWmo_flu() {
		return wmo_flu;
	}

	public void setWmo_flu(String wmo_flu) {
		this.wmo_flu = wmo_flu;
	}

	public Proprietario getProprietario() {
		return proprietario;
	}

	public void setProprietario(Proprietario proprietario) {
		this.proprietario = proprietario;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public boolean isEm_operacao() {
		return em_operacao;
	}

	public void setEm_operacao(boolean em_operacao) {
		this.em_operacao = em_operacao;
	}

	public double getPotencia() {
		return potencia;
	}

	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}

	public double getCanais() {
		return canais;
	}

	public void setCanais(double canais) {
		this.canais = canais;
	}

	public Latitude getLatitude() {
		return latitude;
	}

	public void setLatitude(Latitude latitude) {
		this.latitude = latitude;
	}

	public Longitude getLongitude() {
		return longitude;
	}

	public void setLongitude(Longitude longitude) {
		this.longitude = longitude;
	}

	public double getAltitude() {
		return altitude;
	}

	public void setAltitude(double altitude) {
		this.altitude = altitude;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getVersao() {
		return versao;
	}

	public void setVersao(String versao) {
		this.versao = versao;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public String getCadastro() {
		return cadastro;
	}

	public void setCadastro(String cadastro) {
		this.cadastro = cadastro;
	}

	public HashMap<Integer, Sensor> getSensores() {
		return sensores;
	}

	public void setSensores(HashMap<Integer, Sensor> sensores) {
		this.sensores = sensores;
	}

}
