/**
 */
package restapp.model.impl;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import restapp.model.Card;
import restapp.model.ModelPackage;
import restapp.model.Product;
import restapp.model.ProductsCard;
import restapp.model.User;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Products Card</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link restapp.model.impl.ProductsCardImpl#getId <em>Id</em>}</li>
 *   <li>{@link restapp.model.impl.ProductsCardImpl#getNewEReference1 <em>New EReference1</em>}</li>
 *   <li>{@link restapp.model.impl.ProductsCardImpl#getNewEReference2 <em>New EReference2</em>}</li>
 *   <li>{@link restapp.model.impl.ProductsCardImpl#getNewEReference3 <em>New EReference3</em>}</li>
 *   <li>{@link restapp.model.impl.ProductsCardImpl#getDate <em>Date</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProductsCardImpl extends MinimalEObjectImpl.Container implements ProductsCard {
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
	 * The cached value of the '{@link #getNewEReference1() <em>New EReference1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewEReference1()
	 * @generated
	 * @ordered
	 */
	protected Product newEReference1;

	/**
	 * The cached value of the '{@link #getNewEReference2() <em>New EReference2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewEReference2()
	 * @generated
	 * @ordered
	 */
	protected Card newEReference2;

	/**
	 * The cached value of the '{@link #getNewEReference3() <em>New EReference3</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewEReference3()
	 * @generated
	 * @ordered
	 */
	protected User newEReference3;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductsCardImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.PRODUCTS_CARD;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PRODUCTS_CARD__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Product getNewEReference1() {
		if (newEReference1 != null && newEReference1.eIsProxy()) {
			InternalEObject oldNewEReference1 = (InternalEObject)newEReference1;
			newEReference1 = (Product)eResolveProxy(oldNewEReference1);
			if (newEReference1 != oldNewEReference1) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.PRODUCTS_CARD__NEW_EREFERENCE1, oldNewEReference1, newEReference1));
			}
		}
		return newEReference1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Product basicGetNewEReference1() {
		return newEReference1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNewEReference1(Product newNewEReference1) {
		Product oldNewEReference1 = newEReference1;
		newEReference1 = newNewEReference1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PRODUCTS_CARD__NEW_EREFERENCE1, oldNewEReference1, newEReference1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Card getNewEReference2() {
		if (newEReference2 != null && newEReference2.eIsProxy()) {
			InternalEObject oldNewEReference2 = (InternalEObject)newEReference2;
			newEReference2 = (Card)eResolveProxy(oldNewEReference2);
			if (newEReference2 != oldNewEReference2) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.PRODUCTS_CARD__NEW_EREFERENCE2, oldNewEReference2, newEReference2));
			}
		}
		return newEReference2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Card basicGetNewEReference2() {
		return newEReference2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNewEReference2(Card newNewEReference2) {
		Card oldNewEReference2 = newEReference2;
		newEReference2 = newNewEReference2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PRODUCTS_CARD__NEW_EREFERENCE2, oldNewEReference2, newEReference2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public User getNewEReference3() {
		if (newEReference3 != null && newEReference3.eIsProxy()) {
			InternalEObject oldNewEReference3 = (InternalEObject)newEReference3;
			newEReference3 = (User)eResolveProxy(oldNewEReference3);
			if (newEReference3 != oldNewEReference3) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.PRODUCTS_CARD__NEW_EREFERENCE3, oldNewEReference3, newEReference3));
			}
		}
		return newEReference3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public User basicGetNewEReference3() {
		return newEReference3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNewEReference3(User newNewEReference3) {
		User oldNewEReference3 = newEReference3;
		newEReference3 = newNewEReference3;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PRODUCTS_CARD__NEW_EREFERENCE3, oldNewEReference3, newEReference3));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PRODUCTS_CARD__DATE, oldDate, date));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.PRODUCTS_CARD__ID:
				return getId();
			case ModelPackage.PRODUCTS_CARD__NEW_EREFERENCE1:
				if (resolve) return getNewEReference1();
				return basicGetNewEReference1();
			case ModelPackage.PRODUCTS_CARD__NEW_EREFERENCE2:
				if (resolve) return getNewEReference2();
				return basicGetNewEReference2();
			case ModelPackage.PRODUCTS_CARD__NEW_EREFERENCE3:
				if (resolve) return getNewEReference3();
				return basicGetNewEReference3();
			case ModelPackage.PRODUCTS_CARD__DATE:
				return getDate();
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
			case ModelPackage.PRODUCTS_CARD__ID:
				setId((Integer)newValue);
				return;
			case ModelPackage.PRODUCTS_CARD__NEW_EREFERENCE1:
				setNewEReference1((Product)newValue);
				return;
			case ModelPackage.PRODUCTS_CARD__NEW_EREFERENCE2:
				setNewEReference2((Card)newValue);
				return;
			case ModelPackage.PRODUCTS_CARD__NEW_EREFERENCE3:
				setNewEReference3((User)newValue);
				return;
			case ModelPackage.PRODUCTS_CARD__DATE:
				setDate((Date)newValue);
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
			case ModelPackage.PRODUCTS_CARD__ID:
				setId(ID_EDEFAULT);
				return;
			case ModelPackage.PRODUCTS_CARD__NEW_EREFERENCE1:
				setNewEReference1((Product)null);
				return;
			case ModelPackage.PRODUCTS_CARD__NEW_EREFERENCE2:
				setNewEReference2((Card)null);
				return;
			case ModelPackage.PRODUCTS_CARD__NEW_EREFERENCE3:
				setNewEReference3((User)null);
				return;
			case ModelPackage.PRODUCTS_CARD__DATE:
				setDate(DATE_EDEFAULT);
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
			case ModelPackage.PRODUCTS_CARD__ID:
				return id != ID_EDEFAULT;
			case ModelPackage.PRODUCTS_CARD__NEW_EREFERENCE1:
				return newEReference1 != null;
			case ModelPackage.PRODUCTS_CARD__NEW_EREFERENCE2:
				return newEReference2 != null;
			case ModelPackage.PRODUCTS_CARD__NEW_EREFERENCE3:
				return newEReference3 != null;
			case ModelPackage.PRODUCTS_CARD__DATE:
				return DATE_EDEFAULT == null ? date != null : !DATE_EDEFAULT.equals(date);
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
		result.append(')');
		return result.toString();
	}

} //ProductsCardImpl
