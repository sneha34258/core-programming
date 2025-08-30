/*2. Perimeter of a Rectangle
Write a program to calculate the perimeter of a rectangle. Take the length
and width as inputs and use the formula:
Perimeter = 2 * (length + width).*/
import java.util.*;
public class RectanglePerimeter{
	public static void main(String args[]){
		System.out.print("enter length");
		Scanner sc= new Scanner(System.in);
		int l = sc.nextInt();
		System.out.print("enter width");
		int w = sc.nextInt();
		int Perimeter = 2 * (l+w);
		System.out.println("The perimeter of rectangle is " + Perimeter );
	}
}
		
