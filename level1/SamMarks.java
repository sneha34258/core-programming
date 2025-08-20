/* 
2. Sam’s mark in Maths is 94, Physics is 95 and Chemistry is 96 out of 100. Find the average percent mark in PCM
I/P => NONE
O/P => Sam’s average mark in PCM is ___ 


*/

import java.util.*;
public class SamMarks{
	public static void main(String args[] ){
		int math=94, phy=95, chem=96;
		int avg= (math+phy+chem)/3;
		System.out.println("Sam's marks in PCM is : " + avg);
		//output= Sam's marks in pcm is 95
	}
}