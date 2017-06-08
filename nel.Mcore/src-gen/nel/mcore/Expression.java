/**
 * <copyright>
 * </copyright>
 *
 */
package nel.mcore;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link nel.mcore.Expression#getLexp <em>Lexp</em>}</li>
 *   <li>{@link nel.mcore.Expression#getRexp <em>Rexp</em>}</li>
 * </ul>
 * </p>
 *
 * @see nel.mcore.McorePackage#getExpression()
 * @model
 * @generated
 */
public interface Expression extends EObject
{
  /**
   * Returns the value of the '<em><b>Lexp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Lexp</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lexp</em>' containment reference.
   * @see #setLexp(LExp)
   * @see nel.mcore.McorePackage#getExpression_Lexp()
   * @model containment="true"
   * @generated
   */
  LExp getLexp();

  /**
   * Sets the value of the '{@link nel.mcore.Expression#getLexp <em>Lexp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lexp</em>' containment reference.
   * @see #getLexp()
   * @generated
   */
  void setLexp(LExp value);

  /**
   * Returns the value of the '<em><b>Rexp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rexp</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rexp</em>' containment reference.
   * @see #setRexp(RExp)
   * @see nel.mcore.McorePackage#getExpression_Rexp()
   * @model containment="true"
   * @generated
   */
  RExp getRexp();

  /**
   * Sets the value of the '{@link nel.mcore.Expression#getRexp <em>Rexp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rexp</em>' containment reference.
   * @see #getRexp()
   * @generated
   */
  void setRexp(RExp value);

} // Expression
