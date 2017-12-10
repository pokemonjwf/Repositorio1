package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import java.awt.SystemColor;
import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.JOptionPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class principal extends JFrame {

	private JPanel contentPane;
	private JTextField txtNuevaPelicula;
	private JTextField txtPrecio;
	private JTextField txtContador;
	private JTextField txtTotalRecaudado;
	
	ButtonGroup g1=new ButtonGroup();
	ButtonGroup g2=new ButtonGroup();
	
	
	DefaultListModel list1=new DefaultListModel();
	DefaultListModel list2=new DefaultListModel();
	DefaultListModel list3=new DefaultListModel();
	DefaultListModel list4=new DefaultListModel();
	DefaultListModel list5=new DefaultListModel();
	private JComboBox cboHorario;
	private JRadioButton rdbLmm;
	private JRadioButton rdbJv;
	private JRadioButton rdbSd;
	private JRadioButton rdbEstreno;
	private JRadioButton rdbNormal;
	private JButton btnNuevo;
	private JButton btnRegistrar;
	private JButton btnSalir;
	private JList list_Pelicula;
	private JList list_Horario;
	private JList list_Tipo;
	private JList list_Frecuencia;
	private JList list_Precio;
	
	float precioTipo;
	float auHorario;
	float auFrecuencia;
	float precio;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					principal frame = new principal();
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
	public principal()
	{
		inicializar();
		cargarComboHorario();
		agruparRadioButton();
		eventos();
		
	}
	public void inicializar() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 530, 655);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(152, 251, 152));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblProximoEstrenosDe = new JLabel("PROXIMO ESTRENOS DE PELICULAS");
		lblProximoEstrenosDe.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblProximoEstrenosDe.setBounds(121, 11, 290, 14);
		contentPane.add(lblProximoEstrenosDe);
		
		JLabel lblNuevaPelicula = new JLabel("Nueva Pelicula");
		lblNuevaPelicula.setBounds(10, 59, 102, 14);
		contentPane.add(lblNuevaPelicula);
		
		txtNuevaPelicula = new JTextField();
		txtNuevaPelicula.setBounds(10, 84, 86, 20);
		contentPane.add(txtNuevaPelicula);
		txtNuevaPelicula.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new LineBorder(new Color(153, 180, 209)), "Tipo", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(112, 59, 93, 109);
		contentPane.add(panel);
		panel.setLayout(null);
		
		rdbEstreno = new JRadioButton("Estreno");
		rdbEstreno.setBounds(11, 31, 65, 23);
		panel.add(rdbEstreno);
		
		rdbNormal = new JRadioButton("Normal");
		rdbNormal.setBounds(11, 71, 65, 23);
		panel.add(rdbNormal);
		
		JLabel lblHorario = new JLabel("Horario");
		lblHorario.setBounds(252, 59, 46, 14);
		contentPane.add(lblHorario);
		
		cboHorario = new JComboBox();
		cboHorario.setBounds(252, 84, 86, 20);
		contentPane.add(cboHorario);
		
		JLabel lblPrecio = new JLabel("Precio");
		lblPrecio.setBounds(252, 123, 46, 14);
		contentPane.add(lblPrecio);
		
		txtPrecio = new JTextField();
		txtPrecio.setBounds(252, 148, 86, 20);
		contentPane.add(txtPrecio);
		txtPrecio.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(new LineBorder(new Color(153, 180, 209)), "Frecuencia", TitledBorder.LEADING, TitledBorder.TOP, null, SystemColor.desktop));
		panel_1.setBounds(385, 59, 102, 109);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		rdbLmm = new JRadioButton("L-M-M");
		rdbLmm.setBounds(17, 24, 80, 23);
		panel_1.add(rdbLmm);
		
		rdbJv = new JRadioButton("J-V");
		rdbJv.setBounds(17, 50, 80, 23);
		panel_1.add(rdbJv);
		
		rdbSd = new JRadioButton("S-D");
		rdbSd.setBounds(17, 76, 80, 23);
		panel_1.add(rdbSd);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(25, 179, 462, 45);
		contentPane.add(panel_2);
		panel_2.setLayout(new GridLayout(0, 3, 0, 0));
		
		btnNuevo = new JButton("Nuevo");
		panel_2.add(btnNuevo);
		
		btnRegistrar = new JButton("Registrar");
		panel_2.add(btnRegistrar);
		
		btnSalir = new JButton("Salir");
		panel_2.add(btnSalir);
		
		JLabel label = new JLabel("==========================================================");
		label.setBounds(35, 237, 467, 14);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("==========================================================");
		label_1.setBounds(35, 276, 467, 14);
		contentPane.add(label_1);
		
		JLabel lblResumen = new JLabel("RESUMEN");
		lblResumen.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblResumen.setBounds(212, 250, 86, 20);
		contentPane.add(lblResumen);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(25, 332, 462, 196);
		contentPane.add(panel_3);
		panel_3.setLayout(new GridLayout(0, 5, 0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		panel_3.add(scrollPane);
		
		list_Pelicula = new JList();
		scrollPane.setViewportView(list_Pelicula);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		panel_3.add(scrollPane_1);
		
		list_Horario = new JList();
		scrollPane_1.setViewportView(list_Horario);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		panel_3.add(scrollPane_2);
		
		list_Tipo = new JList();
		scrollPane_2.setViewportView(list_Tipo);
		
		JScrollPane scrollPane_3 = new JScrollPane();
		panel_3.add(scrollPane_3);
		
		list_Frecuencia = new JList();
		scrollPane_3.setViewportView(list_Frecuencia);
		
		JScrollPane scrollPane_4 = new JScrollPane();
		panel_3.add(scrollPane_4);
		
		list_Precio = new JList();
		scrollPane_4.setViewportView(list_Precio);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(25, 300, 462, 21);
		contentPane.add(panel_4);
		panel_4.setLayout(new GridLayout(0, 5, 0, 0));
		
		JLabel lblPelicula = new JLabel("Pelicula");
		panel_4.add(lblPelicula);
		
		JLabel lblHorario_1 = new JLabel("Horario");
		panel_4.add(lblHorario_1);
		
		JLabel lblTipo = new JLabel("Tipo");
		panel_4.add(lblTipo);
		
		JLabel lblFrecuencia = new JLabel("Frecuencia");
		panel_4.add(lblFrecuencia);
		
		JLabel lblPrecio_1 = new JLabel("Precio");
		panel_4.add(lblPrecio_1);
		
		JLabel lblTotalTiquets = new JLabel("Total Tiquets:");
		lblTotalTiquets.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblTotalTiquets.setBounds(273, 552, 123, 14);
		contentPane.add(lblTotalTiquets);
		
		JLabel lblTotalRecaudado = new JLabel("Total Recaudado:");
		lblTotalRecaudado.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblTotalRecaudado.setBounds(273, 577, 123, 14);
		contentPane.add(lblTotalRecaudado);
		
		txtContador = new JTextField();
		txtContador.setBounds(401, 546, 86, 20);
		contentPane.add(txtContador);
		txtContador.setColumns(10);
		
		txtTotalRecaudado = new JTextField();
		txtTotalRecaudado.setBounds(401, 575, 86, 20);
		contentPane.add(txtTotalRecaudado);
		txtTotalRecaudado.setColumns(10);
	}
	public void eventos()
	{
		rdbEstreno.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				calcular();
			}
		});
		
		rdbNormal.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				calcular();
			}
		});
		
		rdbLmm.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				calcular();
			}
		});
		
		rdbJv.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				calcular();
			}
		});
		
		rdbSd.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				calcular();
			}
		});
		
		cboHorario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				calcular();
			}
		});
		
		btnRegistrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				registrar();
			}
		});
		
		btnNuevo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nuevo();
			}
		});
		
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				salir();
			}
		});
	}
	public void calcular()
	{	
		
		if(rdbEstreno.isSelected())
		{
			precioTipo=12;
		}
		if(rdbNormal.isSelected())
		{
			precioTipo=10;
		}
		if(rdbLmm.isSelected())
		{
			auFrecuencia=-2;
		}
		if(rdbJv.isSelected())
		{
			auFrecuencia=2;
		}
		if(rdbSd.isSelected())
		{
			auFrecuencia=3;
		}
		if(cboHorario.getSelectedItem()=="6-8pm")
		{
			auHorario=0;
		}
		if(cboHorario.getSelectedItem()=="8-10pm")
		{
			auHorario=2;
		}
		if(cboHorario.getSelectedItem()=="10-12pm")
		{
			auHorario=3;
		}
		
		precio=precioTipo+auHorario+auFrecuencia;
		txtPrecio.setText(String.valueOf(precio));
			
	}
	public void cargarComboHorario()
	{
		cboHorario.addItem("6-8pm");
		cboHorario.addItem("8-10pm");
		cboHorario.addItem("10-12pm");
		
	}
	public void agruparRadioButton()
	{
		g1.add(rdbEstreno);
		g1.add(rdbNormal);
		g2.add(rdbLmm);
		g2.add(rdbJv);
		g2.add(rdbSd);
	}
	public void registrar()
	{	precio=Float.parseFloat(txtPrecio.getText());
		String pelicula="";
		String tipo="";
		String horario="";
		String frecuencia="";
		pelicula=txtNuevaPelicula.getText();
		if(rdbEstreno.isSelected())
		{
			tipo="Estreno";
		}
		if(rdbNormal.isSelected())
		{
			tipo="Normal";
		}
		if(rdbLmm.isSelected())
		{
			frecuencia="L-M-M";
		}
		if(rdbJv.isSelected())
		{
			frecuencia="J-V";
		}
		if(rdbSd.isSelected())
		{
			frecuencia="S-D";
		}
		if(cboHorario.getSelectedIndex()==0)
		{
			horario="6-8pm";
		}
		if(cboHorario.getSelectedIndex()==1)
		{
			horario="8-10pm";
		}
		if(cboHorario.getSelectedIndex()==2)
		{
			horario="10-12pm";
		}
		list1.addElement(pelicula);
		list_Pelicula.setModel(list1);
		list2.addElement(horario);
		list_Horario.setModel(list2);
		list3.addElement(tipo);
		list_Tipo.setModel(list3);
		list4.addElement(frecuencia);
		list_Frecuencia.setModel(list4);
		list5.addElement(precio);
		list_Precio.setModel(list5);
		sumarlista();
	}
	public void sumarlista()
	{
		float suma=0;
		String cadena="";
		int cont=0;
		for (int i=0; i < list_Precio.getModel().getSize(); i++){

			cadena = list_Precio.getModel().getElementAt(i).toString();
			precio = Float.parseFloat(cadena);
			suma = suma + precio;
			cont++;
			}
			txtContador.setText(String.valueOf(cont));
			txtTotalRecaudado.setText(String.valueOf(suma));
		
	}
	public void nuevo()
	{
		txtNuevaPelicula.setText("");
		g1.clearSelection();
		g2.clearSelection();		
		cboHorario.setSelectedIndex(0);
		txtPrecio.setText("");
		txtNuevaPelicula.requestFocus();
		
	}
	public void salir()
	{
		int n=JOptionPane.showConfirmDialog(rootPane, "Desea salir?","salir",JOptionPane.YES_NO_OPTION);
		if(n==JOptionPane.YES_OPTION)
		{
			dispose();
		}
	}
}
