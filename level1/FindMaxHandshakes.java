/* Create a program to find the maximum number of handshakes among N number of students.
Hint => 
Get integer input for numberOfStudents variable.
Use the combination = (n * (n - 1)) / 2 formula to calculate the maximum number of possible handshakes.
Display the number of possible handshakes.
*/
import java.util.*;
public class FindMaxHandshakes{
	public static void main(String args[]){
		System.out.print("enter n : ");
		Scanner sc=new Scanner(System.in);
		int n= sc.nextInt();
		int handshake = (n * (n - 1)) / 2;
		System.out.println("No. of maximum handshakes is " + handshake);
		
		
	
		

	}
}

