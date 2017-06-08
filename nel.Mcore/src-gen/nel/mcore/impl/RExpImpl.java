/**
 * <copyright>
 * </copyright>
 *
 */
package nel.mcore.impl;

import nel.mcore.McorePackage;
import nel.mcore.REGSARGS;
import nel.mcore.RExp;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RExp</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link nel.mcore.impl.RExpImpl#getArg <em>Arg</em>}</li>
 *   <li>{@link nel.mcore.impl.RExpImpl#getLarg <em>Larg</em>}</li>
 *   <li>{@link nel.mcore.impl.RExpImpl#getAop <em>Aop</em>}</li>
 *   <li>{@link nel.mcore.impl.RExpImpl#getRarg <em>Rarg</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RExpImpl extends MinimalEObjectImpl.Container implements RExp
{
  /**
   * The cached value of the '{@link #getArg() <em>Arg</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArg()
   * @generated
   * @ordered
   */
  protected REGSARGS arg;

  /**
   * The cached value of the '{@link #getLarg() <em>Larg</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLarg()
   * @generated
   * @ordered
   */
  protected REGSARGS larg;

  /**
   * The default value of the '{@link #getAop() <em>Aop</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAop()
   * @generated
   * @ordered
   */
  protected static final String AOP_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAop() <em>Aop</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAop()
   * @generated
   * @ordered
   */
  protected String aop = AOP_EDEFAULT;

  /**
   * The cached value of the '{@link #getRarg() <em>Rarg</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRarg()
   * @generated
   * @ordered
   */
  protected REGSARGS rarg;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RExpImpl()
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
    return McorePackage.Literals.REXP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public REGSARGS getArg()
  {
    return arg;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetArg(REGSARGS newArg, NotificationChain msgs)
  {
    REGSARGS oldArg = arg;
    arg = newArg;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, McorePackage.REXP__ARG, oldArg, newArg);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setArg(REGSARGS newArg)
  {
    if (newArg != arg)
    {
      NotificationChain msgs = null;
      if (arg != null)
        msgs = ((InternalEObject)arg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - McorePackage.REXP__ARG, null, msgs);
      if (newArg != null)
        msgs = ((InternalEObject)newArg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - McorePackage.REXP__ARG, null, msgs);
      msgs = basicSetArg(newArg, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McorePackage.REXP__ARG, newArg, newArg));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public REGSARGS getLarg()
  {
    return larg;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLarg(REGSARGS newLarg, NotificationChain msgs)
  {
    REGSARGS oldLarg = larg;
    larg = newLarg;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, McorePackage.REXP__LARG, oldLarg, newLarg);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLarg(REGSARGS newLarg)
  {
    if (newLarg != larg)
    {
      NotificationChain msgs = null;
      if (larg != null)
        msgs = ((InternalEObject)larg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - McorePackage.REXP__LARG, null, msgs);
      if (newLarg != null)
        msgs = ((InternalEObject)newLarg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - McorePackage.REXP__LARG, null, msgs);
      msgs = basicSetLarg(newLarg, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McorePackage.REXP__LARG, newLarg, newLarg));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getAop()
  {
    return aop;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAop(String newAop)
  {
    String oldAop = aop;
    aop = newAop;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McorePackage.REXP__AOP, oldAop, aop));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public REGSARGS getRarg()
  {
    return rarg;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRarg(REGSARGS newRarg, NotificationChain msgs)
  {
    REGSARGS oldRarg = rarg;
    rarg = newRarg;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, McorePackage.REXP__RARG, oldRarg, newRarg);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRarg(REGSARGS newRarg)
  {
    if (newRarg != rarg)
    {
      NotificationChain msgs = null;
      if (rarg != null)
        msgs = ((InternalEObject)rarg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - McorePackage.REXP__RARG, null, msgs);
      if (newRarg != null)
        msgs = ((InternalEObject)newRarg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - McorePackage.REXP__RARG, null, msgs);
      msgs = basicSetRarg(newRarg, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McorePackage.REXP__RARG, newRarg, newRarg));
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
      case McorePackage.REXP__ARG:
        return basicSetArg(null, msgs);
      case McorePackage.REXP__LARG:
        return basicSetLarg(null, msgs);
      case McorePackage.REXP__RARG:
        return basicSetRarg(null, msgs);
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
      case McorePackage.REXP__ARG:
        return getArg();
      case McorePackage.REXP__LARG:
        return getLarg();
      case McorePackage.REXP__AOP:
        return getAop();
      case McorePackage.REXP__RARG:
        return getRarg();
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
      case McorePackage.REXP__ARG:
        setArg((REGSARGS)newValue);
        return;
      case McorePackage.REXP__LARG:
        setLarg((REGSARGS)newValue);
        return;
      case McorePackage.REXP__AOP:
        setAop((String)newValue);
        return;
      case McorePackage.REXP__RARG:
        setRarg((REGSARGS)newValue);
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
      case McorePackage.REXP__ARG:
        setArg((REGSARGS)null);
        return;
      case McorePackage.REXP__LARG:
        setLarg((REGSARGS)null);
        return;
      case McorePackage.REXP__AOP:
        setAop(AOP_EDEFAULT);
        return;
      case McorePackage.REXP__RARG:
        setRarg((REGSARGS)null);
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
      case McorePackage.REXP__ARG:
        return arg != null;
      case McorePackage.REXP__LARG:
        return larg != null;
      case McorePackage.REXP__AOP:
        return AOP_EDEFAULT == null ? aop != null : !AOP_EDEFAULT.equals(aop);
      case McorePackage.REXP__RARG:
        return rarg != null;
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
    result.append(" (aop: ");
    result.append(aop);
    result.append(')');
    return result.toString();
  }

} //RExpImpl
