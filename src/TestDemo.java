//Write a program TestDemo.java, which accepts the number as argument
import java.util.Scanner;
public class TestDemo { //class name

	public static void main(String[] args) {  // main method
		
		System.out.println("enter the no");  // output
		Scanner scan=new Scanner (System.in); //Scanner for input
		 double a=scan.nextInt();
		 if(a<0)           // if condition
		 
		 System.out.println("you have enter negative no"); // output
		 else if (a==0)     //  else if condition
		 System.out.println("you have enter zero"); // output
		 else if (a>0)     //  else if condition
		 System.out.println("you have enter  positive no"); // output
		 scan.close(); // scanner close
	}
}
	
		 
		 

	



