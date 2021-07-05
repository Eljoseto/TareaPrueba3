package Vista;

import Logica.principal;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ventana_juego extends JFrame {
    JPanel panel_v_juego = new JPanel();

    public ventana_juego() {
        this.setSize(720, 720);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setIconImage(new ImageIcon("imagenes//Covid-19.png").getImage());
        this.setTitle("BuscaCovid");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        panel_v_juego.setLayout(null);
        // Fondo color negro
        panel_v_juego.setBackground(Color.white);
        this.add(panel_v_juego);
        componentes_panel();
    }

    public void componentes_panel() {
        // Texto
        // Puntaje
        puntaje.setBounds(100, 40, 120, 20);
        panel_v_juego.add(puntaje);

        cronometro.setBounds(100, 80, 120, 20);
        panel_v_juego.add(cronometro);

        // Botones
        // Iniciar o reiniciar juego
        iniciar_reiniciar.setBounds(500, 40, 60, 40);
        panel_v_juego.add(iniciar_reiniciar);
        // Menu
        menu.setBounds(600, 40, 60, 40);
        panel_v_juego.add(menu);
        // Action boton salir
        ActionListener action_iniciar_reiniciar = new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                // Iniciar o reiniciar juego
            }
        };
        iniciar_reiniciar.addActionListener(action_iniciar_reiniciar);

        // Action boton salir
        ActionListener action_menu = new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                principal.v_dificultad.setVisible(true);
            }
        };
        menu.addActionListener(action_menu);
    }

    // Creacion de texto, botones, cajas de texto, etc....
    JButton iniciar_reiniciar = new JButton("R");
    JButton menu = new JButton("M");
    JLabel puntaje = new JLabel("Point: ");
    JLabel cronometro = new JLabel("Cronometro: ");
    JLabel JLabel3 = new JLabel("Botton 1");
    JLabel JLabel4 = new JLabel("Botton 1");
}
