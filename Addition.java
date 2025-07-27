import javax.swing.JOptionPane;

public class Addition {
    public static void main(String[] args) {
        // Step 1: Get first number as a String
        String firstNumber = JOptionPane.showInputDialog("Enter first integer");

        // Step 2: Get second number as a String
        String secondNumber = JOptionPane.showInputDialog("Enter second integer");

        // Step 3: Convert Strings to integers
        int number1 = Integer.parseInt(firstNumber);
        int number2 = Integer.parseInt(secondNumber);

        // Step 4: Compute the sum
        int sum = number1 + number2;

        // Step 5: Display the result
        JOptionPane.showMessageDialog(null, "The sum is " + sum,
            "Sum of Two Integers", JOptionPane.PLAIN_MESSAGE);
    }
}
