package com.benpot.model.to;

import java.util.ArrayList;
import java.util.Date;

public class CheckInOutDayTO {
	
	
	public ArrayList<CheckInOutTO> checkInOutList;
	
	public Date incomplete;	
	
	public ArrayList<CheckInOutTO> getCheckInOutList() {
		return checkInOutList;
	}

	public void setCheckInOutList(ArrayList<CheckInOutTO> checkInOutList) {
		this.checkInOutList = checkInOutList;
	}

	public Date getIncomplete() {
		return incomplete;
	}

	public void setIncomplete(Date incomplete) {
		this.incomplete = incomplete;
	}
	
	
}
