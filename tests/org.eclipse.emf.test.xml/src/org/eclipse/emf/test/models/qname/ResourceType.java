/**
 * <copyright>
 * </copyright>
 *
 * $Id: ResourceType.java,v 1.1.2.1 2005/01/14 22:56:19 nickb Exp $
 */
package org.eclipse.emf.test.models.qname;

import java.util.List;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.test.models.qname.ResourceType#getUnionvalue <em>Unionvalue</em>}</li>
 *   <li>{@link org.eclipse.emf.test.models.qname.ResourceType#getQnamelist <em>Qnamelist</em>}</li>
 *   <li>{@link org.eclipse.emf.test.models.qname.ResourceType#getIntvalue <em>Intvalue</em>}</li>
 *   <li>{@link org.eclipse.emf.test.models.qname.ResourceType#getAny <em>Any</em>}</li>
 *   <li>{@link org.eclipse.emf.test.models.qname.ResourceType#getMyQname <em>My Qname</em>}</li>
 *   <li>{@link org.eclipse.emf.test.models.qname.ResourceType#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.test.models.qname.QnamePackage#getResourceType()
 * @model 
 * @generated
 */
public interface ResourceType extends EObject
{
  /**
   * Returns the value of the '<em><b>Unionvalue</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Unionvalue</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Unionvalue</em>' attribute.
   * @see #setUnionvalue(Object)
   * @see org.eclipse.emf.test.models.qname.QnamePackage#getResourceType_Unionvalue()
   * @model unique="false" dataType="org.eclipse.emf.test.models.qname.IntQNameUnion" required="true"
   * @generated
   */
  Object getUnionvalue();

  /**
   * Sets the value of the '{@link org.eclipse.emf.test.models.qname.ResourceType#getUnionvalue <em>Unionvalue</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Unionvalue</em>' attribute.
   * @see #getUnionvalue()
   * @generated
   */
  void setUnionvalue(Object value);

  /**
   * Returns the value of the '<em><b>Qnamelist</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Qnamelist</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Qnamelist</em>' attribute.
   * @see #setQnamelist(List)
   * @see org.eclipse.emf.test.models.qname.QnamePackage#getResourceType_Qnamelist()
   * @model unique="false" dataType="org.eclipse.emf.test.models.qname.QnameList" required="true" many="false"
   * @generated
   */
  List getQnamelist();

  /**
   * Sets the value of the '{@link org.eclipse.emf.test.models.qname.ResourceType#getQnamelist <em>Qnamelist</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Qnamelist</em>' attribute.
   * @see #getQnamelist()
   * @generated
   */
  void setQnamelist(List value);

  /**
   * Returns the value of the '<em><b>Intvalue</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Intvalue</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Intvalue</em>' attribute.
   * @see #isSetIntvalue()
   * @see #unsetIntvalue()
   * @see #setIntvalue(int)
   * @see org.eclipse.emf.test.models.qname.QnamePackage#getResourceType_Intvalue()
   * @model unique="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int" required="true"
   * @generated
   */
  int getIntvalue();

  /**
   * Sets the value of the '{@link org.eclipse.emf.test.models.qname.ResourceType#getIntvalue <em>Intvalue</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Intvalue</em>' attribute.
   * @see #isSetIntvalue()
   * @see #unsetIntvalue()
   * @see #getIntvalue()
   * @generated
   */
  void setIntvalue(int value);

  /**
   * Unsets the value of the '{@link org.eclipse.emf.test.models.qname.ResourceType#getIntvalue <em>Intvalue</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSetIntvalue()
   * @see #getIntvalue()
   * @see #setIntvalue(int)
   * @generated
   */
  void unsetIntvalue();

  /**
   * Returns whether the value of the '{@link org.eclipse.emf.test.models.qname.ResourceType#getIntvalue <em>Intvalue</em>}' attribute is set.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return whether the value of the '<em>Intvalue</em>' attribute is set.
   * @see #unsetIntvalue()
   * @see #getIntvalue()
   * @see #setIntvalue(int)
   * @generated
   */
  boolean isSetIntvalue();

  /**
   * Returns the value of the '<em><b>Any</b></em>' attribute list.
   * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Any</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Any</em>' attribute list.
   * @see org.eclipse.emf.test.models.qname.QnamePackage#getResourceType_Any()
   * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry"
   * @generated
   */
  FeatureMap getAny();

  /**
   * Returns the value of the '<em><b>My Qname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>My Qname</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>My Qname</em>' attribute.
   * @see #setMyQname(List)
   * @see org.eclipse.emf.test.models.qname.QnamePackage#getResourceType_MyQname()
   * @model unique="false" dataType="org.eclipse.emf.test.models.qname.QnameList" many="false"
   * @generated
   */
  List getMyQname();

  /**
   * Sets the value of the '{@link org.eclipse.emf.test.models.qname.ResourceType#getMyQname <em>My Qname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>My Qname</em>' attribute.
   * @see #getMyQname()
   * @generated
   */
  void setMyQname(List value);

  /**
   * Returns the value of the '<em><b>Any Attribute</b></em>' attribute list.
   * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Any Attribute</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Any Attribute</em>' attribute list.
   * @see org.eclipse.emf.test.models.qname.QnamePackage#getResourceType_AnyAttribute()
   * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
   * @generated
   */
  FeatureMap getAnyAttribute();

} // ResourceType
