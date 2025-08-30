/*1. Calculate Simple Interest
Write a program to calculate simple interest using the formula:
Simple Interest = (Principal * Rate * Time) / 100.
Take Principal, Rate, and Time as inputs from the user.*/
import java.util.*;
 public class SimpleInterest {
    public static void main(String args[]){
		System.out.print("enter principal");
		Scanner sc = new Scanner(System.in);
		int p = sc.nextInt();
		System.out.print("enter Rate");
		int r = sc.nextInt();
		System.out.print("enter time");
		int t = sc.nextInt();
		int SimpleInterest = (p * r * t) / 100 ;
		System.out.println("The simple interest is " + SimpleInterest );
	} 
 }
	
