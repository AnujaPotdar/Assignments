package com.internship.quiz.menu;

import java.util.Scanner;

public class AdminMenu {
	private static int adminMenuOptions(Scanner sc) {
		System.out.println("--------------Admin Menu--------------");
		System.out.println("1.Create Quiz");
		System.out.println("2.List Quizes");
		System.out.println("3.Logout");

		return sc.nextInt();
	}
	public static void adminMenu(Scanner sc) {
		int choice;
		while((choice=adminMenuOptions(sc))!=3) {
			switch(choice) {
			case 1:
				System.out.println("You selected case 1");
				break;
			case 2:
				System.out.println("You selected case 2");
				break;
			}
		}
	}
}
