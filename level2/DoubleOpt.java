/*Similarly, write the DoubleOpt program by taking double values and doing the same operations.

*/

import java.util.*;
public class DoubleOpt{
	public static void main(String args[]){
		System.out.print("enter a : ");
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		System.out.print("enter b : ");
		double b= sc.nextDouble();
		System.out.print("enter c : ");
		double c= sc.nextDouble();
		double op1 = a + b * c;
		double op2 = a * b + c;
		double op3= c + a / b;
		double op4 = a % b + c;
		System.out.println("The results of double operations are " + op1 + "," + op2 +  ","  + op3 +  " and " + op4 );
	}
}
