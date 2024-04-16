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

        // Crear el panel principal con un BorderLayout
        JPanel panel = new JPanel(new BorderLayout());
        panel.setBackground(Color.WHITE); // Cambiar el color de fondo del panel
        frame.add(panel);

        // Crear el panel para el mensaje de bienvenida y la imagen
        JPanel leftPanel = new JPanel(new BorderLayout());
        panel.add(leftPanel, BorderLayout.WEST);

        // Crear la etiqueta para la imagen
        ImageIcon imageIcon = new ImageIcon("C:\\Users\\dalfo\\IdeaProjects\\CasoFinalIntegrador5\\src\\main\\resources\\Captura de pantalla 2024-04-09 184435.png"); // Reemplaza "nombreDeLaImagen.jpg" con el nombre de tu imagen
        JLabel imageLabel = new JLabel(imageIcon);
        leftPanel.add(imageLabel, BorderLayout.CENTER);

        // Crear el panel para la etiqueta de bienvenida
        JPanel welcomePanel = new JPanel(new BorderLayout());
        leftPanel.add(welcomePanel, BorderLayout.SOUTH);

        // Crear la etiqueta de bienvenida
        JLabel welcomeLabel = new JLabel("Bienvenido al Sistema Interactivo de Análisis Genómico y Organización de Datos", SwingConstants.CENTER);
        welcomeLabel.setFont(new Font("Arial", Font.BOLD, 20)); // Cambiar el tamaño y el tipo de letra
        welcomeLabel.setForeground(new Color(0, 0, 128)); // Cambiar el color de las letras
        welcomePanel.add(welcomeLabel, BorderLayout.CENTER);

        // Crear el panel para los botones
        JPanel rightPanel = new JPanel(new GridLayout(6, 1));
        panel.add(rightPanel, BorderLayout.EAST);

        // Crear los botones
        for (int i = 0; i < 4; i++) {
            JButton button = new JButton("Botón " + (i + 1));
            button.setFont(new Font("Arial", Font.BOLD, 15)); // Cambiar el tamaño y el tipo de letra
            button.setPreferredSize(new Dimension(150, 50)); // Cambiar el tamaño del botón
            button.setBackground(new Color(0, 0, 139)); // Cambiar el color de fondo del botón
            button.setForeground(Color.WHITE); // Cambiar el color de las letras del botón
            rightPanel.add(button);
        }

        JButton exitButton = new JButton("Salir");
        exitButton.setFont(new Font("Arial", Font.BOLD, 15)); // Cambiar el tamaño y el tipo de letra
        exitButton.setPreferredSize(new Dimension(150, 50)); // Cambiar el tamaño del botón
        exitButton.setBackground(new Color(0, 0, 139)); // Cambiar el color de fondo del botón
        exitButton.setForeground(Color.WHITE); // Cambiar el color de las letras del botón
        rightPanel.add(exitButton);

        // Agregar un oyente de acción al botón de salida
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        // Crear una línea divisoria
        JSeparator separator = new JSeparator(JSeparator.VERTICAL);
        separator.setBackground(new Color(173, 216, 230)); // Cambiar el color de la línea divisoria
        panel.add(separator, BorderLayout.CENTER);

        // Hacer visible la ventana
        frame.setVisible(true);
    }
}