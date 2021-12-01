package co.edu.unbosque.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import co.edu.unbosque.controller.Controller;

import java.awt.Color;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import co.edu.unbosque.model.DTO.ClientesDTO;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

public class crud_clientes extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JButton btnAgregarCliente;
	private JButton btnRefrescarTabla;

	private DefaultTableModel model;
	private  JScrollPane scrollPane;
	public static final String VENTANTA_AGREGAR_CLIENTE = "ventanta_agregar_cliente";
	public static final String VENTANTA_ACTUALIZAR_CLIENTE = "ventanta_actualizar_cliente";
	public static final String VENTANTA_BORRAR_CLIENTE = "ventanta_borrar_cliente";
	
	
	/**
	 * Create the frame.
	 */
	public crud_clientes( Controller controller ) {
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
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblNewLabel_1 = new JLabel("CRUD CLIENTES");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		
		JScrollPane scrollPane = new JScrollPane();
		
		JButton btnBorrarCliente = new JButton("Borrar");
		btnBorrarCliente.setBackground(new Color(0, 128, 128));
		btnBorrarCliente.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnBorrarCliente.setForeground(new Color(255, 255, 255));
		btnBorrarCliente.addActionListener(controller);
		btnBorrarCliente.setActionCommand(VENTANTA_BORRAR_CLIENTE);
		
		JButton btnActualizarCliente = new JButton("Actualizar");
		btnActualizarCliente.setBackground(new Color(50, 205, 50));
		btnActualizarCliente.setForeground(new Color(255, 255, 255));
		btnActualizarCliente.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnActualizarCliente.addActionListener(controller);
		btnActualizarCliente.setActionCommand(VENTANTA_ACTUALIZAR_CLIENTE);
		
		JButton btnNuevoCliente = new JButton("Nuevo Cliente");
		btnNuevoCliente.setBackground(new Color(0, 128, 128));
		btnNuevoCliente.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNuevoCliente.setForeground(new Color(255, 255, 255));
		btnNuevoCliente.addActionListener(controller);
		btnNuevoCliente.setActionCommand(VENTANTA_AGREGAR_CLIENTE);
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(76)
							.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 448, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
							.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(53)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(btnBorrarCliente, GroupLayout.PREFERRED_SIZE, 139, GroupLayout.PREFERRED_SIZE)
									.addGap(39)
									.addComponent(btnActualizarCliente, GroupLayout.PREFERRED_SIZE, 139, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(btnNuevoCliente, GroupLayout.PREFERRED_SIZE, 139, GroupLayout.PREFERRED_SIZE))
								.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 495, GroupLayout.PREFERRED_SIZE))))
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 362, GroupLayout.PREFERRED_SIZE)
					.addGap(27)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(btnBorrarCliente, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
							.addComponent(btnNuevoCliente, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
							.addComponent(btnActualizarCliente, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(66, Short.MAX_VALUE))
		);
		
		table = new JTable();

		model = new DefaultTableModel(
				new Object[][] {
				},
				new String[] { "Cedula", "Nombre", "Direccion", "Telefono", "Correo" }
			);
		
		table.setModel(model);
		
		table.getColumnModel().getColumn(0).setPreferredWidth(86);
		table.getColumnModel().getColumn(1).setPreferredWidth(85);
		table.getColumnModel().getColumn(2).setPreferredWidth(91);
		table.getColumnModel().getColumn(3).setPreferredWidth(93);
		scrollPane.setViewportView(table);
		contentPane.setLayout(gl_contentPane);
		setUndecorated(true);
	}
	
	public void agregarClientesTabla( ArrayList<ClientesDTO> clientes  ) {
		
		model.setRowCount(0);
		
		Object[] fila = new Object[5];
		

		for (int x = 0; x < clientes.size(); x++) {
			fila[0] = clientes.get(x).getCedula() + "";
			fila[1] = clientes.get(x).getNombre() + "";
			fila[2] = clientes.get(x).getDireccion() + "";
			fila[3] = clientes.get(x).getTelefono() + "";
			fila[4] = clientes.get(x).getCorreo() + "";
			
			model.addRow(fila);
		}

	}
	
	
	public ClientesDTO obtenerRegistroSeleccionado() {
		int i = table.getSelectedRow();
		
		if(i >= 0) {
			return new ClientesDTO(
					Integer.parseInt(model.getValueAt(i, 0).toString()),
					model.getValueAt(i, 1).toString(),
					model.getValueAt(i, 2).toString(),
					Integer.parseInt(model.getValueAt(i, 3).toString()),
					model.getValueAt(i, 4).toString()
					);
			
		} else {
			return null;
		}
		
	}
	
	public void borrarFilaSeleccionada() {
		int i = table.getSelectedRow();
		
		if(i >= 0) {
			model.removeRow(i);
		}
	}
	
}
