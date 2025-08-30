/*4. Area of a Circle
Write a program to calculate the area of a circle. Take the radius as input
and use the formula:
Area = π * radius^2.*/
import java.util.*;
public class CircleArea {
	public static void main(String args[]){
		System.out.print("Enter radius");
		Scanner sc= new Scanner(System.in);
		Double Radius = sc.nextDouble();
		Double Area = 3.14 * Math.pow(Radius,2);
		System.out.println("The area of circle is " + Area);
	}
}
