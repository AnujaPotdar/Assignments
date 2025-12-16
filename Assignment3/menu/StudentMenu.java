package com.internship.quiz.menu;

import java.util.Scanner;

public class StudentMenu {
	private static int studentMenuOptions(Scanner sc) {
		System.out.println("-----------Student Menu------------");
		System.out.println("1.View Quizes");
		System.out.println("2.Take Quiz");
		System.out.println("3.Veiw score");
		System.out.println("4.Logout");
		return sc.nextInt();
	}
	public static void studentMenu(Scanner sc) {
		int choice;
		while((choice=studentMenuOptions(sc))!=4) {
			switch((choice)) {
			case 1:
				System.out.println("You selected case 1");
				break;
			case 2:
				System.out.println("You selected case 2");
				break;
			case 3:
				System.out.println("You selected case 3");
				break;
			default:
					
			}
		}
	}
}
