package AnalisisGenomico;

import javax.swing.*;
import java.awt.*;

public class AnalisisGenomico {
    public AnalisisGenomico() {
        JFrame frame = new JFrame("Análisis Genómico");
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton geneCountButton = new JButton("Conteo de genes");
        geneCountButton.addActionListener(e -> {
            // Aquí puedes llamar a la función conteoGenes y mostrar el resultado
            System.out.println("Conteo de genes: " + conteoGenes("ATGATGATG"));
        });

        JButton geneticCombinationsButton = new JButton("Cálculo combinaciones genéticas");
        geneticCombinationsButton.addActionListener(e -> {
            // Aquí puedes llamar a la función combinacionesGeneticas y mostrar el resultado
            System.out.println("Combinaciones genéticas: " + combinacionesGeneticas(3));
        });

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(2, 1, 10, 10));
        buttonPanel.add(geneCountButton);
        buttonPanel.add(geneticCombinationsButton);

        frame.add(buttonPanel);
        frame.setVisible(true);
    }

    // Resto del código...
}