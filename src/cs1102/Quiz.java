package cs1102;
import java.util.Arrays;
import javax.swing.*;

public class Quiz {
	static int nQuestions = 0;
	static int nCorrect = 0;
	
	public static void main(String[] args) {
	
		// first question
		String question = "What is the name of the prime minister of Japan?\n";
		question += "A. Donald John Trump\n";
		question += "B. Jong-un Kim\n";
		question += "C. Shinzou Abe\n";
		question += "D. Jae-in Moon\n";
		question += "E. Vladimir Putin\n";
		String correctAnswer = "C";
		check(question, correctAnswer);
		
		// second question
		question = "Who is the one advocated the Earth sphere theory first?\n";
		question += "A. Galileo\n";
		question += "B. Thomas Edison\n";
		question += "C. Albert Einstein\n";
		question += "D. Henry Ford\n";
		question += "E. Benjamin Franklin\n";
		correctAnswer = "A";
		check(question, correctAnswer);
		
		// third question
		question = "When did World War II happen??\n";
		question += "A. 1898\n";
		question += "B. 1914\n";
		question += "C. 1930\n";
		question += "D. 1939\n";
		question += "E. 1955\n";
		correctAnswer = "D";
		check(question, correctAnswer);
		
		JOptionPane.showMessageDialog(null, "correct "+nCorrect+" out of "+nQuestions+" questions");
	}
	
	static String ask(String question) {
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
	
	static void check(String question, String correctAnswer) {
		nQuestions++;
		
		String answer = ask(question);
		if (answer.equals(correctAnswer)) {
			JOptionPane.showMessageDialog(null,"Correct!");
			nCorrect++;
			return;
		} else {
			JOptionPane.showMessageDialog(null,"Incorrect. The correct answer is " + correctAnswer + ".");
		}
	}

}