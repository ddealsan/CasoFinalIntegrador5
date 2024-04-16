package InterfazBienvenida;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InterfazBienvenida {
    public InterfazBienvenida() {
        // Crear la ventana
        JFrame frame = new JFrame("Sistema Interactivo de Análisis Genómico y Organización de Datos");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);

        // Crear el panel principal
        JPanel panel = new JPanel();
        frame.add(panel);

        // Crear la etiqueta de bienvenida
        JLabel welcomeLabel = new JLabel("Bienvenido al Sistema Interactivo de Análisis Genómico y Organización de Datos");
        panel.add(welcomeLabel);

        // Crear los botones
        JButton button1 = new JButton("Botón 1");
        panel.add(button1);

        JButton button2 = new JButton("Botón 2");
        panel.add(button2);

        JButton exitButton = new JButton("Salir");
        panel.add(exitButton);

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