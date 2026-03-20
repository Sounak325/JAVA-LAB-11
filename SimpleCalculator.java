import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleCalculator {
    public static void main(String[] args) {
        // Create the main frame
        JFrame frame = new JFrame("Simple Calculator");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(4, 2, 10, 10));

        // Labels and text fields
        JLabel label1 = new JLabel("Enter first number:");
        JTextField tf1 = new JTextField();

        JLabel label2 = new JLabel("Enter second number:");
        JTextField tf2 = new JTextField();

        JLabel label3 = new JLabel("Select operator (+, -, *, /):");
        JTextField opField = new JTextField();

        JButton calcButton = new JButton("Calculate");
        JLabel resultLabel = new JLabel("Result will appear here");

        // Action listener for button
        calcButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Parse inputs directly (assuming valid numbers)
                double num1 = Double.parseDouble(tf1.getText());
                double num2 = Double.parseDouble(tf2.getText());
                String op = opField.getText().trim();

                double result = 0;
                if (op.equals("+")) {
                    result = num1 + num2;
                } else if (op.equals("-")) {
                    result = num1 - num2;
                } else if (op.equals("*")) {
                    result = num1 * num2;
                } else if (op.equals("/")) {
                    result = num1 / num2; // assumes num2 != 0
                } else {
                    resultLabel.setText("Invalid operator!");
                    return;
                }

                resultLabel.setText("Result = " + result);
            }
        });
        frame.add(label1); frame.add(tf1);
        frame.add(label2); frame.add(tf2);
        frame.add(label3); frame.add(opField);
        frame.add(calcButton); frame.add(resultLabel);

        frame.setVisible(true);
    }
}
