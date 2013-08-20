package model;

import java.sql.Timestamp;
import java.util.HashMap;
import java.util.LinkedList;

public class PCD {

	private HashMap<Timestamp, LinkedList<Sensor>> pcd;

	public HashMap<Timestamp, LinkedList<Sensor>> getPcd() {
		return pcd;
	}

	public void setPcd(HashMap<Timestamp, LinkedList<Sensor>> pcd) {
		this.pcd = pcd;
	}
}
