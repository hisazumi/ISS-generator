/**
 * <copyright>
 * </copyright>
 *
 */
package nel.mcore.impl;

import nel.mcore.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class McoreFactoryImpl extends EFactoryImpl implements McoreFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static McoreFactory init()
  {
    try
    {
      McoreFactory theMcoreFactory = (McoreFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.f.ait.kyushu-u.ac.jp/Mcore"); 
      if (theMcoreFactory != null)
      {
        return theMcoreFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new McoreFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public McoreFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case McorePackage.MODEL: return createModel();
      case McorePackage.INSTRUCTION: return createInstruction();
      case McorePackage.INST_TYPE: return createInstType();
      case McorePackage.CODING: return createCoding();
      case McorePackage.BEHAVIOR: return createBehavior();
      case McorePackage.EXPRESSION: return createExpression();
      case McorePackage.LEXP: return createLExp();
      case McorePackage.REXP: return createRExp();
      case McorePackage.CONDITION: return createCondition();
      case McorePackage.REGSARGS: return createREGSARGS();
      case McorePackage.REGS: return createREGS();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Instruction createInstruction()
  {
    InstructionImpl instruction = new InstructionImpl();
    return instruction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InstType createInstType()
  {
    InstTypeImpl instType = new InstTypeImpl();
    return instType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Coding createCoding()
  {
    CodingImpl coding = new CodingImpl();
    return coding;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Behavior createBehavior()
  {
    BehaviorImpl behavior = new BehaviorImpl();
    return behavior;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression createExpression()
  {
    ExpressionImpl expression = new ExpressionImpl();
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LExp createLExp()
  {
    LExpImpl lExp = new LExpImpl();
    return lExp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RExp createRExp()
  {
    RExpImpl rExp = new RExpImpl();
    return rExp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Condition createCondition()
  {
    ConditionImpl condition = new ConditionImpl();
    return condition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public REGSARGS createREGSARGS()
  {
    REGSARGSImpl regsargs = new REGSARGSImpl();
    return regsargs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public REGS createREGS()
  {
    REGSImpl regs = new REGSImpl();
    return regs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public McorePackage getMcorePackage()
  {
    return (McorePackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static McorePackage getPackage()
  {
    return McorePackage.eINSTANCE;
  }

} //McoreFactoryImpl
