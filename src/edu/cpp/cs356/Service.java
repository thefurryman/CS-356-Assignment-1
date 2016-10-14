package edu.cpp.cs356;

public interface Service {

	public int[] choiceCount = new int[4];
	
	public int[] correctCount = new int[2];
	
	public void answerQuestions(Student student);
	
	public void printStats();
}
