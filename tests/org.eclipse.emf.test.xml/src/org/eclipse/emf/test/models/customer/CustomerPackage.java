/**
 * <copyright>
 * </copyright>
 *
 * $Id: CustomerPackage.java,v 1.1.2.1 2005/01/14 22:56:18 nickb Exp $
 */
package org.eclipse.emf.test.models.customer;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.test.models.customer.CustomerFactory
 * @generated
 */
public interface CustomerPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "customer";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://org/eclipse/emf/test/models/Customer";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "customer";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  CustomerPackage eINSTANCE = org.eclipse.emf.test.models.customer.impl.CustomerPackageImpl.init();

  /**
   * The meta object id for the '{@link org.eclipse.emf.test.models.customer.impl.AddressTypeImpl <em>Address Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.test.models.customer.impl.AddressTypeImpl
   * @see org.eclipse.emf.test.models.customer.impl.CustomerPackageImpl#getAddressType()
   * @generated
   */
  int ADDRESS_TYPE = 0;

  /**
   * The feature id for the '<em><b>Street</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDRESS_TYPE__STREET = 0;

  /**
   * The feature id for the '<em><b>Town</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDRESS_TYPE__TOWN = 1;

  /**
   * The number of structural features of the the '<em>Address Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDRESS_TYPE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.eclipse.emf.test.models.customer.impl.CanadaAddrImpl <em>Canada Addr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.test.models.customer.impl.CanadaAddrImpl
   * @see org.eclipse.emf.test.models.customer.impl.CustomerPackageImpl#getCanadaAddr()
   * @generated
   */
  int CANADA_ADDR = 1;

  /**
   * The feature id for the '<em><b>Street</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CANADA_ADDR__STREET = ADDRESS_TYPE__STREET;

  /**
   * The feature id for the '<em><b>Town</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CANADA_ADDR__TOWN = ADDRESS_TYPE__TOWN;

  /**
   * The feature id for the '<em><b>Zip</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CANADA_ADDR__ZIP = ADDRESS_TYPE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Province</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CANADA_ADDR__PROVINCE = ADDRESS_TYPE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the the '<em>Canada Addr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CANADA_ADDR_FEATURE_COUNT = ADDRESS_TYPE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.eclipse.emf.test.models.customer.impl.CreditInfoImpl <em>Credit Info</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.test.models.customer.impl.CreditInfoImpl
   * @see org.eclipse.emf.test.models.customer.impl.CustomerPackageImpl#getCreditInfo()
   * @generated
   */
  int CREDIT_INFO = 2;

  /**
   * The feature id for the '<em><b>Holder</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREDIT_INFO__HOLDER = 0;

  /**
   * The feature id for the '<em><b>Cc Number</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREDIT_INFO__CC_NUMBER = 1;

  /**
   * The feature id for the '<em><b>Expire Date</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREDIT_INFO__EXPIRE_DATE = 2;

  /**
   * The number of structural features of the the '<em>Credit Info</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREDIT_INFO_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.eclipse.emf.test.models.customer.impl.CustomersTypeImpl <em>sType</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.test.models.customer.impl.CustomersTypeImpl
   * @see org.eclipse.emf.test.models.customer.impl.CustomerPackageImpl#getCustomersType()
   * @generated
   */
  int CUSTOMER_STYPE = 3;

  /**
   * The feature id for the '<em><b>Mixed</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CUSTOMER_STYPE__MIXED = 0;

  /**
   * The feature id for the '<em><b>Customer</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CUSTOMER_STYPE__CUSTOMER = 1;

  /**
   * The number of structural features of the the '<em>sType</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CUSTOMER_STYPE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.eclipse.emf.test.models.customer.impl.CustomerTypeImpl <em>Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.test.models.customer.impl.CustomerTypeImpl
   * @see org.eclipse.emf.test.models.customer.impl.CustomerPackageImpl#getCustomerType()
   * @generated
   */
  int CUSTOMER_TYPE = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CUSTOMER_TYPE__NAME = 0;

  /**
   * The feature id for the '<em><b>Address</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CUSTOMER_TYPE__ADDRESS = 1;

  /**
   * The feature id for the '<em><b>Credit Card</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CUSTOMER_TYPE__CREDIT_CARD = 2;

  /**
   * The feature id for the '<em><b>Payment Day</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CUSTOMER_TYPE__PAYMENT_DAY = 3;

  /**
   * The feature id for the '<em><b>ID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CUSTOMER_TYPE__ID = 4;

  /**
   * The number of structural features of the the '<em>Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CUSTOMER_TYPE_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link org.eclipse.emf.test.models.customer.impl.DocumentRootImpl <em>Document Root</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.test.models.customer.impl.DocumentRootImpl
   * @see org.eclipse.emf.test.models.customer.impl.CustomerPackageImpl#getDocumentRoot()
   * @generated
   */
  int DOCUMENT_ROOT = 5;

  /**
   * The feature id for the '<em><b>Mixed</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__MIXED = 0;

  /**
   * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

  /**
   * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

  /**
   * The feature id for the '<em><b>Customers</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__CUSTOMERS = 3;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__ID = 4;

  /**
   * The number of structural features of the the '<em>Document Root</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link org.eclipse.emf.test.models.customer.impl.USAddrImpl <em>US Addr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.test.models.customer.impl.USAddrImpl
   * @see org.eclipse.emf.test.models.customer.impl.CustomerPackageImpl#getUSAddr()
   * @generated
   */
  int US_ADDR = 6;

  /**
   * The feature id for the '<em><b>Street</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int US_ADDR__STREET = ADDRESS_TYPE__STREET;

  /**
   * The feature id for the '<em><b>Town</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int US_ADDR__TOWN = ADDRESS_TYPE__TOWN;

  /**
   * The feature id for the '<em><b>Zip</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int US_ADDR__ZIP = ADDRESS_TYPE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>State</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int US_ADDR__STATE = ADDRESS_TYPE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the the '<em>US Addr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int US_ADDR_FEATURE_COUNT = ADDRESS_TYPE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.eclipse.emf.test.models.customer.USState <em>US State</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.test.models.customer.USState
   * @see org.eclipse.emf.test.models.customer.impl.CustomerPackageImpl#getUSState()
   * @generated
   */
  int US_STATE = 7;

  /**
   * The meta object id for the '<em>US State Object</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.test.models.customer.USState
   * @see org.eclipse.emf.test.models.customer.impl.CustomerPackageImpl#getUSStateObject()
   * @generated
   */
  int US_STATE_OBJECT = 8;

  /**
   * The meta object id for the '<em>Zip Codes</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.math.BigInteger
   * @see org.eclipse.emf.test.models.customer.impl.CustomerPackageImpl#getZipCodes()
   * @generated
   */
  int ZIP_CODES = 9;

  /**
   * The meta object id for the '<em>Zip Union</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.lang.Object
   * @see org.eclipse.emf.test.models.customer.impl.CustomerPackageImpl#getZipUnion()
   * @generated
   */
  int ZIP_UNION = 10;


  /**
   * Returns the meta object for class '{@link org.eclipse.emf.test.models.customer.AddressType <em>Address Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Address Type</em>'.
   * @see org.eclipse.emf.test.models.customer.AddressType
   * @generated
   */
  EClass getAddressType();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.test.models.customer.AddressType#getStreet <em>Street</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Street</em>'.
   * @see org.eclipse.emf.test.models.customer.AddressType#getStreet()
   * @see #getAddressType()
   * @generated
   */
  EAttribute getAddressType_Street();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.test.models.customer.AddressType#getTown <em>Town</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Town</em>'.
   * @see org.eclipse.emf.test.models.customer.AddressType#getTown()
   * @see #getAddressType()
   * @generated
   */
  EAttribute getAddressType_Town();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.test.models.customer.CanadaAddr <em>Canada Addr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Canada Addr</em>'.
   * @see org.eclipse.emf.test.models.customer.CanadaAddr
   * @generated
   */
  EClass getCanadaAddr();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.test.models.customer.CanadaAddr#getZip <em>Zip</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Zip</em>'.
   * @see org.eclipse.emf.test.models.customer.CanadaAddr#getZip()
   * @see #getCanadaAddr()
   * @generated
   */
  EAttribute getCanadaAddr_Zip();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.test.models.customer.CanadaAddr#getProvince <em>Province</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Province</em>'.
   * @see org.eclipse.emf.test.models.customer.CanadaAddr#getProvince()
   * @see #getCanadaAddr()
   * @generated
   */
  EAttribute getCanadaAddr_Province();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.test.models.customer.CreditInfo <em>Credit Info</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Credit Info</em>'.
   * @see org.eclipse.emf.test.models.customer.CreditInfo
   * @generated
   */
  EClass getCreditInfo();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.test.models.customer.CreditInfo#getHolder <em>Holder</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Holder</em>'.
   * @see org.eclipse.emf.test.models.customer.CreditInfo#getHolder()
   * @see #getCreditInfo()
   * @generated
   */
  EAttribute getCreditInfo_Holder();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.test.models.customer.CreditInfo#getCcNumber <em>Cc Number</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Cc Number</em>'.
   * @see org.eclipse.emf.test.models.customer.CreditInfo#getCcNumber()
   * @see #getCreditInfo()
   * @generated
   */
  EAttribute getCreditInfo_CcNumber();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.test.models.customer.CreditInfo#getExpireDate <em>Expire Date</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Expire Date</em>'.
   * @see org.eclipse.emf.test.models.customer.CreditInfo#getExpireDate()
   * @see #getCreditInfo()
   * @generated
   */
  EAttribute getCreditInfo_ExpireDate();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.test.models.customer.CustomersType <em>sType</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>sType</em>'.
   * @see org.eclipse.emf.test.models.customer.CustomersType
   * @generated
   */
  EClass getCustomersType();

  /**
   * Returns the meta object for the attribute list '{@link org.eclipse.emf.test.models.customer.CustomersType#getMixed <em>Mixed</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Mixed</em>'.
   * @see org.eclipse.emf.test.models.customer.CustomersType#getMixed()
   * @see #getCustomersType()
   * @generated
   */
  EAttribute getCustomersType_Mixed();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.emf.test.models.customer.CustomersType#getCustomer <em>Customer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Customer</em>'.
   * @see org.eclipse.emf.test.models.customer.CustomersType#getCustomer()
   * @see #getCustomersType()
   * @generated
   */
  EReference getCustomersType_Customer();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.test.models.customer.CustomerType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type</em>'.
   * @see org.eclipse.emf.test.models.customer.CustomerType
   * @generated
   */
  EClass getCustomerType();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.test.models.customer.CustomerType#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.emf.test.models.customer.CustomerType#getName()
   * @see #getCustomerType()
   * @generated
   */
  EAttribute getCustomerType_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.emf.test.models.customer.CustomerType#getAddress <em>Address</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Address</em>'.
   * @see org.eclipse.emf.test.models.customer.CustomerType#getAddress()
   * @see #getCustomerType()
   * @generated
   */
  EReference getCustomerType_Address();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.emf.test.models.customer.CustomerType#getCreditCard <em>Credit Card</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Credit Card</em>'.
   * @see org.eclipse.emf.test.models.customer.CustomerType#getCreditCard()
   * @see #getCustomerType()
   * @generated
   */
  EReference getCustomerType_CreditCard();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.test.models.customer.CustomerType#getPaymentDay <em>Payment Day</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Payment Day</em>'.
   * @see org.eclipse.emf.test.models.customer.CustomerType#getPaymentDay()
   * @see #getCustomerType()
   * @generated
   */
  EAttribute getCustomerType_PaymentDay();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.test.models.customer.CustomerType#getID <em>ID</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>ID</em>'.
   * @see org.eclipse.emf.test.models.customer.CustomerType#getID()
   * @see #getCustomerType()
   * @generated
   */
  EAttribute getCustomerType_ID();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.test.models.customer.DocumentRoot <em>Document Root</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Document Root</em>'.
   * @see org.eclipse.emf.test.models.customer.DocumentRoot
   * @generated
   */
  EClass getDocumentRoot();

  /**
   * Returns the meta object for the attribute list '{@link org.eclipse.emf.test.models.customer.DocumentRoot#getMixed <em>Mixed</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Mixed</em>'.
   * @see org.eclipse.emf.test.models.customer.DocumentRoot#getMixed()
   * @see #getDocumentRoot()
   * @generated
   */
  EAttribute getDocumentRoot_Mixed();

  /**
   * Returns the meta object for the map '{@link org.eclipse.emf.test.models.customer.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
   * @see org.eclipse.emf.test.models.customer.DocumentRoot#getXMLNSPrefixMap()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_XMLNSPrefixMap();

  /**
   * Returns the meta object for the map '{@link org.eclipse.emf.test.models.customer.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the map '<em>XSI Schema Location</em>'.
   * @see org.eclipse.emf.test.models.customer.DocumentRoot#getXSISchemaLocation()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_XSISchemaLocation();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.emf.test.models.customer.DocumentRoot#getCustomers <em>Customers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Customers</em>'.
   * @see org.eclipse.emf.test.models.customer.DocumentRoot#getCustomers()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_Customers();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.test.models.customer.DocumentRoot#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see org.eclipse.emf.test.models.customer.DocumentRoot#getId()
   * @see #getDocumentRoot()
   * @generated
   */
  EAttribute getDocumentRoot_Id();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.test.models.customer.USAddr <em>US Addr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>US Addr</em>'.
   * @see org.eclipse.emf.test.models.customer.USAddr
   * @generated
   */
  EClass getUSAddr();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.test.models.customer.USAddr#getZip <em>Zip</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Zip</em>'.
   * @see org.eclipse.emf.test.models.customer.USAddr#getZip()
   * @see #getUSAddr()
   * @generated
   */
  EAttribute getUSAddr_Zip();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.test.models.customer.USAddr#getState <em>State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>State</em>'.
   * @see org.eclipse.emf.test.models.customer.USAddr#getState()
   * @see #getUSAddr()
   * @generated
   */
  EAttribute getUSAddr_State();

  /**
   * Returns the meta object for enum '{@link org.eclipse.emf.test.models.customer.USState <em>US State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>US State</em>'.
   * @see org.eclipse.emf.test.models.customer.USState
   * @generated
   */
  EEnum getUSState();

  /**
   * Returns the meta object for data type '{@link org.eclipse.emf.test.models.customer.USState <em>US State Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>US State Object</em>'.
   * @see org.eclipse.emf.test.models.customer.USState
   * @model instanceClass="org.eclipse.emf.test.models.customer.USState"
   * @generated
   */
  EDataType getUSStateObject();

  /**
   * Returns the meta object for data type '{@link java.math.BigInteger <em>Zip Codes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Zip Codes</em>'.
   * @see java.math.BigInteger
   * @model instanceClass="java.math.BigInteger"
   * @generated
   */
  EDataType getZipCodes();

  /**
   * Returns the meta object for data type '{@link java.lang.Object <em>Zip Union</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Zip Union</em>'.
   * @see java.lang.Object
   * @model instanceClass="java.lang.Object"
   * @generated
   */
  EDataType getZipUnion();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  CustomerFactory getCustomerFactory();

} //CustomerPackage
