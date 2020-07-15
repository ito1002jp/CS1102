package cs1102;

public class Quiz {
	
	public static void main(String[] args) {
	
		// first question
		MultipleChoiceQuestion question = new MultipleChoiceQuestion(
				 "What is the name of the prime minister of Japan?",
				 "Donald John Trump",
				 "Jong-un Kim",
				 "Shinzou Abe",
				 "Jae-in Moon",
				 "Vladimir Putin",
				 "c");
		question.check();
		
		// second question
		question = new MultipleChoiceQuestion(
				"Who is the one advocated the Earth sphere theory first",
				"Galileo",
				"Thomas Edison",
				"Albert Einstein",
				"Henry Ford",
				"Benjamin Franklin",
				"A");
		question.check();

		// third question
		question = new MultipleChoiceQuestion(
				"When did World War II happen??",
				"1898",
				"1914",
				"1930",
				"1939",
				"1955",
				"D");
		question.check();
		
		// fourth question
		question = new MultipleChoiceQuestion(
				"what age is allowed to start drinking alcohol in the US???",
				"18",
				"19",
				"20",
				"21",
				"22",
				"D");
		question.check();
		
		// fifth question
		question = new MultipleChoiceQuestion(
				"Which country have recently declared their withdrawal from WHO?",
				"China",
				"USA",
				"Japan",
				"France",
				"Canada",
				"B");
		question.check();
		
		MultipleChoiceQuestion.showResults();
	}
}