/**
 * <copyright>
 * </copyright>
 *
 */
package nel.mcore;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>LExp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link nel.mcore.LExp#getReg <em>Reg</em>}</li>
 * </ul>
 * </p>
 *
 * @see nel.mcore.McorePackage#getLExp()
 * @model
 * @generated
 */
public interface LExp extends EObject
{
  /**
   * Returns the value of the '<em><b>Reg</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Reg</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Reg</em>' containment reference.
   * @see #setReg(REGS)
   * @see nel.mcore.McorePackage#getLExp_Reg()
   * @model containment="true"
   * @generated
   */
  REGS getReg();

  /**
   * Sets the value of the '{@link nel.mcore.LExp#getReg <em>Reg</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Reg</em>' containment reference.
   * @see #getReg()
   * @generated
   */
  void setReg(REGS value);

} // LExp
