package InterfazBienvenida;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InterfazBienvenida {
    public InterfazBienvenida() {
        // Crear la ventana
        JFrame frame = new JFrame("Sistema Interactivo de Análisis Genómico y Organización de Datos");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);

        // Crear el panel principal con un GridLayout
        JPanel panel = new JPanel(new GridLayout(1, 2));
        frame.add(panel);

        // Crear el panel para el mensaje de bienvenida y la imagen
        JPanel leftPanel = new JPanel(new BorderLayout());
        panel.add(leftPanel);

        // Crear la etiqueta de bienvenida
        JLabel welcomeLabel = new JLabel("Bienvenido al Sistema Interactivo de Análisis Genómico y Organización de Datos", SwingConstants.CENTER);
        welcomeLabel.setFont(new Font("Arial", Font.BOLD, 20)); // Cambiar el tamaño y el tipo de letra
        leftPanel.add(welcomeLabel, BorderLayout.NORTH);

        // Crear la etiqueta para la imagen
        ImageIcon imageIcon = new ImageIcon("C:\\Users\\dalfo\\IdeaProjects\\CasoFinalIntegrador5\\src\\main\\resources\\Captura de pantalla 2024-04-09 184435.png"); // Reemplaza "nombreDeLaImagen.jpg" con el nombre de tu imagen
        JLabel imageLabel = new JLabel(imageIcon);
        leftPanel.add(imageLabel, BorderLayout.CENTER);

        // Crear el panel para los botones
        JPanel rightPanel = new JPanel(new GridLayout(5, 1));
        panel.add(rightPanel);

        // Crear los botones
        for (int i = 0; i < 4; i++) {
            JButton button = new JButton("Botón " + (i + 1));
            button.setFont(new Font("Arial", Font.BOLD, 15)); // Cambiar el tamaño y el tipo de letra
            button.setPreferredSize(new Dimension(150, 50)); // Cambiar el tamaño del botón
            rightPanel.add(button);
        }

        JButton exitButton = new JButton("Salir");
        exitButton.setFont(new Font("Arial", Font.BOLD, 15)); // Cambiar el tamaño y el tipo de letra
        exitButton.setPreferredSize(new Dimension(150, 50)); // Cambiar el tamaño del botón
        rightPanel.add(exitButton);

        // Agregar un oyente de acción al botón de salida
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        // Hacer visible la ventana
        frame.setVisible(true);
    }
}