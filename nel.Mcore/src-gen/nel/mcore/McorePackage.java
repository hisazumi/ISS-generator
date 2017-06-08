/**
 * <copyright>
 * </copyright>
 *
 */
package nel.mcore;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see nel.mcore.McoreFactory
 * @model kind="package"
 * @generated
 */
public interface McorePackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "mcore";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.f.ait.kyushu-u.ac.jp/Mcore";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "mcore";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  McorePackage eINSTANCE = nel.mcore.impl.McorePackageImpl.init();

  /**
   * The meta object id for the '{@link nel.mcore.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nel.mcore.impl.ModelImpl
   * @see nel.mcore.impl.McorePackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Instructions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__INSTRUCTIONS = 0;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link nel.mcore.impl.InstructionImpl <em>Instruction</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nel.mcore.impl.InstructionImpl
   * @see nel.mcore.impl.McorePackageImpl#getInstruction()
   * @generated
   */
  int INSTRUCTION = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION__NAME = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION__TYPE = 1;

  /**
   * The feature id for the '<em><b>Coding</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION__CODING = 2;

  /**
   * The feature id for the '<em><b>Behavior</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION__BEHAVIOR = 3;

  /**
   * The number of structural features of the '<em>Instruction</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link nel.mcore.impl.InstTypeImpl <em>Inst Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nel.mcore.impl.InstTypeImpl
   * @see nel.mcore.impl.McorePackageImpl#getInstType()
   * @generated
   */
  int INST_TYPE = 2;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INST_TYPE__TYPE = 0;

  /**
   * The number of structural features of the '<em>Inst Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INST_TYPE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link nel.mcore.impl.CodingImpl <em>Coding</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nel.mcore.impl.CodingImpl
   * @see nel.mcore.impl.McorePackageImpl#getCoding()
   * @generated
   */
  int CODING = 3;

  /**
   * The feature id for the '<em><b>Coding</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CODING__CODING = 0;

  /**
   * The number of structural features of the '<em>Coding</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CODING_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link nel.mcore.impl.BehaviorImpl <em>Behavior</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nel.mcore.impl.BehaviorImpl
   * @see nel.mcore.impl.McorePackageImpl#getBehavior()
   * @generated
   */
  int BEHAVIOR = 4;

  /**
   * The feature id for the '<em><b>Expressions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BEHAVIOR__EXPRESSIONS = 0;

  /**
   * The feature id for the '<em><b>Conditions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BEHAVIOR__CONDITIONS = 1;

  /**
   * The number of structural features of the '<em>Behavior</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BEHAVIOR_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link nel.mcore.impl.ExpressionImpl <em>Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nel.mcore.impl.ExpressionImpl
   * @see nel.mcore.impl.McorePackageImpl#getExpression()
   * @generated
   */
  int EXPRESSION = 5;

  /**
   * The feature id for the '<em><b>Lexp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__LEXP = 0;

  /**
   * The feature id for the '<em><b>Rexp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__REXP = 1;

  /**
   * The number of structural features of the '<em>Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link nel.mcore.impl.LExpImpl <em>LExp</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nel.mcore.impl.LExpImpl
   * @see nel.mcore.impl.McorePackageImpl#getLExp()
   * @generated
   */
  int LEXP = 6;

  /**
   * The feature id for the '<em><b>Reg</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LEXP__REG = 0;

  /**
   * The number of structural features of the '<em>LExp</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LEXP_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link nel.mcore.impl.RExpImpl <em>RExp</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nel.mcore.impl.RExpImpl
   * @see nel.mcore.impl.McorePackageImpl#getRExp()
   * @generated
   */
  int REXP = 7;

  /**
   * The feature id for the '<em><b>Arg</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REXP__ARG = 0;

  /**
   * The feature id for the '<em><b>Larg</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REXP__LARG = 1;

  /**
   * The feature id for the '<em><b>Aop</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REXP__AOP = 2;

  /**
   * The feature id for the '<em><b>Rarg</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REXP__RARG = 3;

  /**
   * The number of structural features of the '<em>RExp</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REXP_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link nel.mcore.impl.ConditionImpl <em>Condition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nel.mcore.impl.ConditionImpl
   * @see nel.mcore.impl.McorePackageImpl#getCondition()
   * @generated
   */
  int CONDITION = 8;

  /**
   * The feature id for the '<em><b>Larg</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION__LARG = 0;

  /**
   * The feature id for the '<em><b>Cmpop</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION__CMPOP = 1;

  /**
   * The feature id for the '<em><b>Rarg</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION__RARG = 2;

  /**
   * The feature id for the '<em><b>Thentarget</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION__THENTARGET = 3;

  /**
   * The feature id for the '<em><b>Elsetarget</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION__ELSETARGET = 4;

  /**
   * The number of structural features of the '<em>Condition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link nel.mcore.impl.REGSARGSImpl <em>REGSARGS</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nel.mcore.impl.REGSARGSImpl
   * @see nel.mcore.impl.McorePackageImpl#getREGSARGS()
   * @generated
   */
  int REGSARGS = 9;

  /**
   * The feature id for the '<em><b>Reg</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REGSARGS__REG = 0;

  /**
   * The feature id for the '<em><b>Arg</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REGSARGS__ARG = 1;

  /**
   * The number of structural features of the '<em>REGSARGS</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REGSARGS_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link nel.mcore.impl.REGSImpl <em>REGS</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see nel.mcore.impl.REGSImpl
   * @see nel.mcore.impl.McorePackageImpl#getREGS()
   * @generated
   */
  int REGS = 10;

  /**
   * The feature id for the '<em><b>Arg</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REGS__ARG = 0;

  /**
   * The number of structural features of the '<em>REGS</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REGS_FEATURE_COUNT = 1;


  /**
   * Returns the meta object for class '{@link nel.mcore.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see nel.mcore.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link nel.mcore.Model#getInstructions <em>Instructions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Instructions</em>'.
   * @see nel.mcore.Model#getInstructions()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Instructions();

  /**
   * Returns the meta object for class '{@link nel.mcore.Instruction <em>Instruction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Instruction</em>'.
   * @see nel.mcore.Instruction
   * @generated
   */
  EClass getInstruction();

  /**
   * Returns the meta object for the attribute '{@link nel.mcore.Instruction#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see nel.mcore.Instruction#getName()
   * @see #getInstruction()
   * @generated
   */
  EAttribute getInstruction_Name();

  /**
   * Returns the meta object for the containment reference '{@link nel.mcore.Instruction#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see nel.mcore.Instruction#getType()
   * @see #getInstruction()
   * @generated
   */
  EReference getInstruction_Type();

  /**
   * Returns the meta object for the containment reference '{@link nel.mcore.Instruction#getCoding <em>Coding</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Coding</em>'.
   * @see nel.mcore.Instruction#getCoding()
   * @see #getInstruction()
   * @generated
   */
  EReference getInstruction_Coding();

  /**
   * Returns the meta object for the containment reference '{@link nel.mcore.Instruction#getBehavior <em>Behavior</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Behavior</em>'.
   * @see nel.mcore.Instruction#getBehavior()
   * @see #getInstruction()
   * @generated
   */
  EReference getInstruction_Behavior();

  /**
   * Returns the meta object for class '{@link nel.mcore.InstType <em>Inst Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Inst Type</em>'.
   * @see nel.mcore.InstType
   * @generated
   */
  EClass getInstType();

  /**
   * Returns the meta object for the attribute '{@link nel.mcore.InstType#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see nel.mcore.InstType#getType()
   * @see #getInstType()
   * @generated
   */
  EAttribute getInstType_Type();

  /**
   * Returns the meta object for class '{@link nel.mcore.Coding <em>Coding</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Coding</em>'.
   * @see nel.mcore.Coding
   * @generated
   */
  EClass getCoding();

  /**
   * Returns the meta object for the attribute '{@link nel.mcore.Coding#getCoding <em>Coding</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Coding</em>'.
   * @see nel.mcore.Coding#getCoding()
   * @see #getCoding()
   * @generated
   */
  EAttribute getCoding_Coding();

  /**
   * Returns the meta object for class '{@link nel.mcore.Behavior <em>Behavior</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Behavior</em>'.
   * @see nel.mcore.Behavior
   * @generated
   */
  EClass getBehavior();

  /**
   * Returns the meta object for the containment reference list '{@link nel.mcore.Behavior#getExpressions <em>Expressions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Expressions</em>'.
   * @see nel.mcore.Behavior#getExpressions()
   * @see #getBehavior()
   * @generated
   */
  EReference getBehavior_Expressions();

  /**
   * Returns the meta object for the containment reference list '{@link nel.mcore.Behavior#getConditions <em>Conditions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Conditions</em>'.
   * @see nel.mcore.Behavior#getConditions()
   * @see #getBehavior()
   * @generated
   */
  EReference getBehavior_Conditions();

  /**
   * Returns the meta object for class '{@link nel.mcore.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression</em>'.
   * @see nel.mcore.Expression
   * @generated
   */
  EClass getExpression();

  /**
   * Returns the meta object for the containment reference '{@link nel.mcore.Expression#getLexp <em>Lexp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Lexp</em>'.
   * @see nel.mcore.Expression#getLexp()
   * @see #getExpression()
   * @generated
   */
  EReference getExpression_Lexp();

  /**
   * Returns the meta object for the containment reference '{@link nel.mcore.Expression#getRexp <em>Rexp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Rexp</em>'.
   * @see nel.mcore.Expression#getRexp()
   * @see #getExpression()
   * @generated
   */
  EReference getExpression_Rexp();

  /**
   * Returns the meta object for class '{@link nel.mcore.LExp <em>LExp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>LExp</em>'.
   * @see nel.mcore.LExp
   * @generated
   */
  EClass getLExp();

  /**
   * Returns the meta object for the containment reference '{@link nel.mcore.LExp#getReg <em>Reg</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Reg</em>'.
   * @see nel.mcore.LExp#getReg()
   * @see #getLExp()
   * @generated
   */
  EReference getLExp_Reg();

  /**
   * Returns the meta object for class '{@link nel.mcore.RExp <em>RExp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>RExp</em>'.
   * @see nel.mcore.RExp
   * @generated
   */
  EClass getRExp();

  /**
   * Returns the meta object for the containment reference '{@link nel.mcore.RExp#getArg <em>Arg</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Arg</em>'.
   * @see nel.mcore.RExp#getArg()
   * @see #getRExp()
   * @generated
   */
  EReference getRExp_Arg();

  /**
   * Returns the meta object for the containment reference '{@link nel.mcore.RExp#getLarg <em>Larg</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Larg</em>'.
   * @see nel.mcore.RExp#getLarg()
   * @see #getRExp()
   * @generated
   */
  EReference getRExp_Larg();

  /**
   * Returns the meta object for the attribute '{@link nel.mcore.RExp#getAop <em>Aop</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Aop</em>'.
   * @see nel.mcore.RExp#getAop()
   * @see #getRExp()
   * @generated
   */
  EAttribute getRExp_Aop();

  /**
   * Returns the meta object for the containment reference '{@link nel.mcore.RExp#getRarg <em>Rarg</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Rarg</em>'.
   * @see nel.mcore.RExp#getRarg()
   * @see #getRExp()
   * @generated
   */
  EReference getRExp_Rarg();

  /**
   * Returns the meta object for class '{@link nel.mcore.Condition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Condition</em>'.
   * @see nel.mcore.Condition
   * @generated
   */
  EClass getCondition();

  /**
   * Returns the meta object for the containment reference '{@link nel.mcore.Condition#getLarg <em>Larg</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Larg</em>'.
   * @see nel.mcore.Condition#getLarg()
   * @see #getCondition()
   * @generated
   */
  EReference getCondition_Larg();

  /**
   * Returns the meta object for the attribute '{@link nel.mcore.Condition#getCmpop <em>Cmpop</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Cmpop</em>'.
   * @see nel.mcore.Condition#getCmpop()
   * @see #getCondition()
   * @generated
   */
  EAttribute getCondition_Cmpop();

  /**
   * Returns the meta object for the containment reference '{@link nel.mcore.Condition#getRarg <em>Rarg</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Rarg</em>'.
   * @see nel.mcore.Condition#getRarg()
   * @see #getCondition()
   * @generated
   */
  EReference getCondition_Rarg();

  /**
   * Returns the meta object for the attribute '{@link nel.mcore.Condition#getThentarget <em>Thentarget</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Thentarget</em>'.
   * @see nel.mcore.Condition#getThentarget()
   * @see #getCondition()
   * @generated
   */
  EAttribute getCondition_Thentarget();

  /**
   * Returns the meta object for the attribute '{@link nel.mcore.Condition#getElsetarget <em>Elsetarget</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Elsetarget</em>'.
   * @see nel.mcore.Condition#getElsetarget()
   * @see #getCondition()
   * @generated
   */
  EAttribute getCondition_Elsetarget();

  /**
   * Returns the meta object for class '{@link nel.mcore.REGSARGS <em>REGSARGS</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>REGSARGS</em>'.
   * @see nel.mcore.REGSARGS
   * @generated
   */
  EClass getREGSARGS();

  /**
   * Returns the meta object for the containment reference '{@link nel.mcore.REGSARGS#getReg <em>Reg</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Reg</em>'.
   * @see nel.mcore.REGSARGS#getReg()
   * @see #getREGSARGS()
   * @generated
   */
  EReference getREGSARGS_Reg();

  /**
   * Returns the meta object for the attribute '{@link nel.mcore.REGSARGS#getArg <em>Arg</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Arg</em>'.
   * @see nel.mcore.REGSARGS#getArg()
   * @see #getREGSARGS()
   * @generated
   */
  EAttribute getREGSARGS_Arg();

  /**
   * Returns the meta object for class '{@link nel.mcore.REGS <em>REGS</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>REGS</em>'.
   * @see nel.mcore.REGS
   * @generated
   */
  EClass getREGS();

  /**
   * Returns the meta object for the attribute '{@link nel.mcore.REGS#getArg <em>Arg</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Arg</em>'.
   * @see nel.mcore.REGS#getArg()
   * @see #getREGS()
   * @generated
   */
  EAttribute getREGS_Arg();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  McoreFactory getMcoreFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link nel.mcore.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nel.mcore.impl.ModelImpl
     * @see nel.mcore.impl.McorePackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Instructions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__INSTRUCTIONS = eINSTANCE.getModel_Instructions();

    /**
     * The meta object literal for the '{@link nel.mcore.impl.InstructionImpl <em>Instruction</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nel.mcore.impl.InstructionImpl
     * @see nel.mcore.impl.McorePackageImpl#getInstruction()
     * @generated
     */
    EClass INSTRUCTION = eINSTANCE.getInstruction();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INSTRUCTION__NAME = eINSTANCE.getInstruction_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSTRUCTION__TYPE = eINSTANCE.getInstruction_Type();

    /**
     * The meta object literal for the '<em><b>Coding</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSTRUCTION__CODING = eINSTANCE.getInstruction_Coding();

    /**
     * The meta object literal for the '<em><b>Behavior</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSTRUCTION__BEHAVIOR = eINSTANCE.getInstruction_Behavior();

    /**
     * The meta object literal for the '{@link nel.mcore.impl.InstTypeImpl <em>Inst Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nel.mcore.impl.InstTypeImpl
     * @see nel.mcore.impl.McorePackageImpl#getInstType()
     * @generated
     */
    EClass INST_TYPE = eINSTANCE.getInstType();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INST_TYPE__TYPE = eINSTANCE.getInstType_Type();

    /**
     * The meta object literal for the '{@link nel.mcore.impl.CodingImpl <em>Coding</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nel.mcore.impl.CodingImpl
     * @see nel.mcore.impl.McorePackageImpl#getCoding()
     * @generated
     */
    EClass CODING = eINSTANCE.getCoding();

    /**
     * The meta object literal for the '<em><b>Coding</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CODING__CODING = eINSTANCE.getCoding_Coding();

    /**
     * The meta object literal for the '{@link nel.mcore.impl.BehaviorImpl <em>Behavior</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nel.mcore.impl.BehaviorImpl
     * @see nel.mcore.impl.McorePackageImpl#getBehavior()
     * @generated
     */
    EClass BEHAVIOR = eINSTANCE.getBehavior();

    /**
     * The meta object literal for the '<em><b>Expressions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BEHAVIOR__EXPRESSIONS = eINSTANCE.getBehavior_Expressions();

    /**
     * The meta object literal for the '<em><b>Conditions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BEHAVIOR__CONDITIONS = eINSTANCE.getBehavior_Conditions();

    /**
     * The meta object literal for the '{@link nel.mcore.impl.ExpressionImpl <em>Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nel.mcore.impl.ExpressionImpl
     * @see nel.mcore.impl.McorePackageImpl#getExpression()
     * @generated
     */
    EClass EXPRESSION = eINSTANCE.getExpression();

    /**
     * The meta object literal for the '<em><b>Lexp</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION__LEXP = eINSTANCE.getExpression_Lexp();

    /**
     * The meta object literal for the '<em><b>Rexp</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION__REXP = eINSTANCE.getExpression_Rexp();

    /**
     * The meta object literal for the '{@link nel.mcore.impl.LExpImpl <em>LExp</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nel.mcore.impl.LExpImpl
     * @see nel.mcore.impl.McorePackageImpl#getLExp()
     * @generated
     */
    EClass LEXP = eINSTANCE.getLExp();

    /**
     * The meta object literal for the '<em><b>Reg</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LEXP__REG = eINSTANCE.getLExp_Reg();

    /**
     * The meta object literal for the '{@link nel.mcore.impl.RExpImpl <em>RExp</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nel.mcore.impl.RExpImpl
     * @see nel.mcore.impl.McorePackageImpl#getRExp()
     * @generated
     */
    EClass REXP = eINSTANCE.getRExp();

    /**
     * The meta object literal for the '<em><b>Arg</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REXP__ARG = eINSTANCE.getRExp_Arg();

    /**
     * The meta object literal for the '<em><b>Larg</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REXP__LARG = eINSTANCE.getRExp_Larg();

    /**
     * The meta object literal for the '<em><b>Aop</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REXP__AOP = eINSTANCE.getRExp_Aop();

    /**
     * The meta object literal for the '<em><b>Rarg</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REXP__RARG = eINSTANCE.getRExp_Rarg();

    /**
     * The meta object literal for the '{@link nel.mcore.impl.ConditionImpl <em>Condition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nel.mcore.impl.ConditionImpl
     * @see nel.mcore.impl.McorePackageImpl#getCondition()
     * @generated
     */
    EClass CONDITION = eINSTANCE.getCondition();

    /**
     * The meta object literal for the '<em><b>Larg</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONDITION__LARG = eINSTANCE.getCondition_Larg();

    /**
     * The meta object literal for the '<em><b>Cmpop</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONDITION__CMPOP = eINSTANCE.getCondition_Cmpop();

    /**
     * The meta object literal for the '<em><b>Rarg</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONDITION__RARG = eINSTANCE.getCondition_Rarg();

    /**
     * The meta object literal for the '<em><b>Thentarget</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONDITION__THENTARGET = eINSTANCE.getCondition_Thentarget();

    /**
     * The meta object literal for the '<em><b>Elsetarget</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONDITION__ELSETARGET = eINSTANCE.getCondition_Elsetarget();

    /**
     * The meta object literal for the '{@link nel.mcore.impl.REGSARGSImpl <em>REGSARGS</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nel.mcore.impl.REGSARGSImpl
     * @see nel.mcore.impl.McorePackageImpl#getREGSARGS()
     * @generated
     */
    EClass REGSARGS = eINSTANCE.getREGSARGS();

    /**
     * The meta object literal for the '<em><b>Reg</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REGSARGS__REG = eINSTANCE.getREGSARGS_Reg();

    /**
     * The meta object literal for the '<em><b>Arg</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REGSARGS__ARG = eINSTANCE.getREGSARGS_Arg();

    /**
     * The meta object literal for the '{@link nel.mcore.impl.REGSImpl <em>REGS</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see nel.mcore.impl.REGSImpl
     * @see nel.mcore.impl.McorePackageImpl#getREGS()
     * @generated
     */
    EClass REGS = eINSTANCE.getREGS();

    /**
     * The meta object literal for the '<em><b>Arg</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REGS__ARG = eINSTANCE.getREGS_Arg();

  }

} //McorePackage
