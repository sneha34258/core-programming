/*Write a program to check if the first is the smallest of the 3 numbers.
I/P => number1, number2, number3
O/P => Is the first number the smallest? ____
*/
import java.util.*;
public class SmallestOfThree{
	public static void main(String args[]){
		System.out.print("enter number1 : ");
		Scanner sc= new Scanner(System.in);
		int number1 = sc.nextInt();
		System.out.print("enter number2 : ");
		int number2 = sc.nextInt();
		System.out.print("enter number3 : ");
		int number3 = sc.nextInt();
		 boolean isSmallest = (number1 < number2 && number1 < number3);

        
        System.out.println("Is the first number the smallest? " + isSmallest);
	}
}
