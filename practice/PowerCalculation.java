/*3. Power Calculation
Write a program that takes two numbers as input: a base and an exponent,
and prints the result of base raised to the exponent (without using loops or
conditionals).*/
import java.util.*;
public class PowerCalculation {
	public static void main(String args[]){
		System.out.print("enter base");
		Scanner sc = new Scanner(System.in);
		double b = sc.nextDouble();
		System.out.print("enter exponent");
		double e = sc.nextDouble();
		double result = Math.pow(b,e);
		System.out.println("the result is " + result);
	}
}
