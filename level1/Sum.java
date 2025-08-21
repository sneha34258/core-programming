/*Write a program to check for the natural number and write the sum of n natural numbers 
Hint => 
A Natural Number is a positive integer (1,2,3, etc) sometimes with the inclusion of 0
A sum of n natural numbers is n * (n+1) / 2 
I/P => number
O/P => If the number is a positive integer then the output is
The sum of ___ natural numbers is ___
Otherwise 
The number ___ is not a natural number
*/
import java.util.*;
public class Sum{
	public static void main(String args[] ){
		System.out.print("enter n : ");
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		int sum = n * (n+1) / 2;
		if(n>=0){
			System.out.println("If the number is a positive integer then the sum of natural numbers is " + sum );
		}else{
			System.out.println("number is not a natural number");
		}
	}
}
		
	
