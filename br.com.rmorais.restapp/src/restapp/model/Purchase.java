/**
 */
package restapp.model;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Purchase</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link restapp.model.Purchase#getId <em>Id</em>}</li>
 *   <li>{@link restapp.model.Purchase#getDate <em>Date</em>}</li>
 *   <li>{@link restapp.model.Purchase#getTotalValue <em>Total Value</em>}</li>
 *   <li>{@link restapp.model.Purchase#getDiscount <em>Discount</em>}</li>
 *   <li>{@link restapp.model.Purchase#getTotalWithDiscount <em>Total With Discount</em>}</li>
 *   <li>{@link restapp.model.Purchase#getNewEReference1 <em>New EReference1</em>}</li>
 *   <li>{@link restapp.model.Purchase#getNewEReference2 <em>New EReference2</em>}</li>
 * </ul>
 * </p>
 *
 * @see restapp.model.ModelPackage#getPurchase()
 * @model
 * @generated
 */
public interface Purchase extends EObject {
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
	 * @see restapp.model.ModelPackage#getPurchase_Id()
	 * @model
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link restapp.model.Purchase#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' attribute.
	 * @see #setDate(Date)
	 * @see restapp.model.ModelPackage#getPurchase_Date()
	 * @model
	 * @generated
	 */
	Date getDate();

	/**
	 * Sets the value of the '{@link restapp.model.Purchase#getDate <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' attribute.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(Date value);

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
	 * @see restapp.model.ModelPackage#getPurchase_TotalValue()
	 * @model
	 * @generated
	 */
	double getTotalValue();

	/**
	 * Sets the value of the '{@link restapp.model.Purchase#getTotalValue <em>Total Value</em>}' attribute.
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
	 * @see restapp.model.ModelPackage#getPurchase_Discount()
	 * @model
	 * @generated
	 */
	int getDiscount();

	/**
	 * Sets the value of the '{@link restapp.model.Purchase#getDiscount <em>Discount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Discount</em>' attribute.
	 * @see #getDiscount()
	 * @generated
	 */
	void setDiscount(int value);

	/**
	 * Returns the value of the '<em><b>Total With Discount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Total With Discount</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total With Discount</em>' attribute.
	 * @see #setTotalWithDiscount(double)
	 * @see restapp.model.ModelPackage#getPurchase_TotalWithDiscount()
	 * @model
	 * @generated
	 */
	double getTotalWithDiscount();

	/**
	 * Sets the value of the '{@link restapp.model.Purchase#getTotalWithDiscount <em>Total With Discount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total With Discount</em>' attribute.
	 * @see #getTotalWithDiscount()
	 * @generated
	 */
	void setTotalWithDiscount(double value);

	/**
	 * Returns the value of the '<em><b>New EReference1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>New EReference1</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New EReference1</em>' reference.
	 * @see #setNewEReference1(Provider)
	 * @see restapp.model.ModelPackage#getPurchase_NewEReference1()
	 * @model
	 * @generated
	 */
	Provider getNewEReference1();

	/**
	 * Sets the value of the '{@link restapp.model.Purchase#getNewEReference1 <em>New EReference1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New EReference1</em>' reference.
	 * @see #getNewEReference1()
	 * @generated
	 */
	void setNewEReference1(Provider value);

	/**
	 * Returns the value of the '<em><b>New EReference2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>New EReference2</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New EReference2</em>' reference.
	 * @see #setNewEReference2(User)
	 * @see restapp.model.ModelPackage#getPurchase_NewEReference2()
	 * @model
	 * @generated
	 */
	User getNewEReference2();

	/**
	 * Sets the value of the '{@link restapp.model.Purchase#getNewEReference2 <em>New EReference2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New EReference2</em>' reference.
	 * @see #getNewEReference2()
	 * @generated
	 */
	void setNewEReference2(User value);

} // Purchase
