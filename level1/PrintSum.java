/*Rewrite the program 10 to find the sum until the user enters 0 or a negative number using while loop and break statement
Hint => 
Use infinite while loop as in while (true)
Take the user entry and check if the user entered 0 or a negative number to break the loop using break;


*/


import java.util.Scanner;

public class PrintSum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0.0;  
        System.out.println("Enter numbers (0 or negative number to stop):");

        while (true) {
            double number = sc.nextDouble();
            if (number <= 0) {
                break;  
            }

            total = total + number;  
        }

        System.out.println("The total sum is: " + total);
    }
}

