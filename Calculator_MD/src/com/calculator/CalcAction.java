package com.calculator;

public class CalcAction extends CalcController{
	
	
	

	public CalcAction() {
		super();
	}

	public void resultEqualsText() {
		if (result == text)
			text = "";
	}

	public void action0() {
		resultEqualsText();
		text += "0";
		getTextField().setText(text);
	}
	public void action1() {
		resultEqualsText();
		text += "1";
		getTextField().setText(text);
	}
	public void action2() {
		resultEqualsText();
		text += "2";
		getTextField().setText(text);
	}
	public void action3() {
		calcAction.resultEqualsText();
		text += "3";
		getTextField().setText(text);
	}
	public void action4() {
		calcAction.resultEqualsText();
		text += "4";
		getTextField().setText(text);
	}
	public void action5() {
		calcAction.resultEqualsText();
		text += "5";
		getTextField().setText(text);
	}
	public void action6() {
		calcAction.resultEqualsText();
		text += "6";
		getTextField().setText(text);
	}
	public void action7() {
		calcAction.resultEqualsText();
		text += "7";
		getTextField().setText(text);
	}
	public void action8() {
		calcAction.resultEqualsText();
		text += "8";
		getTextField().setText(text);
	}
	public void action9() {
		calcAction.resultEqualsText();
		text += "9";
		getTextField().setText(text);
	}
	public void actionAdd() {
		if (text.length() > 0)
			num1 = Float.parseFloat(getTextField().getText());
		operation = '+';
		text = "";
		getTextField().setText("+");
	}
	public void actionComma() {
		if (!text.contains("."))
			text += ".";
		else
			text += "";
		getTextField().setText(text);
	}
	public void actionDivide() {
		if (text.length() > 0)
			num1 = Float.parseFloat(getTextField().getText());
		operation = '÷';
		text = "";
		getTextField().setText("÷");
	}
	public void actionMultiply() {
		if (text.length() > 0)
			num1 = Float.parseFloat(getTextField().getText());
		operation = '×';
		text = "";
		getTextField().setText("×");
	}
	public void actionSubstract() {
		if (text.length() > 0)
			num1 = Float.parseFloat(getTextField().getText());
		operation = '-';
		text = "";
		getTextField().setText("-");
	}
}
