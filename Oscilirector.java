public class Oscilirector extends Pane {
	
	/**
	 * a.k.a SHAPESHIFTER
	 * 
	 * Copyright {2015} {Terah Laweh}

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.

	 * 
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
