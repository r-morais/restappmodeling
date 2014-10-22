/**
 */
package restapp.model;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Card</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link restapp.model.Card#getId <em>Id</em>}</li>
 *   <li>{@link restapp.model.Card#getSellDate <em>Sell Date</em>}</li>
 *   <li>{@link restapp.model.Card#getTotalValue <em>Total Value</em>}</li>
 *   <li>{@link restapp.model.Card#getDiscount <em>Discount</em>}</li>
 *   <li>{@link restapp.model.Card#getTotalValueWithDiscount <em>Total Value With Discount</em>}</li>
 *   <li>{@link restapp.model.Card#getPayedValue <em>Payed Value</em>}</li>
 *   <li>{@link restapp.model.Card#getChange <em>Change</em>}</li>
 *   <li>{@link restapp.model.Card#getNewEReference1 <em>New EReference1</em>}</li>
 * </ul>
 * </p>
 *
 * @see restapp.model.ModelPackage#getCard()
 * @model
 * @generated
 */
public interface Card extends EObject {
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
	 * @see restapp.model.ModelPackage#getCard_Id()
	 * @model
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link restapp.model.Card#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Sell Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sell Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sell Date</em>' attribute.
	 * @see #setSellDate(Date)
	 * @see restapp.model.ModelPackage#getCard_SellDate()
	 * @model
	 * @generated
	 */
	Date getSellDate();

	/**
	 * Sets the value of the '{@link restapp.model.Card#getSellDate <em>Sell Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sell Date</em>' attribute.
	 * @see #getSellDate()
	 * @generated
	 */
	void setSellDate(Date value);

	/**
	 * Returns the value of the '<em><b>Total Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Total Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Value</em>' attribute.
	 * @see #setTotalValue(double)
	 * @see restapp.model.ModelPackage#getCard_TotalValue()
	 * @model
	 * @generated
	 */
	double getTotalValue();

	/**
	 * Sets the value of the '{@link restapp.model.Card#getTotalValue <em>Total Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Value</em>' attribute.
	 * @see #getTotalValue()
	 * @generated
	 */
	void setTotalValue(double value);

	/**
	 * Returns the value of the '<em><b>Discount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Discount</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Discount</em>' attribute.
	 * @see #setDiscount(int)
	 * @see restapp.model.ModelPackage#getCard_Discount()
	 * @model
	 * @generated
	 */
	int getDiscount();

	/**
	 * Sets the value of the '{@link restapp.model.Card#getDiscount <em>Discount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Discount</em>' attribute.
	 * @see #getDiscount()
	 * @generated
	 */
	void setDiscount(int value);

	/**
	 * Returns the value of the '<em><b>Total Value With Discount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Total Value With Discount</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Value With Discount</em>' attribute.
	 * @see #setTotalValueWithDiscount(double)
	 * @see restapp.model.ModelPackage#getCard_TotalValueWithDiscount()
	 * @model
	 * @generated
	 */
	double getTotalValueWithDiscount();

	/**
	 * Sets the value of the '{@link restapp.model.Card#getTotalValueWithDiscount <em>Total Value With Discount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Value With Discount</em>' attribute.
	 * @see #getTotalValueWithDiscount()
	 * @generated
	 */
	void setTotalValueWithDiscount(double value);

	/**
	 * Returns the value of the '<em><b>Payed Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Payed Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payed Value</em>' attribute.
	 * @see #setPayedValue(double)
	 * @see restapp.model.ModelPackage#getCard_PayedValue()
	 * @model
	 * @generated
	 */
	double getPayedValue();

	/**
	 * Sets the value of the '{@link restapp.model.Card#getPayedValue <em>Payed Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payed Value</em>' attribute.
	 * @see #getPayedValue()
	 * @generated
	 */
	void setPayedValue(double value);

	/**
	 * Returns the value of the '<em><b>Change</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Change</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change</em>' attribute.
	 * @see #setChange(double)
	 * @see restapp.model.ModelPackage#getCard_Change()
	 * @model
	 * @generated
	 */
	double getChange();

	/**
	 * Sets the value of the '{@link restapp.model.Card#getChange <em>Change</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Change</em>' attribute.
	 * @see #getChange()
	 * @generated
	 */
	void setChange(double value);

	/**
	 * Returns the value of the '<em><b>New EReference1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>New EReference1</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New EReference1</em>' reference.
	 * @see #setNewEReference1(PhysicalCard)
	 * @see restapp.model.ModelPackage#getCard_NewEReference1()
	 * @model
	 * @generated
	 */
	PhysicalCard getNewEReference1();

	/**
	 * Sets the value of the '{@link restapp.model.Card#getNewEReference1 <em>New EReference1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New EReference1</em>' reference.
	 * @see #getNewEReference1()
	 * @generated
	 */
	void setNewEReference1(PhysicalCard value);

} // Card
