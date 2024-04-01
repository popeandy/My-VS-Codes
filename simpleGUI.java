
import javax.swing.JOptionPane;

public class simpleGUI {
    public static void main(String[] args) {
        String op = JOptionPane.showInputDialog("choose an operation: 1. Addition    2. Subtraction    3. Mulitplication    4. Division");
        if (op.equals("1")) {
            JOptionPane.showMessageDialog(null, "This will be done in addition");
        } else if (op.equals("2")) {
            JOptionPane.showMessageDialog(null, "This will be done in subtraction");
        } else if (op.equals("3")) {
            JOptionPane.showMessageDialog(null, "This will be done in multiplication");
        } else if (op.equals("2")) {
            JOptionPane.showMessageDialog(null, "This will be done in division");
        } else {
            JOptionPane.showMessageDialog(null, "Error, please enter a valid number");
            return;
        }

        String num1Str = JOptionPane.showInputDialog("Enter the first number");
        String num2Str = JOptionPane.showInputDialog("Enter the second number");

        int num1, num2;
        try {
            num1 = Integer.parseInt(num1Str);
            num2 = Integer.parseInt(num2Str);
        } catch (NumberFormatException e) {
            System.out.println("Error, please enter a valid number");
            return;
        }

        int result = 0;
        switch (op) {
            case "1": result = num1 + num2; 
            break;
            case "2": result = num1 - num2;
            break;
            case "3": result = num1 * num2;
            break;
            case "4": 
            if (num2 != 0) {
                result = num1 / num2; 
            } else {
                System.out.println("Error, cannot divide by zero.");
                return;
            }
            break;
        }
        JOptionPane.showMessageDialog(null, "Result: "+result);
        }
    }
