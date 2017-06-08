/**
 * <copyright>
 * </copyright>
 *
 */
package nel.mcore;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RExp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link nel.mcore.RExp#getArg <em>Arg</em>}</li>
 *   <li>{@link nel.mcore.RExp#getLarg <em>Larg</em>}</li>
 *   <li>{@link nel.mcore.RExp#getAop <em>Aop</em>}</li>
 *   <li>{@link nel.mcore.RExp#getRarg <em>Rarg</em>}</li>
 * </ul>
 * </p>
 *
 * @see nel.mcore.McorePackage#getRExp()
 * @model
 * @generated
 */
public interface RExp extends EObject
{
  /**
   * Returns the value of the '<em><b>Arg</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Arg</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Arg</em>' containment reference.
   * @see #setArg(REGSARGS)
   * @see nel.mcore.McorePackage#getRExp_Arg()
   * @model containment="true"
   * @generated
   */
  REGSARGS getArg();

  /**
   * Sets the value of the '{@link nel.mcore.RExp#getArg <em>Arg</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Arg</em>' containment reference.
   * @see #getArg()
   * @generated
   */
  void setArg(REGSARGS value);

  /**
   * Returns the value of the '<em><b>Larg</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Larg</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Larg</em>' containment reference.
   * @see #setLarg(REGSARGS)
   * @see nel.mcore.McorePackage#getRExp_Larg()
   * @model containment="true"
   * @generated
   */
  REGSARGS getLarg();

  /**
   * Sets the value of the '{@link nel.mcore.RExp#getLarg <em>Larg</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Larg</em>' containment reference.
   * @see #getLarg()
   * @generated
   */
  void setLarg(REGSARGS value);

  /**
   * Returns the value of the '<em><b>Aop</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Aop</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Aop</em>' attribute.
   * @see #setAop(String)
   * @see nel.mcore.McorePackage#getRExp_Aop()
   * @model
   * @generated
   */
  String getAop();

  /**
   * Sets the value of the '{@link nel.mcore.RExp#getAop <em>Aop</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Aop</em>' attribute.
   * @see #getAop()
   * @generated
   */
  void setAop(String value);

  /**
   * Returns the value of the '<em><b>Rarg</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rarg</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rarg</em>' containment reference.
   * @see #setRarg(REGSARGS)
   * @see nel.mcore.McorePackage#getRExp_Rarg()
   * @model containment="true"
   * @generated
   */
  REGSARGS getRarg();

  /**
   * Sets the value of the '{@link nel.mcore.RExp#getRarg <em>Rarg</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rarg</em>' containment reference.
   * @see #getRarg()
   * @generated
   */
  void setRarg(REGSARGS value);

} // RExp
