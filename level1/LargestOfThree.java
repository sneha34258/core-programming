/*Write a program to check if the first, second, or third number is the largest of the three.
I/P => number1, number2, number3
O/P => 
Is the first number the largest? ____
Is the second number the largest? ___
Is the third number the largest? ___

*/

import java.util.*;
public class LargestOfThree{
	public static void main(String args[]){
		System.out.print("enter number1 : ");
		Scanner sc= new Scanner(System.in);
		int number1 = sc.nextInt();
		System.out.print("enter number2 : ");
		int number2 = sc.nextInt();
		System.out.print("enter number3 : ");
		int number3 = sc.nextInt();
		if(number1>=number2 && number1>=number3){
			System.out.println("number1 is the largest of 3");
		}else if(number2>=number1 && number2>=number3){
			System.out.println("number2 is largest of 3");
		}else{
			System.out.println("number3 is the largest of 3");
		}
	}
}
