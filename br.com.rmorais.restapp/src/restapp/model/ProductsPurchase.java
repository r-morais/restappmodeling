/**
 */
package restapp.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Products Purchase</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link restapp.model.ProductsPurchase#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link restapp.model.ProductsPurchase#getUnityValue <em>Unity Value</em>}</li>
 *   <li>{@link restapp.model.ProductsPurchase#getUnityDiscount <em>Unity Discount</em>}</li>
 *   <li>{@link restapp.model.ProductsPurchase#getUnityValueWithDiscount <em>Unity Value With Discount</em>}</li>
 *   <li>{@link restapp.model.ProductsPurchase#getNewEReference1 <em>New EReference1</em>}</li>
 *   <li>{@link restapp.model.ProductsPurchase#getNewEReference2 <em>New EReference2</em>}</li>
 * </ul>
 * </p>
 *
 * @see restapp.model.ModelPackage#getProductsPurchase()
 * @model
 * @generated
 */
public interface ProductsPurchase extends EObject {
	/**
	 * Returns the value of the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantity</em>' attribute.
	 * @see #setQuantity(int)
	 * @see restapp.model.ModelPackage#getProductsPurchase_Quantity()
	 * @model
	 * @generated
	 */
	int getQuantity();

	/**
	 * Sets the value of the '{@link restapp.model.ProductsPurchase#getQuantity <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity</em>' attribute.
	 * @see #getQuantity()
	 * @generated
	 */
	void setQuantity(int value);

	/**
	 * Returns the value of the '<em><b>Unity Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unity Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unity Value</em>' attribute.
	 * @see #setUnityValue(double)
	 * @see restapp.model.ModelPackage#getProductsPurchase_UnityValue()
	 * @model
	 * @generated
	 */
	double getUnityValue();

	/**
	 * Sets the value of the '{@link restapp.model.ProductsPurchase#getUnityValue <em>Unity Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unity Value</em>' attribute.
	 * @see #getUnityValue()
	 * @generated
	 */
	void setUnityValue(double value);

	/**
	 * Returns the value of the '<em><b>Unity Discount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unity Discount</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unity Discount</em>' attribute.
	 * @see #setUnityDiscount(int)
	 * @see restapp.model.ModelPackage#getProductsPurchase_UnityDiscount()
	 * @model
	 * @generated
	 */
	int getUnityDiscount();

	/**
	 * Sets the value of the '{@link restapp.model.ProductsPurchase#getUnityDiscount <em>Unity Discount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unity Discount</em>' attribute.
	 * @see #getUnityDiscount()
	 * @generated
	 */
	void setUnityDiscount(int value);

	/**
	 * Returns the value of the '<em><b>Unity Value With Discount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unity Value With Discount</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unity Value With Discount</em>' attribute.
	 * @see #setUnityValueWithDiscount(double)
	 * @see restapp.model.ModelPackage#getProductsPurchase_UnityValueWithDiscount()
	 * @model
	 * @generated
	 */
	double getUnityValueWithDiscount();

	/**
	 * Sets the value of the '{@link restapp.model.ProductsPurchase#getUnityValueWithDiscount <em>Unity Value With Discount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unity Value With Discount</em>' attribute.
	 * @see #getUnityValueWithDiscount()
	 * @generated
	 */
	void setUnityValueWithDiscount(double value);

	/**
	 * Returns the value of the '<em><b>New EReference1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>New EReference1</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New EReference1</em>' reference.
	 * @see #setNewEReference1(Purchase)
	 * @see restapp.model.ModelPackage#getProductsPurchase_NewEReference1()
	 * @model
	 * @generated
	 */
	Purchase getNewEReference1();

	/**
	 * Sets the value of the '{@link restapp.model.ProductsPurchase#getNewEReference1 <em>New EReference1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New EReference1</em>' reference.
	 * @see #getNewEReference1()
	 * @generated
	 */
	void setNewEReference1(Purchase value);

	/**
	 * Returns the value of the '<em><b>New EReference2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>New EReference2</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New EReference2</em>' reference.
	 * @see #setNewEReference2(Product)
	 * @see restapp.model.ModelPackage#getProductsPurchase_NewEReference2()
	 * @model
	 * @generated
	 */
	Product getNewEReference2();

	/**
	 * Sets the value of the '{@link restapp.model.ProductsPurchase#getNewEReference2 <em>New EReference2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New EReference2</em>' reference.
	 * @see #getNewEReference2()
	 * @generated
	 */
	void setNewEReference2(Product value);

} // ProductsPurchase
