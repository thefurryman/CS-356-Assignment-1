package edu.cpp.cs356;

import java.util.concurrent.ThreadLocalRandom;

public class QuestionMult implements Question{

	private String question;
	private boolean[] answers;
	private String[] choices;
	
	private String[] multiOne = {
			"Which of the following are animals?",
			"Dog", "Cat", "Fish", "Lamp"
	};
	
	private boolean[] multiOneA = {
			true, true, true, false
	};
	
	public QuestionMult() {
		question = multiOne[0];
		choices = new String[] {multiOne[1], multiOne[2], multiOne[3], multiOne[4]};
		answers = multiOneA;
	}
	
	@Override
	public boolean checkAnswers(boolean[] studChoices) {
		for (int i = 0; i <= answers.length - 1; i++) {
			if (studChoices[i] != answers[i]) {
				return false;
			}
		}
		return true;
	}
	
	@Override
	public boolean[] answerQuestion() {
		boolean[] studAnswers = new boolean[choices.length];
		int rand;
		
		for (int i = 0; i <= studAnswers.length - 1; i++) {
			rand = ThreadLocalRandom.current().nextInt(1, 3);
			if (rand == 1) {
				studAnswers[i] = !studAnswers[i];
			}
		}
		return studAnswers;
	}
}
