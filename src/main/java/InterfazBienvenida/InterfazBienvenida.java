package InterfazBienvenida;



import javax.swing.*;
import java.awt.*;
import javax.swing.border.LineBorder;

public class InterfazBienvenida {
    public InterfazBienvenida() {
        JFrame frame = new JFrame("Gestión de Publicaciones - Alfonso X El Sabio");

        JButton newButton = new JButton("Crear nuevo texto".toUpperCase());
        newButton.setFont(new Font("Arial", Font.BOLD, 20));
        newButton.setPreferredSize(new Dimension(200, 75));
        newButton.setBackground(new Color(0, 0, 139));
        newButton.setForeground(Color.WHITE);
        newButton.addActionListener(e -> new TextEditor());

        JButton editButton = new JButton("Editar texto existente".toUpperCase());
        editButton.setFont(new Font("Arial", Font.BOLD, 20));
        editButton.setPreferredSize(new Dimension(200, 75));
        editButton.setBackground(new Color(0, 0, 139));
        editButton.setForeground(Color.WHITE);
        editButton.addActionListener(e -> new TextEditor2());

        JButton compareButton = new JButton("Comparador de textos".toUpperCase());
        compareButton.setFont(new Font("Arial", Font.BOLD, 20));
        compareButton.setPreferredSize(new Dimension(200, 75));
        compareButton.setBackground(new Color(0, 0, 139));
        compareButton.setForeground(Color.WHITE);
        compareButton.addActionListener(e -> new TextComparator());

        JButton emailValidatorButton = new JButton("Validador de Email".toUpperCase());
        emailValidatorButton.setFont(new Font("Arial", Font.BOLD, 20));
        emailValidatorButton.setPreferredSize(new Dimension(200, 75));
        emailValidatorButton.setBackground(new Color(0, 0, 139));
        emailValidatorButton.setForeground(Color.WHITE);
        emailValidatorButton.addActionListener(e -> new EmailValidator());

        JButton exitButton = new JButton("Salir".toUpperCase());
        exitButton.setFont(new Font("Arial", Font.BOLD, 20));
        exitButton.setPreferredSize(new Dimension(200, 75));
        exitButton.setBackground(new Color(0, 0, 139));
        exitButton.setForeground(Color.WHITE);
        exitButton.addActionListener(e -> System.exit(0));

        JPanel rightPanel = new JPanel(new GridLayout(6, 1));
        rightPanel.add(newButton);
        rightPanel.add(editButton);
        rightPanel.add(compareButton);
        rightPanel.add(emailValidatorButton);
        rightPanel.add(exitButton);

        ImageIcon imageIcon = new ImageIcon("C:\\Users\\dalfo\\IdeaProjects\\CasoFinalIntegrador5\\src\\main\\resources\\Captura de pantalla 2024-04-09 184435.png");
        JLabel imageLabel = new JLabel(imageIcon);

        JLabel welcomeLabel = new JLabel("Bienvenido al sistema de publicaciones de texto de la Universidad Alfonso X El Sabio", SwingConstants.CENTER);
        welcomeLabel.setFont(new Font("Arial", Font.BOLD, 20));
        welcomeLabel.setForeground(new Color(0, 0, 128));

        JPanel leftPanel = new JPanel(new BorderLayout());
        leftPanel.setBackground(Color.WHITE);
        leftPanel.add(imageLabel, BorderLayout.NORTH);
        leftPanel.add(welcomeLabel, BorderLayout.SOUTH);

        JPanel panel = new JPanel(new BorderLayout());
        panel.setBackground(Color.WHITE);
        panel.add(leftPanel, BorderLayout.CENTER);
        panel.add(rightPanel, BorderLayout.EAST);

        JSeparator separator = new JSeparator(JSeparator.VERTICAL);
        separator.setBackground(new Color(173, 216, 230));
        panel.add(separator, BorderLayout.CENTER);

        frame.add(panel);
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}