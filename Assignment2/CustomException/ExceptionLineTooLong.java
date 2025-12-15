package Stringexception;

public class ExceptionLineTooLong  extends Exception{
	public ExceptionLineTooLong() {
	}
	ExceptionLineTooLong(String msg){
		super(msg);
	}
}
