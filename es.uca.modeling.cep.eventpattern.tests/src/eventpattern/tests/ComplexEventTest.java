/**
 */
package eventpattern.tests;

import eventpattern.ComplexEvent;
import eventpattern.EventpatternFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Complex Event</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ComplexEventTest extends OperandTest
{

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static void main(String[] args)
  {
		TestRunner.run(ComplexEventTest.class);
	}

  /**
	 * Constructs a new Complex Event test case with the given name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ComplexEventTest(String name)
  {
		super(name);
	}

  /**
	 * Returns the fixture for this Complex Event test case.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  protected ComplexEvent getFixture()
  {
		return (ComplexEvent)fixture;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
  @Override
  protected void setUp() throws Exception
  {
		setFixture(EventpatternFactory.eINSTANCE.createComplexEvent());
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
  @Override
  protected void tearDown() throws Exception
  {
		setFixture(null);
	}

} //ComplexEventTest
