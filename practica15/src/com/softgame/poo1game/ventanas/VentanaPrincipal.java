package com.softgame.poo1game.ventanas;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class VentanaPrincipal extends JFrame implements ActionListener{
	private JFrame f;
	private JLabel lblFile, lblN, lblLeidos;
	private JTextField txtFile;
	private JButton btnOpen, btnExit;
	private JTextArea txtContenido;
	
	public VentanaPrincipal(){
		f = new JFrame("Practica 14");
		lblFile = new JLabel("Nombre de archivo");
		txtFile = new JTextField(20);
		btnOpen = new JButton("Abrir archivo");
		txtContenido = new JTextArea(30,40);
		lblLeidos = new JLabel("Caracteres leidos");
		lblN = new JLabel("0");
		btnExit = new JButton("Salir");
	}
	public void initComponents(){
		f.setLayout(new FlowLayout());
		f.add(lblFile);
		f.add(txtFile);
		f.add(btnOpen);
		f.addActionListener(new ActionEvent(){
			public void actionPerformed(ActionEvent e){
				openFile();
			}
		});
		f.add(txtContenido);
		f.add(lblLeidos);
		f.add(lblN);
		f.add(btnExit);
			f.addActionListener(new ActionEvent(){
			public void actionPerformed(ActionEvent e){
				f.dispose();
			}
		});
		f.setSize(550,440);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String args[]){
		VentanaPrincipal v = new VentanaPrincipal();
		v.initComponents();
	}
	public void openFile(){
		
	}
}