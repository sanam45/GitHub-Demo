import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginFrame extends JFrame {
    private JTextField emailField;5
    private JPasswordField passwordField;

    public LoginFrame() {
        setTitle("Login Page");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2));

        JLabel emailLabel = new JLabel("Email:");
        panel.add(emailLabel);

        emailField = new JTextField();
        panel.add(emailField);

        JLabel passwordLabel = new JLabel("Password:");
        panel.add(passwordLabel);

        passwordField = new JPasswordField();
        panel.add(passwordField);

        JButton loginButton = new JButton("Login");
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String email = emailField.getText();
                String password = new String(passwordField.getPassword());
                if (isValidCredentials(email, password)) {
                    JOptionPane.showMessageDialog(LoginFrame.this, "Login successful!");
                } else {
                    JOptionPane.showMessageDialog(LoginFrame.this, "Incorrect email or password. Please try again.");
                }
            }
        });
        panel.add(loginButton);

        add(panel);
        setVisible(true);
    }

    private boolean isValidCredentials(String email, String password) {
        // Here, you can implement your own validation logic
        // For simplicity, let's assume valid credentials are:
        // email: "user@example.com"
        // password: "password123"
        return email.equals("user@example.com") && password.equals("password123");
    }

    public static void main(String[] args) {
        new LoginFrame();
    }
}
