package com.benpot.model.to;

import java.util.Date;

public class CheckInOutTO {
	
	private Date init;
	
	private Date end;
	
	private String dif;

	
	public Date getInit() {
		return init;
	}

	public void setInit(Date init) {
		this.init = init;
	}

	public Date getEnd() {
		return end;
	}

	public void setEnd(Date end) {
		this.end = end;
	}

	public String getDif() {
		return dif;
	}

	public void setDif(String dif) {
		this.dif = dif;
	}
	
	

}
