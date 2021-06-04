package com.softgame.poo1game.ventanas;
import com.softgame.poo1game.hilos.Hilo;
import javax.swing.JMenuBar;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JFrame;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class VentanaHilo extends JFrame{
	private JMenuBar menuBar;
	private JLabel lblA;
	private JLabel lblB;
	private JLabel lblC;
	private JLabel lblD;
	private JMenu mnuArchivo;
	private JMenuItem mnuInicio;
	private JMenuItem mnuSalir;
	
	public void initComponents(){
		this.setLayout(new GridLayout(4,1));
		lblA = new JLabel("A");
		lblB = new JLabel("B");
		lblC = new JLabel("C");
		lblD = new JLabel("D");
		menuBar = new JMenuBar();
		mnuArchivo = new JMenu("Archivo");
		menuBar.add(mnuArchivo);
		this.setJMenuBar(menuBar);
		mnuInicio = new JMenuItem("Inicio");
		mnuInicio.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				iniciarHilos();
			}
		});
		mnuArchivo.add(mnuInicio);
		mnuSalir = new JMenuItem("Salir");
		mnuSalir.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				dispose();
			}
		});
		mnuArchivo.add(mnuSalir);
		this.add(lblA);
		this.add(lblB);
		this.add(lblC);
		this.add(lblD);
		this.setSize(400,600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public VentanaHilo(){
		initComponents();
	}
	public void iniciarHilos(){
		Thread A = new Hilo("A",lblA);
		A.start();
		Thread B = new Hilo("B",lblB);
		B.start();
		Thread C = new Hilo("C",lblC);
		C.start();
		Thread D = new Hilo("D",lblD);
		D.start();
	}
}