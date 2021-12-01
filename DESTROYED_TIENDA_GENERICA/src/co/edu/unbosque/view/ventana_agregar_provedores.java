package co.edu.unbosque.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import co.edu.unbosque.controller.Controller;
import co.edu.unbosque.model.DTO.ClientesDTO;
import co.edu.unbosque.model.DTO.ProveedorDTO;

import java.awt.Color;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class ventana_agregar_provedores extends JFrame {

	private JPanel contentPane;
	private JTextField txtNit;
	private JTextField txtNombreProveedor;
	private JTextField txtDireccion;
	private JTextField txtTelefono;
	private JComboBox inpCiudad;
	private JButton btnAgregarProveedor;
	private boolean creando = true;
	
	public static final String GUARDAR_PROVEEDOR = "guardar_proveedor";
	
	/**
	 * Create the frame.
	 */
	public ventana_agregar_provedores( Controller control  ) {
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
		
		JLabel lblNewLabel_1 = new JLabel("PROVEEDORES");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblNewLabel_2 = new JLabel("Nit");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		
		txtNit = new JTextField();
		txtNit.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtNit.setColumns(10);
		
		JLabel lblNewLabel_2_1 = new JLabel("Nombre Proveedor");
		lblNewLabel_2_1.setForeground(Color.WHITE);
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		txtNombreProveedor = new JTextField();
		txtNombreProveedor.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtNombreProveedor.setColumns(10);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Direccion");
		lblNewLabel_2_1_1.setForeground(Color.WHITE);
		lblNewLabel_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		txtDireccion = new JTextField();
		txtDireccion.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtDireccion.setColumns(10);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("Telefono");
		lblNewLabel_2_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_2_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		txtTelefono = new JTextField();
		txtTelefono.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtTelefono.setColumns(10);
		
		JLabel lblNewLabel_2_1_1_1_1 = new JLabel("Ciudad");
		lblNewLabel_2_1_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_2_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		inpCiudad = new JComboBox(new String[] {"","Bogota","Medellin","Cali","Barranquilla" , "Cartagena" , "Ibague" , "Pasto"} );
		
		btnAgregarProveedor = new JButton("Agregar Proveedor");
		btnAgregarProveedor.setBackground(new Color(60, 179, 113));
		btnAgregarProveedor.addActionListener(control);
		btnAgregarProveedor.setActionCommand(GUARDAR_PROVEEDOR);
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(109)
							.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 376, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
							.addComponent(lblNewLabel))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(54)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
								.addComponent(txtNit, GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
								.addComponent(lblNewLabel_2)
								.addComponent(txtNombreProveedor, GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
								.addComponent(lblNewLabel_2_1, GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_2_1_1, GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtDireccion, GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
								.addComponent(lblNewLabel_2_1_1_1, GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtTelefono, GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
								.addComponent(lblNewLabel_2_1_1_1_1, GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE)
								.addComponent(inpCiudad, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
							.addGap(107)
							.addComponent(btnAgregarProveedor, GroupLayout.PREFERRED_SIZE, 183, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel)
					.addContainerGap(527, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(14, Short.MAX_VALUE)
					.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
					.addGap(30)
					.addComponent(lblNewLabel_2)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(txtNit, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
					.addGap(29)
					.addComponent(lblNewLabel_2_1, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(txtNombreProveedor, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
					.addGap(34)
					.addComponent(lblNewLabel_2_1_1, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(txtDireccion, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
					.addGap(32)
					.addComponent(lblNewLabel_2_1_1_1, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(txtTelefono, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
					.addGap(36)
					.addComponent(lblNewLabel_2_1_1_1_1, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
						.addComponent(btnAgregarProveedor, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(inpCiudad, GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE))
					.addGap(64))
		);
		contentPane.setLayout(gl_contentPane);
		setUndecorated(true);
	}
	
	

    public void limpiarFormulario () {
    	txtNit.setText("");
		txtNombreProveedor.setText("");
		txtDireccion.setText("");
		txtTelefono.setText("");
		inpCiudad.setSelectedItem("");
    }
    
    public boolean isCreando() {
		return creando;
	}


	public void accionUI( boolean creando, String txtBoton ) {
		this.creando = creando;
		this.btnAgregarProveedor.setText(txtBoton);
		this.txtNit.setEnabled(creando);
	}
	
	public void setTextFormulario( ProveedorDTO conf ) {
		
		txtNit.setText(conf.getNit());
		txtNombreProveedor.setText(conf.getNombreProveedor());
		txtDireccion.setText(conf.getDireccion());
		txtTelefono.setText(String.valueOf(conf.getTelefono()));
		inpCiudad.setSelectedItem(conf.getCiudad());
		
	}

	public boolean validarFormulario(){

        if(txtNit.getText().equals("")){

        	mostrarMensaje("El campo nit esta vacio");
            return false;
        } else if(  txtNombreProveedor.getText().equals("") ) {
            mostrarMensaje("El campo nombre esta vacio ");
            return false;
        } else if(  txtDireccion.getText().equals("") ) {
            mostrarMensaje("El campo direccion esta vacio ");
            return false;
        } else if( txtTelefono.getText().equals("") ){
            mostrarMensaje("El campo Telefono esta vacio");
            return false;
        } else if( inpCiudad.getSelectedItem().equals("") ){
            mostrarMensaje("El campo Ciudad esta vacio");
            return false;
        }else  { 
            return true;
        }

    }
	
	public ProveedorDTO getDatosProveedor() {
		ProveedorDTO conf = new ProveedorDTO(
				txtNit.getText(),
				txtNombreProveedor.getText(),
				txtDireccion.getText(),
				txtTelefono.getText(),
				inpCiudad.getSelectedItem().toString()
				);
		
		return conf;
	}


    private void mostrarMensaje( String msg ){
        JOptionPane.showMessageDialog(null , msg);
    }

}
