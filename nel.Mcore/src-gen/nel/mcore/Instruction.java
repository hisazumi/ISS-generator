/**
 * <copyright>
 * </copyright>
 *
 */
package nel.mcore;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instruction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link nel.mcore.Instruction#getName <em>Name</em>}</li>
 *   <li>{@link nel.mcore.Instruction#getType <em>Type</em>}</li>
 *   <li>{@link nel.mcore.Instruction#getCoding <em>Coding</em>}</li>
 *   <li>{@link nel.mcore.Instruction#getBehavior <em>Behavior</em>}</li>
 * </ul>
 * </p>
 *
 * @see nel.mcore.McorePackage#getInstruction()
 * @model
 * @generated
 */
public interface Instruction extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see nel.mcore.McorePackage#getInstruction_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link nel.mcore.Instruction#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(InstType)
   * @see nel.mcore.McorePackage#getInstruction_Type()
   * @model containment="true"
   * @generated
   */
  InstType getType();

  /**
   * Sets the value of the '{@link nel.mcore.Instruction#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(InstType value);

  /**
   * Returns the value of the '<em><b>Coding</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Coding</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Coding</em>' containment reference.
   * @see #setCoding(Coding)
   * @see nel.mcore.McorePackage#getInstruction_Coding()
   * @model containment="true"
   * @generated
   */
  Coding getCoding();

  /**
   * Sets the value of the '{@link nel.mcore.Instruction#getCoding <em>Coding</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Coding</em>' containment reference.
   * @see #getCoding()
   * @generated
   */
  void setCoding(Coding value);

  /**
   * Returns the value of the '<em><b>Behavior</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Behavior</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Behavior</em>' containment reference.
   * @see #setBehavior(Behavior)
   * @see nel.mcore.McorePackage#getInstruction_Behavior()
   * @model containment="true"
   * @generated
   */
  Behavior getBehavior();

  /**
   * Sets the value of the '{@link nel.mcore.Instruction#getBehavior <em>Behavior</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Behavior</em>' containment reference.
   * @see #getBehavior()
   * @generated
   */
  void setBehavior(Behavior value);

} // Instruction
