/*Create a program to print odd and even numbers between 1 to the number entered by the user.
Hint => 
Get an integer input from the user, assign to a variable number and check for Natural Number
Using a for loop, iterate from 1 to the number
In each iteration of the loop, print the number is odd or even number
*/

import java.util.*;
public class EvenOdd{
	public static void main(String args[]){
		System.out.print("enter n : ");
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		for(int i=1; i<=n;i++){
			if(i%2==0){
				System.out.println(i+"even number");
			}else{
				System.out.println(i+"odd number");
			}
		}
    }
}