/**
 */
package eventpattern;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eventpattern.Link#getOrder <em>Order</em>}</li>
 *   <li>{@link eventpattern.Link#getOperand <em>Operand</em>}</li>
 *   <li>{@link eventpattern.Link#getOperator <em>Operator</em>}</li>
 * </ul>
 *
 * @see eventpattern.EventpatternPackage#getLink()
 * @model annotation="gmf.link label='order' source='operand' target='operator' target.constraint='self <> oppositeEnd' source.decoration='none' target.decoration='arrow' color='110,110,110' tool.name='Link' tool.description='Add a link'"
 * @generated
 */
public interface Link extends EObject
{
  /**
	 * Returns the value of the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Order</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Order</em>' attribute.
	 * @see #setOrder(int)
	 * @see eventpattern.EventpatternPackage#getLink_Order()
	 * @model
	 * @generated
	 */
  int getOrder();

  /**
	 * Sets the value of the '{@link eventpattern.Link#getOrder <em>Order</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order</em>' attribute.
	 * @see #getOrder()
	 * @generated
	 */
  void setOrder(int value);

  /**
	 * Returns the value of the '<em><b>Operand</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link eventpattern.Operand#getOutboundLink <em>Outbound Link</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operand</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Operand</em>' reference.
	 * @see #setOperand(Operand)
	 * @see eventpattern.EventpatternPackage#getLink_Operand()
	 * @see eventpattern.Operand#getOutboundLink
	 * @model opposite="outboundLink"
	 * @generated
	 */
  Operand getOperand();

  /**
	 * Sets the value of the '{@link eventpattern.Link#getOperand <em>Operand</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operand</em>' reference.
	 * @see #getOperand()
	 * @generated
	 */
  void setOperand(Operand value);

  /**
	 * Returns the value of the '<em><b>Operator</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link eventpattern.Operator#getInboundLink <em>Inbound Link</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operator</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' reference.
	 * @see #setOperator(Operator)
	 * @see eventpattern.EventpatternPackage#getLink_Operator()
	 * @see eventpattern.Operator#getInboundLink
	 * @model opposite="inboundLink"
	 * @generated
	 */
  Operator getOperator();

  /**
	 * Sets the value of the '{@link eventpattern.Link#getOperator <em>Operator</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' reference.
	 * @see #getOperator()
	 * @generated
	 */
  void setOperator(Operator value);

} // Link
