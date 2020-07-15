package cs1102;

import java.util.Arrays;
import javax.swing.JOptionPane;

public class MultipleChoiceQuestion {
	static int nQuestions = 0;
	static int nCorrect = 0;
	String question;
	String correctAnswer;
	
	public MultipleChoiceQuestion(String query, String a, String b, String c, String d, String e, String answer) {
		question = query+"\n";
		question += "A. "+a+"\n";
		question += "B. "+b+"\n";
		question += "C. "+c+"\n";
		question += "D. "+d+"\n";
		question += "E. "+e+"\n";
		correctAnswer = answer.toUpperCase();
	}
	
	String ask() {
		String[] options = {"A", "B", "C", "D", "E"};
		
		while(true) {
			String answer = JOptionPane.showInputDialog(question);
			answer = answer.toUpperCase();
			
			if (Arrays.asList(options).contains(answer)) {
				return answer;
			} else {
				JOptionPane.showMessageDialog(null,"Invalid answer. Please enter A, B, C, D, or E.");
				continue;				
			}
		}
	}
	
	void check() {
		nQuestions++;
		
		String answer = ask();
		if (answer.equals(correctAnswer)) {
			JOptionPane.showMessageDialog(null,"Correct!");
			nCorrect++;
			return;
		} else {
			JOptionPane.showMessageDialog(null,"Incorrect. The correct answer is " + correctAnswer + ".");
		}
	}
	
	static void showResults() {
		JOptionPane.showMessageDialog(null, "correct "+nCorrect+" out of "+nQuestions+" questions");
	}
}
