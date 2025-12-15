package Stringexception;

import java.util.Scanner;

public class StringAccept {
	String line;
	int len=0;
	StringAccept(){
		
	}
	public void accept(Scanner sc) throws ExceptionLineTooLong {
		System.out.println("Enter your string");
		line=sc.next();
		len=line.length();
		if(len>80) {
			throw new ExceptionLineTooLong("String length is more than 80 characters!!");
		}else {
			System.out.println("String accepted successfully");
		}
	}
}
