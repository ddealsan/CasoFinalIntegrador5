package AnalisisGenomico;

import javax.swing.*;
import java.awt.*;

public class combinacionesGeneticas {
    private JFrame frame;
    private JTextField numberInputField;
    private JLabel resultLabel;

    public combinacionesGeneticas() {
        run();
    }

    public void run() {
        frame = new JFrame("Cálculo de combinaciones genéticas");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        numberInputField = new JTextField();
        JButton calculateButton = new JButton("Calcular");
        calculateButton.addActionListener(e -> {
            int number = Integer.parseInt(numberInputField.getText());
            int combinations = calculateCombinations(number);
            resultLabel.setText("Número de combinaciones genéticas: " + combinations);
        });

        resultLabel = new JLabel("Número de combinaciones genéticas: ");

        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new BorderLayout());
        inputPanel.add(numberInputField, BorderLayout.CENTER);
        inputPanel.add(calculateButton, BorderLayout.EAST);

        frame.add(inputPanel, BorderLayout.NORTH);
        frame.add(resultLabel, BorderLayout.CENTER);

        frame.setVisible(true);
    }

    private int calculateCombinations(int number) {
        if (number <= 1) {
            return 1;
        } else {
            return number * calculateCombinations(number - 1);
        }
    }
}