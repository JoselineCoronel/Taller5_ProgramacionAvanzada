package Forms;

import Entities.Libro;
import Entities.User;

import javax.swing.*;
import java.util.List;

public class BuscarLibro extends JFrame{
    private JPanel buscarLibro;
    private JTextField textField1;
    private JTextArea textArea1;
    private JButton buscarButton;
    private List<Libro> o;

    public BuscarLibro(){
        setContentPane(buscarLibro);
        setTitle("Formulario Registro");
        setSize(400, 400);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
