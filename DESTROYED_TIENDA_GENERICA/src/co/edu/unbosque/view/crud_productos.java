package co.edu.unbosque.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import co.edu.unbosque.controller.Controller;
import co.edu.unbosque.model.DTO.ProductoDTO;
import co.edu.unbosque.model.DTO.ProveedorDTO;

import javax.swing.JButton;

public class crud_productos extends JFrame {

	private JPanel contentPane;
	private JTable table;

	private DefaultTableModel model;
	public static final String VENTANTA_AGREGAR_PRODUCTO = "ventanta_agregar_producto";
	public static final String VENTANTA_ACTUALIZAR_PRODUCTO = "ventanta_actualizar_producto";
	public static final String VENTANTA_BORRAR_PRODUCTO = "ventanta_borrar_producto";
	
	/**
	 * Create the frame.
	 */
	public crud_productos( Controller controller ) {
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
		
		JLabel lblNewLabel_1 = new JLabel("CRUD PRODUCTOS");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		
		JScrollPane scrollPane = new JScrollPane();
		
		JButton btnBorrarProducto = new JButton("Borrar");
		btnBorrarProducto.setBackground(new Color(0, 128, 128));
		btnBorrarProducto.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnBorrarProducto.setForeground(new Color(255, 255, 255));
		btnBorrarProducto.addActionListener(controller);
		btnBorrarProducto.setActionCommand(VENTANTA_BORRAR_PRODUCTO);
		
		
		JButton btnActualizarProducto = new JButton("Actualizar");
		btnActualizarProducto.setBackground(new Color(50, 205, 50));
		btnActualizarProducto.setForeground(new Color(255, 255, 255));
		btnActualizarProducto.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnActualizarProducto.addActionListener(controller);
		btnActualizarProducto.setActionCommand(VENTANTA_ACTUALIZAR_PRODUCTO);
		
		
		JButton btnNuevoProducto = new JButton("Nuevo Producto");
		btnNuevoProducto.setBackground(new Color(0, 128, 128));
		btnNuevoProducto.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNuevoProducto.setForeground(new Color(255, 255, 255));
		btnNuevoProducto.addActionListener(controller);
		btnNuevoProducto.setActionCommand(VENTANTA_AGREGAR_PRODUCTO);
		
		
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
									.addComponent(btnBorrarProducto, GroupLayout.PREFERRED_SIZE, 139, GroupLayout.PREFERRED_SIZE)
									.addGap(39)
									.addComponent(btnActualizarProducto, GroupLayout.PREFERRED_SIZE, 139, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(btnNuevoProducto, GroupLayout.PREFERRED_SIZE, 139, GroupLayout.PREFERRED_SIZE))
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
						.addComponent(btnBorrarProducto, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
							.addComponent(btnNuevoProducto, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
							.addComponent(btnActualizarProducto, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(66, Short.MAX_VALUE))
		);
		
		table = new JTable();
		
		model = new DefaultTableModel(
				new Object[][] {
				},
				new String[] { "Cod Producto", "Producto", "NIT Proveedor", "Precio compra", "Precio venta" }
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
	
	
	public void agregarProductosTabla( ArrayList<ProductoDTO> productos  ) {
		
		model.setRowCount(0);
		
		Object[] fila = new Object[5];
		

		for (int x = 0; x < productos.size(); x++) {
			fila[0] = productos.get(x).getCodigoProducto() + "";
			fila[1] = productos.get(x).getNombreProducto() + "";
			fila[2] = productos.get(x).getNitProveedor() + "";
			fila[3] = productos.get(x).getPrecioCompra() + "";
			fila[4] = productos.get(x).getPrecioVenta() + "";
			
			model.addRow(fila);
		}

	}
	
	
	public ProductoDTO obtenerRegistroSeleccionado() {
		int i = table.getSelectedRow();
		
		if(i >= 0) {
			return new ProductoDTO(
					model.getValueAt(i, 0).toString(),
					model.getValueAt(i, 1).toString(),
					model.getValueAt(i, 2).toString(),
					Float.parseFloat(model.getValueAt(i, 3).toString()),
					Float.parseFloat(model.getValueAt(i, 4).toString())
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
