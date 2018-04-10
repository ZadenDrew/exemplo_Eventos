/*
 * Mismo ejemplo de Eventos usando una clase interna.
 */
package pro_ejemplo_eventos;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author abrandarizdominguez
 */
// Al querer usar eventos, se implementa ActionListener en la clase + imports.
public class Evento1 {

    JFrame marco;
    JPanel panel;
    JButton bAzul, bAmarillo, bRojo;

    // Constructor:
    public Evento1() {
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
        PonerColor color = new PonerColor();
        // Se añade a los botones el ActionListener:
        bAzul.addActionListener(color);
        bAmarillo.addActionListener(color);
        bRojo.addActionListener(color);
        // Se hace visible la ventana:
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
    }

    // Clase interna:
    public class PonerColor implements ActionListener {

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
}
