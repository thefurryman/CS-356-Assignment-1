package edu.cpp.cs356;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class IVoteService implements Service {

	private ArrayList<Student> students;
	private Question question;
	
	public IVoteService (ArrayList<Student> students, Question question) {
		this.students = students;
		this.question = question;
	}
	
	public void answerQuestions(Student student) { //Student answers given question
		boolean[] studAns = question.answerQuestion();
		student.setAnswerChoice(studAns);
		tally(studAns);
	}
	
	public void printStats() {
		System.out.println(
				"Number of students: " + students.size() + "\n" + 
				"A: " + choiceCount[0] + "\n" +
				"B: " + choiceCount[1] + "\n" +
				"C: " + choiceCount[2] + "\n" +
				"D: " + choiceCount[3] + "\n" +
				"Right: " + correctCount[0] + " Wrong: " + correctCount[1]);
	}
	
	//keeps track of answers chosen and number of correct answers
	private void tally(boolean[] studAns) { 
		for (int i = 0; i <= choiceCount.length - 1; i++) {
			if (studAns[i] == true) {
				choiceCount[i]++;
			}
		}
		
		if (question.checkAnswers(studAns)) {
			correctCount[0]++;
		} else {
			correctCount[1]++;
		}
	}
}
