package edu.cpp.cs356;

import java.util.concurrent.ThreadLocalRandom;

public class QuestionSingle implements Question {

	private String question;
	private boolean[] answers;
	private String[] choices;
	
	public QuestionSingle() {
		question = singleOne[0];
		choices = new String[] {singleOne[1], singleOne[2], singleOne[3], singleOne[4]};
		answers = singleOneA;
	}
	//singleOne and singleOneA are question + answer choices, and answers respectively
	private String[] singleOne = {
			"What color is the sky?",
			"Red", "Green", "Blue", "Brown"
	};
	
	private boolean[] singleOneA = {
		false, false, true, false
	};

	@Override
	public boolean checkAnswers(boolean[] answers) {
		if (answers[2] == this.answers[2]) {
			return true;
		}
		return false;
	}
	
	@Override
	public boolean[] answerQuestion() { //randomly choose one of the choices and set it to "true" single since choice
		int choice = ThreadLocalRandom.current().nextInt(0, 4);
		
		boolean[] studAnswers = new boolean[choices.length];
		studAnswers[choice] = !studAnswers[choice];
		
		return studAnswers;
	}
}
