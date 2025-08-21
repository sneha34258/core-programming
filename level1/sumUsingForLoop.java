/*Rewrite the program number 12 with the for loop instead of a while loop to find the sum of n Natural Numbers. 
Hint => 
Take the user input number and check whether it's a Natural number
If it's a natural number Compute using formulae as well as compute using for loop
Compare the two results and print the result


*/
import java.util.*;

public class sumUsingForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        if (n > 0) {
            int sum = 0;
            for (int i = 1; i <= n; i++) {
                sum = sum + i;
            }
            int formula = n * (n + 1) / 2;

            System.out.println("Sum with for loop = " + sum);
            System.out.println("Sum with formula  = " + formula);
            System.out.println(sum == formula ? "Both results are correct ✅" : "Results do not match ❌");
        } else {
            System.out.println("Not a natural number!");
        }
	}
}

