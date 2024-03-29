package com.gwtcalc.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;

public class CalcUiBinder extends Composite implements HasText {

	private static CalcUiBinderUiBinder uiBinder = GWT.create(CalcUiBinderUiBinder.class);

	interface CalcUiBinderUiBinder extends UiBinder<Widget, CalcUiBinder> {
	}

	@UiField VerticalPanel verticalPanel;
	@UiField TextBox textBox;
	@UiField Button btnClear;
	@UiField Button btnOne;
	@UiField Button btnDivide;
	@UiField Button btnMult;
	@UiField Button btnSub;
	@UiField Button btnAdd;
	@UiField Button btnAns;
	@UiField Button btnTwo; 
	@UiField Button btnThree;
	@UiField Button btnFour;
	@UiField Button btnFive;
	@UiField Button btnSix;
	@UiField Button btnSeven;
	@UiField Button btnEight;
	@UiField Button btnNine;
	@UiField Button btnZero;

	    
	
	public CalcUiBinder() {
		initWidget(uiBinder.createAndBindUi(this));
		
		btnClear.addClickHandler(new ClickHandler() {
		@Override
		public void onClick(ClickEvent event) {
			textBox.setText("");
			
		    }
		});
	 
		btnOne.addClickHandler(new ClickHandler() {
	            public void onClick(ClickEvent event) {
	            	textBox.setText("1");
	            }
        });
		
		btnTwo.addClickHandler(new ClickHandler() {
		    public void onClick(ClickEvent event) {
		       textBox.setValue(textBox.getValue()+ "2" );
		    }
		});
		
		btnThree.addClickHandler(new ClickHandler() {
		    public void onClick(ClickEvent event) {
		    	 textBox.setValue(textBox.getValue()+ "3" );
		    }
		});
	
		btnFour.addClickHandler(new ClickHandler() {
		    public void onClick(ClickEvent event) {
		    	 textBox.setValue(textBox.getValue()+ "4" );
		    }
		});
	
		btnFive.addClickHandler(new ClickHandler() {
		    public void onClick(ClickEvent event) {
		    	 textBox.setValue(textBox.getValue()+ "5" );
		    }
		});
		
		btnSix.addClickHandler(new ClickHandler() {
		    public void onClick(ClickEvent event) {
		    	 textBox.setValue(textBox.getValue()+ "6" );
		    }
		});
		
		btnSeven.addClickHandler(new ClickHandler() {
		    public void onClick(ClickEvent event) {
		    	 textBox.setValue(textBox.getValue()+ "7" );
		    }
		});
	
		btnEight.addClickHandler(new ClickHandler() {
		    public void onClick(ClickEvent event) {
		    	 textBox.setValue(textBox.getValue()+ "8" );
		    }
		});
		
		btnNine.addClickHandler(new ClickHandler() {
			@Override
			public void onClick(ClickEvent event) {
				 textBox.setValue(textBox.getValue()+ "9" );
			}
		});
		
		btnZero.addClickHandler(new ClickHandler() {
			@Override
			public void onClick(ClickEvent event) {
				 textBox.setValue(textBox.getValue()+ "0" );
			}
		});
	
//		btnZero.addClickHandler(new ClickHandler() {
//			@Override
//			public void onClick(ClickEvent event) {
//				textBox.setText("0");
//			}
//		});
	}


	@Override
	public String getText() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void setText(String text) {
		// TODO Auto-generated method stub
		
	}

	
	

}
