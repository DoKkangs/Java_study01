package ch24;

import java.util.ArrayList;

public class Student {

	int studentId;
	String studentName;
	
	ArrayList<Subject> subjectList;
	
	
	public Student(int studentId,String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
		
		subjectList = new ArrayList<Subject>();
	}
	
	public void addSubject(String subjectName,int score) {
		
		Subject subject = new Subject();
		subject.setSubjectName(subjectName);
		subject.setScore(score);
		
		subjectList.add(subject);
	}
	
	public void showScoreInfo() {
		
		int total = 0;
		
		for(Subject subject:subjectList) {
			
			total += subject.getScore();
			System.out.println(studentName+"학생의 " + subject.getSubjectName()+"과목의 성적은 "+subject.getScore()+"입니다");
			
		}
		System.out.println(studentName+"학생의 총점은 "+total+"입니다.");
	}
	
}
