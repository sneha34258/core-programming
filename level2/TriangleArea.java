/*Write a program that takes the base and height in cm to find the area of a triangle in square inches and square centimeters 
Hint => Area of a Triangle is ½ * base * height and 1 in = 2.54 cm
I/P => base, height
O/P => The Area of the triangle in sq in is ___ and sq cm is ___
*/

import java.util.*;
public class TriangleArea{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		double b=sc.nextFloat();
		double h=sc.nextFloat();
		double area=0.5*b*h;
		double areaInches=area/(2.54*2.54);
		System.out.println("Area of triangle in square inches is "+areaInches+" and in square centimeters is "+area);
	}
}

		
