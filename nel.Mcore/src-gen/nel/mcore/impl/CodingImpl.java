/**
 * <copyright>
 * </copyright>
 *
 */
package nel.mcore.impl;

import nel.mcore.Coding;
import nel.mcore.McorePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Coding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link nel.mcore.impl.CodingImpl#getCoding <em>Coding</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CodingImpl extends MinimalEObjectImpl.Container implements Coding
{
  /**
   * The default value of the '{@link #getCoding() <em>Coding</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCoding()
   * @generated
   * @ordered
   */
  protected static final String CODING_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCoding() <em>Coding</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCoding()
   * @generated
   * @ordered
   */
  protected String coding = CODING_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CodingImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return McorePackage.Literals.CODING;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getCoding()
  {
    return coding;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCoding(String newCoding)
  {
    String oldCoding = coding;
    coding = newCoding;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McorePackage.CODING__CODING, oldCoding, coding));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case McorePackage.CODING__CODING:
        return getCoding();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case McorePackage.CODING__CODING:
        setCoding((String)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case McorePackage.CODING__CODING:
        setCoding(CODING_EDEFAULT);
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case McorePackage.CODING__CODING:
        return CODING_EDEFAULT == null ? coding != null : !CODING_EDEFAULT.equals(coding);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (coding: ");
    result.append(coding);
    result.append(')');
    return result.toString();
  }

} //CodingImpl
