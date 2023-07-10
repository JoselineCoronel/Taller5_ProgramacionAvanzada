package Forms;

import Entities.Libro;
import Entities.User;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class Menu extends JFrame{
    private JPanel menuForm;
    private JButton buscarLibroButton;
    private JButton prestarLibroButton;
    private JButton agregarLibroButton;
    private JButton devolverLibroButton;
    private List<Libro> menu;

    public Menu(List<Libro> menu){

        setContentPane(menuForm);
        setTitle("Formulario Registro");
        setSize(400, 400);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);


        buscarLibroButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                BuscarLibro bl = new BuscarLibro();
            }
        });
        prestarLibroButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PrestarLibro pl = new PrestarLibro();
            }
        });
        agregarLibroButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AgregarLibro al = new AgregarLibro();
            }
        });
        devolverLibroButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DevolverLibro dv = new DevolverLibro();
            }
        });
    }

}
