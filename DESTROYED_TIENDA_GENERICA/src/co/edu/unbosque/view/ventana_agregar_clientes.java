package co.edu.unbosque.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import co.edu.unbosque.controller.Controller;
import co.edu.unbosque.model.DTO.ClientesDTO;
import co.edu.unbosque.model.DTO.configuracionDTO;

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
import javax.swing.JButton;

public class ventana_agregar_clientes extends JFrame {

	private JPanel contentPane;
	private JTextField txtCedula;
	private JTextField txtNombre;
	private JTextField txtDireccion;
	private JTextField txtTelefono;
	private JTextField txtCorreo;
	private JButton btnGuardarCliente;
	private boolean creando = true;
	
	public static final String GUARDAR_CLIENTE = "guardar_cliente";
	

	/**
	 * Create the frame.
	 */
	public ventana_agregar_clientes( Controller control   ) {
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
		
		JLabel lblNewLabel_1 = new JLabel("CLIENTES");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		JLabel lblNewLabel_2 = new JLabel("Cedula");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		
		txtCedula = new JTextField();
		txtCedula.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtCedula.setColumns(10);
		
		JLabel lblNewLabel_2_1 = new JLabel("Nombre");
		lblNewLabel_2_1.setForeground(Color.WHITE);
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		txtNombre = new JTextField();
		txtNombre.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtNombre.setColumns(10);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Direcci\u00F3n");
		lblNewLabel_2_1_1.setForeground(Color.WHITE);
		lblNewLabel_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		txtDireccion = new JTextField();
		txtDireccion.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtDireccion.setColumns(10);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("Telefono");
		lblNewLabel_2_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_2_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		txtTelefono = new JTextField();
		txtTelefono.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtTelefono.setColumns(10);
		
		JLabel lblNewLabel_2_1_1_1_1 = new JLabel("Correo Electronico");
		lblNewLabel_2_1_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_2_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		txtCorreo = new JTextField();
		txtCorreo.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtCorreo.setColumns(10);
		
		btnGuardarCliente = new JButton("Guardar Cliente");
		btnGuardarCliente.setBackground(new Color(0, 139, 139));
		btnGuardarCliente.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnGuardarCliente.addActionListener(control);
		btnGuardarCliente.setActionCommand( GUARDAR_CLIENTE );
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(116)
							.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 368, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
							.addComponent(lblNewLabel))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(53)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
								.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 157, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_2_1, GroupLayout.PREFERRED_SIZE, 157, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_2_1_1, GroupLayout.PREFERRED_SIZE, 157, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtCedula, GroupLayout.PREFERRED_SIZE, 286, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtDireccion)
								.addComponent(txtNombre)
								.addComponent(btnGuardarCliente, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 161, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(txtTelefono, GroupLayout.PREFERRED_SIZE, 239, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblNewLabel_2_1_1_1, GroupLayout.PREFERRED_SIZE, 157, GroupLayout.PREFERRED_SIZE))
									.addGap(18)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(lblNewLabel_2_1_1_1_1, GroupLayout.PREFERRED_SIZE, 157, GroupLayout.PREFERRED_SIZE)
										.addComponent(txtCorreo, GroupLayout.PREFERRED_SIZE, 247, GroupLayout.PREFERRED_SIZE))))
							.addGap(35)))
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel)
					.addContainerGap(527, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(16, Short.MAX_VALUE)
					.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
					.addGap(20)
					.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(txtCedula, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
					.addGap(27)
					.addComponent(lblNewLabel_2_1, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(txtNombre, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
					.addGap(32)
					.addComponent(lblNewLabel_2_1_1, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(txtDireccion, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
					.addGap(27)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_2_1_1_1, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_2_1_1_1_1, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(txtCorreo, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtTelefono, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
					.addGap(41)
					.addComponent(btnGuardarCliente, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
					.addGap(40))
		);
		contentPane.setLayout(gl_contentPane);
		setUndecorated(true);
	}

	
	public boolean isCreando() {
		return creando;
	}


	public void accionUI( boolean creando, String txtBoton ) {
		this.creando = creando;
		this.btnGuardarCliente.setText(txtBoton);
		this.txtCedula.setEnabled(creando);
	}
	
	public void setTextFormulario( ClientesDTO conf ) {
		
		txtCedula.setText(String.valueOf(conf.getCedula()));
		txtNombre.setText(conf.getNombre());
		txtDireccion.setText(conf.getDireccion());
		txtTelefono.setText(String.valueOf(conf.getTelefono()));
		txtCorreo.setText(conf.getCorreo());
		
	}

	public boolean validarFormulario(){

        if(txtCedula.getText().equals("") || !verificarNumero( txtCedula.getText() )  ){

        	mostrarMensaje("El campo Cedula es invalido, solo es valido numeros");
            return false;
        } else if(  txtNombre.getText().equals("") ) {
            mostrarMensaje("El campo nombre esta vacio ");
            return false;
        } else if(  txtDireccion.getText().equals("") ) {
            mostrarMensaje("El campo direccion esta vacio ");
            return false;
        } else if( txtTelefono.getText().equals("") || !verificarNumero( txtTelefono.getText() ) ){
            mostrarMensaje("El campo Telefono es invalido, solo es valido numeros");
            return false;
        } else if( txtCorreo.getText().equals("") ){
            mostrarMensaje("El campo Correo esta vacio");
            return false;
        }else  { 
            return true;
        }

    }
	
	public ClientesDTO getDatosCliente() {
		ClientesDTO conf = new ClientesDTO(
				Integer.parseInt(txtCedula.getText()),
				txtNombre.getText(),
				txtDireccion.getText(),
				Integer.parseInt(txtTelefono.getText()),
				txtCorreo.getText()
				);
		
		return conf;
	}


    public void limpiarFormulario () {
    	txtCedula.setText("");
		txtNombre.setText("");
		txtDireccion.setText("");
		txtTelefono.setText("");
		txtCorreo.setText("");
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
