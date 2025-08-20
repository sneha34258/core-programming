
/*
3. Create a program to convert the distance of 10.8 kilometers to miles.
Hint: 1 km = 1.6 miles
I/P => NONE
O/P => The distance  ___ km in miles is ___
*/
import java.util.*;
public class Distanceconvert{
	public static void main(String args[] ){
		double distInKM = 10.8;
		double distInMiles = distInKM * 1.6;
		System.out.println("The distance of 10.8 kilometers to miles is :" + distInMiles);
		//output= distance in miles is 17.28
	}
}