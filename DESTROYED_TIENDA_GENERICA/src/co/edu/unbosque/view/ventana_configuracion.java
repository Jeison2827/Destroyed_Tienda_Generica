package co.edu.unbosque.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import co.edu.unbosque.controller.Controller;
import co.edu.unbosque.model.DAO.ConfiguracionDAO;
import co.edu.unbosque.model.DTO.configuracionDTO;

import java.awt.Color;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.text.Normalizer.Form;
import java.util.ArrayList;

import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.BevelBorder;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ventana_configuracion extends JFrame {

	private JPanel contentPane;
	private JTextField txtNombreTienda;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_1;
	private JTextField txtTipoComercio;
	private JLabel lblNewLabel_3;
	private JTextField txtNitTienda;
	private JLabel lblNewLabel_4;
	private JTextField txtValorIva;
	private JTextField txtInteres;
	private JLabel lblNewLabel_5;
	private JComboBox inpBanco;
	private JComboBox inpCiudades;
	private JTextField txtCtaCorriente;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_7;
	private JTextField txtNombreGerente;

	
	public static final String GUARDAR_CONFIGURACION = "guardar_configuracion";
	
	/**
	 * Create the frame.
	 */
	public ventana_configuracion( Controller control  ) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(350, 100, 612, 567);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(70, 130, 180));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblX = new JLabel("X");
		lblX.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				dispose();
			}
		});
		lblX.setForeground(new Color(255, 255, 255));
		lblX.setHorizontalAlignment(SwingConstants.CENTER);
		lblX.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		txtNombreTienda = new JTextField();
		txtNombreTienda.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtNombreTienda.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		txtNombreTienda.setColumns(10);
		
		lblNewLabel = new JLabel("CONFIGURACION");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		lblNewLabel_2 = new JLabel("Nombre Tienda");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		
		lblNewLabel_1 = new JLabel("Tipo Comercio");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		txtTipoComercio = new JTextField();
		txtTipoComercio.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtTipoComercio.setColumns(10);
		txtTipoComercio.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		
		lblNewLabel_3 = new JLabel("Nit tienda");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		txtNitTienda = new JTextField();
		txtNitTienda.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtNitTienda.setColumns(10);
		txtNitTienda.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		
		lblNewLabel_4 = new JLabel("Ciudad");
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		inpCiudades = new JComboBox( new String[] {"","Bogota","Medellin","Cali","Barranquilla" , "Cartagena" , "Ibague" , "Pasto"} );
		inpCiudades.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		JLabel lblNewLabel_1_1 = new JLabel("Valor Iva");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		txtValorIva = new JTextField();
		txtValorIva.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtValorIva.setColumns(10);
		txtValorIva.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Tasa de Inter\u00E9s");
		lblNewLabel_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		txtInteres = new JTextField();
		txtInteres.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtInteres.setColumns(10);
		txtInteres.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		
		lblNewLabel_5 = new JLabel("Banco");
		lblNewLabel_5.setForeground(Color.WHITE);
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		inpBanco = new JComboBox( new String[] {"","Bancolombia","Davivienda","Caja Social","Av villas" , "Banco de Bogota" } );
		inpBanco.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		txtCtaCorriente = new JTextField();
		txtCtaCorriente.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtCtaCorriente.setColumns(10);
		txtCtaCorriente.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		
		lblNewLabel_6 = new JLabel("No. cuenta corriente");
		lblNewLabel_6.setForeground(Color.WHITE);
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		lblNewLabel_7 = new JLabel("Nombre Gerente");
		lblNewLabel_7.setForeground(Color.WHITE);
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		txtNombreGerente = new JTextField();
		txtNombreGerente.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtNombreGerente.setColumns(10);
		txtNombreGerente.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		
		JButton btnGuardarConfiguracion = new JButton("Guardar");
		btnGuardarConfiguracion.setForeground(new Color(0, 0, 0));
		btnGuardarConfiguracion.setBackground(new Color(152, 251, 152));
		btnGuardarConfiguracion.setActionCommand(GUARDAR_CONFIGURACION);
		btnGuardarConfiguracion.addActionListener(control);
		
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(145)
							.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 320, GroupLayout.PREFERRED_SIZE)
							.addGap(97)
							.addComponent(lblX, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(144)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtNombreTienda, GroupLayout.PREFERRED_SIZE, 301, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(58)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
									.addComponent(inpCiudades, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(txtTipoComercio, GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
									.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE)
									.addComponent(txtInteres, GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
									.addComponent(lblNewLabel_4, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE))
								.addComponent(lblNewLabel_7, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtNombreGerente, GroupLayout.PREFERRED_SIZE, 194, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_1_1_1, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE))
							.addGap(73)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_6, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtValorIva, GroupLayout.PREFERRED_SIZE, 194, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_1_1, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE)
								.addComponent(inpBanco, GroupLayout.PREFERRED_SIZE, 194, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_5, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtNitTienda, GroupLayout.PREFERRED_SIZE, 194, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtCtaCorriente, GroupLayout.PREFERRED_SIZE, 194, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnGuardarConfiguracion, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE))))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
					.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(txtNombreTienda, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
					.addGap(28)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtTipoComercio, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtNitTienda, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
					.addGap(28)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblNewLabel_1_1, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_4, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(txtValorIva, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
						.addComponent(inpCiudades, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE))
					.addGap(20)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblNewLabel_5, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_1_1_1, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(txtInteres, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
						.addComponent(inpBanco, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE))
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(17)
							.addComponent(lblNewLabel_6, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(txtCtaCorriente, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(18)
							.addComponent(lblNewLabel_7, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(txtNombreGerente, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)))
					.addGap(18)
					.addComponent(btnGuardarConfiguracion, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(lblX, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(526, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
		
		setUndecorated(true);
	}
	
	
	
	
   public JTextField getTxtNombreTienda() {
		return txtNombreTienda;
	}

	public JTextField getTxtTipoComercio() {
		return txtTipoComercio;
	}

	public JTextField getTxtNitTienda() {
		return txtNitTienda;
	}

	public JTextField getTxtValorIva() {
		return txtValorIva;
	}

	public JTextField getTxtInteres() {
		return txtInteres;
	}

	public JComboBox getInpBanco() {
		return inpBanco;
	}

	public JTextField getTxtCtaCorriente() {
		return txtCtaCorriente;
	}

	public JTextField getTxtNombreGerente() {
		return txtNombreGerente;
	}


	public void setTextFormulario( configuracionDTO conf ) {
		
		txtNombreTienda.setText(conf.getNombreTienda());
		txtTipoComercio.setText(conf.getTipoComercio());
		txtNitTienda.setText(conf.getNitTienda());
		inpCiudades.setSelectedItem(conf.getCiudadTienda());
		txtValorIva.setText(String.valueOf(conf.getIva()));
		txtInteres.setText(String.valueOf(conf.getTasaInteres()));
		inpBanco.setSelectedItem(conf.getNombreBanco());
		txtCtaCorriente.setText(conf.getCtaCorriente());
		txtNombreGerente.setText(conf.getGerenteTienda());
		
	}

	public boolean validarFormulario(){

        if(txtNombreTienda.getText().equals("") ){

            mostrarMensaje("El campo nombre tienda esta vacio");
            return false;
        } else if(  txtTipoComercio.getText().equals("") ) {
            mostrarMensaje("El campo tipo comercio esta vacio ");
            return false;
        } else if(  txtNitTienda.getText().equals("") ) {
            mostrarMensaje("El campo nit tienda esta vacio ");
            return false;
        } else if( txtValorIva.getText().equals("") || !verificarNumero( txtValorIva.getText() ) ){
            mostrarMensaje("El campo Valor iva es invalido, solo es valido numeros");
            return false;
        } else if( txtInteres.getText().equals("") || !verificarNumero( txtInteres.getText() ) ){
            mostrarMensaje("El campo Intereses es invalido, solo es valido numeros");
            return false;
        } else if( inpBanco.getSelectedItem().toString().equals("") ){
            mostrarMensaje("El campo banco esta vacio.");
            return false;
        } else if( inpCiudades.getSelectedItem().toString().equals("") ){
            mostrarMensaje("El campo Ciudad esta vacio.");
            return false;
        }  else if(  txtCtaCorriente.getText().equals("") ) {
            mostrarMensaje("El campo cta corriente esta vacio ");
            return false;
        }  else if(  txtNombreGerente.getText().equals("") ) {
            mostrarMensaje("El campo nombre gerente esta vacio ");
            return false;
        }
        
        else  { 
            return true;
        }

    }
	
	public configuracionDTO getDatosConfiguracion() {
		configuracionDTO conf = new configuracionDTO(
				txtNombreTienda.getText(),
				txtTipoComercio.getText(),
				txtNitTienda.getText(),
				inpCiudades.getSelectedItem().toString(),
				Integer.parseInt( txtValorIva.getText() ),
				Integer.parseInt( txtInteres.getText() ),
				inpBanco.getSelectedItem().toString(),
				txtCtaCorriente.getText(),
				txtNombreGerente.getText()
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
