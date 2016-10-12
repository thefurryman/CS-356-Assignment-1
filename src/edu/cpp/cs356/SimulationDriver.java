package edu.cpp.cs356;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;
public class SimulationDriver {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stud = new Student("stu1");
		//stud.setAnswerChoice(0);
		
		//System.out.println(Arrays.toString(stud.getAnswerChoices()));
		System.out.println(stud.getAnswerChoices()[0] );
	}
	
	private ArrayList<Student> generateStudents() {
		int MIN_STUDENT = 3;
		int MAX_STUDENT = 30;
		String studId = "stud";
		
		int numStudents = ThreadLocalRandom.current().nextInt(MIN_STUDENT, MAX_STUDENT + 1);
		ArrayList<Student> students = new ArrayList<Student>();
		
		for (int i = 0; i <= numStudents - 1; i++) {
			Student stud = new Student(studId + i);
			students.add(stud);
		}
		return students;
	}

}
