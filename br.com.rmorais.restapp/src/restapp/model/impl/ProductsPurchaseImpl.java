/**
 */
package restapp.model.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import restapp.model.ModelPackage;
import restapp.model.Product;
import restapp.model.ProductsPurchase;
import restapp.model.Purchase;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Products Purchase</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link restapp.model.impl.ProductsPurchaseImpl#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link restapp.model.impl.ProductsPurchaseImpl#getUnityValue <em>Unity Value</em>}</li>
 *   <li>{@link restapp.model.impl.ProductsPurchaseImpl#getUnityDiscount <em>Unity Discount</em>}</li>
 *   <li>{@link restapp.model.impl.ProductsPurchaseImpl#getUnityValueWithDiscount <em>Unity Value With Discount</em>}</li>
 *   <li>{@link restapp.model.impl.ProductsPurchaseImpl#getNewEReference1 <em>New EReference1</em>}</li>
 *   <li>{@link restapp.model.impl.ProductsPurchaseImpl#getNewEReference2 <em>New EReference2</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProductsPurchaseImpl extends MinimalEObjectImpl.Container implements ProductsPurchase {
	/**
	 * The default value of the '{@link #getQuantity() <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
	protected static final int QUANTITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getQuantity() <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
	protected int quantity = QUANTITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getUnityValue() <em>Unity Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnityValue()
	 * @generated
	 * @ordered
	 */
	protected static final double UNITY_VALUE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getUnityValue() <em>Unity Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnityValue()
	 * @generated
	 * @ordered
	 */
	protected double unityValue = UNITY_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getUnityDiscount() <em>Unity Discount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnityDiscount()
	 * @generated
	 * @ordered
	 */
	protected static final int UNITY_DISCOUNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getUnityDiscount() <em>Unity Discount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnityDiscount()
	 * @generated
	 * @ordered
	 */
	protected int unityDiscount = UNITY_DISCOUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getUnityValueWithDiscount() <em>Unity Value With Discount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnityValueWithDiscount()
	 * @generated
	 * @ordered
	 */
	protected static final double UNITY_VALUE_WITH_DISCOUNT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getUnityValueWithDiscount() <em>Unity Value With Discount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnityValueWithDiscount()
	 * @generated
	 * @ordered
	 */
	protected double unityValueWithDiscount = UNITY_VALUE_WITH_DISCOUNT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getNewEReference1() <em>New EReference1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewEReference1()
	 * @generated
	 * @ordered
	 */
	protected Purchase newEReference1;

	/**
	 * The cached value of the '{@link #getNewEReference2() <em>New EReference2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewEReference2()
	 * @generated
	 * @ordered
	 */
	protected Product newEReference2;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductsPurchaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.PRODUCTS_PURCHASE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getQuantity() {
		return quantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuantity(int newQuantity) {
		int oldQuantity = quantity;
		quantity = newQuantity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PRODUCTS_PURCHASE__QUANTITY, oldQuantity, quantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getUnityValue() {
		return unityValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnityValue(double newUnityValue) {
		double oldUnityValue = unityValue;
		unityValue = newUnityValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PRODUCTS_PURCHASE__UNITY_VALUE, oldUnityValue, unityValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getUnityDiscount() {
		return unityDiscount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnityDiscount(int newUnityDiscount) {
		int oldUnityDiscount = unityDiscount;
		unityDiscount = newUnityDiscount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PRODUCTS_PURCHASE__UNITY_DISCOUNT, oldUnityDiscount, unityDiscount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getUnityValueWithDiscount() {
		return unityValueWithDiscount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnityValueWithDiscount(double newUnityValueWithDiscount) {
		double oldUnityValueWithDiscount = unityValueWithDiscount;
		unityValueWithDiscount = newUnityValueWithDiscount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PRODUCTS_PURCHASE__UNITY_VALUE_WITH_DISCOUNT, oldUnityValueWithDiscount, unityValueWithDiscount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Purchase getNewEReference1() {
		if (newEReference1 != null && newEReference1.eIsProxy()) {
			InternalEObject oldNewEReference1 = (InternalEObject)newEReference1;
			newEReference1 = (Purchase)eResolveProxy(oldNewEReference1);
			if (newEReference1 != oldNewEReference1) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.PRODUCTS_PURCHASE__NEW_EREFERENCE1, oldNewEReference1, newEReference1));
			}
		}
		return newEReference1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Purchase basicGetNewEReference1() {
		return newEReference1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNewEReference1(Purchase newNewEReference1) {
		Purchase oldNewEReference1 = newEReference1;
		newEReference1 = newNewEReference1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PRODUCTS_PURCHASE__NEW_EREFERENCE1, oldNewEReference1, newEReference1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Product getNewEReference2() {
		if (newEReference2 != null && newEReference2.eIsProxy()) {
			InternalEObject oldNewEReference2 = (InternalEObject)newEReference2;
			newEReference2 = (Product)eResolveProxy(oldNewEReference2);
			if (newEReference2 != oldNewEReference2) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.PRODUCTS_PURCHASE__NEW_EREFERENCE2, oldNewEReference2, newEReference2));
			}
		}
		return newEReference2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Product basicGetNewEReference2() {
		return newEReference2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNewEReference2(Product newNewEReference2) {
		Product oldNewEReference2 = newEReference2;
		newEReference2 = newNewEReference2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PRODUCTS_PURCHASE__NEW_EREFERENCE2, oldNewEReference2, newEReference2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.PRODUCTS_PURCHASE__QUANTITY:
				return getQuantity();
			case ModelPackage.PRODUCTS_PURCHASE__UNITY_VALUE:
				return getUnityValue();
			case ModelPackage.PRODUCTS_PURCHASE__UNITY_DISCOUNT:
				return getUnityDiscount();
			case ModelPackage.PRODUCTS_PURCHASE__UNITY_VALUE_WITH_DISCOUNT:
				return getUnityValueWithDiscount();
			case ModelPackage.PRODUCTS_PURCHASE__NEW_EREFERENCE1:
				if (resolve) return getNewEReference1();
				return basicGetNewEReference1();
			case ModelPackage.PRODUCTS_PURCHASE__NEW_EREFERENCE2:
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
			case ModelPackage.PRODUCTS_PURCHASE__QUANTITY:
				setQuantity((Integer)newValue);
				return;
			case ModelPackage.PRODUCTS_PURCHASE__UNITY_VALUE:
				setUnityValue((Double)newValue);
				return;
			case ModelPackage.PRODUCTS_PURCHASE__UNITY_DISCOUNT:
				setUnityDiscount((Integer)newValue);
				return;
			case ModelPackage.PRODUCTS_PURCHASE__UNITY_VALUE_WITH_DISCOUNT:
				setUnityValueWithDiscount((Double)newValue);
				return;
			case ModelPackage.PRODUCTS_PURCHASE__NEW_EREFERENCE1:
				setNewEReference1((Purchase)newValue);
				return;
			case ModelPackage.PRODUCTS_PURCHASE__NEW_EREFERENCE2:
				setNewEReference2((Product)newValue);
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
			case ModelPackage.PRODUCTS_PURCHASE__QUANTITY:
				setQuantity(QUANTITY_EDEFAULT);
				return;
			case ModelPackage.PRODUCTS_PURCHASE__UNITY_VALUE:
				setUnityValue(UNITY_VALUE_EDEFAULT);
				return;
			case ModelPackage.PRODUCTS_PURCHASE__UNITY_DISCOUNT:
				setUnityDiscount(UNITY_DISCOUNT_EDEFAULT);
				return;
			case ModelPackage.PRODUCTS_PURCHASE__UNITY_VALUE_WITH_DISCOUNT:
				setUnityValueWithDiscount(UNITY_VALUE_WITH_DISCOUNT_EDEFAULT);
				return;
			case ModelPackage.PRODUCTS_PURCHASE__NEW_EREFERENCE1:
				setNewEReference1((Purchase)null);
				return;
			case ModelPackage.PRODUCTS_PURCHASE__NEW_EREFERENCE2:
				setNewEReference2((Product)null);
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
			case ModelPackage.PRODUCTS_PURCHASE__QUANTITY:
				return quantity != QUANTITY_EDEFAULT;
			case ModelPackage.PRODUCTS_PURCHASE__UNITY_VALUE:
				return unityValue != UNITY_VALUE_EDEFAULT;
			case ModelPackage.PRODUCTS_PURCHASE__UNITY_DISCOUNT:
				return unityDiscount != UNITY_DISCOUNT_EDEFAULT;
			case ModelPackage.PRODUCTS_PURCHASE__UNITY_VALUE_WITH_DISCOUNT:
				return unityValueWithDiscount != UNITY_VALUE_WITH_DISCOUNT_EDEFAULT;
			case ModelPackage.PRODUCTS_PURCHASE__NEW_EREFERENCE1:
				return newEReference1 != null;
			case ModelPackage.PRODUCTS_PURCHASE__NEW_EREFERENCE2:
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
		result.append(" (quantity: ");
		result.append(quantity);
		result.append(", unityValue: ");
		result.append(unityValue);
		result.append(", unityDiscount: ");
		result.append(unityDiscount);
		result.append(", unityValueWithDiscount: ");
		result.append(unityValueWithDiscount);
		result.append(')');
		return result.toString();
	}

} //ProductsPurchaseImpl
