package Vista;

import Logica.*;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class dificultad extends JFrame {
    JPanel panel_dificultad = new JPanel();
    JRadioButton opcion_dif_novato;
    JRadioButton opcion_dif_veterano;
    JRadioButton opcion_dif_experto;
    ButtonGroup grupo_botones;

    public dificultad() {
        this.setSize(400, 400);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setIconImage(new ImageIcon("imagenes//Covid-19.png").getImage());
        this.setTitle("Juego -Nombre Juego-");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setUndecorated(true);
        panel_dificultad.setLayout(null);
        panel_dificultad.setBorder(BorderFactory.createLineBorder(Color.white, 1));
        // Fondo del Frame
        panel_dificultad.setBackground(Color.black);
        // Añadimos el panel a la ventana
        add(panel_dificultad);
        componentes();
    }

    public void componentes() {
        JLabel titulo_frame = new JLabel("Dificultad");
        titulo_frame.setBounds(150, 20, 150, 20);
        titulo_frame.setForeground(Color.white);
        panel_dificultad.add(titulo_frame);

        opcion_dif_novato = new JRadioButton("Principiante 9x9", true);
        opcion_dif_novato.setBounds(80, 100, 150, 20);
        opcion_dif_novato.setBackground(Color.white);
        panel_dificultad.add(opcion_dif_novato);

        opcion_dif_veterano = new JRadioButton("Intermedio 16x16");
        opcion_dif_veterano.setBounds(80, 150, 150, 20);
        opcion_dif_veterano.setBackground(Color.white);
        panel_dificultad.add(opcion_dif_veterano);

        opcion_dif_experto = new JRadioButton("Avanzado 32x32");
        opcion_dif_experto.setBounds(80, 200, 150, 20);
        opcion_dif_experto.setBackground(Color.white);
        panel_dificultad.add(opcion_dif_experto);

        grupo_botones = new ButtonGroup();
        grupo_botones.add(opcion_dif_novato);
        grupo_botones.add(opcion_dif_veterano);
        grupo_botones.add(opcion_dif_experto);

        JButton aceptar = new JButton("Aceptar");
        ActionListener actionaceptar = new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                botonSeleccionado();
                principal.v_dificultad.setVisible(false);
            }
        };
        aceptar.addActionListener(actionaceptar);
        aceptar.setBounds(80, 280, 80, 20);
        aceptar.setBackground(Color.white);
        panel_dificultad.add(aceptar);

    }

    public void botonSeleccionado() {
        if (opcion_dif_novato.isSelected()) {
            principal.dificultad_int = 0;
        } else if (opcion_dif_veterano.isSelected()) {
            principal.dificultad_int = 1;
        } else if (opcion_dif_experto.isSelected()) {
            principal.dificultad_int = 2;
        }
        System.out.println(principal.dificultad_int);
    }
}
