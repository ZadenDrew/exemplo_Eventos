package exemplo_eventos;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author abrandarizdominguez
 */
// Al querer usar eventos, se implementa ActionListener en la clase + imports.
public class Evento implements ActionListener {

    JFrame marco;
    JPanel panel;
    JButton bAzul, bAmarillo, bRojo;

    // Constructor:
    public Evento() {
        // Se instancian los objetos:
        marco = new JFrame("Ventana eventos");
        panel = new JPanel();
        bAzul = new JButton("Azul");
        bAmarillo = new JButton("Amarillo");
        bRojo = new JButton("Rojo");
        // Características de los objetos:
        marco.setSize(400, 200);
        panel.add(bAzul);
        panel.add(bAmarillo);
        panel.add(bRojo);
        marco.add(panel);
        // Se añade a los botones el ActionListener:
        bAzul.addActionListener(this);
        bAmarillo.addActionListener(this);
        bRojo.addActionListener(this);
        // Se hace visible la ventana:
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        /*
         * Para poder diferenciar que botón es el pulsado utilizamos para el
         * ActionEvent su método .getSource.
         */
        Object boton = ae.getSource();
        if (boton == bAzul) {
            panel.setBackground(Color.BLUE);
        } else if (boton == bAmarillo) {
            panel.setBackground(Color.YELLOW);
        } else {
            panel.setBackground(Color.RED);
        }
    }
}
