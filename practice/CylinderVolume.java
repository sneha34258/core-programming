/*Volume of a Cylinder
Write a program to calculate the volume of a cylinder. Take the radius and
height as inputs and use the formula:
Volume = π * radius^2 * height.*/
import java.util.*;
public class CylinderVolume {
	public static void main(String args[]){
		System.out.print("enter radius");
		Scanner sc = new Scanner(System.in);
		double radius= sc.nextDouble();
		System.out.print("enter height");
		double height= sc.nextDouble();
		double Volume = 3.14 * Math.pow(radius,2) * height;
		System.out.println("the volume of cylinder is " + Volume);
		
	}
}
		