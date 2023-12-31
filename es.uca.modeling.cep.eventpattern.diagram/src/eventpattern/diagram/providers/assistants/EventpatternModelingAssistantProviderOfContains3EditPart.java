/*
 * 
 */
package eventpattern.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import eventpattern.diagram.edit.parts.*;
import eventpattern.diagram.providers.EventpatternElementTypes;
import eventpattern.diagram.providers.EventpatternModelingAssistantProvider;

/**
 * @generated
 */
public class EventpatternModelingAssistantProviderOfContains3EditPart extends EventpatternModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((Contains3EditPart) sourceEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSource(Contains3EditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(EventpatternElementTypes.Link_4001);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source, IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget((Contains3EditPart) sourceEditPart, targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSourceAndTarget(Contains3EditPart source,
			IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof ContainsEditPart) {
			types.add(EventpatternElementTypes.Link_4001);
		}
		if (targetEditPart instanceof AndEditPart) {
			types.add(EventpatternElementTypes.Link_4001);
		}
		if (targetEditPart instanceof OrEditPart) {
			types.add(EventpatternElementTypes.Link_4001);
		}
		if (targetEditPart instanceof NotEditPart) {
			types.add(EventpatternElementTypes.Link_4001);
		}
		if (targetEditPart instanceof UnionEditPart) {
			types.add(EventpatternElementTypes.Link_4001);
		}
		if (targetEditPart instanceof IntersectionEditPart) {
			types.add(EventpatternElementTypes.Link_4001);
		}
		if (targetEditPart instanceof DiferenceEditPart) {
			types.add(EventpatternElementTypes.Link_4001);
		}
		if (targetEditPart instanceof DistanceEditPart) {
			types.add(EventpatternElementTypes.Link_4001);
		}
		if (targetEditPart instanceof EqualsEditPart) {
			types.add(EventpatternElementTypes.Link_4001);
		}
		if (targetEditPart instanceof IntersectsEditPart) {
			types.add(EventpatternElementTypes.Link_4001);
		}
		if (targetEditPart instanceof AdditionEditPart) {
			types.add(EventpatternElementTypes.Link_4001);
		}
		if (targetEditPart instanceof SubtractionEditPart) {
			types.add(EventpatternElementTypes.Link_4001);
		}
		if (targetEditPart instanceof MultiplicationEditPart) {
			types.add(EventpatternElementTypes.Link_4001);
		}
		if (targetEditPart instanceof DivisionEditPart) {
			types.add(EventpatternElementTypes.Link_4001);
		}
		if (targetEditPart instanceof ModulusEditPart) {
			types.add(EventpatternElementTypes.Link_4001);
		}
		if (targetEditPart instanceof EqualEditPart) {
			types.add(EventpatternElementTypes.Link_4001);
		}
		if (targetEditPart instanceof NotEqualEditPart) {
			types.add(EventpatternElementTypes.Link_4001);
		}
		if (targetEditPart instanceof LessThanEditPart) {
			types.add(EventpatternElementTypes.Link_4001);
		}
		if (targetEditPart instanceof GreaterThanEditPart) {
			types.add(EventpatternElementTypes.Link_4001);
		}
		if (targetEditPart instanceof LessEqualEditPart) {
			types.add(EventpatternElementTypes.Link_4001);
		}
		if (targetEditPart instanceof GreaterEqualEditPart) {
			types.add(EventpatternElementTypes.Link_4001);
		}
		if (targetEditPart instanceof EveryEditPart) {
			types.add(EventpatternElementTypes.Link_4001);
		}
		if (targetEditPart instanceof EveryDistinctEditPart) {
			types.add(EventpatternElementTypes.Link_4001);
		}
		if (targetEditPart instanceof RepeatEditPart) {
			types.add(EventpatternElementTypes.Link_4001);
		}
		if (targetEditPart instanceof UntilEditPart) {
			types.add(EventpatternElementTypes.Link_4001);
		}
		if (targetEditPart instanceof RangeEditPart) {
			types.add(EventpatternElementTypes.Link_4001);
		}
		if (targetEditPart instanceof FollowedByEditPart) {
			types.add(EventpatternElementTypes.Link_4001);
		}
		if (targetEditPart instanceof WhileEditPart) {
			types.add(EventpatternElementTypes.Link_4001);
		}
		if (targetEditPart instanceof MaxEditPart) {
			types.add(EventpatternElementTypes.Link_4001);
		}
		if (targetEditPart instanceof MinEditPart) {
			types.add(EventpatternElementTypes.Link_4001);
		}
		if (targetEditPart instanceof AvgEditPart) {
			types.add(EventpatternElementTypes.Link_4001);
		}
		if (targetEditPart instanceof CountEditPart) {
			types.add(EventpatternElementTypes.Link_4001);
		}
		if (targetEditPart instanceof SumEditPart) {
			types.add(EventpatternElementTypes.Link_4001);
		}
		if (targetEditPart instanceof GroupByEditPart) {
			types.add(EventpatternElementTypes.Link_4001);
		}
		if (targetEditPart instanceof EmailEditPart) {
			types.add(EventpatternElementTypes.Link_4001);
		}
		if (targetEditPart instanceof TwitterEditPart) {
			types.add(EventpatternElementTypes.Link_4001);
		}
		if (targetEditPart instanceof ComplexEventEditPart) {
			types.add(EventpatternElementTypes.Link_4001);
		}
		if (targetEditPart instanceof Contains2EditPart) {
			types.add(EventpatternElementTypes.Link_4001);
		}
		if (targetEditPart instanceof And2EditPart) {
			types.add(EventpatternElementTypes.Link_4001);
		}
		if (targetEditPart instanceof Or2EditPart) {
			types.add(EventpatternElementTypes.Link_4001);
		}
		if (targetEditPart instanceof Not2EditPart) {
			types.add(EventpatternElementTypes.Link_4001);
		}
		if (targetEditPart instanceof Union2EditPart) {
			types.add(EventpatternElementTypes.Link_4001);
		}
		if (targetEditPart instanceof Intersection2EditPart) {
			types.add(EventpatternElementTypes.Link_4001);
		}
		if (targetEditPart instanceof Diference2EditPart) {
			types.add(EventpatternElementTypes.Link_4001);
		}
		if (targetEditPart instanceof Distance2EditPart) {
			types.add(EventpatternElementTypes.Link_4001);
		}
		if (targetEditPart instanceof Equals2EditPart) {
			types.add(EventpatternElementTypes.Link_4001);
		}
		if (targetEditPart instanceof Intersects2EditPart) {
			types.add(EventpatternElementTypes.Link_4001);
		}
		if (targetEditPart instanceof Addition2EditPart) {
			types.add(EventpatternElementTypes.Link_4001);
		}
		if (targetEditPart instanceof Subtraction2EditPart) {
			types.add(EventpatternElementTypes.Link_4001);
		}
		if (targetEditPart instanceof Multiplication2EditPart) {
			types.add(EventpatternElementTypes.Link_4001);
		}
		if (targetEditPart instanceof Division2EditPart) {
			types.add(EventpatternElementTypes.Link_4001);
		}
		if (targetEditPart instanceof Modulus2EditPart) {
			types.add(EventpatternElementTypes.Link_4001);
		}
		if (targetEditPart instanceof Equal2EditPart) {
			types.add(EventpatternElementTypes.Link_4001);
		}
		if (targetEditPart instanceof NotEqual2EditPart) {
			types.add(EventpatternElementTypes.Link_4001);
		}
		if (targetEditPart instanceof LessThan2EditPart) {
			types.add(EventpatternElementTypes.Link_4001);
		}
		if (targetEditPart instanceof GreaterThan2EditPart) {
			types.add(EventpatternElementTypes.Link_4001);
		}
		if (targetEditPart instanceof LessEqual2EditPart) {
			types.add(EventpatternElementTypes.Link_4001);
		}
		if (targetEditPart instanceof GreaterEqual2EditPart) {
			types.add(EventpatternElementTypes.Link_4001);
		}
		if (targetEditPart instanceof Every2EditPart) {
			types.add(EventpatternElementTypes.Link_4001);
		}
		if (targetEditPart instanceof EveryDistinct2EditPart) {
			types.add(EventpatternElementTypes.Link_4001);
		}
		if (targetEditPart instanceof Repeat2EditPart) {
			types.add(EventpatternElementTypes.Link_4001);
		}
		if (targetEditPart instanceof Until2EditPart) {
			types.add(EventpatternElementTypes.Link_4001);
		}
		if (targetEditPart instanceof Range2EditPart) {
			types.add(EventpatternElementTypes.Link_4001);
		}
		if (targetEditPart instanceof FollowedBy2EditPart) {
			types.add(EventpatternElementTypes.Link_4001);
		}
		if (targetEditPart instanceof While2EditPart) {
			types.add(EventpatternElementTypes.Link_4001);
		}
		if (targetEditPart instanceof Contains3EditPart) {
			types.add(EventpatternElementTypes.Link_4001);
		}
		if (targetEditPart instanceof And3EditPart) {
			types.add(EventpatternElementTypes.Link_4001);
		}
		if (targetEditPart instanceof Or3EditPart) {
			types.add(EventpatternElementTypes.Link_4001);
		}
		if (targetEditPart instanceof Not3EditPart) {
			types.add(EventpatternElementTypes.Link_4001);
		}
		if (targetEditPart instanceof Union3EditPart) {
			types.add(EventpatternElementTypes.Link_4001);
		}
		if (targetEditPart instanceof Intersection3EditPart) {
			types.add(EventpatternElementTypes.Link_4001);
		}
		if (targetEditPart instanceof Diference3EditPart) {
			types.add(EventpatternElementTypes.Link_4001);
		}
		if (targetEditPart instanceof Distance3EditPart) {
			types.add(EventpatternElementTypes.Link_4001);
		}
		if (targetEditPart instanceof Equals3EditPart) {
			types.add(EventpatternElementTypes.Link_4001);
		}
		if (targetEditPart instanceof Intersects3EditPart) {
			types.add(EventpatternElementTypes.Link_4001);
		}
		if (targetEditPart instanceof Addition3EditPart) {
			types.add(EventpatternElementTypes.Link_4001);
		}
		if (targetEditPart instanceof Subtraction3EditPart) {
			types.add(EventpatternElementTypes.Link_4001);
		}
		if (targetEditPart instanceof Multiplication3EditPart) {
			types.add(EventpatternElementTypes.Link_4001);
		}
		if (targetEditPart instanceof Division3EditPart) {
			types.add(EventpatternElementTypes.Link_4001);
		}
		if (targetEditPart instanceof Modulus3EditPart) {
			types.add(EventpatternElementTypes.Link_4001);
		}
		if (targetEditPart instanceof Equal3EditPart) {
			types.add(EventpatternElementTypes.Link_4001);
		}
		if (targetEditPart instanceof NotEqual3EditPart) {
			types.add(EventpatternElementTypes.Link_4001);
		}
		if (targetEditPart instanceof LessThan3EditPart) {
			types.add(EventpatternElementTypes.Link_4001);
		}
		if (targetEditPart instanceof GreaterThan3EditPart) {
			types.add(EventpatternElementTypes.Link_4001);
		}
		if (targetEditPart instanceof LessEqual3EditPart) {
			types.add(EventpatternElementTypes.Link_4001);
		}
		if (targetEditPart instanceof GreaterEqual3EditPart) {
			types.add(EventpatternElementTypes.Link_4001);
		}
		if (targetEditPart instanceof Every3EditPart) {
			types.add(EventpatternElementTypes.Link_4001);
		}
		if (targetEditPart instanceof EveryDistinct3EditPart) {
			types.add(EventpatternElementTypes.Link_4001);
		}
		if (targetEditPart instanceof Repeat3EditPart) {
			types.add(EventpatternElementTypes.Link_4001);
		}
		if (targetEditPart instanceof Until3EditPart) {
			types.add(EventpatternElementTypes.Link_4001);
		}
		if (targetEditPart instanceof Range3EditPart) {
			types.add(EventpatternElementTypes.Link_4001);
		}
		if (targetEditPart instanceof FollowedBy3EditPart) {
			types.add(EventpatternElementTypes.Link_4001);
		}
		if (targetEditPart instanceof While3EditPart) {
			types.add(EventpatternElementTypes.Link_4001);
		}
		if (targetEditPart instanceof Max2EditPart) {
			types.add(EventpatternElementTypes.Link_4001);
		}
		if (targetEditPart instanceof Min2EditPart) {
			types.add(EventpatternElementTypes.Link_4001);
		}
		if (targetEditPart instanceof Avg2EditPart) {
			types.add(EventpatternElementTypes.Link_4001);
		}
		if (targetEditPart instanceof Count2EditPart) {
			types.add(EventpatternElementTypes.Link_4001);
		}
		if (targetEditPart instanceof Sum2EditPart) {
			types.add(EventpatternElementTypes.Link_4001);
		}
		if (targetEditPart instanceof GroupBy2EditPart) {
			types.add(EventpatternElementTypes.Link_4001);
		}
		if (targetEditPart instanceof ComplexEventPropertyEditPart) {
			types.add(EventpatternElementTypes.Link_4001);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForTarget(IAdaptable source, IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget((Contains3EditPart) sourceEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForTarget(Contains3EditPart source, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == EventpatternElementTypes.Link_4001) {
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
			types.add(EventpatternElementTypes.GroupBy_2040);
			types.add(EventpatternElementTypes.Email_2033);
			types.add(EventpatternElementTypes.Twitter_2039);
			types.add(EventpatternElementTypes.ComplexEvent_2038);
			types.add(EventpatternElementTypes.Contains_3061);
			types.add(EventpatternElementTypes.And_3003);
			types.add(EventpatternElementTypes.Or_3004);
			types.add(EventpatternElementTypes.Not_3005);
			types.add(EventpatternElementTypes.Union_3062);
			types.add(EventpatternElementTypes.Intersection_3075);
			types.add(EventpatternElementTypes.Diference_3064);
			types.add(EventpatternElementTypes.Distance_3065);
			types.add(EventpatternElementTypes.Equals_3066);
			types.add(EventpatternElementTypes.Intersects_3067);
			types.add(EventpatternElementTypes.Addition_3006);
			types.add(EventpatternElementTypes.Subtraction_3007);
			types.add(EventpatternElementTypes.Multiplication_3008);
			types.add(EventpatternElementTypes.Division_3009);
			types.add(EventpatternElementTypes.Modulus_3010);
			types.add(EventpatternElementTypes.Equal_3011);
			types.add(EventpatternElementTypes.NotEqual_3012);
			types.add(EventpatternElementTypes.LessThan_3013);
			types.add(EventpatternElementTypes.GreaterThan_3014);
			types.add(EventpatternElementTypes.LessEqual_3015);
			types.add(EventpatternElementTypes.GreaterEqual_3016);
			types.add(EventpatternElementTypes.Every_3017);
			types.add(EventpatternElementTypes.EveryDistinct_3018);
			types.add(EventpatternElementTypes.Repeat_3019);
			types.add(EventpatternElementTypes.Until_3020);
			types.add(EventpatternElementTypes.Range_3021);
			types.add(EventpatternElementTypes.FollowedBy_3022);
			types.add(EventpatternElementTypes.While_3023);
			types.add(EventpatternElementTypes.Contains_3068);
			types.add(EventpatternElementTypes.And_3027);
			types.add(EventpatternElementTypes.Or_3028);
			types.add(EventpatternElementTypes.Not_3029);
			types.add(EventpatternElementTypes.Union_3069);
			types.add(EventpatternElementTypes.Intersection_3076);
			types.add(EventpatternElementTypes.Diference_3071);
			types.add(EventpatternElementTypes.Distance_3072);
			types.add(EventpatternElementTypes.Equals_3073);
			types.add(EventpatternElementTypes.Intersects_3074);
			types.add(EventpatternElementTypes.Addition_3030);
			types.add(EventpatternElementTypes.Subtraction_3031);
			types.add(EventpatternElementTypes.Multiplication_3032);
			types.add(EventpatternElementTypes.Division_3033);
			types.add(EventpatternElementTypes.Modulus_3034);
			types.add(EventpatternElementTypes.Equal_3035);
			types.add(EventpatternElementTypes.NotEqual_3036);
			types.add(EventpatternElementTypes.LessThan_3037);
			types.add(EventpatternElementTypes.GreaterThan_3038);
			types.add(EventpatternElementTypes.LessEqual_3039);
			types.add(EventpatternElementTypes.GreaterEqual_3040);
			types.add(EventpatternElementTypes.Every_3041);
			types.add(EventpatternElementTypes.EveryDistinct_3042);
			types.add(EventpatternElementTypes.Repeat_3043);
			types.add(EventpatternElementTypes.Until_3044);
			types.add(EventpatternElementTypes.Range_3045);
			types.add(EventpatternElementTypes.FollowedBy_3046);
			types.add(EventpatternElementTypes.While_3047);
			types.add(EventpatternElementTypes.Max_3048);
			types.add(EventpatternElementTypes.Min_3049);
			types.add(EventpatternElementTypes.Avg_3050);
			types.add(EventpatternElementTypes.Count_3051);
			types.add(EventpatternElementTypes.Sum_3052);
			types.add(EventpatternElementTypes.GroupBy_3060);
			types.add(EventpatternElementTypes.ComplexEventProperty_3059);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((Contains3EditPart) targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnTarget(Contains3EditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(EventpatternElementTypes.Link_4001);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForSource(IAdaptable target, IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((Contains3EditPart) targetEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForSource(Contains3EditPart target, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == EventpatternElementTypes.Link_4001) {
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
			types.add(EventpatternElementTypes.WithinTimer_2030);
			types.add(EventpatternElementTypes.TimeInterval_2031);
			types.add(EventpatternElementTypes.TimeSchedule_2032);
			types.add(EventpatternElementTypes.ComplexEvent_2038);
			types.add(EventpatternElementTypes.EventProperty_3001);
			types.add(EventpatternElementTypes.EventProperty_3002);
			types.add(EventpatternElementTypes.Contains_3061);
			types.add(EventpatternElementTypes.And_3003);
			types.add(EventpatternElementTypes.Or_3004);
			types.add(EventpatternElementTypes.Not_3005);
			types.add(EventpatternElementTypes.Union_3062);
			types.add(EventpatternElementTypes.Intersection_3075);
			types.add(EventpatternElementTypes.Diference_3064);
			types.add(EventpatternElementTypes.Distance_3065);
			types.add(EventpatternElementTypes.Equals_3066);
			types.add(EventpatternElementTypes.Intersects_3067);
			types.add(EventpatternElementTypes.Addition_3006);
			types.add(EventpatternElementTypes.Subtraction_3007);
			types.add(EventpatternElementTypes.Multiplication_3008);
			types.add(EventpatternElementTypes.Division_3009);
			types.add(EventpatternElementTypes.Modulus_3010);
			types.add(EventpatternElementTypes.Equal_3011);
			types.add(EventpatternElementTypes.NotEqual_3012);
			types.add(EventpatternElementTypes.LessThan_3013);
			types.add(EventpatternElementTypes.GreaterThan_3014);
			types.add(EventpatternElementTypes.LessEqual_3015);
			types.add(EventpatternElementTypes.GreaterEqual_3016);
			types.add(EventpatternElementTypes.Every_3017);
			types.add(EventpatternElementTypes.EveryDistinct_3018);
			types.add(EventpatternElementTypes.Repeat_3019);
			types.add(EventpatternElementTypes.Until_3020);
			types.add(EventpatternElementTypes.Range_3021);
			types.add(EventpatternElementTypes.FollowedBy_3022);
			types.add(EventpatternElementTypes.While_3023);
			types.add(EventpatternElementTypes.Point_3079);
			types.add(EventpatternElementTypes.Event_3024);
			types.add(EventpatternElementTypes.EventProperty_3025);
			types.add(EventpatternElementTypes.Value_3026);
			types.add(EventpatternElementTypes.GeoValue_3077);
			types.add(EventpatternElementTypes.Contains_3068);
			types.add(EventpatternElementTypes.And_3027);
			types.add(EventpatternElementTypes.Or_3028);
			types.add(EventpatternElementTypes.Not_3029);
			types.add(EventpatternElementTypes.Union_3069);
			types.add(EventpatternElementTypes.Intersection_3076);
			types.add(EventpatternElementTypes.Diference_3071);
			types.add(EventpatternElementTypes.Distance_3072);
			types.add(EventpatternElementTypes.Equals_3073);
			types.add(EventpatternElementTypes.Intersects_3074);
			types.add(EventpatternElementTypes.Addition_3030);
			types.add(EventpatternElementTypes.Subtraction_3031);
			types.add(EventpatternElementTypes.Multiplication_3032);
			types.add(EventpatternElementTypes.Division_3033);
			types.add(EventpatternElementTypes.Modulus_3034);
			types.add(EventpatternElementTypes.Equal_3035);
			types.add(EventpatternElementTypes.NotEqual_3036);
			types.add(EventpatternElementTypes.LessThan_3037);
			types.add(EventpatternElementTypes.GreaterThan_3038);
			types.add(EventpatternElementTypes.LessEqual_3039);
			types.add(EventpatternElementTypes.GreaterEqual_3040);
			types.add(EventpatternElementTypes.Every_3041);
			types.add(EventpatternElementTypes.EveryDistinct_3042);
			types.add(EventpatternElementTypes.Repeat_3043);
			types.add(EventpatternElementTypes.Until_3044);
			types.add(EventpatternElementTypes.Range_3045);
			types.add(EventpatternElementTypes.FollowedBy_3046);
			types.add(EventpatternElementTypes.While_3047);
			types.add(EventpatternElementTypes.Max_3048);
			types.add(EventpatternElementTypes.Min_3049);
			types.add(EventpatternElementTypes.Avg_3050);
			types.add(EventpatternElementTypes.Count_3051);
			types.add(EventpatternElementTypes.Sum_3052);
			types.add(EventpatternElementTypes.Point_3080);
			types.add(EventpatternElementTypes.Event_3053);
			types.add(EventpatternElementTypes.EventProperty_3054);
			types.add(EventpatternElementTypes.Value_3055);
			types.add(EventpatternElementTypes.GeoValue_3078);
			types.add(EventpatternElementTypes.WithinTimer_3056);
			types.add(EventpatternElementTypes.TimeInterval_3057);
			types.add(EventpatternElementTypes.TimeSchedule_3058);
		}
		return types;
	}

}
