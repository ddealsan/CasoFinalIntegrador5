package AnalisisGenomico;

import javax.swing.*;
import java.awt.*;

public class conteoGenes {
    private JFrame frame;
    private JTextField dnaInputField;
    private JLabel resultLabel;

    public conteoGenes() {
        run();
    }

    public void run() {
        frame = new JFrame("Conteo de genes");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        dnaInputField = new JTextField();
        JButton calculateButton = new JButton("Calcular");
        calculateButton.addActionListener(e -> {
            String dna = dnaInputField.getText();
            int geneCount = countGenes(dna);
            resultLabel.setText("Número de genes: " + geneCount);
        });

        resultLabel = new JLabel("Número de genes: ");

        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new BorderLayout());
        inputPanel.add(dnaInputField, BorderLayout.CENTER);
        inputPanel.add(calculateButton, BorderLayout.EAST);

        frame.add(inputPanel, BorderLayout.NORTH);
        frame.add(resultLabel, BorderLayout.CENTER);

        frame.setVisible(true);
    }

    private int countGenes(String dna) {
        if (dna.length() < 3) {
            return 0;
        } else if (dna.substring(0, 3).equals("ATG")) {
            return 1 + countGenes(dna.substring(3));
        } else {
            return countGenes(dna.substring(1));
        }
    }
}