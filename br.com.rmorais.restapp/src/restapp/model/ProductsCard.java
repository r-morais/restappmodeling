/**
 */
package restapp.model;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Products Card</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link restapp.model.ProductsCard#getId <em>Id</em>}</li>
 *   <li>{@link restapp.model.ProductsCard#getNewEReference1 <em>New EReference1</em>}</li>
 *   <li>{@link restapp.model.ProductsCard#getNewEReference2 <em>New EReference2</em>}</li>
 *   <li>{@link restapp.model.ProductsCard#getNewEReference3 <em>New EReference3</em>}</li>
 *   <li>{@link restapp.model.ProductsCard#getDate <em>Date</em>}</li>
 * </ul>
 * </p>
 *
 * @see restapp.model.ModelPackage#getProductsCard()
 * @model
 * @generated
 */
public interface ProductsCard extends EObject {
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
	 * @see restapp.model.ModelPackage#getProductsCard_Id()
	 * @model
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link restapp.model.ProductsCard#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>New EReference1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>New EReference1</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New EReference1</em>' reference.
	 * @see #setNewEReference1(Product)
	 * @see restapp.model.ModelPackage#getProductsCard_NewEReference1()
	 * @model
	 * @generated
	 */
	Product getNewEReference1();

	/**
	 * Sets the value of the '{@link restapp.model.ProductsCard#getNewEReference1 <em>New EReference1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New EReference1</em>' reference.
	 * @see #getNewEReference1()
	 * @generated
	 */
	void setNewEReference1(Product value);

	/**
	 * Returns the value of the '<em><b>New EReference2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>New EReference2</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New EReference2</em>' reference.
	 * @see #setNewEReference2(Card)
	 * @see restapp.model.ModelPackage#getProductsCard_NewEReference2()
	 * @model
	 * @generated
	 */
	Card getNewEReference2();

	/**
	 * Sets the value of the '{@link restapp.model.ProductsCard#getNewEReference2 <em>New EReference2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New EReference2</em>' reference.
	 * @see #getNewEReference2()
	 * @generated
	 */
	void setNewEReference2(Card value);

	/**
	 * Returns the value of the '<em><b>New EReference3</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>New EReference3</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New EReference3</em>' reference.
	 * @see #setNewEReference3(User)
	 * @see restapp.model.ModelPackage#getProductsCard_NewEReference3()
	 * @model
	 * @generated
	 */
	User getNewEReference3();

	/**
	 * Sets the value of the '{@link restapp.model.ProductsCard#getNewEReference3 <em>New EReference3</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New EReference3</em>' reference.
	 * @see #getNewEReference3()
	 * @generated
	 */
	void setNewEReference3(User value);

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
	 * @see restapp.model.ModelPackage#getProductsCard_Date()
	 * @model
	 * @generated
	 */
	Date getDate();

	/**
	 * Sets the value of the '{@link restapp.model.ProductsCard#getDate <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' attribute.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(Date value);

} // ProductsCard
