package edu.cpp.cs356;

public class QuestionMult {

	private boolean questionType;
	private String question;
	private boolean[] answers;
	private String[] choices;
	
	public QuestionMult(boolean type, String question, String[] choices, boolean[] answers) {
		this.questionType = type;
		this.question = question;
		this.choices = choices;
		this.answers = answers;
	}
	
	private boolean checkAnswers(boolean[] studChoices) {
		for (int i = 0; i <= answers.length; i++) {
			if (studChoices[i] != answers[i]) {
				return false;
			}
		}
		return true;
	}
	
	
	
	
	
	
	
	
	private String[] multiOne = {
			"Which of the following are animals?",
			"Dog", "Cat", "Fish", "Lamp"
	};
	
	private String[] multiOneA = {
			"Dog", "Cat", "Fish"
	};
	
	private String[] singleOne = {
			"What color is the sky?",
			"Red", "Green", "Blue"
	};
	
	private String[] singleOneA = {
			"Blue"
	};
}
