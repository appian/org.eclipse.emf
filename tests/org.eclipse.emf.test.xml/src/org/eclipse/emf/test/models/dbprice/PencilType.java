/**
 * <copyright>
 * </copyright>
 *
 * $Id: PencilType.java,v 1.1.2.1 2005/01/14 22:56:18 nickb Exp $
 */
package org.eclipse.emf.test.models.dbprice;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pencil Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.test.models.dbprice.PencilType#getPrice <em>Price</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.test.models.dbprice.DbpricePackage#getPencilType()
 * @model 
 * @generated
 */
public interface PencilType extends EObject
{
  /**
   * Returns the value of the '<em><b>Price</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Price</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Price</em>' attribute.
   * @see #isSetPrice()
   * @see #unsetPrice()
   * @see #setPrice(int)
   * @see org.eclipse.emf.test.models.dbprice.DbpricePackage#getPencilType_Price()
   * @model unique="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int" required="true"
   * @generated
   */
  int getPrice();

  /**
   * Sets the value of the '{@link org.eclipse.emf.test.models.dbprice.PencilType#getPrice <em>Price</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Price</em>' attribute.
   * @see #isSetPrice()
   * @see #unsetPrice()
   * @see #getPrice()
   * @generated
   */
  void setPrice(int value);

  /**
   * Unsets the value of the '{@link org.eclipse.emf.test.models.dbprice.PencilType#getPrice <em>Price</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSetPrice()
   * @see #getPrice()
   * @see #setPrice(int)
   * @generated
   */
  void unsetPrice();

  /**
   * Returns whether the value of the '{@link org.eclipse.emf.test.models.dbprice.PencilType#getPrice <em>Price</em>}' attribute is set.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return whether the value of the '<em>Price</em>' attribute is set.
   * @see #unsetPrice()
   * @see #getPrice()
   * @see #setPrice(int)
   * @generated
   */
  boolean isSetPrice();

} // PencilType
