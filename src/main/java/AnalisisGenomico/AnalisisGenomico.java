package AnalisisGenomico;

import javax.swing.*;
import java.awt.*;

public class AnalisisGenomico {
    private JFrame frame;

    public AnalisisGenomico() {
        frame = new JFrame("Análisis Genómico");
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        // Lado izquierdo: imagen y texto
        ImageIcon imageIcon = new ImageIcon(getClass().getResource("/FotoLogo.png")); // Reemplaza con la ruta a tu imagen
        JLabel imageLabel = new JLabel(imageIcon);
        JLabel textLabel = new JLabel("<html><div style='text-align: center;'>Bienvenido al Análisis Genómico</div></html>");
        textLabel.setForeground(Color.BLUE);
        textLabel.setFont(new Font("Times New Roman", Font.BOLD, 45));
        textLabel.setHorizontalAlignment(JLabel.CENTER);

        JPanel leftPanel = new JPanel();
        leftPanel.setLayout(new BorderLayout());
        leftPanel.add(imageLabel, BorderLayout.CENTER);
        leftPanel.add(textLabel, BorderLayout.SOUTH);
        leftPanel.setBackground(Color.WHITE);

        // Lado derecho: botones
        JButton geneCountButton = new JButton("Conteo de genes");
        geneCountButton.addActionListener(e -> {
            // Instancia la clase conteoGenes y llama a su método run
            new conteoGenes().run();
        });

        JButton geneticCombinationsButton = new JButton("Cálculo combinaciones genéticas");
        geneticCombinationsButton.addActionListener(e -> {
            // Instancia la clase combinacionesGeneticas y llama a su método run
            new combinacionesGeneticas().run();
        });

        JPanel rightPanel = new JPanel();
        rightPanel.setLayout(new GridLayout(2, 1, 10, 10));
        rightPanel.add(geneCountButton);
        rightPanel.add(geneticCombinationsButton);

        // Agregar los paneles al frame
        JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, leftPanel, rightPanel);
        splitPane.setDividerSize(20);
        splitPane.setDividerLocation(300);
        splitPane.setEnabled(false);
        splitPane.setForeground(new Color(0, 0, 128));

        frame.add(splitPane);
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}