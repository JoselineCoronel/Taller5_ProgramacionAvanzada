package Forms;

import Entities.User;
import Util.Utils;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class Form extends JFrame{
    private JTextField nameField;
    private JTextField ageField;
    private JTextField emailField;
    private JButton guardarButton;
    private JButton limpiarButton;
    private JButton cerrarButton;
    private JTextArea textArea1;
    private JPanel registerForm;

    private List<User> userList;

    public Form(List<User> userList){
        this.userList = userList;
        setContentPane(registerForm);
        setTitle("Formulario Registro");
        setSize(400, 400);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        limpiarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clear();
            }
        });

        guardarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                saveUser(userList);
            }
        });
        cerrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                close();
            }
        });
    }

    private void saveUser(List<User> userList){

        try{
            String name = nameField.getText();
            String age = ageField.getText();
            String email = emailField.getText();

            if (!name.isEmpty() && !age.isEmpty() && !email.isEmpty()){
                int ageInt = Integer.parseInt(age);
                User user = new User(name, ageInt, email);
                userList.add(user);

                textArea1.setText("");
                for (User aux : userList) {
                    textArea1.append(aux.toString() + "\n");
                }
                clear();

            }else{
                JOptionPane.showMessageDialog(registerForm, "Por favor, complete todos los campos.");
            }
        }
        catch (NumberFormatException e){
            JOptionPane.showMessageDialog(registerForm, "[!] Ha ocurrido un error [!]");
            clear();
        }
    }


    private void clear(){
        nameField.setText("");
        ageField.setText("");
        emailField.setText("");
    }

    private void close(){
        Utils.writeData(userList);
        System.exit(0);
    }


}
