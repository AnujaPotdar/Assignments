package com.internship.quiz.main;

import java.util.Scanner;

import com.internship.quiz.menu.MainMenu;

public class Main {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		MainMenu.mainMenu(sc);
	}
}
