package com.sample;
import javax.swing.Icon;
import javax.swing.JOptionPane;

public class Window {
	
	
	public Window(){}
	
	public static String askUser(String question, String answer) {
		String[] options = {answer};
		return showDialog(question, options);
	}
	
	public static String askUser(String question, String firstAnswer, String secondAnswer, String thirdAnswer) {
		String[] options = {firstAnswer,secondAnswer,thirdAnswer};
		return showDialog(question, options);
	}
	
	public static String askUser(String question, String firstAnswer, String secondAnswer) {
		String[] options = {firstAnswer,secondAnswer};
		return showDialog(question, options);
    }
	
	public static String showDialog(String question, String[] options) {
		int n = JOptionPane.showOptionDialog(
			null,							//parent
			question,						//Dialog message
			"StarWars_static",				//Dialog title
			JOptionPane.YES_NO_OPTION,		//option type
			JOptionPane.QUESTION_MESSAGE,	//message type
			null,     						//icon
			options,  						//options
			options[0]					//initial value
		); 
		if (n<0 || n >= options.length)
			return "User interaption";
		else 
			return options[n];
	}	
}