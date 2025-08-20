/*
4. Create a program to calculate the profit and loss in number and percentage based on the cost price of INR 129 and the selling price of INR 191. 
Hint => 
Use a single print statement to display multiline text and variables.
Profit = selling price - cost price
Profit Percentage = profit / cost price * 100
I/P => NONE
O/P => 
The Cost Price is INR ___ and Selling Price is INR ___
The Profit is INR ___ and the Profit Percentage is ___
*/
import java.util.*;
public class ProfitNdLoss{
	public static void main(String args[] ){
		int CP = 129;
		int SP = 191;
		int Profit = SP - CP;
		int pPercentage = (Profit*100) / CP;
		System.out.println("The Cost Price is INR " + CP + " and selling Price is INR " + SP);
		System.out.println("The Profit is INR " + Profit + " and the Profit Percentage is "+  pPercentage +"%");
		
		//output= profit is 62 and profit percentage is 48%
	}
}
