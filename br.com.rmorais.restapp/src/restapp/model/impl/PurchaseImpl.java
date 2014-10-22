/**
 */
package restapp.model.impl;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import restapp.model.ModelPackage;
import restapp.model.Provider;
import restapp.model.Purchase;
import restapp.model.User;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Purchase</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link restapp.model.impl.PurchaseImpl#getId <em>Id</em>}</li>
 *   <li>{@link restapp.model.impl.PurchaseImpl#getDate <em>Date</em>}</li>
 *   <li>{@link restapp.model.impl.PurchaseImpl#getTotalValue <em>Total Value</em>}</li>
 *   <li>{@link restapp.model.impl.PurchaseImpl#getDiscount <em>Discount</em>}</li>
 *   <li>{@link restapp.model.impl.PurchaseImpl#getTotalWithDiscount <em>Total With Discount</em>}</li>
 *   <li>{@link restapp.model.impl.PurchaseImpl#getNewEReference1 <em>New EReference1</em>}</li>
 *   <li>{@link restapp.model.impl.PurchaseImpl#getNewEReference2 <em>New EReference2</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PurchaseImpl extends MinimalEObjectImpl.Container implements Purchase {
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
	 * The default value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected Date date = DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTotalValue() <em>Total Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalValue()
	 * @generated
	 * @ordered
	 */
	protected static final double TOTAL_VALUE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getTotalValue() <em>Total Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalValue()
	 * @generated
	 * @ordered
	 */
	protected double totalValue = TOTAL_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDiscount() <em>Discount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiscount()
	 * @generated
	 * @ordered
	 */
	protected static final int DISCOUNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDiscount() <em>Discount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiscount()
	 * @generated
	 * @ordered
	 */
	protected int discount = DISCOUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getTotalWithDiscount() <em>Total With Discount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalWithDiscount()
	 * @generated
	 * @ordered
	 */
	protected static final double TOTAL_WITH_DISCOUNT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getTotalWithDiscount() <em>Total With Discount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalWithDiscount()
	 * @generated
	 * @ordered
	 */
	protected double totalWithDiscount = TOTAL_WITH_DISCOUNT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getNewEReference1() <em>New EReference1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewEReference1()
	 * @generated
	 * @ordered
	 */
	protected Provider newEReference1;

	/**
	 * The cached value of the '{@link #getNewEReference2() <em>New EReference2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewEReference2()
	 * @generated
	 * @ordered
	 */
	protected User newEReference2;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PurchaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.PURCHASE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PURCHASE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDate(Date newDate) {
		Date oldDate = date;
		date = newDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PURCHASE__DATE, oldDate, date));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getTotalValue() {
		return totalValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTotalValue(double newTotalValue) {
		double oldTotalValue = totalValue;
		totalValue = newTotalValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PURCHASE__TOTAL_VALUE, oldTotalValue, totalValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDiscount() {
		return discount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiscount(int newDiscount) {
		int oldDiscount = discount;
		discount = newDiscount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PURCHASE__DISCOUNT, oldDiscount, discount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getTotalWithDiscount() {
		return totalWithDiscount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTotalWithDiscount(double newTotalWithDiscount) {
		double oldTotalWithDiscount = totalWithDiscount;
		totalWithDiscount = newTotalWithDiscount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PURCHASE__TOTAL_WITH_DISCOUNT, oldTotalWithDiscount, totalWithDiscount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Provider getNewEReference1() {
		if (newEReference1 != null && newEReference1.eIsProxy()) {
			InternalEObject oldNewEReference1 = (InternalEObject)newEReference1;
			newEReference1 = (Provider)eResolveProxy(oldNewEReference1);
			if (newEReference1 != oldNewEReference1) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.PURCHASE__NEW_EREFERENCE1, oldNewEReference1, newEReference1));
			}
		}
		return newEReference1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Provider basicGetNewEReference1() {
		return newEReference1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNewEReference1(Provider newNewEReference1) {
		Provider oldNewEReference1 = newEReference1;
		newEReference1 = newNewEReference1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PURCHASE__NEW_EREFERENCE1, oldNewEReference1, newEReference1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public User getNewEReference2() {
		if (newEReference2 != null && newEReference2.eIsProxy()) {
			InternalEObject oldNewEReference2 = (InternalEObject)newEReference2;
			newEReference2 = (User)eResolveProxy(oldNewEReference2);
			if (newEReference2 != oldNewEReference2) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.PURCHASE__NEW_EREFERENCE2, oldNewEReference2, newEReference2));
			}
		}
		return newEReference2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public User basicGetNewEReference2() {
		return newEReference2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNewEReference2(User newNewEReference2) {
		User oldNewEReference2 = newEReference2;
		newEReference2 = newNewEReference2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PURCHASE__NEW_EREFERENCE2, oldNewEReference2, newEReference2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.PURCHASE__ID:
				return getId();
			case ModelPackage.PURCHASE__DATE:
				return getDate();
			case ModelPackage.PURCHASE__TOTAL_VALUE:
				return getTotalValue();
			case ModelPackage.PURCHASE__DISCOUNT:
				return getDiscount();
			case ModelPackage.PURCHASE__TOTAL_WITH_DISCOUNT:
				return getTotalWithDiscount();
			case ModelPackage.PURCHASE__NEW_EREFERENCE1:
				if (resolve) return getNewEReference1();
				return basicGetNewEReference1();
			case ModelPackage.PURCHASE__NEW_EREFERENCE2:
				if (resolve) return getNewEReference2();
				return basicGetNewEReference2();
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
			case ModelPackage.PURCHASE__ID:
				setId((Integer)newValue);
				return;
			case ModelPackage.PURCHASE__DATE:
				setDate((Date)newValue);
				return;
			case ModelPackage.PURCHASE__TOTAL_VALUE:
				setTotalValue((Double)newValue);
				return;
			case ModelPackage.PURCHASE__DISCOUNT:
				setDiscount((Integer)newValue);
				return;
			case ModelPackage.PURCHASE__TOTAL_WITH_DISCOUNT:
				setTotalWithDiscount((Double)newValue);
				return;
			case ModelPackage.PURCHASE__NEW_EREFERENCE1:
				setNewEReference1((Provider)newValue);
				return;
			case ModelPackage.PURCHASE__NEW_EREFERENCE2:
				setNewEReference2((User)newValue);
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
			case ModelPackage.PURCHASE__ID:
				setId(ID_EDEFAULT);
				return;
			case ModelPackage.PURCHASE__DATE:
				setDate(DATE_EDEFAULT);
				return;
			case ModelPackage.PURCHASE__TOTAL_VALUE:
				setTotalValue(TOTAL_VALUE_EDEFAULT);
				return;
			case ModelPackage.PURCHASE__DISCOUNT:
				setDiscount(DISCOUNT_EDEFAULT);
				return;
			case ModelPackage.PURCHASE__TOTAL_WITH_DISCOUNT:
				setTotalWithDiscount(TOTAL_WITH_DISCOUNT_EDEFAULT);
				return;
			case ModelPackage.PURCHASE__NEW_EREFERENCE1:
				setNewEReference1((Provider)null);
				return;
			case ModelPackage.PURCHASE__NEW_EREFERENCE2:
				setNewEReference2((User)null);
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
			case ModelPackage.PURCHASE__ID:
				return id != ID_EDEFAULT;
			case ModelPackage.PURCHASE__DATE:
				return DATE_EDEFAULT == null ? date != null : !DATE_EDEFAULT.equals(date);
			case ModelPackage.PURCHASE__TOTAL_VALUE:
				return totalValue != TOTAL_VALUE_EDEFAULT;
			case ModelPackage.PURCHASE__DISCOUNT:
				return discount != DISCOUNT_EDEFAULT;
			case ModelPackage.PURCHASE__TOTAL_WITH_DISCOUNT:
				return totalWithDiscount != TOTAL_WITH_DISCOUNT_EDEFAULT;
			case ModelPackage.PURCHASE__NEW_EREFERENCE1:
				return newEReference1 != null;
			case ModelPackage.PURCHASE__NEW_EREFERENCE2:
				return newEReference2 != null;
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
		result.append(", date: ");
		result.append(date);
		result.append(", totalValue: ");
		result.append(totalValue);
		result.append(", discount: ");
		result.append(discount);
		result.append(", totalWithDiscount: ");
		result.append(totalWithDiscount);
		result.append(')');
		return result.toString();
	}

} //PurchaseImpl
