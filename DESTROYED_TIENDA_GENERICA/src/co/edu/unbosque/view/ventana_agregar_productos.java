package co.edu.unbosque.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import co.edu.unbosque.controller.Controller;
import co.edu.unbosque.model.DTO.ProductoDTO;
import co.edu.unbosque.model.DTO.ProveedorDTO;

import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class ventana_agregar_productos extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;

	private JLabel lblNewLabel_3;

	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;

	private JLabel lblNewLabel_6;
	private JTextField txtCodigoProducto;
	private JTextField txtNombrePorducto;
	private JComboBox inpProveedor;
	private JTextField txtPrecioCompra;
	private JTextField txtPrecioVenta;
	private JButton btnAgregarProducto;

	private boolean creando = true;
	
	public static final String GUARDAR_PRODUCTO = "guardar_producto";
	
	
	/**
	 * Create the frame.
	 */
	public ventana_agregar_productos( Controller control  ) {
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
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		lblNewLabel_1 = new JLabel("Productos");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		
		lblNewLabel_2 = new JLabel("Codigo Producto");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		
		txtCodigoProducto = new JTextField();
		txtCodigoProducto.setColumns(10);
		
		txtNombrePorducto = new JTextField();
		txtNombrePorducto.setColumns(10);
		
		lblNewLabel_3 = new JLabel("Nombre de Producto");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		inpProveedor = new JComboBox(new DefaultComboBoxModel<>(new String[] { "" }));
		
		lblNewLabel_4 = new JLabel("Nit Proveedor");
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		lblNewLabel_5 = new JLabel("Precio de compra");
		lblNewLabel_5.setForeground(Color.WHITE);
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		txtPrecioCompra = new JTextField();
		txtPrecioCompra.setColumns(10);
		
		lblNewLabel_6 = new JLabel("Precio de Venta");
		lblNewLabel_6.setForeground(Color.WHITE);
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		txtPrecioVenta = new JTextField();
		txtPrecioVenta.setColumns(10);
		
		btnAgregarProducto = new JButton("Guardar producto");
		btnAgregarProducto.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnAgregarProducto.setBackground(new Color(72, 209, 204));
		btnAgregarProducto.addActionListener(control);
		btnAgregarProducto.setActionCommand(GUARDAR_PRODUCTO);
		
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(103, Short.MAX_VALUE)
					.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 382, GroupLayout.PREFERRED_SIZE)
					.addGap(68)
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
					.addGap(18))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(71)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
							.addComponent(lblNewLabel_5, GroupLayout.PREFERRED_SIZE, 123, GroupLayout.PREFERRED_SIZE)
							.addComponent(lblNewLabel_4, GroupLayout.PREFERRED_SIZE, 139, GroupLayout.PREFERRED_SIZE)
							.addComponent(txtCodigoProducto)
							.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 139, GroupLayout.PREFERRED_SIZE)
							.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 123, GroupLayout.PREFERRED_SIZE)
							.addComponent(txtNombrePorducto, GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
							.addComponent(inpProveedor, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(txtPrecioCompra))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(txtPrecioVenta, GroupLayout.PREFERRED_SIZE, 261, GroupLayout.PREFERRED_SIZE)
							.addGap(76)
							.addComponent(btnAgregarProducto, GroupLayout.PREFERRED_SIZE, 160, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblNewLabel_6, GroupLayout.PREFERRED_SIZE, 123, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(34, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE))
					.addGap(23)
					.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(txtCodigoProducto, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
					.addGap(34)
					.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(txtNombrePorducto, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
					.addGap(32)
					.addComponent(lblNewLabel_4, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(inpProveedor, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addGap(30)
					.addComponent(lblNewLabel_5, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(txtPrecioCompra, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
					.addGap(28)
					.addComponent(lblNewLabel_6, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtPrecioVenta, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnAgregarProducto, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(38, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
		setUndecorated(true);
		
		
	}
	

	 public void limpiarFormulario () {
		 txtCodigoProducto.setText("");
		 txtNombrePorducto.setText("");
		 txtPrecioVenta.setText("");
		 txtPrecioCompra.setText("");
		 inpProveedor.setSelectedItem("");
	 }
	 
	 public void llenarInputNit( ArrayList<ProveedorDTO> proveedores ) {
		 
		 this.inpProveedor.removeAllItems();
		 
		 this.inpProveedor.addItem("");
		 
		 for(ProveedorDTO p: proveedores) {
			 this.inpProveedor.addItem(p.getNit().toString());
		 }

	 }
	    
    public boolean isCreando() {
		return creando;
	}


	public void accionUI( boolean creando, String txtBoton ) {
		this.creando = creando;
		this.btnAgregarProducto.setText(txtBoton);
		this.txtCodigoProducto.setEnabled(creando);
	}
	
	public void setTextFormulario( ProductoDTO conf ) {
		
		txtCodigoProducto.setText(conf.getCodigoProducto());
		txtNombrePorducto.setText(conf.getNombreProducto());
		txtPrecioVenta.setText(String.valueOf(conf.getPrecioVenta()));
		txtPrecioCompra.setText(String.valueOf(conf.getPrecioCompra()));
		inpProveedor.setSelectedItem(conf.getNitProveedor());
		
	}

	public boolean validarFormulario(){

        if(txtCodigoProducto.getText().equals("")){

        	mostrarMensaje("El campo codigo producto esta vacio");
            return false;
        } else if(  txtNombrePorducto.getText().equals("") ) {
            mostrarMensaje("El campo nombre esta vacio ");
            return false;
        } else if(  txtPrecioVenta.getText().equals("")  || !verificarNumero( txtPrecioVenta.getText() ) ) {
        	 mostrarMensaje("El campo Precio venta es invalido, solo es valido numeros");
            return false;
        } else if( txtPrecioCompra.getText().equals("") || !verificarNumero( txtPrecioCompra.getText() )  ){
        	 mostrarMensaje("El campo Precio Compra es invalido, solo es valido numeros");
            return false;
        } else if( inpProveedor.getSelectedItem().equals("") ){
            mostrarMensaje("El campo Provedor esta vacio");
            return false;
        }else  { 
            return true;
        }

    }
	
	public ProductoDTO getDatosProducto() {
		ProductoDTO conf = new ProductoDTO(
				txtCodigoProducto.getText(),
				txtNombrePorducto.getText(),
				inpProveedor.getSelectedItem().toString(),
				Integer.parseInt(txtPrecioCompra.getText()),
				Integer.parseInt(txtPrecioVenta.getText())
				);
		return conf;
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
