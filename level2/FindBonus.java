/*Create a program to find the bonuses of employees based on their years of service.
Hint => 
Zara decided to give a bonus of 5% to employees whose year of service is more than 5 years.
Take salary and year of service in the year as input.
Print the bonus amount.
*/

import java.util.*;
public class FindBonus{
	public static void main(String args[]){
			System.out.print("enter salary : ");
			Scanner sc= new Scanner(System.in);
			int salary=sc.nextInt();
			System.out.print("enter years or service : ");
			int year= sc.nextInt();
			int bonus=0;
			if(year>5){
				bonus= (salary * 5 ) / 100;
				System.out.println(" bonus is" + bonus);
				System.out.println("total salary after bonus is " + (salary+bonus));
			}else{
				System.out.println("no bonus");
			}
	}
}