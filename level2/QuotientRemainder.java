/*Write a program to take 2 numbers and print their quotient and reminder
Hint => Use division operator (/) for quotient and moduli operator (%) for reminder
I/P => number1, number2
O/P => The Quotient is ___ and Reminder is ___ of two number ___ and ___
*/
import java.util.*;
public class QuotientRemainder{
	public static void main(String args[]){
		System.out.print("enter a : ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.print("enter b : ");
		int b= sc.nextInt();
		int Quotient = a / b;
		int Remainder = a % b;
		System.out.println("The Quotient is " + Quotient + " and remainder is " + Remainder + " of two number " + a + " and " + b);
	}
}