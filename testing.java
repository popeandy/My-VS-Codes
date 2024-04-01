import java.util.Scanner;
class testing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your first number: ");
        double num1 = scanner.nextDouble();

        System.out.println("Enter your second number: ");
        double num2 = scanner.nextDouble();

        System.out.println("Which type of operation will you be using? \n1. Addition \n2. Subtraction \n3. Multiplication \n4. Division");
        int numChoice = scanner.nextInt();

        double result = 0.0;

        switch (numChoice) {
            case 1: result = num1 + num2;
            break;
            case 2: result = num1 - num2;
            break;
            case 3: result = num1 * num2;
            break;
            case 4: 
            if (num2 != 0) {
                result = num1 / num2; 
            } else {
                System.out.println("Error, cannot divide by zero.");
            }
            break;
        }
        System.out.println("Result: " + result);
        }
    }