/*Write a program SpringSeason that takes two int values month and day from the command line and prints “Its a Spring Season” otherwise prints “Not a Spring Season”. 
Hint => 
*/

import java.util.*;
public class SpringSeason{
    public static void main(String args[] ){   
	System.out.print("enter month : ");
	Scanner sc = new Scanner(System.in);
	int month= sc.nextInt();
	System.out.print("enter day : ");
	int day=sc.nextInt();
	 if ((month == 3 && day >= 20 && day <= 31) ||
            (month == 4 && day >= 1 && day <= 30) ||
            (month == 5 && day >= 1 && day <= 31) ||
            (month == 6 && day >= 1 && day <= 20)) {
            
            System.out.println("Its a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
	}
}
	
