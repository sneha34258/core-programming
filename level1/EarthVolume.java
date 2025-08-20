/*
7. Write a Program to compute the volume of Earth in km^3 and miles^3
Hint => Volume of a Sphere is (4/3) * pi * r^3 and radius of earth is 6378 km
O/P => The volume of earth in cubic kilometers is ____ and cubic miles is ____
*/

import java.util.*;
public class EarthVolume{
	public static void main(String args[] ){
		double r = 6378;
		double pi = 3.14;
		double v = (4*pi*r*r*r)/3;
		double m = v * 0.62;
		System.out.println("The voulme of earth in cubic Kilometers is " + v + "and cubic miles is " + m );
		
		
	}
}


