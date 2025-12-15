package Stringexception;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		StringAccept s=new StringAccept();
		Scanner sc=new Scanner(System.in);
		try {
			s.accept(sc);
		} catch (ExceptionLineTooLong e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
