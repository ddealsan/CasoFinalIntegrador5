package GestionDeInformacion;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class GestionDeInformacion {
    private JFrame frame;

    public GestionDeInformacion() {
        frame = new JFrame("Gestión de Información");

        JButton createTextButton = new JButton("Crear Texto".toUpperCase());
        createTextButton.setPreferredSize(new Dimension(60, 25));
        createTextButton.setForeground(Color.WHITE);
        createTextButton.setBackground(Color.BLUE);
        createTextButton.setFont(new Font("Times New Roman", Font.BOLD, 20));
        createTextButton.setBorder(new LineBorder(new Color(0, 0, 128), 3));
        createTextButton.addActionListener(e -> new TextEditor());

        JButton editTextButton = new JButton("Editar Texto".toUpperCase());
        editTextButton.setPreferredSize(new Dimension(60, 25));
        editTextButton.setForeground(Color.WHITE);
        editTextButton.setBackground(Color.BLUE);
        editTextButton.setFont(new Font("Times New Roman", Font.BOLD, 20));
        editTextButton.setBorder(new LineBorder(new Color(0, 0, 128), 3));
        editTextButton.addActionListener(e -> new TextEditor2());

        JButton viewTextsButton = new JButton("Ver Textos".toUpperCase());
        viewTextsButton.setPreferredSize(new Dimension(60, 25));
        viewTextsButton.setForeground(Color.WHITE);
        viewTextsButton.setBackground(Color.BLUE);
        viewTextsButton.setFont(new Font("Times New Roman", Font.BOLD, 20));
        viewTextsButton.setBorder(new LineBorder(new Color(0, 0, 128), 3));
        // Aquí puedes añadir un ActionListener para el botón "Ver Textos"

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(3, 1, 10, 10));
        buttonPanel.add(createTextButton);
        buttonPanel.add(editTextButton);
        buttonPanel.add(viewTextsButton);

        ImageIcon imageIcon = new ImageIcon(getClass().getResource("/FotoLogo.png"));
        JLabel imageLabel = new JLabel(imageIcon);

        JLabel welcomeLabel = new JLabel("<html><div style='text-align: center;'>Bienvenido a la Gestión de Información</div></html>");
        welcomeLabel.setForeground(Color.BLUE);
        welcomeLabel.setFont(new Font("Times New Roman", Font.BOLD, 45));
        welcomeLabel.setHorizontalAlignment(JLabel.CENTER);

        JPanel leftPanel = new JPanel();
        leftPanel.setLayout(new BorderLayout());
        leftPanel.add(imageLabel, BorderLayout.CENTER);
        leftPanel.add(welcomeLabel, BorderLayout.SOUTH);
        leftPanel.setBackground(Color.WHITE);

        JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, leftPanel, buttonPanel);
        splitPane.setDividerSize(20);
        splitPane.setDividerLocation(600);
        splitPane.setEnabled(false);
        splitPane.setForeground(new Color(0, 0, 128));

        frame.add(splitPane);
        frame.setSize(1200, 600);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setVisible(true);
    }
}