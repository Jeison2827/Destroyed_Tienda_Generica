package co.edu.unbosque.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import co.edu.unbosque.controller.Controller;
import co.edu.unbosque.model.DAO.ClientesDAO;
import co.edu.unbosque.model.DAO.ProductosDAO;
import co.edu.unbosque.model.DAO.ProveedoresDAO;
import co.edu.unbosque.model.DAO.VentasDAO;
import co.edu.unbosque.model.DTO.ClientesDTO;
import co.edu.unbosque.model.DTO.ProductoDTO;
import co.edu.unbosque.model.DTO.ProveedorDTO;
import co.edu.unbosque.model.DTO.VentasDTO;
import co.edu.unbosque.model.DTO.VentasProductoDTO;

import java.awt.Color;

import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class ventana_gestion_ventas extends JFrame {

	private JPanel contentPane;
	private JTextField txtNombreProducto;
	private JTextField txtCantidadProducto;
	private JTextField totalValorProducto;
	private JTextField txtCantidadProductos;
	private JTextField txtSubTotalSinIva;
	private JTextField txtValorTotalConIva;
	private JTextField txtNombreCliente;
	private JComboBox inpCedula;
	private JComboBox inpCodigoProducto;
	
	public static final String AGREGAR_PRODUCTOS_CARRITO = "agregar_productos_carrito";
	public static final String GENERAR_FACTURA = "generar_factura";

	private ClientesDAO clientesDAO = new ClientesDAO();
	private ProductosDAO productosDAO = new ProductosDAO();
	private VentasDAO ventasDAO = new VentasDAO();
	
	private ProductoDTO currentProducto;
	private ClientesDTO currentCliente;
	
	
	
	private VentasDTO ventasDTO;
	private int CodigoVenta;
	private int iva;
	
	/**
	 * Create the frame.
	 */
	public ventana_gestion_ventas( Controller control   ) {
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
		
		JLabel lblNewLabel_1 = new JLabel("GESTION DE VENTAS");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		JLabel lblNewLabel_2 = new JLabel("Cedula Cliente");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		inpCedula = new JComboBox( new DefaultComboBoxModel<>(new String[] { "" }) );
		inpCedula.addActionListener (new ActionListener () {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(inpCedula.getSelectedItem() != null && !inpCedula.getSelectedItem().equals("")  ) {
					
					currentCliente = clientesDAO.getClientePorCedula( Integer.parseInt(inpCedula.getSelectedItem().toString()));

					txtNombreCliente.setText( currentCliente.getNombre() );
				} else {
					txtNombreCliente.setText("");
				}
				
			}
		});
		
		JLabel lblNewLabel_2_1 = new JLabel("Codigo Producto");
		lblNewLabel_2_1.setForeground(Color.WHITE);
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		
		txtNombreProducto = new JTextField();
		txtNombreProducto.setDisabledTextColor(new Color(0, 0, 205));
		txtNombreProducto.setEditable(false);
		txtNombreProducto.setEnabled(false);
		txtNombreProducto.setColumns(10);
		
		inpCodigoProducto = new JComboBox( new DefaultComboBoxModel<>(new String[] { "" }) );
		inpCodigoProducto.addActionListener (new ActionListener () {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(inpCodigoProducto.getSelectedItem() != null && !inpCodigoProducto.getSelectedItem().equals("")  ) {
					
					currentProducto = productosDAO.getProductoPorCodigo( inpCodigoProducto.getSelectedItem().toString());
					
					txtNombreProducto.setText( currentProducto.getNombreProducto());
				} else {
					txtNombreProducto.setText("");
				}
			}
		});
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Nombre Producto");
		lblNewLabel_2_1_1.setForeground(Color.WHITE);
		lblNewLabel_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		JLabel lblNewLabel_3 = new JLabel("Cantidad del Producto");
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		txtCantidadProducto = new JTextField();
		txtCantidadProducto.setColumns(10);
		
		JLabel lblNewLabel_3_1 = new JLabel("Total Valor del Producto");
		lblNewLabel_3_1.setForeground(Color.WHITE);
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		totalValorProducto = new JTextField();
		totalValorProducto.setDisabledTextColor(new Color(0, 0, 255));
		totalValorProducto.setEnabled(false);
		totalValorProducto.setEditable(false);
		totalValorProducto.setColumns(10);
		
		JButton btnAgregarProductoCarrito = new JButton("Agregar Producto al Carrito");
		btnAgregarProductoCarrito.setForeground(new Color(255, 255, 255));
		btnAgregarProductoCarrito.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnAgregarProductoCarrito.setBackground(new Color(0, 139, 139));
		btnAgregarProductoCarrito.addActionListener(control);
		btnAgregarProductoCarrito.setActionCommand(AGREGAR_PRODUCTOS_CARRITO);
		
		JLabel lblNewLabel_4 = new JLabel("Cantidad de Productos");
		lblNewLabel_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		txtCantidadProductos = new JTextField();
		txtCantidadProductos.setDisabledTextColor(new Color(0, 0, 255));
		txtCantidadProductos.setEnabled(false);
		txtCantidadProductos.setEditable(false);
		txtCantidadProductos.setColumns(10);
		
		JLabel lblNewLabel_4_1 = new JLabel("SUBTOTAL (sin IVA)");
		lblNewLabel_4_1.setForeground(Color.WHITE);
		lblNewLabel_4_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		txtSubTotalSinIva = new JTextField();
		txtSubTotalSinIva.setDisabledTextColor(new Color(0, 0, 255));
		txtSubTotalSinIva.setEnabled(false);
		txtSubTotalSinIva.setEditable(false);
		txtSubTotalSinIva.setColumns(10);
		
		JLabel lblNewLabel_4_1_1 = new JLabel("Valor total con IVA");
		lblNewLabel_4_1_1.setForeground(Color.WHITE);
		lblNewLabel_4_1_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		txtValorTotalConIva = new JTextField();
		txtValorTotalConIva.setDisabledTextColor(new Color(0, 0, 255));
		txtValorTotalConIva.setEnabled(false);
		txtValorTotalConIva.setEditable(false);
		txtValorTotalConIva.setColumns(10);
		
		JButton btnGenerarFactura = new JButton("Generar Factura");
		btnGenerarFactura.setForeground(new Color(255, 255, 255));
		btnGenerarFactura.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnGenerarFactura.setBackground(new Color(50, 205, 50));
		btnGenerarFactura.addActionListener(control);
		btnGenerarFactura.setActionCommand(GENERAR_FACTURA);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("Nombre Cliente");
		lblNewLabel_2_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_2_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		txtNombreCliente = new JTextField();
		txtNombreCliente.setDisabledTextColor(new Color(0, 0, 205));
		txtNombreCliente.setEnabled(false);
		txtNombreCliente.setEditable(false);
		txtNombreCliente.setColumns(10);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(120)
							.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 340, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(42)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 154, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED, 226, Short.MAX_VALUE)
									.addComponent(lblNewLabel_2_1_1_1, GroupLayout.PREFERRED_SIZE, 154, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_contentPane.createSequentialGroup()
											.addComponent(inpCedula, GroupLayout.PREFERRED_SIZE, 246, GroupLayout.PREFERRED_SIZE)
											.addGap(18)
											.addComponent(txtNombreCliente, GroupLayout.PREFERRED_SIZE, 261, GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_contentPane.createSequentialGroup()
											.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
												.addComponent(txtCantidadProducto, Alignment.LEADING)
												.addComponent(inpCodigoProducto, Alignment.LEADING, 0, 246, Short.MAX_VALUE)
												.addComponent(lblNewLabel_2_1, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 154, GroupLayout.PREFERRED_SIZE)
												.addComponent(lblNewLabel_3, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 143, GroupLayout.PREFERRED_SIZE))
											.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
												.addGroup(gl_contentPane.createSequentialGroup()
													.addGap(10)
													.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
														.addComponent(lblNewLabel_3_1, GroupLayout.PREFERRED_SIZE, 143, GroupLayout.PREFERRED_SIZE)
														.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
															.addComponent(txtNombreProducto)
															.addGroup(gl_contentPane.createSequentialGroup()
																.addComponent(lblNewLabel_2_1_1, GroupLayout.PREFERRED_SIZE, 154, GroupLayout.PREFERRED_SIZE)
																.addGap(107)))
														.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
															.addComponent(lblNewLabel_4_1_1, GroupLayout.PREFERRED_SIZE, 128, GroupLayout.PREFERRED_SIZE)
															.addComponent(btnAgregarProductoCarrito, GroupLayout.PREFERRED_SIZE, 192, GroupLayout.PREFERRED_SIZE)
															.addComponent(txtValorTotalConIva, GroupLayout.PREFERRED_SIZE, 128, GroupLayout.PREFERRED_SIZE)
															.addComponent(btnGenerarFactura, GroupLayout.PREFERRED_SIZE, 192, GroupLayout.PREFERRED_SIZE))))
												.addGroup(gl_contentPane.createSequentialGroup()
													.addGap(18)
													.addComponent(totalValorProducto))))
										.addGroup(gl_contentPane.createSequentialGroup()
											.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
												.addComponent(txtCantidadProductos, Alignment.LEADING)
												.addComponent(lblNewLabel_4, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
											.addGap(18)
											.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
												.addComponent(txtSubTotalSinIva)
												.addComponent(lblNewLabel_4_1, GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE))))
									.addPreferredGap(ComponentPlacement.RELATED, 9, Short.MAX_VALUE)))))
					.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_2_1_1_1, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(txtNombreCliente, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
						.addComponent(inpCedula, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
					.addGap(32)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_2_1, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_2_1_1, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(inpCodigoProducto, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtNombreProducto, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
					.addGap(30)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_3)
						.addComponent(lblNewLabel_3_1, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtCantidadProducto, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
						.addComponent(totalValorProducto, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnAgregarProductoCarrito, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
					.addGap(33)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_4)
						.addComponent(lblNewLabel_4_1, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_4_1_1, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(txtCantidadProductos, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtSubTotalSinIva, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtValorTotalConIva, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addComponent(btnGenerarFactura, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(20, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
		setUndecorated(true);
	}
	
	
	/*public void setTextFormulario( ClientesDTO conf ) {
		
		txtCedula.setText(String.valueOf(conf.getCedula()));
		txtNombre.setText(conf.getNombre());
		txtDireccion.setText(conf.getDireccion());
		txtTelefono.setText(String.valueOf(conf.getTelefono()));
		txtCorreo.setText(conf.getCorreo());
		
	}*/

	
	public void iniciarVenta( int iva, int codigoVenta, ArrayList<ClientesDTO> clientes, ArrayList<ProductoDTO> productos  ) {
		
		 this.iva = iva;
		 this.CodigoVenta = codigoVenta;
		 this.inpCedula.setEnabled(true);
		 ventasDTO = new VentasDTO();
		 
		 this.inpCedula.removeAllItems();
		 this.inpCodigoProducto.removeAllItems();
		 
		 this.clientesDAO.setClientesDTO(clientes);
		 this.productosDAO.setProductosDTO(productos);
		 
		 this.inpCedula.addItem("");
		 this.inpCodigoProducto.addItem("");
		 
		 for(ClientesDTO c: clientes) {
			 this.inpCedula.addItem(String.valueOf(c.getCedula()));
		 }
		 
		 for(ProductoDTO p: productos) {
			 this.inpCodigoProducto.addItem(p.getCodigoProducto());
		 }
		
		
	}
	
	
	public void siguienteProducto() {
		
		 this.inpCedula.setEnabled(false);
		 
		 ArrayList<VentasProductoDTO> productos = new ArrayList<>();
			
			
			
			
			productos.add( new VentasProductoDTO( 
								this.CodigoVenta, 
								inpCodigoProducto.getSelectedItem().toString(), 
								txtNombreProducto.getText(), 
								currentProducto.getPrecioVenta(), 
								Integer.parseInt(txtCantidadProducto.getText()),
								Integer.parseInt(txtCantidadProducto.getText()) * currentProducto.getPrecioVenta(),
								getValorConIva( Integer.parseInt(txtCantidadProducto.getText()) ,  currentProducto.getPrecioVenta() )
							)  
						);
			
			totalValorProducto.setText( String.valueOf( Integer.parseInt(txtCantidadProducto.getText()) * currentProducto.getPrecioVenta()  ) );
	}
	
	
	
	public boolean validarFormulario(){

        if(inpCedula.getSelectedItem().equals("")  ){
        	mostrarMensaje("El campo Cedula esta vacio");
            return false;
        } else if(inpCodigoProducto.getSelectedItem().equals("")  ){
        	mostrarMensaje("El campo Codigo Producto esta vacio");
            return false;
        }   else if( txtCantidadProducto.getText().equals("") || !verificarNumero( txtCantidadProducto.getText() ) ){
            mostrarMensaje("El campo Telefono es invalido, solo es valido numeros");
            return false;
        } else  { 
            return true;
        }

    }
	
	public VentasDTO getDatoVenta() {
		
		
		
		/*VentasDTO conf = new VentasDTO(
				this.CodigoVenta,
				Integer.parseInt(inpCedula.getSelectedItem().toString()),
				productos,
				Integer.parseInt(txtTelefono.getText()),
				txtCorreo.getText()
				);
		
		int codigoVenta, int cedulaCliente, ArrayList<VentasProductoDTO> productos,
		int totalCantidadProductos, float valorTotalSinIva, float valorIva, float valorTotalConIva*/
		return null;
	}

	private float getValorConIva(  int cantidadProducto, float precioVenta   ) {
		float iva = (Integer.parseInt(txtCantidadProducto.getText()) * currentProducto.getPrecioVenta()) * this.iva;
		
		return (Integer.parseInt(txtCantidadProducto.getText()) * currentProducto.getPrecioVenta()) + iva;
	}

    public void limpiarFormulario () {
    	inpCedula.setSelectedItem("");
		txtNombreCliente.setText("");
		inpCodigoProducto.setSelectedItem("");
		txtNombreProducto.setText("");
		txtCantidadProducto.setText("");
		txtCantidadProductos.setText("");
		txtSubTotalSinIva.setText("");
		txtValorTotalConIva.setText("");
    }
	
    private boolean verificarNumero (String text) {
        try {
            Integer.parseInt(text);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    
    private void mostrarMensaje( String msg ){
        JOptionPane.showMessageDialog(null , msg);
    }
	
	

}
