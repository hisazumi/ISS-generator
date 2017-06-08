/**
 * <copyright>
 * </copyright>
 *
 */
package nel.mcore.impl;

import nel.mcore.Behavior;
import nel.mcore.Coding;
import nel.mcore.InstType;
import nel.mcore.Instruction;
import nel.mcore.McorePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Instruction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link nel.mcore.impl.InstructionImpl#getName <em>Name</em>}</li>
 *   <li>{@link nel.mcore.impl.InstructionImpl#getType <em>Type</em>}</li>
 *   <li>{@link nel.mcore.impl.InstructionImpl#getCoding <em>Coding</em>}</li>
 *   <li>{@link nel.mcore.impl.InstructionImpl#getBehavior <em>Behavior</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InstructionImpl extends MinimalEObjectImpl.Container implements Instruction
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected InstType type;

  /**
   * The cached value of the '{@link #getCoding() <em>Coding</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCoding()
   * @generated
   * @ordered
   */
  protected Coding coding;

  /**
   * The cached value of the '{@link #getBehavior() <em>Behavior</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBehavior()
   * @generated
   * @ordered
   */
  protected Behavior behavior;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected InstructionImpl()
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
    return McorePackage.Literals.INSTRUCTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McorePackage.INSTRUCTION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InstType getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetType(InstType newType, NotificationChain msgs)
  {
    InstType oldType = type;
    type = newType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, McorePackage.INSTRUCTION__TYPE, oldType, newType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(InstType newType)
  {
    if (newType != type)
    {
      NotificationChain msgs = null;
      if (type != null)
        msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - McorePackage.INSTRUCTION__TYPE, null, msgs);
      if (newType != null)
        msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - McorePackage.INSTRUCTION__TYPE, null, msgs);
      msgs = basicSetType(newType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McorePackage.INSTRUCTION__TYPE, newType, newType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Coding getCoding()
  {
    return coding;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCoding(Coding newCoding, NotificationChain msgs)
  {
    Coding oldCoding = coding;
    coding = newCoding;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, McorePackage.INSTRUCTION__CODING, oldCoding, newCoding);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCoding(Coding newCoding)
  {
    if (newCoding != coding)
    {
      NotificationChain msgs = null;
      if (coding != null)
        msgs = ((InternalEObject)coding).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - McorePackage.INSTRUCTION__CODING, null, msgs);
      if (newCoding != null)
        msgs = ((InternalEObject)newCoding).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - McorePackage.INSTRUCTION__CODING, null, msgs);
      msgs = basicSetCoding(newCoding, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McorePackage.INSTRUCTION__CODING, newCoding, newCoding));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Behavior getBehavior()
  {
    return behavior;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBehavior(Behavior newBehavior, NotificationChain msgs)
  {
    Behavior oldBehavior = behavior;
    behavior = newBehavior;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, McorePackage.INSTRUCTION__BEHAVIOR, oldBehavior, newBehavior);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBehavior(Behavior newBehavior)
  {
    if (newBehavior != behavior)
    {
      NotificationChain msgs = null;
      if (behavior != null)
        msgs = ((InternalEObject)behavior).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - McorePackage.INSTRUCTION__BEHAVIOR, null, msgs);
      if (newBehavior != null)
        msgs = ((InternalEObject)newBehavior).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - McorePackage.INSTRUCTION__BEHAVIOR, null, msgs);
      msgs = basicSetBehavior(newBehavior, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, McorePackage.INSTRUCTION__BEHAVIOR, newBehavior, newBehavior));
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
      case McorePackage.INSTRUCTION__TYPE:
        return basicSetType(null, msgs);
      case McorePackage.INSTRUCTION__CODING:
        return basicSetCoding(null, msgs);
      case McorePackage.INSTRUCTION__BEHAVIOR:
        return basicSetBehavior(null, msgs);
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
      case McorePackage.INSTRUCTION__NAME:
        return getName();
      case McorePackage.INSTRUCTION__TYPE:
        return getType();
      case McorePackage.INSTRUCTION__CODING:
        return getCoding();
      case McorePackage.INSTRUCTION__BEHAVIOR:
        return getBehavior();
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
      case McorePackage.INSTRUCTION__NAME:
        setName((String)newValue);
        return;
      case McorePackage.INSTRUCTION__TYPE:
        setType((InstType)newValue);
        return;
      case McorePackage.INSTRUCTION__CODING:
        setCoding((Coding)newValue);
        return;
      case McorePackage.INSTRUCTION__BEHAVIOR:
        setBehavior((Behavior)newValue);
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
      case McorePackage.INSTRUCTION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case McorePackage.INSTRUCTION__TYPE:
        setType((InstType)null);
        return;
      case McorePackage.INSTRUCTION__CODING:
        setCoding((Coding)null);
        return;
      case McorePackage.INSTRUCTION__BEHAVIOR:
        setBehavior((Behavior)null);
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
      case McorePackage.INSTRUCTION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case McorePackage.INSTRUCTION__TYPE:
        return type != null;
      case McorePackage.INSTRUCTION__CODING:
        return coding != null;
      case McorePackage.INSTRUCTION__BEHAVIOR:
        return behavior != null;
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
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //InstructionImpl
