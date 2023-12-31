/*
 * 
 */
package eventpattern.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import eventpattern.diagram.providers.EventpatternElementTypes;
import eventpattern.diagram.providers.EventpatternModelingAssistantProvider;

/**
 * @generated
 */
public class EventpatternModelingAssistantProviderOfCEPEventPatternEditPart
		extends EventpatternModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(49);
		types.add(EventpatternElementTypes.Contains_2041);
		types.add(EventpatternElementTypes.And_2001);
		types.add(EventpatternElementTypes.Or_2002);
		types.add(EventpatternElementTypes.Not_2003);
		types.add(EventpatternElementTypes.Union_2042);
		types.add(EventpatternElementTypes.Intersection_2048);
		types.add(EventpatternElementTypes.Diference_2044);
		types.add(EventpatternElementTypes.Distance_2045);
		types.add(EventpatternElementTypes.Equals_2046);
		types.add(EventpatternElementTypes.Intersects_2047);
		types.add(EventpatternElementTypes.Addition_2004);
		types.add(EventpatternElementTypes.Subtraction_2005);
		types.add(EventpatternElementTypes.Multiplication_2006);
		types.add(EventpatternElementTypes.Division_2007);
		types.add(EventpatternElementTypes.Modulus_2008);
		types.add(EventpatternElementTypes.Equal_2009);
		types.add(EventpatternElementTypes.NotEqual_2010);
		types.add(EventpatternElementTypes.LessThan_2011);
		types.add(EventpatternElementTypes.GreaterThan_2012);
		types.add(EventpatternElementTypes.LessEqual_2013);
		types.add(EventpatternElementTypes.GreaterEqual_2014);
		types.add(EventpatternElementTypes.Every_2015);
		types.add(EventpatternElementTypes.EveryDistinct_2016);
		types.add(EventpatternElementTypes.Repeat_2017);
		types.add(EventpatternElementTypes.Until_2018);
		types.add(EventpatternElementTypes.Range_2019);
		types.add(EventpatternElementTypes.FollowedBy_2020);
		types.add(EventpatternElementTypes.While_2021);
		types.add(EventpatternElementTypes.Max_2022);
		types.add(EventpatternElementTypes.Min_2023);
		types.add(EventpatternElementTypes.Avg_2024);
		types.add(EventpatternElementTypes.Count_2025);
		types.add(EventpatternElementTypes.Sum_2026);
		types.add(EventpatternElementTypes.Point_2050);
		types.add(EventpatternElementTypes.Event_2027);
		types.add(EventpatternElementTypes.EventProperty_2028);
		types.add(EventpatternElementTypes.Value_2029);
		types.add(EventpatternElementTypes.GeoValue_2049);
		types.add(EventpatternElementTypes.GroupBy_2040);
		types.add(EventpatternElementTypes.WithinTimer_2030);
		types.add(EventpatternElementTypes.TimeInterval_2031);
		types.add(EventpatternElementTypes.TimeSchedule_2032);
		types.add(EventpatternElementTypes.Email_2033);
		types.add(EventpatternElementTypes.Twitter_2039);
		types.add(EventpatternElementTypes.SlidingEventInterval_2034);
		types.add(EventpatternElementTypes.BatchingEventInterval_2035);
		types.add(EventpatternElementTypes.SlidingTimeInterval_2036);
		types.add(EventpatternElementTypes.BatchingTimeInterval_2037);
		types.add(EventpatternElementTypes.ComplexEvent_2038);
		return types;
	}

}
