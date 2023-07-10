package Forms;

import Entities.Libro;
import Entities.User;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class InicioSesion extends JFrame{

    private JTextField emailField;
    private JButton sesionButton;
    private JPanel loginForm;
    private JTextField passwordField;
    private List<Libro> menu;

    public InicioSesion(){
        menu = new ArrayList<>();
        setContentPane(loginForm);
        setTitle("Formulario inicio de sesión");
        setSize(500,500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        sesionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mensajeDeError();
            }
        });
    }

    private void mensajeDeError(){
        try{
            String email = emailField.getText();
            String contraseña = passwordField.getText();

            if (!email.isEmpty() && !contraseña.isEmpty()){

                Menu pp = new Menu(menu);
                clear();

            }else{
                JOptionPane.showMessageDialog(loginForm, "Por favor, complete todos los campos.");
            }
        }
        catch (NumberFormatException e){
            JOptionPane.showMessageDialog(loginForm, "[!] Ha ocurrido un error [!]");
            clear();
        }
    }

    private void clear(){
        emailField.setText("");
        passwordField.setText("");
    }
}
