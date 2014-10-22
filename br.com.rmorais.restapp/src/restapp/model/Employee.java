/**
 */
package restapp.model;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Employee</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link restapp.model.Employee#getId <em>Id</em>}</li>
 *   <li>{@link restapp.model.Employee#getName <em>Name</em>}</li>
 *   <li>{@link restapp.model.Employee#getRg <em>Rg</em>}</li>
 *   <li>{@link restapp.model.Employee#getCpf <em>Cpf</em>}</li>
 *   <li>{@link restapp.model.Employee#getAddress <em>Address</em>}</li>
 *   <li>{@link restapp.model.Employee#getZipcode <em>Zipcode</em>}</li>
 *   <li>{@link restapp.model.Employee#getPhone <em>Phone</em>}</li>
 *   <li>{@link restapp.model.Employee#getMobile <em>Mobile</em>}</li>
 *   <li>{@link restapp.model.Employee#isWorking <em>Working</em>}</li>
 *   <li>{@link restapp.model.Employee#getContracted <em>Contracted</em>}</li>
 *   <li>{@link restapp.model.Employee#getFired <em>Fired</em>}</li>
 *   <li>{@link restapp.model.Employee#getSalary <em>Salary</em>}</li>
 *   <li>{@link restapp.model.Employee#getComission <em>Comission</em>}</li>
 *   <li>{@link restapp.model.Employee#getStatus <em>Status</em>}</li>
 * </ul>
 * </p>
 *
 * @see restapp.model.ModelPackage#getEmployee()
 * @model
 * @generated
 */
public interface Employee extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see restapp.model.ModelPackage#getEmployee_Id()
	 * @model id="true"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link restapp.model.Employee#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see restapp.model.ModelPackage#getEmployee_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link restapp.model.Employee#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Rg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rg</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rg</em>' attribute.
	 * @see #setRg(String)
	 * @see restapp.model.ModelPackage#getEmployee_Rg()
	 * @model
	 * @generated
	 */
	String getRg();

	/**
	 * Sets the value of the '{@link restapp.model.Employee#getRg <em>Rg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rg</em>' attribute.
	 * @see #getRg()
	 * @generated
	 */
	void setRg(String value);

	/**
	 * Returns the value of the '<em><b>Cpf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cpf</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cpf</em>' attribute.
	 * @see #setCpf(String)
	 * @see restapp.model.ModelPackage#getEmployee_Cpf()
	 * @model
	 * @generated
	 */
	String getCpf();

	/**
	 * Sets the value of the '{@link restapp.model.Employee#getCpf <em>Cpf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cpf</em>' attribute.
	 * @see #getCpf()
	 * @generated
	 */
	void setCpf(String value);

	/**
	 * Returns the value of the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Address</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address</em>' attribute.
	 * @see #setAddress(String)
	 * @see restapp.model.ModelPackage#getEmployee_Address()
	 * @model
	 * @generated
	 */
	String getAddress();

	/**
	 * Sets the value of the '{@link restapp.model.Employee#getAddress <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address</em>' attribute.
	 * @see #getAddress()
	 * @generated
	 */
	void setAddress(String value);

	/**
	 * Returns the value of the '<em><b>Zipcode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Zipcode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Zipcode</em>' attribute.
	 * @see #setZipcode(String)
	 * @see restapp.model.ModelPackage#getEmployee_Zipcode()
	 * @model
	 * @generated
	 */
	String getZipcode();

	/**
	 * Sets the value of the '{@link restapp.model.Employee#getZipcode <em>Zipcode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zipcode</em>' attribute.
	 * @see #getZipcode()
	 * @generated
	 */
	void setZipcode(String value);

	/**
	 * Returns the value of the '<em><b>Phone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Phone</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phone</em>' attribute.
	 * @see #setPhone(String)
	 * @see restapp.model.ModelPackage#getEmployee_Phone()
	 * @model
	 * @generated
	 */
	String getPhone();

	/**
	 * Sets the value of the '{@link restapp.model.Employee#getPhone <em>Phone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phone</em>' attribute.
	 * @see #getPhone()
	 * @generated
	 */
	void setPhone(String value);

	/**
	 * Returns the value of the '<em><b>Mobile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mobile</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mobile</em>' attribute.
	 * @see #setMobile(String)
	 * @see restapp.model.ModelPackage#getEmployee_Mobile()
	 * @model
	 * @generated
	 */
	String getMobile();

	/**
	 * Sets the value of the '{@link restapp.model.Employee#getMobile <em>Mobile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mobile</em>' attribute.
	 * @see #getMobile()
	 * @generated
	 */
	void setMobile(String value);

	/**
	 * Returns the value of the '<em><b>Working</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Working</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Working</em>' attribute.
	 * @see #setWorking(boolean)
	 * @see restapp.model.ModelPackage#getEmployee_Working()
	 * @model
	 * @generated
	 */
	boolean isWorking();

	/**
	 * Sets the value of the '{@link restapp.model.Employee#isWorking <em>Working</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Working</em>' attribute.
	 * @see #isWorking()
	 * @generated
	 */
	void setWorking(boolean value);

	/**
	 * Returns the value of the '<em><b>Contracted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contracted</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contracted</em>' attribute.
	 * @see #setContracted(Date)
	 * @see restapp.model.ModelPackage#getEmployee_Contracted()
	 * @model
	 * @generated
	 */
	Date getContracted();

	/**
	 * Sets the value of the '{@link restapp.model.Employee#getContracted <em>Contracted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contracted</em>' attribute.
	 * @see #getContracted()
	 * @generated
	 */
	void setContracted(Date value);

	/**
	 * Returns the value of the '<em><b>Fired</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fired</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fired</em>' attribute.
	 * @see #setFired(Date)
	 * @see restapp.model.ModelPackage#getEmployee_Fired()
	 * @model
	 * @generated
	 */
	Date getFired();

	/**
	 * Sets the value of the '{@link restapp.model.Employee#getFired <em>Fired</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fired</em>' attribute.
	 * @see #getFired()
	 * @generated
	 */
	void setFired(Date value);

	/**
	 * Returns the value of the '<em><b>Salary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Salary</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Salary</em>' attribute.
	 * @see #setSalary(double)
	 * @see restapp.model.ModelPackage#getEmployee_Salary()
	 * @model
	 * @generated
	 */
	double getSalary();

	/**
	 * Sets the value of the '{@link restapp.model.Employee#getSalary <em>Salary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Salary</em>' attribute.
	 * @see #getSalary()
	 * @generated
	 */
	void setSalary(double value);

	/**
	 * Returns the value of the '<em><b>Comission</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comission</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comission</em>' attribute.
	 * @see #setComission(double)
	 * @see restapp.model.ModelPackage#getEmployee_Comission()
	 * @model
	 * @generated
	 */
	double getComission();

	/**
	 * Sets the value of the '{@link restapp.model.Employee#getComission <em>Comission</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comission</em>' attribute.
	 * @see #getComission()
	 * @generated
	 */
	void setComission(double value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see #setStatus(int)
	 * @see restapp.model.ModelPackage#getEmployee_Status()
	 * @model
	 * @generated
	 */
	int getStatus();

	/**
	 * Sets the value of the '{@link restapp.model.Employee#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(int value);

} // Employee
