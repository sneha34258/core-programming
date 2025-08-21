/*Write a program to find the distance in yards and miles for the distance provided by the user in feet
Hint => 1 mile = 1760 yards and 1 yard is 3 feet
I/P => distanceInFeet
O/P => The distance in yards is ___ while the distance in miles is ___
*/

import java.util.*;
public class MilesYards{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
        System.out.print("Enter distance in feet: ");
        double feet = sc.nextDouble();

        double yards = feet / 3.0;         // 1 yard = 3 feet
        double miles = yards / 1760.0;     // 1 mile = 1760 yards

        System.out.println("Distance in Yards: " + yards);
        System.out.println("Distance in Miles: " + miles);
		
		//output:Enter distance in feet: 5280
	   //        Distance in Yards: 1760.0
	     //      Distance in Miles: 1.0


	}
}