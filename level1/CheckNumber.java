/*Write a program to check whether a number is positive, negative, or zero.
Hint => 
Get integer input from the user and store it in the number variable.
If the number is positive, print positive.
If the number is negative, print negative.
If the number is zero, print zero. 
*/
import java.util.*;
public class CheckNumber{
	public static void main(String args[]){
		System.out.print("enter a : ");
		Scanner sc= new Scanner(System.in);
		int a = sc.nextInt();
		if(a>0){
			System.out.println("number is positive");
		}else if(a<0){
			System.out.println("number is negative");
		}else{
			System.out.println("number is zero");
		}
	}
}
