package prueba3;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;
import java.util.StringTokenizer;

import javax.swing.BoxLayout;
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
    private javax.swing.JButton btnGanar;
    private javax.swing.JButton btnPerder;
    private javax.swing.JButton btnCasilla;
    private javax.swing.JLabel etiquetaReloj;
    private javax.swing.JLabel etiquetaTiempo;
    private javax.swing.JLabel etiquetaTitulo;
    private javax.swing.JLabel etiquetaPuntos;
    private javax.swing.JPanel pnlCrono;
    private int puntos=0;
	  public VistaTableroCronometro() {
		  
	        initComponents();
	        setLocationRelativeTo(null);
	        t = new Timer(10, acciones);
	    }

	    @SuppressWarnings("unchecked")

	    private void initComponents() {
	    	pnlCrono = new javax.swing.JPanel();
	        etiquetaReloj = new javax.swing.JLabel();
	        etiquetaTitulo = new javax.swing.JLabel();
	        etiquetaTiempo = new javax.swing.JLabel();
	        etiquetaPuntos = new javax.swing.JLabel();
	        btnStart = new javax.swing.JButton();
	        btnPause = new javax.swing.JButton();
	        btnGanar = new javax.swing.JButton();
	        btnPerder = new javax.swing.JButton();
	        btnCasilla = new javax.swing.JButton();
	        btnStop = new javax.swing.JButton();
	        
	        JPanel pnlPrincipal = new JPanel();
	        pnlPrincipal.setLayout(new BoxLayout(pnlPrincipal, BoxLayout.Y_AXIS));
	        this.add(pnlPrincipal);
	       setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
	        setTitle("Buscovid");

	        pnlPrincipal.add(pnlCrono);
	        //pnlCrono.setLayout(new BoxLayout(pnlCrono, BoxLayout.Y_AXIS));
	        //pnlCrono.setBounds(0, 0, 720, 100);
	        pnlCrono.add(etiquetaReloj);
	        pnlCrono.add(etiquetaTiempo);
	        pnlCrono.add(btnStart);
	        pnlCrono.add(btnPause);
	        pnlCrono.add(btnStop);
	        pnlCrono.add(etiquetaTitulo);
	        pnlCrono.add(etiquetaPuntos);
	        pnlCrono.add(btnGanar);
	        pnlCrono.add(btnPerder);
	        //pnlCrono.add(btnCasilla);
	        pnlCrono.setLayout(null);
	        

	        etiquetaTiempo.setFont(new java.awt.Font("Lucida Sans", 0, 18)); 
	        //etiquetaTiempo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
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

	        btnGanar.setText("Acierto");
	        btnGanar.setEnabled(true);
	        btnGanar.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	              puntos++;
	              etiquetaPuntos.setText(""+puntos);
	            }
	        });
	        btnPerder.setText("Pierde");
	        btnPerder.setEnabled(true);
	        btnPerder.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	              puntos=0;
	              etiquetaPuntos.setText(""+puntos);
	            }
	        });
	        etiquetaTitulo.setFont(new java.awt.Font("Corbel", 1, 18)); 
	        etiquetaTitulo.setText("Puntos");
	        
	        etiquetaPuntos.setFont(new java.awt.Font("Corbel", 1, 18)); 
	        etiquetaPuntos.setText(""+puntos);
	        
	        /*
	        btnCasilla.setText("        ");
	        btnCasilla.setSize(500,500);
	        btnCasilla.setEnabled(true);
	        btnCasilla.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	            	Random rn = new Random();
	            	int n = rn.nextInt(9 - 0 + 1) + 0;
	            	if (n == 0) {
	            		btnCasilla.setText("BOMBA");
					}else {
						btnCasilla.setText(""+n);
					}
	            }
	        });*/
	        
	        Tablero a = new Tablero(9);
	        a.initTablero();
	        a.printTablero();
	        
	        JPanel pnlTablero = new JPanel();
	        //pnlTablero.setBounds(400, 200, 150, 150);
	       // pnlTablero.setLayout();
	        pnlPrincipal.add(pnlTablero, BorderLayout.CENTER);
	        pnlTablero.setPreferredSize(new Dimension(410,410));
	        pnlTablero.setMaximumSize(new Dimension(415, 415));
	        int tamaño = 9;
	        
	        for (int i = 0; i < tamaño; i++) {
				for (int j = 0; j < 9; j++) {
		        	javax.swing.JButton btnCasilla2 = new javax.swing.JButton();
		        	pnlTablero.add(btnCasilla2, BorderLayout.CENTER);
		        	btnCasilla2.setText(" ");
		        	String contenido = ""+a.getTablero()[i][j];
		        	btnCasilla2.setSize(500,500);
		        	btnCasilla2.setEnabled(true);
		        	btnCasilla2.addActionListener(new java.awt.event.ActionListener() {
			            public void actionPerformed(java.awt.event.ActionEvent evt) {
			            	/*
			            	Random rn = new Random();
			            	int n = rn.nextInt(9 - 0 + 1) + 0;
			            	if (n == 0) {
			            		btnCasilla2.setText("BOMBA");
							}else {
								btnCasilla2.setText(""+n);
							}*/
			            	btnCasilla2.setText(contenido);
			            	
			            }
			            	
			        });
				}
			}
	
	        //pack();
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
