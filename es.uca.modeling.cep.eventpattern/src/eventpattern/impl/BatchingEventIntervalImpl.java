/**
 */
package eventpattern.impl;

import eventpattern.BatchingEventInterval;
import eventpattern.EventpatternPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Batching Event Interval</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eventpattern.impl.BatchingEventIntervalImpl#getSize <em>Size</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BatchingEventIntervalImpl extends DataWindowImpl implements BatchingEventInterval
{
  /**
	 * The default value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
  protected static final int SIZE_EDEFAULT = 0;

  /**
	 * The cached value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
  protected int size = SIZE_EDEFAULT;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected BatchingEventIntervalImpl()
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
		return EventpatternPackage.Literals.BATCHING_EVENT_INTERVAL;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public int getSize()
  {
		return size;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setSize(int newSize)
  {
		int oldSize = size;
		size = newSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EventpatternPackage.BATCHING_EVENT_INTERVAL__SIZE, oldSize, size));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
		switch (featureID) {
			case EventpatternPackage.BATCHING_EVENT_INTERVAL__SIZE:
				return getSize();
		}
		return super.eGet(featureID, resolve, coreType);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public void eSet(int featureID, Object newValue)
  {
		switch (featureID) {
			case EventpatternPackage.BATCHING_EVENT_INTERVAL__SIZE:
				setSize((Integer)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public void eUnset(int featureID)
  {
		switch (featureID) {
			case EventpatternPackage.BATCHING_EVENT_INTERVAL__SIZE:
				setSize(SIZE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public boolean eIsSet(int featureID)
  {
		switch (featureID) {
			case EventpatternPackage.BATCHING_EVENT_INTERVAL__SIZE:
				return size != SIZE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public String toString()
  {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (size: ");
		result.append(size);
		result.append(')');
		return result.toString();
	}

} //BatchingEventIntervalImpl
