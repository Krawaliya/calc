import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Prompt user for first number
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        // Prompt user for second number
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        // Calculate the sum
        double sum = num1 + num2;

        // Display the result
        System.out.println("The sum is: " + sum);


	//cal the sub
	double sub = num1 - num2;

	//display the sub
	System.out.println("The sub is: "+sub);

        //calculate multi
        double mul= num1 * num2;

        //display the mul
        System.out.println("The mul is " +mul);


        // Close the scanner
        scanner.close();
    }
}
