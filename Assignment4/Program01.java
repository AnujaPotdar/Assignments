package com.sunbeam.p1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Program01 {
	private static final String URL="jdbc:mysql://localhost:3306/internship_db";
	private static final String USERNAME="root";
	private static final String PASSWORD="manager";
	
	public static Connection getConnection() throws SQLException {
		return DriverManager.getConnection(URL, USERNAME, PASSWORD);
		
	}
	
	public static void getAllStudents() {
		String sql="Select * from student";
		Connection connection;
		try {
			connection = getConnection();
			PreparedStatement selectStatement=connection.prepareStatement(sql);
			ResultSet rs=selectStatement.executeQuery();
		
			while(rs.next()) {
				int rollno=rs.getInt(1);
				String name=rs.getString(2),course=rs.getString(5),email=rs.getString(3);
				System.out.println(rollno+"-"+name+"-"+email+"-"+course);
				
			}
			connection.close();
			selectStatement.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}		
		
	}
	public static void addStudent(String name,String email,String course) {
		
		String sql="Insert into student(name,email,course) values(?,?,?)";
		try {
			Connection connection=getConnection();
			PreparedStatement insertStatement=connection.prepareStatement(sql);
			insertStatement.setString(1, name);
			insertStatement.setString(2, email);
			insertStatement.setString(3, course);
			insertStatement.executeUpdate();
			
			connection.close();
			insertStatement.close();
			System.out.println("Student inserted successfully!");
			
		}catch (SQLException e) {
			e.printStackTrace();
		}
	
	}
	
	public static void updatetudent(String course,int rollno) {
		
		String sql="update student set course=? where eollno=?";
		
		try {
			Connection connection=getConnection();
			PreparedStatement updateStatement=connection.prepareStatement(sql);
			updateStatement.setString(1,course);
			updateStatement.setInt(2, rollno);
			updateStatement.executeUpdate();
			connection.close();
			updateStatement.close();
			System.out.println("Updated successfully!!");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
	public static void deleteStudent(int rollno) {
		
		String sql="delete from student where rollno=?";
		
		Connection connection;
		try {
			connection = getConnection();
			PreparedStatement deleteStudent=connection.prepareStatement(sql);
			deleteStudent.setInt(1,rollno);
			deleteStudent.executeUpdate();
			
			connection.close();
			deleteStudent.close();
			System.out.println("Deleted successfully!");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}
	
	public static int menu(Scanner sc) {
		System.out.println("----------------Student Menu---------------");
		System.out.println("0.Exit");
		System.out.println("1.Show All Students");
		System.out.println("2.Insert Student");
		System.out.println("3.Update Student");
		System.out.println("4.Delete Student");
		System.out.println("Which operation you want to perform?");
		return sc.nextInt();
	}
	public static void main(String args[]) {
		
		int rollno;
		String name,email,course;
		Scanner sc=new Scanner(System.in);
		int choice;
		while((choice=menu(sc))!=0){
			
			switch(choice) {
			case 1:
				System.out.println("---------------Student List-----------------");
				getAllStudents();
				System.out.println("--------------------------------------------");
				break;
			case 2:
				System.out.println("Enter name:");
				 name=sc.next();
				System.out.println("Enter email:");
				 email=sc.next();
				System.out.println("Enter course:");
				 course=sc.next();
				addStudent(name, email, course);
				break;
			case 3:
				System.out.println("Enter rollno of student you want to update:");
				 rollno=sc.nextInt();
				System.out.println("Enter new course:");
				course=sc.next();
				updatetudent(course,rollno);
				break;
			case 4:
				System.out.println("Enter rollno of student which you want to delete:");
				 rollno=sc.nextInt();
				deleteStudent(rollno);
				break;
			default:
				System.out.println("Invalid choice!!");
				
			}
		}
		
	}
}
