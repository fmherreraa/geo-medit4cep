/**
 */
package eventpattern.impl;

import eventpattern.EventpatternPackage;
import eventpattern.LogicalOperator;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Logical Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class LogicalOperatorImpl extends ConditionOperatorImpl implements LogicalOperator
{
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected LogicalOperatorImpl()
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
		return EventpatternPackage.Literals.LOGICAL_OPERATOR;
	}

} //LogicalOperatorImpl
