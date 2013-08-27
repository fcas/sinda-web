package model;

public class Sensor {

	private int sensor_id;
	private String descricao;
	private String unidade;
	private int bits;
	private int intervalo;
	private int shift;
	private int inicioBits;
	private Calibrador calibrador;
	private String dataHoraReferencia;
	private String posicao;

	public int getSensor_id() {
		return sensor_id;
	}

	public void setSensor_id(int sensor_id) {
		this.sensor_id = sensor_id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getUnidade() {
		return unidade;
	}

	public void setUnidade(String unidade) {
		this.unidade = unidade;
	}

	public int getBits() {
		return bits;
	}

	public void setBits(int bits) {
		this.bits = bits;
	}

	public int getIntervalo() {
		return intervalo;
	}

	public void setIntervalo(int intervalo) {
		this.intervalo = intervalo;
	}

	public int getShift() {
		return shift;
	}

	public void setShift(int shift) {
		this.shift = shift;
	}

	public int getInicioBits() {
		return inicioBits;
	}

	public void setInicioBits(int inicioBits) {
		this.inicioBits = inicioBits;
	}

	public Calibrador getCalibrador() {
		return calibrador;
	}

	public void setCalibrador(Calibrador calibrador) {
		this.calibrador = calibrador;
	}

	public String getDataHoraReferencia() {
		return dataHoraReferencia;
	}

	public void setDataHoraReferencia(String dataHoraReferencia) {
		this.dataHoraReferencia = dataHoraReferencia;
	}

	public String getPosicao() {
		return posicao;
	}

	public void setPosicao(String posicao) {
		this.posicao = posicao;
	}

}
