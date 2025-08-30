/*Calculate Average of Three Numbers
Write a program that takes three numbers as input from the user and prints
their average.*/
import java.util.*;
public class Average{
	public static void main(String args[]){
		System.out.print("enter a");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.print("enter b");
		int b= sc.nextInt();
		System.out.print("enter c");
		int c = sc.nextInt();
		int Average = (a + b+ c ) / 3;
		System.out.println("the average of three numbers is " + Average );
	}
}
