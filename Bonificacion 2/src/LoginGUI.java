import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class LoginGUI extends JFrame {
    private JLabel userLabel;
    private JLabel passLabel;
    private JTextField userText;
    private JPasswordField passText;
    private JButton loginButton;

    public LoginGUI() {
        super("Login");
        setLayout(new GridBagLayout());

        GridBagConstraints constraints = new GridBagConstraints();
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.gridwidth = 2;
        constraints.insets = new Insets(10, 10, 10, 10);

        userLabel = new JLabel("User:");
        userLabel.setFont(new Font("Serif", Font.BOLD, 14));
        add(userLabel, constraints);

        constraints.gridx = 0;
        constraints.gridy = 1;

        userText = new JTextField();
        userText.setColumns(20);
        add(userText, constraints);

        passLabel = new JLabel("Password:");
        passLabel.setFont(new Font("Serif", Font.BOLD, 14));
        constraints.gridx = 0;
        constraints.gridy = 2;
        add(passLabel, constraints);

        constraints.gridx = 0;
        constraints.gridy = 3;

        passText = new JPasswordField();
        passText.setColumns(20);
        add(passText, constraints);

        constraints.gridx = 0;
        constraints.gridy = 4;
        constraints.gridwidth = 2;

        loginButton = new JButton("Login");
        loginButton.setFont(new Font("Serif", Font.BOLD, 14));
        loginButton.setBackground(Color.decode("#007BFF"));
        loginButton.setForeground(Color.white);
        add(loginButton, constraints);

        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String user = userText.getText();
                String pass = new String(passText.getPassword());
                leertxt.leer("usuarios.txt");
                escribirtxt.escribir("ingresos.long");

            }

        });

        setSize(350, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }


    public static void main(String[] args) {
        new LoginGUI();

    }
}