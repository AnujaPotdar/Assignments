package studInfo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class StudentMain {
	public static int menu(Scanner sc) {
		System.out.println("------------------------------");
		System.out.println("1)Add Student");
		System.out.println("2)Display All Students");
		System.out.println("3)Search Student on Rollno");
		System.out.println("4)Sort Student on Rollno");
		System.out.println("5)Sort Student on name");
		System.out.println("6)Sort Student on marks");
		System.out.println("0)Exit");
		System.out.println("------------------------------");
		System.out.println("Enter your choice:");

		return sc.nextInt();
	}
	public static void main(String args[]) {
		int ch;
		Scanner sc=new Scanner(System.in);
		List<Student> s=new ArrayList<>();
		
		while((ch=menu(sc))!=0) {
		switch(ch) {
		case 1:
			Student s1=new Student();
			s1.accept(sc);
			s.add(s1);
			System.out.println("Student Added!!");
			break;
		case 2:
			if(s.size()<=0) {
				System.out.println("No data found!");
				break;
			}
			for(Student s2:s) {
				s2.display();
			}
			break;
		case 3:
			System.out.println("Enter roll no to search:");
			int r=sc.nextInt();
			int f=0;
			for(Student s2:s) {
				if(s2.rollno==r) {
					f=1;
					s2.display();
				}
			}
			if(f==0)
				System.out.println("Student not found!");
			break;
		case 4:
			System.out.println("Students sorted according to rollno\n");
			Collections.sort(s);
			for(Student s2:s) {
				s2.display();
			}
			break;
		case 5:
			System.out.println("Students sorted according to name\n");
			Collections.sort(s,new sortByName());
			for(Student s2:s) {
				s2.display();
			}
			break;
		case 6:
			System.out.println("Students sorted according to rmarks\n");
			Collections.sort(s,new sortByMarks());
			for(Student s2:s) {
				s2.display();
			}
			break;
		default:
			System.out.println("INVALID CHOICE!!!");
			
		}
		}
	}
}
