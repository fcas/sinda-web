package model;

public class URI {

	private String pcd;
	private String sensor; 
	private String start;
	private String end;
	private String format;
	private String URI = "http://spada.crn2.inpe.br:8080/spada/consulta/";
	
	public void setSensor(String sensor) {
		this.sensor = sensor;
	}
	
	public void setPcd(String pcd) {
		this.pcd = pcd;
	}

	public void setStart(String start) {
		this.start = start;
	}

	public void setEnd(String end) {
		this.end = end;
	}

	public void setFormat(String format) {
		this.format = format;
	}
	
	public String getURIpcd() {
		return URI+"pcd?pcd="+pcd;
	}
	
	public String getURIfull() {
		return URI+"pcd="+pcd+"&"+"start="+start+"&"+"formato="+format+"&"+"end="+end+"&"+"sensor="+sensor;
	}

}
