package com.internship.quiz.menu;

import java.util.Scanner;

public class MainMenu {
	private static int mainMenuOptions(Scanner sc) {
		
		System.out.println("-----------MainMenu-----------");
		System.out.println("1.Admin Login");
		System.out.println("2.Student Register");
		System.out.println("3.Student Login");
		System.out.println("4.Exit");
		
		return sc.nextInt();
	}
	public static void mainMenu(Scanner sc) {
		int choice;
		while((choice=mainMenuOptions(sc))!=4) {
			switch(choice) {
			case 1:
				System.out.println("You selected case 1");
				AdminMenu.adminMenu(sc);
				break;
			case 2:
				System.out.println("You selected case 2");
				break;
			case 3:
				System.out.println("You selected case 3");
				StudentMenu.studentMenu(sc);
				break;
			}
		}
	}
}
