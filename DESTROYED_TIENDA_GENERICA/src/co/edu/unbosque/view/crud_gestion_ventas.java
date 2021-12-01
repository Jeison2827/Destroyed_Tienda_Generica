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
import co.edu.unbosque.model.DTO.ProductoDTO;
import co.edu.unbosque.model.DTO.VentasDTO;

public class crud_gestion_ventas extends JFrame {

	private JPanel contentPane;
	private JTable table;
	
	private DefaultTableModel model;
	public static final String VENTANTA_NUEVA_VENTA = "ventanta_nueva_venta";
	public static final String VENTANTA_BUSCAR_VENTA_CLIENTE = "ventanta_buscar_venta_cliente";
	
	/**
	 * Create the frame.
	 */
	public crud_gestion_ventas(Controller controller) {
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
		
		JLabel lblNewLabel_1 = new JLabel("CRUD GESTION VENTAS");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		
		JScrollPane scrollPane = new JScrollPane();
		
		JButton btnBuscarVentaCliente = new JButton("Buscar Venta Cliente");
		btnBuscarVentaCliente.setBackground(new Color(0, 128, 128));
		btnBuscarVentaCliente.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnBuscarVentaCliente.setForeground(new Color(255, 255, 255));
		btnBuscarVentaCliente.addActionListener(controller);
		btnBuscarVentaCliente.setActionCommand(VENTANTA_BUSCAR_VENTA_CLIENTE);
		
		
		JButton btnNuevaVenta = new JButton("Nueva Venta");
		btnNuevaVenta.setBackground(new Color(50, 205, 50));
		btnNuevaVenta.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNuevaVenta.setForeground(new Color(255, 255, 255));
		btnNuevaVenta.addActionListener(controller);
		btnNuevaVenta.setActionCommand(VENTANTA_NUEVA_VENTA);
		
		
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
									.addComponent(btnBuscarVentaCliente, GroupLayout.PREFERRED_SIZE, 160, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(btnNuevaVenta, GroupLayout.PREFERRED_SIZE, 139, GroupLayout.PREFERRED_SIZE))
								.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 495, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED, 44, Short.MAX_VALUE)))
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
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnBuscarVentaCliente, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNuevaVenta, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(66, Short.MAX_VALUE))
		);
		
		table = new JTable();
		
		model = new DefaultTableModel(
				new Object[][] {
				},
				new String[] { "Cod Venta", "C.C", "Total Productos", "Valor Venta sin IVA",  "valor de IVA", "Valor total IVA" }
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
	
	
	public void agregarVentasTabla( ArrayList<VentasDTO> ventas  ) {
		
		model.setRowCount(0);
		
		Object[] fila = new Object[6];
		

		for (int x = 0; x < ventas.size(); x++) {
			fila[0] = ventas.get(x).getCodigoVenta() + "";
			fila[1] = ventas.get(x).getCedulaCliente() + "";
			fila[2] = ventas.get(x).getTotalCantidadProductos() + "";
			fila[3] = ventas.get(x).getValorTotalSinIva() + "";
			fila[4] = ventas.get(x).getValorIva() + "";
			fila[5] = ventas.get(x).getValorTotalConIva() + "";
			
			model.addRow(fila);
		}

	}
	
	
	public int obtenerRegistroSeleccionado() {
		int i = table.getSelectedRow();
		
		if(i >= 0) {
			
			return Integer.parseInt(model.getValueAt(i, 0).toString());

		} else {
			return -1;
		}
		
	}
	
	
	public void borrarFilaSeleccionada() {
		int i = table.getSelectedRow();
		
		if(i >= 0) {
			model.removeRow(i);
		}
	}

}
