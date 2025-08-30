/*Convert Kilometers to Miles
Write a program that takes the distance in kilometers as input from the user
and converts it into miles using the formula:
Miles = Kilometers * 0.621371.*/
import java.util.*;
public class DistanceConvert {
	public static void main(String args[]){
		System.out.print("enter distance");
		Scanner sc = new Scanner(System.in);
		double DistKm = sc.nextDouble();
        double DistMiles = DistKm * 0.621371;
        System.out.println("the distance in miles is " + DistMiles);
	}
}	
