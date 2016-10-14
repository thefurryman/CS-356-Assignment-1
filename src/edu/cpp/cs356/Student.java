package edu.cpp.cs356;

public class Student {

	private String studId;
	
	private boolean[] answerChoices = {
			false, false, false, false
	};
	
	public Student(String studId) {
		this.studId = studId;
	}
	public boolean[] getAnswerChoices() {
		return answerChoices;
	}

	public void setAnswerChoice(boolean[] answerChoices) {
		this.answerChoices = answerChoices; 
	}

}
