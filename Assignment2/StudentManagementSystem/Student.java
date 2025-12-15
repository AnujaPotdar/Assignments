package studInfo;
import java.util.Scanner;

public class Student implements Comparable<Student>{
	int rollno,marks;
	String name;
	public Student() {}
	public Student(int rollno, int marks, String name) {
		super();
		this.rollno = rollno;
		this.marks = marks;
		this.name = name;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public void accept(Scanner sc) {
		System.out.println("Enter rollno:");
		rollno=sc.nextInt();
		System.out.println("Enter name:");
		name=sc.next();
		System.out.println("Enter marks:");
		marks=sc.nextInt();
	}
	public void display() {
		System.out.println("RollNo:"+rollno);
		System.out.println("Name:"+name);
		System.out.println("Marks:"+marks);
	}
	@Override
	public boolean equals(Object obj) {
		if(this==obj) {
			return true;
		}
		if(obj==null) {
			return false;
		}
		if(obj instanceof Student) {
			Student s=(Student)obj;
			if(s.rollno==this.rollno && s.name==this.name && s.marks==this.marks) {
				return true;
			}
		}
		return false;
	}
	@Override
	public int compareTo(Student o) {
		return this.rollno-o.rollno;
	}
	
}
