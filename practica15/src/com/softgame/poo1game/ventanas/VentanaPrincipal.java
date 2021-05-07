package com.softgame.poo1game.ventanas;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.FlowLayout;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
public class VentanaPrincipal extends JFrame{
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
		btnOpen.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				openFile();
			}
		});
		f.add(txtContenido);
		f.add(lblLeidos);
		f.add(lblN);
		f.add(btnExit);
		btnExit.addActionListener(new ActionListener(){
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
		String file = txtFile.getText();
		String path = System.getProperty("user.home") + System.getProperty("file.separator") + file;
		System.out.println(path);
		txtContenido.setText("");
		File archivo = new File(path);
		if(!archivo.exists()){
			JOptionPane.showMessageDialog(f, "No existe");
			return;
		}
		if(archivo.isFile()){
			getContenido(archivo);
		}else{
			getList(archivo);
		}
	}
	public void getContenido(File f){
		try{
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			int count = 0;
			String reng;
			while((reng = br.readLine()) != null){
				txtContenido.append(reng+"\n");
				count = reng.length()+count;
				System.out.println(reng);
			}
			br.close();
			lblN.setText(Integer.toString(count));
		}catch (Exception e){
			e.printStackTrace();
		}
	}
	public void getList(File f){
		String[] contenido = f.list();
		int count = 0;
		for(int i = 0; i<contenido.length; i++){
			txtContenido.append(contenido[i]+"\n");
			count = contenido[i].length() + count;
			System.out.println(contenido[i]);
		}
		lblN.setText(Integer.toString(count));
	}
}