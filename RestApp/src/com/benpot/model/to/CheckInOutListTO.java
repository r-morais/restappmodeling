package com.benpot.model.to;

import java.util.ArrayList;

public class CheckInOutListTO {

	private String totalExecuted;
	
	private ArrayList<CheckInOutDayTO> checkDayList;

	public String getTotalExecuted() {
		return totalExecuted;
	}

	public void setTotalExecuted(String totalExecuted) {
		this.totalExecuted = totalExecuted;
	}

	public ArrayList<CheckInOutDayTO> getCheckDayList() {
		return checkDayList;
	}

	public void setCheckDayList(ArrayList<CheckInOutDayTO> checkDayList) {
		this.checkDayList = checkDayList;
	}
	
	
}
