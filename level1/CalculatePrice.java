/*Write a program to input the unit price of an item and the quantity to be bought. Then, calculate the total price.
Hint => NA
I/P => unitPrice, quantity
O/P => The total purchase price is INR ___ if the quantity ___ and unit price is INR ___
*/







import java.util.*;
public class CalculatePrice{
	public static void main(String args[]){
		System.out.print("enter unit price : ");
		Scanner sc=new Scanner(System.in);
		int u= sc.nextInt();
		System.out.print("enter quantity : ");
		int q= sc.nextInt();
		int totalPurchase = u * q;
		System.out.println("the total purchase is " + totalPurchase + " if the quantity is  " + q + " and unit price is " + u  );

		
		
	
		

	}
}
