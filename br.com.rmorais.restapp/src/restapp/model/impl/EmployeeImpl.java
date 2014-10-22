/**
 */
package restapp.model.impl;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import restapp.model.Employee;
import restapp.model.ModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Employee</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link restapp.model.impl.EmployeeImpl#getId <em>Id</em>}</li>
 *   <li>{@link restapp.model.impl.EmployeeImpl#getName <em>Name</em>}</li>
 *   <li>{@link restapp.model.impl.EmployeeImpl#getRg <em>Rg</em>}</li>
 *   <li>{@link restapp.model.impl.EmployeeImpl#getCpf <em>Cpf</em>}</li>
 *   <li>{@link restapp.model.impl.EmployeeImpl#getAddress <em>Address</em>}</li>
 *   <li>{@link restapp.model.impl.EmployeeImpl#getZipcode <em>Zipcode</em>}</li>
 *   <li>{@link restapp.model.impl.EmployeeImpl#getPhone <em>Phone</em>}</li>
 *   <li>{@link restapp.model.impl.EmployeeImpl#getMobile <em>Mobile</em>}</li>
 *   <li>{@link restapp.model.impl.EmployeeImpl#isWorking <em>Working</em>}</li>
 *   <li>{@link restapp.model.impl.EmployeeImpl#getContracted <em>Contracted</em>}</li>
 *   <li>{@link restapp.model.impl.EmployeeImpl#getFired <em>Fired</em>}</li>
 *   <li>{@link restapp.model.impl.EmployeeImpl#getSalary <em>Salary</em>}</li>
 *   <li>{@link restapp.model.impl.EmployeeImpl#getComission <em>Comission</em>}</li>
 *   <li>{@link restapp.model.impl.EmployeeImpl#getStatus <em>Status</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EmployeeImpl extends MinimalEObjectImpl.Container implements Employee {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getRg() <em>Rg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRg()
	 * @generated
	 * @ordered
	 */
	protected static final String RG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRg() <em>Rg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRg()
	 * @generated
	 * @ordered
	 */
	protected String rg = RG_EDEFAULT;

	/**
	 * The default value of the '{@link #getCpf() <em>Cpf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCpf()
	 * @generated
	 * @ordered
	 */
	protected static final String CPF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCpf() <em>Cpf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCpf()
	 * @generated
	 * @ordered
	 */
	protected String cpf = CPF_EDEFAULT;

	/**
	 * The default value of the '{@link #getAddress() <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAddress() <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected String address = ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getZipcode() <em>Zipcode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZipcode()
	 * @generated
	 * @ordered
	 */
	protected static final String ZIPCODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getZipcode() <em>Zipcode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZipcode()
	 * @generated
	 * @ordered
	 */
	protected String zipcode = ZIPCODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPhone() <em>Phone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhone()
	 * @generated
	 * @ordered
	 */
	protected static final String PHONE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPhone() <em>Phone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhone()
	 * @generated
	 * @ordered
	 */
	protected String phone = PHONE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMobile() <em>Mobile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMobile()
	 * @generated
	 * @ordered
	 */
	protected static final String MOBILE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMobile() <em>Mobile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMobile()
	 * @generated
	 * @ordered
	 */
	protected String mobile = MOBILE_EDEFAULT;

	/**
	 * The default value of the '{@link #isWorking() <em>Working</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isWorking()
	 * @generated
	 * @ordered
	 */
	protected static final boolean WORKING_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isWorking() <em>Working</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isWorking()
	 * @generated
	 * @ordered
	 */
	protected boolean working = WORKING_EDEFAULT;

	/**
	 * The default value of the '{@link #getContracted() <em>Contracted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContracted()
	 * @generated
	 * @ordered
	 */
	protected static final Date CONTRACTED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContracted() <em>Contracted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContracted()
	 * @generated
	 * @ordered
	 */
	protected Date contracted = CONTRACTED_EDEFAULT;

	/**
	 * The default value of the '{@link #getFired() <em>Fired</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFired()
	 * @generated
	 * @ordered
	 */
	protected static final Date FIRED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFired() <em>Fired</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFired()
	 * @generated
	 * @ordered
	 */
	protected Date fired = FIRED_EDEFAULT;

	/**
	 * The default value of the '{@link #getSalary() <em>Salary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSalary()
	 * @generated
	 * @ordered
	 */
	protected static final double SALARY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getSalary() <em>Salary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSalary()
	 * @generated
	 * @ordered
	 */
	protected double salary = SALARY_EDEFAULT;

	/**
	 * The default value of the '{@link #getComission() <em>Comission</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComission()
	 * @generated
	 * @ordered
	 */
	protected static final double COMISSION_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getComission() <em>Comission</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComission()
	 * @generated
	 * @ordered
	 */
	protected double comission = COMISSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final int STATUS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected int status = STATUS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmployeeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.EMPLOYEE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(int newId) {
		int oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.EMPLOYEE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.EMPLOYEE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRg() {
		return rg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRg(String newRg) {
		String oldRg = rg;
		rg = newRg;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.EMPLOYEE__RG, oldRg, rg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCpf() {
		return cpf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCpf(String newCpf) {
		String oldCpf = cpf;
		cpf = newCpf;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.EMPLOYEE__CPF, oldCpf, cpf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddress(String newAddress) {
		String oldAddress = address;
		address = newAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.EMPLOYEE__ADDRESS, oldAddress, address));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getZipcode() {
		return zipcode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setZipcode(String newZipcode) {
		String oldZipcode = zipcode;
		zipcode = newZipcode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.EMPLOYEE__ZIPCODE, oldZipcode, zipcode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhone(String newPhone) {
		String oldPhone = phone;
		phone = newPhone;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.EMPLOYEE__PHONE, oldPhone, phone));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMobile() {
		return mobile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMobile(String newMobile) {
		String oldMobile = mobile;
		mobile = newMobile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.EMPLOYEE__MOBILE, oldMobile, mobile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isWorking() {
		return working;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWorking(boolean newWorking) {
		boolean oldWorking = working;
		working = newWorking;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.EMPLOYEE__WORKING, oldWorking, working));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getContracted() {
		return contracted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContracted(Date newContracted) {
		Date oldContracted = contracted;
		contracted = newContracted;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.EMPLOYEE__CONTRACTED, oldContracted, contracted));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getFired() {
		return fired;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFired(Date newFired) {
		Date oldFired = fired;
		fired = newFired;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.EMPLOYEE__FIRED, oldFired, fired));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getSalary() {
		return salary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSalary(double newSalary) {
		double oldSalary = salary;
		salary = newSalary;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.EMPLOYEE__SALARY, oldSalary, salary));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getComission() {
		return comission;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComission(double newComission) {
		double oldComission = comission;
		comission = newComission;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.EMPLOYEE__COMISSION, oldComission, comission));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(int newStatus) {
		int oldStatus = status;
		status = newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.EMPLOYEE__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.EMPLOYEE__ID:
				return getId();
			case ModelPackage.EMPLOYEE__NAME:
				return getName();
			case ModelPackage.EMPLOYEE__RG:
				return getRg();
			case ModelPackage.EMPLOYEE__CPF:
				return getCpf();
			case ModelPackage.EMPLOYEE__ADDRESS:
				return getAddress();
			case ModelPackage.EMPLOYEE__ZIPCODE:
				return getZipcode();
			case ModelPackage.EMPLOYEE__PHONE:
				return getPhone();
			case ModelPackage.EMPLOYEE__MOBILE:
				return getMobile();
			case ModelPackage.EMPLOYEE__WORKING:
				return isWorking();
			case ModelPackage.EMPLOYEE__CONTRACTED:
				return getContracted();
			case ModelPackage.EMPLOYEE__FIRED:
				return getFired();
			case ModelPackage.EMPLOYEE__SALARY:
				return getSalary();
			case ModelPackage.EMPLOYEE__COMISSION:
				return getComission();
			case ModelPackage.EMPLOYEE__STATUS:
				return getStatus();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ModelPackage.EMPLOYEE__ID:
				setId((Integer)newValue);
				return;
			case ModelPackage.EMPLOYEE__NAME:
				setName((String)newValue);
				return;
			case ModelPackage.EMPLOYEE__RG:
				setRg((String)newValue);
				return;
			case ModelPackage.EMPLOYEE__CPF:
				setCpf((String)newValue);
				return;
			case ModelPackage.EMPLOYEE__ADDRESS:
				setAddress((String)newValue);
				return;
			case ModelPackage.EMPLOYEE__ZIPCODE:
				setZipcode((String)newValue);
				return;
			case ModelPackage.EMPLOYEE__PHONE:
				setPhone((String)newValue);
				return;
			case ModelPackage.EMPLOYEE__MOBILE:
				setMobile((String)newValue);
				return;
			case ModelPackage.EMPLOYEE__WORKING:
				setWorking((Boolean)newValue);
				return;
			case ModelPackage.EMPLOYEE__CONTRACTED:
				setContracted((Date)newValue);
				return;
			case ModelPackage.EMPLOYEE__FIRED:
				setFired((Date)newValue);
				return;
			case ModelPackage.EMPLOYEE__SALARY:
				setSalary((Double)newValue);
				return;
			case ModelPackage.EMPLOYEE__COMISSION:
				setComission((Double)newValue);
				return;
			case ModelPackage.EMPLOYEE__STATUS:
				setStatus((Integer)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ModelPackage.EMPLOYEE__ID:
				setId(ID_EDEFAULT);
				return;
			case ModelPackage.EMPLOYEE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ModelPackage.EMPLOYEE__RG:
				setRg(RG_EDEFAULT);
				return;
			case ModelPackage.EMPLOYEE__CPF:
				setCpf(CPF_EDEFAULT);
				return;
			case ModelPackage.EMPLOYEE__ADDRESS:
				setAddress(ADDRESS_EDEFAULT);
				return;
			case ModelPackage.EMPLOYEE__ZIPCODE:
				setZipcode(ZIPCODE_EDEFAULT);
				return;
			case ModelPackage.EMPLOYEE__PHONE:
				setPhone(PHONE_EDEFAULT);
				return;
			case ModelPackage.EMPLOYEE__MOBILE:
				setMobile(MOBILE_EDEFAULT);
				return;
			case ModelPackage.EMPLOYEE__WORKING:
				setWorking(WORKING_EDEFAULT);
				return;
			case ModelPackage.EMPLOYEE__CONTRACTED:
				setContracted(CONTRACTED_EDEFAULT);
				return;
			case ModelPackage.EMPLOYEE__FIRED:
				setFired(FIRED_EDEFAULT);
				return;
			case ModelPackage.EMPLOYEE__SALARY:
				setSalary(SALARY_EDEFAULT);
				return;
			case ModelPackage.EMPLOYEE__COMISSION:
				setComission(COMISSION_EDEFAULT);
				return;
			case ModelPackage.EMPLOYEE__STATUS:
				setStatus(STATUS_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ModelPackage.EMPLOYEE__ID:
				return id != ID_EDEFAULT;
			case ModelPackage.EMPLOYEE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ModelPackage.EMPLOYEE__RG:
				return RG_EDEFAULT == null ? rg != null : !RG_EDEFAULT.equals(rg);
			case ModelPackage.EMPLOYEE__CPF:
				return CPF_EDEFAULT == null ? cpf != null : !CPF_EDEFAULT.equals(cpf);
			case ModelPackage.EMPLOYEE__ADDRESS:
				return ADDRESS_EDEFAULT == null ? address != null : !ADDRESS_EDEFAULT.equals(address);
			case ModelPackage.EMPLOYEE__ZIPCODE:
				return ZIPCODE_EDEFAULT == null ? zipcode != null : !ZIPCODE_EDEFAULT.equals(zipcode);
			case ModelPackage.EMPLOYEE__PHONE:
				return PHONE_EDEFAULT == null ? phone != null : !PHONE_EDEFAULT.equals(phone);
			case ModelPackage.EMPLOYEE__MOBILE:
				return MOBILE_EDEFAULT == null ? mobile != null : !MOBILE_EDEFAULT.equals(mobile);
			case ModelPackage.EMPLOYEE__WORKING:
				return working != WORKING_EDEFAULT;
			case ModelPackage.EMPLOYEE__CONTRACTED:
				return CONTRACTED_EDEFAULT == null ? contracted != null : !CONTRACTED_EDEFAULT.equals(contracted);
			case ModelPackage.EMPLOYEE__FIRED:
				return FIRED_EDEFAULT == null ? fired != null : !FIRED_EDEFAULT.equals(fired);
			case ModelPackage.EMPLOYEE__SALARY:
				return salary != SALARY_EDEFAULT;
			case ModelPackage.EMPLOYEE__COMISSION:
				return comission != COMISSION_EDEFAULT;
			case ModelPackage.EMPLOYEE__STATUS:
				return status != STATUS_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(", name: ");
		result.append(name);
		result.append(", rg: ");
		result.append(rg);
		result.append(", cpf: ");
		result.append(cpf);
		result.append(", address: ");
		result.append(address);
		result.append(", zipcode: ");
		result.append(zipcode);
		result.append(", phone: ");
		result.append(phone);
		result.append(", mobile: ");
		result.append(mobile);
		result.append(", working: ");
		result.append(working);
		result.append(", contracted: ");
		result.append(contracted);
		result.append(", fired: ");
		result.append(fired);
		result.append(", salary: ");
		result.append(salary);
		result.append(", comission: ");
		result.append(comission);
		result.append(", status: ");
		result.append(status);
		result.append(')');
		return result.toString();
	}

} //EmployeeImpl
