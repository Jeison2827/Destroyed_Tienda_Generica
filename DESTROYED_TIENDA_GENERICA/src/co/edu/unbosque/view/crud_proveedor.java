package co.edu.unbosque.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import co.edu.unbosque.controller.Controller;
import co.edu.unbosque.model.DTO.ClientesDTO;
import co.edu.unbosque.model.DTO.ProveedorDTO;

public class crud_proveedor extends JFrame {

	private JPanel contentPane;
	private JTable table;
	
	private DefaultTableModel model;
	public static final String VENTANTA_AGREGAR_PROVEEDOR = "ventanta_agregar_proveedor";
	public static final String VENTANTA_ACTUALIZAR_PROVEEDOR = "ventanta_actualizar_proveedor";
	public static final String VENTANTA_BORRAR_PROVEEDOR = "ventanta_borrar_proveedor";
	
	/**
	 * Create the frame.
	 */
	public crud_proveedor( Controller controller  ) {
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
		
		JLabel lblNewLabel_1 = new JLabel("CRUD PROVEEDORES");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		
		JScrollPane scrollPane = new JScrollPane();
		
		JButton btnBorrarProveedor = new JButton("Borrar");
		btnBorrarProveedor.setBackground(new Color(0, 128, 128));
		btnBorrarProveedor.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnBorrarProveedor.setForeground(new Color(255, 255, 255));
		btnBorrarProveedor.addActionListener(controller);
		btnBorrarProveedor.setActionCommand(VENTANTA_BORRAR_PROVEEDOR);
		
		
		JButton btnActualizarProveedor = new JButton("Actualizar");
		btnActualizarProveedor.setBackground(new Color(50, 205, 50));
		btnActualizarProveedor.setForeground(new Color(255, 255, 255));
		btnActualizarProveedor.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnActualizarProveedor.addActionListener(controller);
		btnActualizarProveedor.setActionCommand(VENTANTA_ACTUALIZAR_PROVEEDOR);
		
		
		JButton btnNuevoProveedor = new JButton("Nuevo Proveedor");
		btnNuevoProveedor.setBackground(new Color(0, 128, 128));
		btnNuevoProveedor.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNuevoProveedor.setForeground(new Color(255, 255, 255));
		btnNuevoProveedor.addActionListener(controller);
		btnNuevoProveedor.setActionCommand(VENTANTA_AGREGAR_PROVEEDOR);
		
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
									.addComponent(btnBorrarProveedor, GroupLayout.PREFERRED_SIZE, 139, GroupLayout.PREFERRED_SIZE)
									.addGap(26)
									.addComponent(btnActualizarProveedor, GroupLayout.PREFERRED_SIZE, 139, GroupLayout.PREFERRED_SIZE)
									.addGap(31)
									.addComponent(btnNuevoProveedor, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
						.addComponent(btnBorrarProveedor, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
							.addComponent(btnNuevoProveedor, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
							.addComponent(btnActualizarProveedor, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(66, Short.MAX_VALUE))
		);
		
		table = new JTable();
		
		model = new DefaultTableModel(
				new Object[][] {
				},
				new String[] { "NIT", "Nombre Proveedor", "Direccion", "Telefono", "Ciudad" }
			);
		
		table.setModel(model);
		
		table.getColumnModel().getColumn(0).setPreferredWidth(86);
		table.getColumnModel().getColumn(1).setPreferredWidth(112);
		table.getColumnModel().getColumn(2).setPreferredWidth(91);
		table.getColumnModel().getColumn(3).setPreferredWidth(93);
		scrollPane.setViewportView(table);
		contentPane.setLayout(gl_contentPane);
		setUndecorated(true);
	}

	
	public void agregarProveedoresTabla( ArrayList<ProveedorDTO> proveedores  ) {
		
		model.setRowCount(0);
		
		Object[] fila = new Object[5];
		

		for (int x = 0; x < proveedores.size(); x++) {
			fila[0] = proveedores.get(x).getNit() + "";
			fila[1] = proveedores.get(x).getNombreProveedor() + "";
			fila[2] = proveedores.get(x).getDireccion() + "";
			fila[3] = proveedores.get(x).getTelefono() + "";
			fila[4] = proveedores.get(x).getCiudad() + "";
			
			model.addRow(fila);
		}

	}
	
	
	public ProveedorDTO obtenerRegistroSeleccionado() {
		int i = table.getSelectedRow();
		
		if(i >= 0) {
			return new ProveedorDTO(
					model.getValueAt(i, 0).toString(),
					model.getValueAt(i, 1).toString(),
					model.getValueAt(i, 2).toString(),
					model.getValueAt(i, 3).toString(),
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
