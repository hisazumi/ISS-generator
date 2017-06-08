/**
 * <copyright>
 * </copyright>
 *
 */
package nel.mcore.impl;

import nel.mcore.Expression;
import nel.mcore.LExp;
import nel.mcore.McorePackage;
import nel.mcore.RExp;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link nel.mcore.impl.ExpressionImpl#getLexp <em>Lexp</em>}</li>
 *   <li>{@link nel.mcore.impl.ExpressionImpl#getRexp <em>Rexp</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExpressionImpl extends MinimalEObjectImpl.Container implements Expression
{
  /**
   * The cached value of the '{@link #getLexp() <em>Lexp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLexp()
   * @generated
   * @ordered
   */
  protected LExp lexp;

  /**
   * The cached value of the '{@link #getRexp() <em>Rexp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRexp()
   * @generated
   * @ordered
   */
  protected RExp rexp;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExpressionImpl()
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
    return McorePackage.Literals.EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LExp getLexp()
  {
    return lexp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLexp(LExp newLexp, NotificationChain msgs)
  {
    LExp oldLexp = lexp;
    lexp = newLexp;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, McorePackage.EXPRESSION__LEXP, oldLexp, newLexp);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLexp(LExp newLexp)
  {
    if (newLexp != lexp)
    {
      NotificationChain msgs = null;
      if (lexp != null)
        msgs = ((InternalEObject)lexp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - McorePackage.EXPRESSION__LEXP, null, msgs);
      if (newLexp != null)
        msgs = ((InternalEObject)newLexp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - McorePackage.EXPRESSION__LEXP, null, msgs);
      msgs = basicSetLexp(newLexp, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McorePackage.EXPRESSION__LEXP, newLexp, newLexp));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RExp getRexp()
  {
    return rexp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRexp(RExp newRexp, NotificationChain msgs)
  {
    RExp oldRexp = rexp;
    rexp = newRexp;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, McorePackage.EXPRESSION__REXP, oldRexp, newRexp);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRexp(RExp newRexp)
  {
    if (newRexp != rexp)
    {
      NotificationChain msgs = null;
      if (rexp != null)
        msgs = ((InternalEObject)rexp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - McorePackage.EXPRESSION__REXP, null, msgs);
      if (newRexp != null)
        msgs = ((InternalEObject)newRexp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - McorePackage.EXPRESSION__REXP, null, msgs);
      msgs = basicSetRexp(newRexp, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McorePackage.EXPRESSION__REXP, newRexp, newRexp));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case McorePackage.EXPRESSION__LEXP:
        return basicSetLexp(null, msgs);
      case McorePackage.EXPRESSION__REXP:
        return basicSetRexp(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case McorePackage.EXPRESSION__LEXP:
        return getLexp();
      case McorePackage.EXPRESSION__REXP:
        return getRexp();
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
      case McorePackage.EXPRESSION__LEXP:
        setLexp((LExp)newValue);
        return;
      case McorePackage.EXPRESSION__REXP:
        setRexp((RExp)newValue);
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
      case McorePackage.EXPRESSION__LEXP:
        setLexp((LExp)null);
        return;
      case McorePackage.EXPRESSION__REXP:
        setRexp((RExp)null);
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
      case McorePackage.EXPRESSION__LEXP:
        return lexp != null;
      case McorePackage.EXPRESSION__REXP:
        return rexp != null;
    }
    return super.eIsSet(featureID);
  }

} //ExpressionImpl
