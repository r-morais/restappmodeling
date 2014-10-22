package com.benpot.struts.action;

import com.opensymphony.xwork2.ActionSupport;


public class UnhandledExceptionHandler extends ActionSupport {


	private static final long serialVersionUID = 1L;
	
	private Exception exception;

    @Override()
    public String execute() {

        if(exception != null){

            addActionError(getText("common.unknown.exception") + "<div class=\"errorMessageExceptionText\">" + exception.toString() + "</div>");
            return ERROR; 
           
        } else {
           System.err.println("***** TRIED TO LOG EXCEPTION BUT EXCEPTION WAS NULL! I HAVE NOT LOGGED THIS EXCEPTION! *****");
        }

        addActionError(getText("actionUnhandledExceptionHandler.could.not.log.exception"));
        return "canNotLogDatabaseError";
    }

	public Exception getException() {
		return exception;
	}

	public void setException(Exception exception) {
		this.exception = exception;
	}   
    
}
