package prueba3;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.Timer;

public class VistaTableroCronometro extends javax.swing.JFrame{
	
    private javax.swing.JButton btnPause;
    private javax.swing.JButton btnStart;
    private javax.swing.JButton btnStop;
    private javax.swing.JLabel etiquetaTiempo;
    private javax.swing.JPanel pnlCrono;
	  public VistaTableroCronometro() {
		  
	        initComponents();
	        setLocationRelativeTo(null);
	        t = new Timer(10, acciones);
	    }

	    @SuppressWarnings("unchecked")

	    private void initComponents() {
	    	pnlCrono = new javax.swing.JPanel();
	        etiquetaTiempo = new javax.swing.JLabel();
	        btnStart = new javax.swing.JButton();
	        btnPause = new javax.swing.JButton();
	        btnStop = new javax.swing.JButton();
	        
	        
	        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
	        setTitle("Buscovid");

	        this.getContentPane().add(pnlCrono);
	        
	        pnlCrono.add(etiquetaTiempo);
	        pnlCrono.add(btnStart);
	        pnlCrono.add(btnPause);
	        pnlCrono.add(btnStop);

	        etiquetaTiempo.setFont(new java.awt.Font("Lucida Sans", 0, 18)); 
	        etiquetaTiempo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
	        etiquetaTiempo.setText("00:00:00:00");

	        btnStart.setText("Iniciar");
	        btnStart.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                btnStartActionPerformed(evt);
	            }
	        });

	        btnPause.setText("Pausar");
	        btnPause.setEnabled(false);
	        btnPause.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                btnPauseActionPerformed(evt);
	            }
	        });

	        btnStop.setText("Detener");
	        btnStop.setEnabled(false);
	        btnStop.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                btnStopActionPerformed(evt);
	            }
	        });

	        pack();
	    }

	    private Timer t;
	    private int h, m, s, cs;
	    private ActionListener acciones = new ActionListener(){

	        @Override
	        public void actionPerformed(ActionEvent ae) {
	            ++cs; 
	            if(cs==100){
	                cs = 0;
	                ++s;
	            }
	            if(s==60) 
	            {
	                s = 0;
	                ++m;
	            }
	            if(m==60)
	            {
	                m = 0;
	                ++h;
	            }
	            actualizarLabel();
	        }
	        
	    };
	    
	    private void actualizarLabel() {
	        String tiempo = (h<=9?"0":"")+h+":"+(m<=9?"0":"")+m+":"+(s<=9?"0":"")+s+":"+(cs<=9?"0":"")+cs;
	        etiquetaTiempo.setText(tiempo);
	    }
	    
	    private void btnStartActionPerformed(java.awt.event.ActionEvent evt) {
	        t.start();
	        btnStart.setEnabled(false);
	        btnStart.setText("Reanudar");
	        btnPause.setEnabled(true);
	        btnStop.setEnabled(true);
	    }

	    private void btnPauseActionPerformed(java.awt.event.ActionEvent evt) {
	        t.stop();
	        btnStart.setEnabled(true);
	        btnPause.setEnabled(false);
	    }

	    private void btnStopActionPerformed(java.awt.event.ActionEvent evt) {
	        if(t.isRunning()) 
	        {
	            t.stop();
	            btnStart.setEnabled(true);
	        }
	        btnStart.setText("Iniciar");
	        btnPause.setEnabled(false);
	        btnStop.setEnabled(false);
	        h=0; m=0; s=0; cs=0;
	        actualizarLabel();
	    }


	    public static void main(String args[]) {
	    	
	        java.awt.EventQueue.invokeLater(new Runnable() {
	            @Override
	            public void run() {
	            	VistaTableroCronometro a = new VistaTableroCronometro();
	            	a.setVisible(true);
	            	a.setSize(720, 720);
	                
	            }
	        });
	    }

	    
	  
}
