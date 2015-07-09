/*
 * 
 */
package eventpattern.diagram.edit.parts;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.RoundedRectangle;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;

import eventpattern.diagram.edit.policies.OpenDiagramEditPolicy;
import eventpattern.diagram.edit.policies.WithinTimer2ItemSemanticEditPolicy;
import eventpattern.diagram.part.EventpatternVisualIDRegistry;
import eventpattern.diagram.providers.EventpatternElementTypes;

/**
 * @generated
 */
public class WithinTimer2EditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 3056;

	/**
	 * @generated
	 */
	protected IFigure contentPane;

	/**
	 * @generated
	 */
	protected IFigure primaryShape;

	/**
	 * @generated
	 */
	public WithinTimer2EditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new WithinTimer2ItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		installEditPolicy(EditPolicyRoles.OPEN_ROLE,
				new OpenDiagramEditPolicy());
		// XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
	}

	/**
	 * @generated
	 */
	protected LayoutEditPolicy createLayoutEditPolicy() {
		org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy lep = new org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy() {

			protected EditPolicy createChildEditPolicy(EditPart child) {
				EditPolicy result = child
						.getEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE);
				if (result == null) {
					result = new NonResizableEditPolicy();
				}
				return result;
			}

			protected Command getMoveChildrenCommand(Request request) {
				return null;
			}

			protected Command getCreateCommand(CreateRequest request) {
				return null;
			}
		};
		return lep;
	}

	/**
	 * @generated
	 */
	protected IFigure createNodeShape() {
		return primaryShape = new WithinTimerFigure();
	}

	/**
	 * @generated
	 */
	public WithinTimerFigure getPrimaryShape() {
		return (WithinTimerFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof WithinTimerYearsMonthsWeeksDaysHou2EditPart) {
			((WithinTimerYearsMonthsWeeksDaysHou2EditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureWithinTimerLabelFigure());
			return true;
		}
		if (childEditPart instanceof WithinTimerWithinTimerWithinTimerElementsCompartment2EditPart) {
			IFigure pane = getPrimaryShape()
					.getWithinTimerWithinTimerElementsCompartmentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((WithinTimerWithinTimerWithinTimerElementsCompartment2EditPart) childEditPart)
					.getFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof WithinTimerYearsMonthsWeeksDaysHou2EditPart) {
			return true;
		}
		if (childEditPart instanceof WithinTimerWithinTimerWithinTimerElementsCompartment2EditPart) {
			IFigure pane = getPrimaryShape()
					.getWithinTimerWithinTimerElementsCompartmentFigure();
			pane.remove(((WithinTimerWithinTimerWithinTimerElementsCompartment2EditPart) childEditPart)
					.getFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected void addChildVisual(EditPart childEditPart, int index) {
		if (addFixedChild(childEditPart)) {
			return;
		}
		super.addChildVisual(childEditPart, -1);
	}

	/**
	 * @generated
	 */
	protected void removeChildVisual(EditPart childEditPart) {
		if (removeFixedChild(childEditPart)) {
			return;
		}
		super.removeChildVisual(childEditPart);
	}

	/**
	 * @generated
	 */
	protected IFigure getContentPaneFor(IGraphicalEditPart editPart) {
		if (editPart instanceof WithinTimerWithinTimerWithinTimerElementsCompartment2EditPart) {
			return getPrimaryShape()
					.getWithinTimerWithinTimerElementsCompartmentFigure();
		}
		return getContentPane();
	}

	/**
	 * @generated
	 */
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(40, 40);
		return result;
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated
	 */
	protected NodeFigure createNodeFigure() {
		NodeFigure figure = createNodePlate();
		figure.setLayoutManager(new StackLayout());
		IFigure shape = createNodeShape();
		figure.add(shape);
		contentPane = setupContentPane(shape);
		return figure;
	}

	/**
	 * Default implementation treats passed figure as content pane.
	 * Respects layout one may have set for generated figure.
	 * @param nodeShape instance of generated figure class
	 * @generated
	 */
	protected IFigure setupContentPane(IFigure nodeShape) {
		if (nodeShape.getLayoutManager() == null) {
			ConstrainedToolbarLayout layout = new ConstrainedToolbarLayout();
			layout.setSpacing(5);
			nodeShape.setLayoutManager(layout);
		}
		return nodeShape; // use nodeShape itself as contentPane
	}

	/**
	 * @generated
	 */
	public IFigure getContentPane() {
		if (contentPane != null) {
			return contentPane;
		}
		return super.getContentPane();
	}

	/**
	 * @generated
	 */
	protected void setForegroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setForegroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setBackgroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setBackgroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineWidth(int width) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineWidth(width);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineType(int style) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineStyle(style);
		}
	}

	/**
	 * @generated
	 */
	public EditPart getPrimaryChildEditPart() {
		return getChildBySemanticHint(EventpatternVisualIDRegistry
				.getType(WithinTimerYearsMonthsWeeksDaysHou2EditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSource() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(1);
		types.add(EventpatternElementTypes.Link_4001);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSourceAndTarget(
			IGraphicalEditPart targetEditPart) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof AndEditPart) {
			types.add(EventpatternElementTypes.Link_4001);
		}
		if (targetEditPart instanceof OrEditPart) {
			types.add(EventpatternElementTypes.Link_4001);
		}
		if (targetEditPart instanceof NotEditPart) {
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
		if (targetEditPart instanceof EmailEditPart) {
			types.add(EventpatternElementTypes.Link_4001);
		}
		if (targetEditPart instanceof TwitterEditPart) {
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
		if (targetEditPart instanceof And3EditPart) {
			types.add(EventpatternElementTypes.Link_4001);
		}
		if (targetEditPart instanceof Or3EditPart) {
			types.add(EventpatternElementTypes.Link_4001);
		}
		if (targetEditPart instanceof Not3EditPart) {
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
		if (targetEditPart instanceof ComplexEventPropertyEditPart) {
			types.add(EventpatternElementTypes.Link_4001);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForTarget(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == EventpatternElementTypes.Link_4001) {
			types.add(EventpatternElementTypes.And_2001);
			types.add(EventpatternElementTypes.Or_2002);
			types.add(EventpatternElementTypes.Not_2003);
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
			types.add(EventpatternElementTypes.Email_2033);
			types.add(EventpatternElementTypes.Twitter_2039);
			types.add(EventpatternElementTypes.And_3003);
			types.add(EventpatternElementTypes.Or_3004);
			types.add(EventpatternElementTypes.Not_3005);
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
			types.add(EventpatternElementTypes.And_3027);
			types.add(EventpatternElementTypes.Or_3028);
			types.add(EventpatternElementTypes.Not_3029);
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
			types.add(EventpatternElementTypes.ComplexEventProperty_3059);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public class WithinTimerFigure extends RoundedRectangle {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureWithinTimerLabelFigure;
		/**
		 * @generated
		 */
		private RectangleFigure fWithinTimerWithinTimerElementsCompartmentFigure;

		/**
		 * @generated
		 */
		public WithinTimerFigure() {
			this.setCornerDimensions(new Dimension(getMapMode().DPtoLP(8),
					getMapMode().DPtoLP(8)));
			this.setForegroundColor(THIS_FORE);
			this.setBackgroundColor(THIS_BACK);
			this.setBorder(new MarginBorder(getMapMode().DPtoLP(5),
					getMapMode().DPtoLP(5), getMapMode().DPtoLP(5),
					getMapMode().DPtoLP(5)));
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureWithinTimerLabelFigure = new WrappingLabel();

			fFigureWithinTimerLabelFigure.setText("WithinTimer");
			fFigureWithinTimerLabelFigure.setMaximumSize(new Dimension(
					getMapMode().DPtoLP(10000), getMapMode().DPtoLP(50)));

			this.add(fFigureWithinTimerLabelFigure);

			fWithinTimerWithinTimerElementsCompartmentFigure = new RectangleFigure();

			fWithinTimerWithinTimerElementsCompartmentFigure.setOutline(false);

			this.add(fWithinTimerWithinTimerElementsCompartmentFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureWithinTimerLabelFigure() {
			return fFigureWithinTimerLabelFigure;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getWithinTimerWithinTimerElementsCompartmentFigure() {
			return fWithinTimerWithinTimerElementsCompartmentFigure;
		}

	}

	/**
	 * @generated
	 */
	static final Color THIS_FORE = new Color(null, 110, 110, 110);

	/**
	 * @generated
	 */
	static final Color THIS_BACK = new Color(null, 255, 248, 220);

	// Open the properties view, when the user has double-clicked on the node.
	public void performRequest(Request req) {

		if (req.getType() == REQ_OPEN) {
			mouseDoubleClick();
		} else {
			super.performRequest(req);
		}
	}

	protected void mouseDoubleClick() {
		IWorkbenchPage page = PlatformUI.getWorkbench()
				.getActiveWorkbenchWindow().getActivePage();

		if (page != null) {
			try {
				page.showView("org.eclipse.ui.views.PropertySheet");
			} catch (PartInitException e) {
				e.printStackTrace();
			}
		}
	}
}