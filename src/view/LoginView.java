package view;

import javax.swing.*;
import java.awt.event.ActionListener;

public class LoginView extends JFrame {
    private JTextField usernameTextField;
    private JPasswordField passwordTextField;
    private JButton loginButton;
    private JButton registerButton;

    public LoginView() {
        setSize(300, 300);
        setLocationRelativeTo(null);
        initializeFields();
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        add(usernameTextField);
        add(passwordTextField);
        add(loginButton);
        add(registerButton);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void initializeFields() {
        usernameTextField = new JTextField();
        passwordTextField = new JPasswordField();
        loginButton = new JButton("Login");
        registerButton = new JButton("Register");
    }

    public String getUsername() {
        return usernameTextField.getText();
    }

    public String getPassword() {
        String pass= new String(passwordTextField.getPassword());
        System.out.println(pass);
        return pass;
    }

    public void setLoginButtonListener(ActionListener loginButtonListener) {
        loginButton.addActionListener(loginButtonListener);
    }

    public void setRegisterButtonListener(ActionListener registerButtonListener) {
        registerButton.addActionListener(registerButtonListener);
    }

}
