//   Students grade 
import java.util.Scanner;

public class Grade { // class  name

	public static void main(String[] args) {  // main method
		Scanner s = new Scanner(System.in);  // Scanner for input
		System.out.println("enter your mark");  // output
		double mark = s.nextDouble();
		System.out.println("enter your age");  // output
		double age = s.nextDouble();		
		
		if (mark > 70 || (mark > 60 && age < 15)) {  // logic if condition
			System.out.println("A grade");  // output
		} else if ((mark > 60 && mark < 70) || (mark > 45 && mark < 60) && age < 15) {  // else if condition
			System.out.println("B grade");  // output
		} else if (mark < 60 ||( mark > 45 && age < 15)) {   // else if condition
			System.out.println("C grade");   // output
		}
		
		s.close(); // Scanner close
	}
}
