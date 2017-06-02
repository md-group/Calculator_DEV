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

	CalcAction calcAction = new CalcAction();

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
			if (getTextField().getText().length() > 0) {
				StringBuilder strB = new StringBuilder(getTextField().getText());
				strB.deleteCharAt(getTextField().getText().length() - 1);
				text = strB.toString();
				getTextField().setText(text);
				break;
			}
		case ENTER:
			try {
				switch (operation) {
				case '+':
					num2 = Float.parseFloat(getTextField().getText());
					text = "" + (num1 + num2);
					break;
				case '-':
					num2 = Float.parseFloat(getTextField().getText());
					text = "" + (num1 - num2);
					break;
				case '×':
					num2 = Float.parseFloat(getTextField().getText());
					text = "" + (num1 * num2);
					break;
				case '÷':
					num2 = Float.parseFloat(getTextField().getText());
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
				getTextField().setText(text.substring(0, 10));
			getTextField().setText(text);
			result = text;
		default:
			break;
		}
	}

	@FXML
	void KeyTyped(KeyEvent event) {
		switch (event.getCharacter()) {
		case "0":
			calcAction.action0();
			break;
		case "1":
			calcAction.action1();
			break;
		case "2":
			calcAction.action2();
			break;
		case "3":
			calcAction.action3();
			break;
		case "4":
			calcAction.action4();
			break;
		case "5":
			calcAction.action5();
			break;
		case "6":
			calcAction.action6();
			break;
		case "7":
			calcAction.action7();
			break;
		case "8":
			calcAction.action8();
			break;
		case "9":
			calcAction.action9();
			break;
		case "+":
			calcAction.actionAdd();
			break;
		case "/":
			calcAction.actionDivide();
			break;
		case "*":
			calcAction.actionMultiply();
			break;
		case "-":
			calcAction.actionSubstract();
			break;
		case ".":
			calcAction.actionComma();
			break;
		}
	}

	@FXML
	void Button0Action(ActionEvent event) {
		calcAction.action0();
	}

	@FXML
	void Button1Action(ActionEvent event) {
		calcAction.action1();
	}

	@FXML
	void Button2Action(ActionEvent event) {
		calcAction.action2();
	}

	@FXML
	void Button3Action(ActionEvent event) {
		calcAction.action3();
	}

	@FXML
	void Button4Action(ActionEvent event) {
		calcAction.action4();
	}

	@FXML
	void Button5Action(ActionEvent event) {
		calcAction.action5();
	}

	@FXML
	void Button6Action(ActionEvent event) {
		calcAction.action6();
	}

	@FXML
	void Button7Action(ActionEvent event) {
		calcAction.action7();
	}

	@FXML
	void Button8Action(ActionEvent event) {
		calcAction.action8();
	}

	@FXML
	void Button9Action(ActionEvent event) {
		calcAction.action9();
	}

	@FXML
	void ButtonAddAction(ActionEvent event) {
		calcAction.actionAdd();
	}

	@FXML
	void ButtonCommaAction(ActionEvent event) {
		calcAction.actionComma();
	}

	@FXML
	void ButtonDivideAction(ActionEvent event) {
		calcAction.actionDivide();
	}

	@FXML
	void ButtonMultiplyAction(ActionEvent event) {
		calcAction.actionMultiply();
	}

	@FXML
	void ButtonSubstractAction(ActionEvent event) {
		calcAction.actionSubstract();
	}

	@FXML
	void ButtonClearAction(ActionEvent event) {
		text = "";
		num1 = num2 = 0;
		getTextField().setText(text);
	}

	@FXML
	void ButtonPercentAction(ActionEvent event) {
		if (text.length() > 0)
			per = Float.parseFloat(getTextField().getText());
		text = "" + per * num1 / 100;
		if (text.length() > 10)
			getTextField().setText(text.substring(0, 8));
		getTextField().setText(text);
	}

	@FXML
	void ButtonBackSpaceAction(ActionEvent event) {
		text = "";
		if (getTextField().getText().length() > 0) {
			StringBuilder strB = new StringBuilder(getTextField().getText());
			strB.deleteCharAt(getTextField().getText().length() - 1);
			text = strB.toString();
			getTextField().setText(text);
		}
	}

	@FXML
	void ButtonPlusMinusAction(ActionEvent event) {
		if (text.length() > 0) {
			float sign = Float.parseFloat(text);
			sign = sign * (-1);
			getTextField().setText(String.valueOf(sign));
		}
	}

	@FXML
	void ButtonEqualAction(ActionEvent event) {
		try {
			switch (operation) {
			case '+':
				num2 = Float.parseFloat(getTextField().getText());
				text = "" + (num1 + num2);
				break;
			case '-':
				num2 = Float.parseFloat(getTextField().getText());
				text = "" + (num1 - num2);
				break;
			case '×':
				num2 = Float.parseFloat(getTextField().getText());
				text = "" + (num1 * num2);
				break;
			case '÷':
				num2 = Float.parseFloat(getTextField().getText());
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
			getTextField().setText(text.substring(0, 10));
		getTextField().setText(text);
		result = text;
	}

	public void initialize(URL location, ResourceBundle resources) {
		System.out.println("The pane loaded");
	}

	public TextField getTextField() {
		return textField;
	}

}