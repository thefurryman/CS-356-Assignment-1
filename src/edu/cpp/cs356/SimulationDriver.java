package edu.cpp.cs356;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class SimulationDriver {

	public static void main(String[] args) {
		start();
	}
	
	public static void start() {
		SimulationDriver driver = new SimulationDriver();
		
		ArrayList<Student> students = driver.generateStudents();
		Question question = driver.initializeQuestion();
		Service service = new IVoteService(students, question);
		
		//every student will answer the question given
		for (int i = 0; i <= students.size() - 1; i++) { 
			service.answerQuestions(students.get(i));
		}
		service.printStats();
	}
	
	private Question initializeQuestion() {
		Question question;
		int randQ = ThreadLocalRandom.current().nextInt(1, 3); //rand = 1 or 2 ("50/50")
		
		if (randQ == 1) {
			question = new QuestionSingle();
			System.out.println("Single choice question selected." + "\n");
		} else {
			question = new QuestionMult();
			System.out.println("Multiple choice question selected." + "\n");
		}
		return question;
	}
	
	private ArrayList<Student> generateStudents() {
		int MIN_STUDENT = 1;
		int MAX_STUDENT = 30;
		String studId = "stud";
		
		int numStudents = ThreadLocalRandom.current().nextInt(MIN_STUDENT, MAX_STUDENT + 1);
		ArrayList<Student> students = new ArrayList<Student>();
		
		for (int i = 0; i <= numStudents - 1; i++) {
			Student stud = new Student(studId + i);
			students.add(stud);
		}
		System.out.println(students.size() + " students generated.");
		return students;
	}
}
