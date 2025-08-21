/*Write a program to find the sum of n natural numbers using while loop compare the result with the formulae n*(n+1)/2 and show the result from both computations was correct. 
Hint => 
Take the user input number and check whether it's a Natural number
If it's a natural number Compute using formulae as well as compute using while loop
Compare the two results and print the result
*/
import java.util.Scanner;

public class SumNaturalnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        if (n > 0) {
            int sum = 0, i = 1;
            while (i <= n) {
                sum = sum + i;
                i++;
            }
            int formula = n * (n + 1) / 2;
            System.out.println("Sum with while loop = " + sum);
            System.out.println("Sum with formula    = " + formula);
        } else {
            System.out.println("Not a natural number!");
    }
}
