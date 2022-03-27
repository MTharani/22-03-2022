package com.array;

import java.util.ArrayList;
import java.util.Iterator;

class Student{
	int sid;
	String sname;
	float fees;
	public Student(int sid, String sname, float fees) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.fees = fees;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", fees=" + fees + "]";
	}	
}
//UserDefinedObjectArrayListMain
public class Userdefine  {

	public static void main(String[] args) {
		Student s1=new Student(1, "Thara", 8973.2f);
		Student s2=new Student(2, "Devi", 70903.2f);
		Student s3=new Student(3, "Dhivya", 89321.2f);
		
		ArrayList<Student> slist=new ArrayList<Student>();
		slist.add(s1);
		slist.add(s2);
		slist.add(s3);
		System.out.println(slist);
		
		//Iterator 
		Iterator<Student> sit=slist.iterator();
		while(sit.hasNext()) {
		Student sob=sit.next();
		System.out.println(sob.sid+" "+sob.sname+" "+sob.fees);
		}
	}
	

}

