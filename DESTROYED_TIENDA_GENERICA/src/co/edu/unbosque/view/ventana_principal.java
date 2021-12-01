package co.edu.unbosque.view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import co.edu.unbosque.controller.Controller;
import co.edu.unbosque.controller.InterfazUsuario;

import java.awt.Color;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ventana_principal extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	
	public static final String PANEL_CONFIGURACION = "panel_configuracion";
	public static final String PANEL_CLIENTES = "panel_clientes";
	public static final String PANEL_PRODUCTOS = "panel_productos";
	public static final String PANEL_PROVEEDORES = "panel_proveedores";
	public static final String PANEL_GESTION_VENTAS = "panel_gestion_ventas";

	/**
	 * Create the frame.
	 */
	public ventana_principal( Controller control  ) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(350, 100, 612, 567);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(70, 130, 180));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("X");
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
			}
		});
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblNewLabel_1 = new JLabel("BIENVENIDOS A NUESTRA TIENDA");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		
		JButton btnConfiguracion = new JButton("CONFIGURACION PROGRAMA");
		btnConfiguracion.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnConfiguracion.setForeground(new Color(255, 255, 255));
		btnConfiguracion.setBackground(new Color(0, 139, 139));
		btnConfiguracion.addActionListener(control);
		btnConfiguracion.setActionCommand(PANEL_CONFIGURACION);
		
		JButton btnModuloClientes = new JButton("MODULO CLIENTES");
		btnModuloClientes.setForeground(Color.WHITE);
		btnModuloClientes.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnModuloClientes.setBackground(new Color(50, 205, 50));
		btnModuloClientes.addActionListener(control);
		btnModuloClientes.setActionCommand(PANEL_CLIENTES);
		
		JButton btnModuloProductos = new JButton("MODULO PRODUCTOS");
		btnModuloProductos.setForeground(Color.WHITE);
		btnModuloProductos.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnModuloProductos.setBackground(new Color(50, 205, 50));
		btnModuloProductos.addActionListener(control);
		btnModuloProductos.setActionCommand(PANEL_PRODUCTOS);
		
		JButton btnModuloProveedores = new JButton("MODULO PROVEEDORES");
		btnModuloProveedores.setForeground(Color.WHITE);
		btnModuloProveedores.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnModuloProveedores.setBackground(new Color(0, 139, 139));
		btnModuloProveedores.addActionListener(control);
		btnModuloProveedores.setActionCommand(PANEL_PROVEEDORES);
		
		JButton btnModuloGestionVentas = new JButton("GESTION DE VENTAS");
		btnModuloGestionVentas.setForeground(Color.WHITE);
		btnModuloGestionVentas.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnModuloGestionVentas.setBackground(new Color(0, 139, 139));		
		btnModuloGestionVentas.addActionListener(control);
		btnModuloGestionVentas.setActionCommand(PANEL_GESTION_VENTAS);

		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(94)
							.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 401, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
							.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(122)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(btnModuloClientes, GroupLayout.PREFERRED_SIZE, 350, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnConfiguracion, GroupLayout.PREFERRED_SIZE, 350, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnModuloProveedores, GroupLayout.PREFERRED_SIZE, 350, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnModuloProductos, GroupLayout.PREFERRED_SIZE, 350, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnModuloGestionVentas, GroupLayout.PREFERRED_SIZE, 350, GroupLayout.PREFERRED_SIZE))))
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel)
						.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
					.addGap(47)
					.addComponent(btnConfiguracion, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
					.addGap(34)
					.addComponent(btnModuloClientes, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
					.addGap(28)
					.addComponent(btnModuloProveedores, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
					.addGap(28)
					.addComponent(btnModuloProductos, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
					.addGap(31)
					.addComponent(btnModuloGestionVentas, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(73, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
		setUndecorated(true);
	}

}
