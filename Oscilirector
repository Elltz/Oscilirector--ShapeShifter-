public class Oscilirector extends Pane {
	
	/**
	 * a.k.a SHAPESHIFTER
	 */

	private Shape mRect,mCir,InuserShape,OutuserShape;
	private double x,y;
	private Paint paint;

	public Oscilirector() {
		super();
	}

	public Oscilirector(Node... arg0) {
		super(arg0);
	}

	private void oscilirector(){
		paint = Color.BLUE;
		mRect = new Rectangle(getPrefWidth(),getPrefHeight());
		mCir = new Circle(getPrefWidth()/2);
		setBackground(new Background(new BackgroundFill(
				paint, null, null)));

		hoverProperty().addListener(new ChangeListener<Boolean>() {

			@Override
			public void changed(ObservableValue<? extends Boolean> observable,
					Boolean oldValue, Boolean newValue) {
				System.out.println("IT WORKS LIKE THAT-");	
				System.out.println(newValue);
				if(newValue == true){
					callEnter();
				}else{
					callExit();
				}
			}
		});


		getChildren().addListener(new ListChangeListener<Node>() {

			@Override
			public void onChanged(
					javafx.collections.ListChangeListener.Change<? extends Node> arg0) {
				if(getChildren().size() != 0){
					getChildren().get(0).relocate(x, y);
				}

			}
		});
		DropShadow ds = new DropShadow();
		ds.setOffsetY(0.0);
		ds.setOffsetX(0.0);
		ds.setColor(Color.BLACK);
		setEffect(ds);
	}

	private boolean first =true;

	@Override
	protected void updateBounds() {
		super.updateBounds();		
		if(first){
			oscilirector();
			first = false;
			if(getChildren().size() != 0){
				getChildren().get(0).relocate(x, y);
			}
		}
	}

	public double getRelocationX() {
		return x;
	}

	public void setRelocationX(double x) {
		this.x = x;
	}

	public double getRelocationY() {
		return y;
	}

	public void setRelocationY(double y) {
		this.y = y;
	}

	public Paint getOscilirectorPaint() {
		return paint;
	}

	public void setOscilirectorPaint(Paint paint) {
		this.paint = paint;
	}

	private void callExit(){
		if(OutuserShape == null){
			setShape(mCir);
		}else{setShape(OutuserShape);}
	}

	private void callEnter(){
		if(InuserShape == null){
			setShape(mRect);
		}else{setShape(InuserShape);}
	}


}
