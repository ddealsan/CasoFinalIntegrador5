package GestionDeInformacion;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class VerArchivos extends JFrame {
    private JTextArea textArea;

    public VerArchivos() {
        textArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(textArea);
        add(scrollPane, BorderLayout.CENTER);

        JButton openButton = new JButton("Ver archivos");
        openButton.addActionListener(e -> openFile());
        add(openButton, BorderLayout.SOUTH);

        setSize(600, 600);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    private void openFile() {
        JFileChooser fileChooser = new JFileChooser("./src/main/resources/txts");
        int result = fileChooser.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            try {
                String content = new String(Files.readAllBytes(selectedFile.toPath()));
                textArea.setText(content);
            } catch (IOException e) {
                JOptionPane.showMessageDialog(this, "Error al abrir el archivo.");
                e.printStackTrace();
            }
        }
    }
}