package com.benpot.struts.action;

import java.io.InputStream;

import restapp.model.Employee;
import restapp.model.impl.EmployeeImpl;

import com.benpot.model.Contract;
import com.benpot.model.Payment;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("deprecation")
public class AjaxAction extends ActionSupport{

	private static final long serialVersionUID = 1L;

	/*****************************************
	 * PARAMETERS
	 *****************************************/
	private long idPayment;
	
	private Payment payment;	
	
	private long idContract;
	
	private Contract contract;
	
	private InputStream inputStream;
	
	
	/*****************************************
	 * CONSTRUCTOR
	 *****************************************/	
	public String retrivePayment() {	

		//Gson gson =  new GsonBuilder().registerTypeAdapter(Payment.class, new PaymentAdapter()).create();	
		//inputStream = new StringBufferInputStream(gson.toJson(payment));
		
		Employee employee = new EmployeeImpl();
		employee.setAddress("asd");
		return SUCCESS;
	}
	
	
	/*****************************************
	 * GET AND SETTERS
	 *****************************************/
	public long getIdPayment() {
		return idPayment;
	}


	public void setIdPayment(long idPayment) {
		this.idPayment = idPayment;
	}


	public Payment getPayment() {
		return payment;
	}


	public void setPayment(Payment payment) {
		this.payment = payment;
	}


	public InputStream getInputStream() {
		return inputStream;
	}


	public void setInputStream(InputStream inputStream) {
		this.inputStream = inputStream;
	}


	public long getIdContract() {
		return idContract;
	}


	public void setIdContract(long idContract) {
		this.idContract = idContract;
	}


	public Contract getContract() {
		return contract;
	}


	public void setContract(Contract contract) {
		this.contract = contract;
	}
	
	

}
