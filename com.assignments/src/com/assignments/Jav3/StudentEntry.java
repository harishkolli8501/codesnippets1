package com.assignments.Jav3;

public class StudentEntry {
	
	int stuid ;
	String name;
	String course;
	int age;
	static String company = "QT";
	
	public void studentDetails(int sid,String sname, String scourse, int sage) {
		System.out.println(this.stuid=sid);
		System.out.println(this.name = sname);
		System.out.println(this.course=scourse);
		System.out.println(this.age=sage);
		System.out.println(company);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StudentEntry s1= new StudentEntry();
		
		s1.studentDetails(001,"Harish","Selenium",26);
		System.out.println(s1.stuid);

	}

}
