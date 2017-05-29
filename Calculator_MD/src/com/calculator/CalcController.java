package com.calculator;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class CalcController implements Initializable {
	
	String text = "";
	double num1 = 0;
	double num2 = 0;
	char operation;
	String result;
	
    @FXML
    private TextField textField;
    @FXML
    private Button Button0;
    @FXML
    private Button ButtonComma;
    @FXML
    private Button ButtonEqual;
    @FXML
    private Button Button1;
    @FXML
    private Button Button2;
    @FXML
    private Button Button3;
    @FXML
    private Button ButtonAdd;
    @FXML
    private Button Button4;
    @FXML
    private Button Button5;
    @FXML
    private Button Button6;
    @FXML
    private Button ButtonSubstract;
    @FXML
    private Button Button7;
    @FXML
    private Button Button8;
    @FXML
    private Button Button9;
    @FXML
    private Button ButtonMultiply;
    @FXML
    private Button ButtonDivide;
    @FXML
    private Button ButtonClear1;
    @FXML
    private Button ButtonClear2;
    @FXML
    private Button ButtonBackSpace;
    @FXML
    private Button ButtonPlusMinus;
    @FXML
    void Button0Action(ActionEvent event) {
    	resultEqualsText();
    	text += "0";
        textField.setText(text);
    }
    @FXML
    void Button1Action(ActionEvent event) {
    	resultEqualsText();
    	text += "1";
    	textField.setText(text);
    }
    @FXML
    void Button2Action(ActionEvent event) {
    	resultEqualsText();
    	text += "2";
    	textField.setText(text);
    }
    @FXML
    void Button3Action(ActionEvent event) {
    	resultEqualsText();
    	text += "3";
    	textField.setText(text);
    }
    @FXML
    void Button4Action(ActionEvent event) {
    	resultEqualsText();
    	text += "4";
    	textField.setText(text);
    }
    @FXML
    void Button5Action(ActionEvent event) {
    	resultEqualsText();
    	text += "5";
    	textField.setText(text);
    }
    @FXML
    void Button6Action(ActionEvent event) {
    	resultEqualsText();
    	text += "6";
    	textField.setText(text);
    }
    @FXML
    void Button7Action(ActionEvent event) {
    	resultEqualsText();
    	text += "7";
    	textField.setText(text);
    }
    @FXML
    void Button8Action(ActionEvent event) {
    	resultEqualsText();
    	text += "8";
    	textField.setText(text);
    }
    @FXML
    void Button9Action(ActionEvent event) {
    	resultEqualsText();
    	text += "9";
    	textField.setText(text);
    }
    @FXML
    void ButtonAddAction(ActionEvent event) {
    	if(text.length() > 0)
    		num1 = Float.parseFloat(textField.getText());
    		operation = '+';
    		text = "";
    		textField.setText("+");
    }
    @FXML
    void ButtonCommaAction(ActionEvent event) {
    	if(!text.contains(","))
    		text += ",";
    	else
    		text += "";
    	textField.setText(text);
    }
    @FXML
    void ButtonDivideAction(ActionEvent event) {
    	if(text.length() > 0)
    		num1 = Float.parseFloat(textField.getText());
    		operation = '÷';
    		text = "";
    		textField.setText("÷");
    }
    @FXML
    void ButtonMultiplyAction(ActionEvent event) {
    	if(text.length() > 0)
    		num1 = Float.parseFloat(textField.getText());
    		operation = '×';
    		text = "";
    		textField.setText("×");
    }
    @FXML
    void ButtonSubstractAction(ActionEvent event) {
    	if(text.length() > 0)
    		num1 = Float.parseFloat(textField.getText());
    		operation = '-';
    		text = "";
    		textField.setText("-");
    }
    @FXML
    void ButtonClearAction(ActionEvent event) {
    	text = "";
    	textField.setText(text);
    }
    @FXML
    void ButtonBackSpaceAction(ActionEvent event) {
    	text = "";
    	if(textField.getText().length() > 0){
    		StringBuilder strB = new StringBuilder(textField.getText());
    		strB.deleteCharAt(textField.getText().length() - 1);
    		text = strB.toString();
    		textField.setText(text);
    	}
    }
    @FXML
    void ButtonPlusMinusAction(ActionEvent event) {
    	if(text.length() > 0) {
    		float sign = Float.parseFloat(text);
    		sign = sign * (-1);
    		textField.setText(String.valueOf(sign));
    	}
    	
    	
    }
    @FXML
    void ButtonEqualAction(ActionEvent event) {
    	try {
    		switch (operation) {
    		case '+':
    			num2 = Float.parseFloat(textField.getText());
    			text = "" + (num1 + num2);
    			break;
    		case '-':
    			num2 = Float.parseFloat(textField.getText());
    			text = "" + (num1 - num2);
    			break;
    		case '×':
    			num2 = Float.parseFloat(textField.getText());
    			text = "" + (num1 * num2);
    			break;
    		case '÷':
    			num2 = Float.parseFloat(textField.getText());
    			text = "" + (num1 / num2);
    			break;
    		default:
    			text = "Syntax error";
    			break;
    		}
    	}
    	catch(java.lang.NumberFormatException error) {
    		text = "Syntax error";
    	}
    	textField.setText(text);
    	result = text;
    }

	public void initialize(URL location, ResourceBundle resources) {
		System.out.println("The pane loaded");
	}
	
	private void resultEqualsText() {
		if (result == text)
			text = "";
	}
}