/**
 * <copyright>
 * </copyright>
 *
 */
package nel.mcore.impl;

import nel.mcore.Condition;
import nel.mcore.McorePackage;
import nel.mcore.REGSARGS;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link nel.mcore.impl.ConditionImpl#getLarg <em>Larg</em>}</li>
 *   <li>{@link nel.mcore.impl.ConditionImpl#getCmpop <em>Cmpop</em>}</li>
 *   <li>{@link nel.mcore.impl.ConditionImpl#getRarg <em>Rarg</em>}</li>
 *   <li>{@link nel.mcore.impl.ConditionImpl#getThentarget <em>Thentarget</em>}</li>
 *   <li>{@link nel.mcore.impl.ConditionImpl#getElsetarget <em>Elsetarget</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConditionImpl extends MinimalEObjectImpl.Container implements Condition
{
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
   * The default value of the '{@link #getCmpop() <em>Cmpop</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCmpop()
   * @generated
   * @ordered
   */
  protected static final String CMPOP_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCmpop() <em>Cmpop</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCmpop()
   * @generated
   * @ordered
   */
  protected String cmpop = CMPOP_EDEFAULT;

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
   * The default value of the '{@link #getThentarget() <em>Thentarget</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getThentarget()
   * @generated
   * @ordered
   */
  protected static final String THENTARGET_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getThentarget() <em>Thentarget</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getThentarget()
   * @generated
   * @ordered
   */
  protected String thentarget = THENTARGET_EDEFAULT;

  /**
   * The default value of the '{@link #getElsetarget() <em>Elsetarget</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElsetarget()
   * @generated
   * @ordered
   */
  protected static final String ELSETARGET_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getElsetarget() <em>Elsetarget</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElsetarget()
   * @generated
   * @ordered
   */
  protected String elsetarget = ELSETARGET_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ConditionImpl()
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
    return McorePackage.Literals.CONDITION;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, McorePackage.CONDITION__LARG, oldLarg, newLarg);
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
        msgs = ((InternalEObject)larg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - McorePackage.CONDITION__LARG, null, msgs);
      if (newLarg != null)
        msgs = ((InternalEObject)newLarg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - McorePackage.CONDITION__LARG, null, msgs);
      msgs = basicSetLarg(newLarg, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McorePackage.CONDITION__LARG, newLarg, newLarg));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getCmpop()
  {
    return cmpop;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCmpop(String newCmpop)
  {
    String oldCmpop = cmpop;
    cmpop = newCmpop;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McorePackage.CONDITION__CMPOP, oldCmpop, cmpop));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, McorePackage.CONDITION__RARG, oldRarg, newRarg);
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
        msgs = ((InternalEObject)rarg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - McorePackage.CONDITION__RARG, null, msgs);
      if (newRarg != null)
        msgs = ((InternalEObject)newRarg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - McorePackage.CONDITION__RARG, null, msgs);
      msgs = basicSetRarg(newRarg, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McorePackage.CONDITION__RARG, newRarg, newRarg));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getThentarget()
  {
    return thentarget;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setThentarget(String newThentarget)
  {
    String oldThentarget = thentarget;
    thentarget = newThentarget;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McorePackage.CONDITION__THENTARGET, oldThentarget, thentarget));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getElsetarget()
  {
    return elsetarget;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setElsetarget(String newElsetarget)
  {
    String oldElsetarget = elsetarget;
    elsetarget = newElsetarget;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McorePackage.CONDITION__ELSETARGET, oldElsetarget, elsetarget));
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
      case McorePackage.CONDITION__LARG:
        return basicSetLarg(null, msgs);
      case McorePackage.CONDITION__RARG:
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
      case McorePackage.CONDITION__LARG:
        return getLarg();
      case McorePackage.CONDITION__CMPOP:
        return getCmpop();
      case McorePackage.CONDITION__RARG:
        return getRarg();
      case McorePackage.CONDITION__THENTARGET:
        return getThentarget();
      case McorePackage.CONDITION__ELSETARGET:
        return getElsetarget();
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
      case McorePackage.CONDITION__LARG:
        setLarg((REGSARGS)newValue);
        return;
      case McorePackage.CONDITION__CMPOP:
        setCmpop((String)newValue);
        return;
      case McorePackage.CONDITION__RARG:
        setRarg((REGSARGS)newValue);
        return;
      case McorePackage.CONDITION__THENTARGET:
        setThentarget((String)newValue);
        return;
      case McorePackage.CONDITION__ELSETARGET:
        setElsetarget((String)newValue);
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
      case McorePackage.CONDITION__LARG:
        setLarg((REGSARGS)null);
        return;
      case McorePackage.CONDITION__CMPOP:
        setCmpop(CMPOP_EDEFAULT);
        return;
      case McorePackage.CONDITION__RARG:
        setRarg((REGSARGS)null);
        return;
      case McorePackage.CONDITION__THENTARGET:
        setThentarget(THENTARGET_EDEFAULT);
        return;
      case McorePackage.CONDITION__ELSETARGET:
        setElsetarget(ELSETARGET_EDEFAULT);
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
      case McorePackage.CONDITION__LARG:
        return larg != null;
      case McorePackage.CONDITION__CMPOP:
        return CMPOP_EDEFAULT == null ? cmpop != null : !CMPOP_EDEFAULT.equals(cmpop);
      case McorePackage.CONDITION__RARG:
        return rarg != null;
      case McorePackage.CONDITION__THENTARGET:
        return THENTARGET_EDEFAULT == null ? thentarget != null : !THENTARGET_EDEFAULT.equals(thentarget);
      case McorePackage.CONDITION__ELSETARGET:
        return ELSETARGET_EDEFAULT == null ? elsetarget != null : !ELSETARGET_EDEFAULT.equals(elsetarget);
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
    result.append(" (cmpop: ");
    result.append(cmpop);
    result.append(", thentarget: ");
    result.append(thentarget);
    result.append(", elsetarget: ");
    result.append(elsetarget);
    result.append(')');
    return result.toString();
  }

} //ConditionImpl
