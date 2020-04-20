package stream.tollintake;

public class TollReading {
	private Integer stationid;
	private Integer customerid;
	private String timestamp;
	private Boolean isFraud = false;
	
	public TollReading() {
		// TODO Auto-generated constructor stub
	}
	
	public TollReading(Integer stationid, Integer customerid, String timestamp, Boolean isFraud) {
		this.stationid = stationid;
		this.customerid = customerid;
		this.timestamp = timestamp;
		this.isFraud = isFraud;
	}

	public Integer getStationid() {
		return stationid;
	}

	public void setStationid(Integer stationid) {
		this.stationid = stationid;
	}

	public Integer getCustomerid() {
		return customerid;
	}

	public void setCustomerid(Integer customerid) {
		this.customerid = customerid;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	public Boolean getIsFraud() {
		return isFraud;
	}

	public void setIsFraud(Boolean isFraud) {
		this.isFraud = isFraud;
	}
}
