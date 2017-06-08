/**
 * <copyright>
 * </copyright>
 *
 */
package nel.mcore;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Coding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link nel.mcore.Coding#getCoding <em>Coding</em>}</li>
 * </ul>
 * </p>
 *
 * @see nel.mcore.McorePackage#getCoding()
 * @model
 * @generated
 */
public interface Coding extends EObject
{
  /**
   * Returns the value of the '<em><b>Coding</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Coding</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Coding</em>' attribute.
   * @see #setCoding(String)
   * @see nel.mcore.McorePackage#getCoding_Coding()
   * @model
   * @generated
   */
  String getCoding();

  /**
   * Sets the value of the '{@link nel.mcore.Coding#getCoding <em>Coding</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Coding</em>' attribute.
   * @see #getCoding()
   * @generated
   */
  void setCoding(String value);

} // Coding
