package com.calculator;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;

public class CalcController implements Initializable {

	String text = "";
	double num1 = 0;
	double num2 = 0;
	char operation;
	String result;
	double per;

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
	private Button ButtonClear;
	@FXML
	private Button ButtonPercent;
	@FXML
	private Button ButtonBackSpace;
	@FXML
	private Button ButtonPlusMinus;

	@FXML
	void KeyPressed(KeyEvent event) {
		switch (event.getCode()) {
		case BACK_SPACE:
			text = "";
			if (textField.getText().length() > 0) {
				StringBuilder strB = new StringBuilder(textField.getText());
				strB.deleteCharAt(textField.getText().length() - 1);
				text = strB.toString();
				textField.setText(text);
				break;
			}
		case ENTER:
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
			} catch (java.lang.NumberFormatException error) {
				text = "Syntax error";
			}
			if (text.length() > 10)
				textField.setText(text.substring(0, 10));
			textField.setText(text);
			result = text;
		default:
			break;
		}
	}

	@FXML
	void KeyTyped(KeyEvent event) {
		switch (event.getCharacter()) {
		case "0":
			action0();
			break;
		case "1":
			action1();
			break;
		case "2":
			action2();
			break;
		case "3":
			action3();
			break;
		case "4":
			action4();
			break;
		case "5":
			action5();
			break;
		case "6":
			action6();
			break;
		case "7":
			action7();
			break;
		case "8":
			action8();
			break;
		case "9":
			action9();
			break;
		case "+":
			actionAdd();
			break;
		case "/":
			actionDivide();
			break;
		case "*":
			actionMultiply();
			break;
		case "-":
			actionSubstract();
			break;
		case ".":
			actionComma();
			break;
		}
	}

	@FXML
	void Button0Action(ActionEvent event) {
		action0();
	}

	public void action0() {
		resultEqualsText();
		text += "0";
		textField.setText(text);
	}

	@FXML
	void Button1Action(ActionEvent event) {
		action1();
	}

	private void action1() {
		resultEqualsText();
		text += "1";
		textField.setText(text);
	}

	@FXML
	void Button2Action(ActionEvent event) {
		action2();
	}

	private void action2() {
		resultEqualsText();
		text += "2";
		textField.setText(text);
	}

	@FXML
	void Button3Action(ActionEvent event) {
		action3();
	}

	private void action3() {
		resultEqualsText();
		text += "3";
		textField.setText(text);
	}

	@FXML
	void Button4Action(ActionEvent event) {
		action4();
	}

	private void action4() {
		resultEqualsText();
		text += "4";
		textField.setText(text);
	}

	@FXML
	void Button5Action(ActionEvent event) {
		action5();
	}

	private void action5() {
		resultEqualsText();
		text += "5";
		textField.setText(text);
	}

	@FXML
	void Button6Action(ActionEvent event) {
		action6();
	}

	private void action6() {
		resultEqualsText();
		text += "6";
		textField.setText(text);
	}

	@FXML
	void Button7Action(ActionEvent event) {
		action7();
	}

	private void action7() {
		resultEqualsText();
		text += "7";
		textField.setText(text);
	}

	@FXML
	void Button8Action(ActionEvent event) {
		action8();
	}

	private void action8() {
		resultEqualsText();
		text += "8";
		textField.setText(text);
	}

	@FXML
	void Button9Action(ActionEvent event) {
		action9();
	}

	private void action9() {
		resultEqualsText();
		text += "9";
		textField.setText(text);
	}

	@FXML
	void ButtonAddAction(ActionEvent event) {
		actionAdd();
	}

	private void actionAdd() {
		if (text.length() > 0)
			num1 = Float.parseFloat(textField.getText());
		operation = '+';
		text = "";
		textField.setText("+");
	}

	@FXML
	void ButtonCommaAction(ActionEvent event) {
		actionComma();
	}

	private void actionComma() {
		if (!text.contains("."))
			text += ".";
		else
			text += "";
		textField.setText(text);
	}

	@FXML
	void ButtonDivideAction(ActionEvent event) {
		actionDivide();
	}

	private void actionDivide() {
		if (text.length() > 0)
			num1 = Float.parseFloat(textField.getText());
		operation = '÷';
		text = "";
		textField.setText("÷");
	}

	@FXML
	void ButtonMultiplyAction(ActionEvent event) {
		actionMultiply();
	}

	private void actionMultiply() {
		if (text.length() > 0)
			num1 = Float.parseFloat(textField.getText());
		operation = '×';
		text = "";
		textField.setText("×");
	}

	@FXML
	void ButtonSubstractAction(ActionEvent event) {
		actionSubstract();
	}

	private void actionSubstract() {
		if (text.length() > 0)
			num1 = Float.parseFloat(textField.getText());
		operation = '-';
		text = "";
		textField.setText("-");
	}

	@FXML
	void ButtonClearAction(ActionEvent event) {
		text = "";
		num1 = num2 = 0;
		textField.setText(text);
	}

	@FXML
	void ButtonPercentAction(ActionEvent event) {
		if (text.length() > 0)
			per = Float.parseFloat(textField.getText());
		text = "" + per * num1 / 100;
		if (text.length() > 10)
			textField.setText(text.substring(0, 8));
		textField.setText(text);
	}

	@FXML
	void ButtonBackSpaceAction(ActionEvent event) {
		text = "";
		if (textField.getText().length() > 0) {
			StringBuilder strB = new StringBuilder(textField.getText());
			strB.deleteCharAt(textField.getText().length() - 1);
			text = strB.toString();
			textField.setText(text);
		}
	}

	@FXML
	void ButtonPlusMinusAction(ActionEvent event) {
		if (text.length() > 0) {
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
		} catch (java.lang.NumberFormatException error) {
			text = "Syntax error";
		}
		if (text.length() > 10)
			textField.setText(text.substring(0, 10));
		textField.setText(text);
		result = text;
	}

	public void initialize(URL location, ResourceBundle resources) {
		System.out.println("The pane loaded");
	}

	public void resultEqualsText() {
		if (result == text)
			text = "";
	}
}