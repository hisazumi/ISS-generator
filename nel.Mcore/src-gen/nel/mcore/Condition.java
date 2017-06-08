/**
 * <copyright>
 * </copyright>
 *
 */
package nel.mcore;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link nel.mcore.Condition#getLarg <em>Larg</em>}</li>
 *   <li>{@link nel.mcore.Condition#getCmpop <em>Cmpop</em>}</li>
 *   <li>{@link nel.mcore.Condition#getRarg <em>Rarg</em>}</li>
 *   <li>{@link nel.mcore.Condition#getThentarget <em>Thentarget</em>}</li>
 *   <li>{@link nel.mcore.Condition#getElsetarget <em>Elsetarget</em>}</li>
 * </ul>
 * </p>
 *
 * @see nel.mcore.McorePackage#getCondition()
 * @model
 * @generated
 */
public interface Condition extends EObject
{
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
   * @see nel.mcore.McorePackage#getCondition_Larg()
   * @model containment="true"
   * @generated
   */
  REGSARGS getLarg();

  /**
   * Sets the value of the '{@link nel.mcore.Condition#getLarg <em>Larg</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Larg</em>' containment reference.
   * @see #getLarg()
   * @generated
   */
  void setLarg(REGSARGS value);

  /**
   * Returns the value of the '<em><b>Cmpop</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cmpop</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cmpop</em>' attribute.
   * @see #setCmpop(String)
   * @see nel.mcore.McorePackage#getCondition_Cmpop()
   * @model
   * @generated
   */
  String getCmpop();

  /**
   * Sets the value of the '{@link nel.mcore.Condition#getCmpop <em>Cmpop</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cmpop</em>' attribute.
   * @see #getCmpop()
   * @generated
   */
  void setCmpop(String value);

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
   * @see nel.mcore.McorePackage#getCondition_Rarg()
   * @model containment="true"
   * @generated
   */
  REGSARGS getRarg();

  /**
   * Sets the value of the '{@link nel.mcore.Condition#getRarg <em>Rarg</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rarg</em>' containment reference.
   * @see #getRarg()
   * @generated
   */
  void setRarg(REGSARGS value);

  /**
   * Returns the value of the '<em><b>Thentarget</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Thentarget</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Thentarget</em>' attribute.
   * @see #setThentarget(String)
   * @see nel.mcore.McorePackage#getCondition_Thentarget()
   * @model
   * @generated
   */
  String getThentarget();

  /**
   * Sets the value of the '{@link nel.mcore.Condition#getThentarget <em>Thentarget</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Thentarget</em>' attribute.
   * @see #getThentarget()
   * @generated
   */
  void setThentarget(String value);

  /**
   * Returns the value of the '<em><b>Elsetarget</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elsetarget</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elsetarget</em>' attribute.
   * @see #setElsetarget(String)
   * @see nel.mcore.McorePackage#getCondition_Elsetarget()
   * @model
   * @generated
   */
  String getElsetarget();

  /**
   * Sets the value of the '{@link nel.mcore.Condition#getElsetarget <em>Elsetarget</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Elsetarget</em>' attribute.
   * @see #getElsetarget()
   * @generated
   */
  void setElsetarget(String value);

} // Condition
