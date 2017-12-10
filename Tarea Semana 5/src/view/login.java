package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class login extends JFrame {

	private JPanel contentPane;
	private JTextField txtUsuario;
	private JPasswordField txtContraseña;
	principal p=new principal();
	private JButton btnAceptar;
	private JButton btnSalir;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login frame = new login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public login() {
		inicializar();
		mensaje();
		eventos();
	}
	public void inicializar() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 378, 238);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(127, 255, 212));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAlumnoDeIv = new JLabel("ALUMNO DE IV SEMESTRE");
		lblAlumnoDeIv.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblAlumnoDeIv.setBounds(110, 21, 209, 14);
		contentPane.add(lblAlumnoDeIv);
		
		JLabel lblUsuario = new JLabel("Usuario:");
		lblUsuario.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblUsuario.setBounds(50, 68, 99, 14);
		contentPane.add(lblUsuario);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a:");
		lblContrasea.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblContrasea.setBounds(50, 109, 99, 14);
		contentPane.add(lblContrasea);
		
		txtUsuario = new JTextField();
		txtUsuario.setBounds(184, 67, 86, 20);
		contentPane.add(txtUsuario);
		txtUsuario.setColumns(10);
		
		txtContraseña = new JPasswordField();
		txtContraseña.setBounds(184, 108, 86, 19);
		contentPane.add(txtContraseña);
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(60, 147, 89, 23);
		contentPane.add(btnAceptar);
		
		btnSalir = new JButton("Salir");
		btnSalir.setBounds(230, 147, 89, 23);
		contentPane.add(btnSalir);
	}
	public void eventos()
	{
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				char[] clave=txtContraseña.getPassword();
				String clavefinal=new String(clave);
				if(txtUsuario.getText().equals("jaime") && clavefinal.equals("123456"))
				{ dispose();
					JOptionPane.showMessageDialog(null,"ALUMNO REGISTRADO","Hola",JOptionPane.INFORMATION_MESSAGE);
					p.setVisible(true);
				}else
				{
					JOptionPane.showMessageDialog(null, "Usuario o Contraseña incorrectos","error",JOptionPane.ERROR_MESSAGE);
					limpiar();
				}
			}
		});
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				salir();
			}
		});
		
	}
	public void mensaje()
	{
		JOptionPane.showMessageDialog(null, "BIENVENIDOS AL EXAMEN FINAL","Hola",JOptionPane.INFORMATION_MESSAGE);
	}
	public void limpiar()
	{
		txtUsuario.setText("");
		txtContraseña.setText("");
		txtUsuario.requestFocus();
	}
	public void salir()
	{
		int n=JOptionPane.showConfirmDialog(rootPane,"Desea salir?","Salir",JOptionPane.YES_NO_OPTION);
		if(n==JOptionPane.YES_OPTION)
		{
			dispose();
		}
	}
}
