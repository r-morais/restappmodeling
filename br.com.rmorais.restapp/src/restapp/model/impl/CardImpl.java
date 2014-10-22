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
import restapp.model.PhysicalCard;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Card</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link restapp.model.impl.CardImpl#getId <em>Id</em>}</li>
 *   <li>{@link restapp.model.impl.CardImpl#getSellDate <em>Sell Date</em>}</li>
 *   <li>{@link restapp.model.impl.CardImpl#getTotalValue <em>Total Value</em>}</li>
 *   <li>{@link restapp.model.impl.CardImpl#getDiscount <em>Discount</em>}</li>
 *   <li>{@link restapp.model.impl.CardImpl#getTotalValueWithDiscount <em>Total Value With Discount</em>}</li>
 *   <li>{@link restapp.model.impl.CardImpl#getPayedValue <em>Payed Value</em>}</li>
 *   <li>{@link restapp.model.impl.CardImpl#getChange <em>Change</em>}</li>
 *   <li>{@link restapp.model.impl.CardImpl#getNewEReference1 <em>New EReference1</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CardImpl extends MinimalEObjectImpl.Container implements Card {
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
	 * The default value of the '{@link #getSellDate() <em>Sell Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSellDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date SELL_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSellDate() <em>Sell Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSellDate()
	 * @generated
	 * @ordered
	 */
	protected Date sellDate = SELL_DATE_EDEFAULT;

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
	 * The default value of the '{@link #getTotalValueWithDiscount() <em>Total Value With Discount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalValueWithDiscount()
	 * @generated
	 * @ordered
	 */
	protected static final double TOTAL_VALUE_WITH_DISCOUNT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getTotalValueWithDiscount() <em>Total Value With Discount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalValueWithDiscount()
	 * @generated
	 * @ordered
	 */
	protected double totalValueWithDiscount = TOTAL_VALUE_WITH_DISCOUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getPayedValue() <em>Payed Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPayedValue()
	 * @generated
	 * @ordered
	 */
	protected static final double PAYED_VALUE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPayedValue() <em>Payed Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPayedValue()
	 * @generated
	 * @ordered
	 */
	protected double payedValue = PAYED_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getChange() <em>Change</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChange()
	 * @generated
	 * @ordered
	 */
	protected static final double CHANGE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getChange() <em>Change</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChange()
	 * @generated
	 * @ordered
	 */
	protected double change = CHANGE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getNewEReference1() <em>New EReference1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewEReference1()
	 * @generated
	 * @ordered
	 */
	protected PhysicalCard newEReference1;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CardImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.CARD;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.CARD__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getSellDate() {
		return sellDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSellDate(Date newSellDate) {
		Date oldSellDate = sellDate;
		sellDate = newSellDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.CARD__SELL_DATE, oldSellDate, sellDate));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.CARD__TOTAL_VALUE, oldTotalValue, totalValue));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.CARD__DISCOUNT, oldDiscount, discount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getTotalValueWithDiscount() {
		return totalValueWithDiscount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTotalValueWithDiscount(double newTotalValueWithDiscount) {
		double oldTotalValueWithDiscount = totalValueWithDiscount;
		totalValueWithDiscount = newTotalValueWithDiscount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.CARD__TOTAL_VALUE_WITH_DISCOUNT, oldTotalValueWithDiscount, totalValueWithDiscount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPayedValue() {
		return payedValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPayedValue(double newPayedValue) {
		double oldPayedValue = payedValue;
		payedValue = newPayedValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.CARD__PAYED_VALUE, oldPayedValue, payedValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getChange() {
		return change;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChange(double newChange) {
		double oldChange = change;
		change = newChange;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.CARD__CHANGE, oldChange, change));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalCard getNewEReference1() {
		if (newEReference1 != null && newEReference1.eIsProxy()) {
			InternalEObject oldNewEReference1 = (InternalEObject)newEReference1;
			newEReference1 = (PhysicalCard)eResolveProxy(oldNewEReference1);
			if (newEReference1 != oldNewEReference1) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.CARD__NEW_EREFERENCE1, oldNewEReference1, newEReference1));
			}
		}
		return newEReference1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalCard basicGetNewEReference1() {
		return newEReference1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNewEReference1(PhysicalCard newNewEReference1) {
		PhysicalCard oldNewEReference1 = newEReference1;
		newEReference1 = newNewEReference1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.CARD__NEW_EREFERENCE1, oldNewEReference1, newEReference1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.CARD__ID:
				return getId();
			case ModelPackage.CARD__SELL_DATE:
				return getSellDate();
			case ModelPackage.CARD__TOTAL_VALUE:
				return getTotalValue();
			case ModelPackage.CARD__DISCOUNT:
				return getDiscount();
			case ModelPackage.CARD__TOTAL_VALUE_WITH_DISCOUNT:
				return getTotalValueWithDiscount();
			case ModelPackage.CARD__PAYED_VALUE:
				return getPayedValue();
			case ModelPackage.CARD__CHANGE:
				return getChange();
			case ModelPackage.CARD__NEW_EREFERENCE1:
				if (resolve) return getNewEReference1();
				return basicGetNewEReference1();
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
			case ModelPackage.CARD__ID:
				setId((Integer)newValue);
				return;
			case ModelPackage.CARD__SELL_DATE:
				setSellDate((Date)newValue);
				return;
			case ModelPackage.CARD__TOTAL_VALUE:
				setTotalValue((Double)newValue);
				return;
			case ModelPackage.CARD__DISCOUNT:
				setDiscount((Integer)newValue);
				return;
			case ModelPackage.CARD__TOTAL_VALUE_WITH_DISCOUNT:
				setTotalValueWithDiscount((Double)newValue);
				return;
			case ModelPackage.CARD__PAYED_VALUE:
				setPayedValue((Double)newValue);
				return;
			case ModelPackage.CARD__CHANGE:
				setChange((Double)newValue);
				return;
			case ModelPackage.CARD__NEW_EREFERENCE1:
				setNewEReference1((PhysicalCard)newValue);
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
			case ModelPackage.CARD__ID:
				setId(ID_EDEFAULT);
				return;
			case ModelPackage.CARD__SELL_DATE:
				setSellDate(SELL_DATE_EDEFAULT);
				return;
			case ModelPackage.CARD__TOTAL_VALUE:
				setTotalValue(TOTAL_VALUE_EDEFAULT);
				return;
			case ModelPackage.CARD__DISCOUNT:
				setDiscount(DISCOUNT_EDEFAULT);
				return;
			case ModelPackage.CARD__TOTAL_VALUE_WITH_DISCOUNT:
				setTotalValueWithDiscount(TOTAL_VALUE_WITH_DISCOUNT_EDEFAULT);
				return;
			case ModelPackage.CARD__PAYED_VALUE:
				setPayedValue(PAYED_VALUE_EDEFAULT);
				return;
			case ModelPackage.CARD__CHANGE:
				setChange(CHANGE_EDEFAULT);
				return;
			case ModelPackage.CARD__NEW_EREFERENCE1:
				setNewEReference1((PhysicalCard)null);
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
			case ModelPackage.CARD__ID:
				return id != ID_EDEFAULT;
			case ModelPackage.CARD__SELL_DATE:
				return SELL_DATE_EDEFAULT == null ? sellDate != null : !SELL_DATE_EDEFAULT.equals(sellDate);
			case ModelPackage.CARD__TOTAL_VALUE:
				return totalValue != TOTAL_VALUE_EDEFAULT;
			case ModelPackage.CARD__DISCOUNT:
				return discount != DISCOUNT_EDEFAULT;
			case ModelPackage.CARD__TOTAL_VALUE_WITH_DISCOUNT:
				return totalValueWithDiscount != TOTAL_VALUE_WITH_DISCOUNT_EDEFAULT;
			case ModelPackage.CARD__PAYED_VALUE:
				return payedValue != PAYED_VALUE_EDEFAULT;
			case ModelPackage.CARD__CHANGE:
				return change != CHANGE_EDEFAULT;
			case ModelPackage.CARD__NEW_EREFERENCE1:
				return newEReference1 != null;
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
		result.append(", sellDate: ");
		result.append(sellDate);
		result.append(", totalValue: ");
		result.append(totalValue);
		result.append(", discount: ");
		result.append(discount);
		result.append(", totalValueWithDiscount: ");
		result.append(totalValueWithDiscount);
		result.append(", payedValue: ");
		result.append(payedValue);
		result.append(", change: ");
		result.append(change);
		result.append(')');
		return result.toString();
	}

} //CardImpl
