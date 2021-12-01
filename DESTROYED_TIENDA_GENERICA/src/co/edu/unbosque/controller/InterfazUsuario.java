package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import co.edu.unbosque.view.crud_clientes;
import co.edu.unbosque.view.crud_gestion_ventas;
import co.edu.unbosque.view.crud_productos;
import co.edu.unbosque.view.crud_proveedor;
import co.edu.unbosque.view.ventana_agregar_clientes;
import co.edu.unbosque.view.ventana_agregar_productos;
import co.edu.unbosque.view.ventana_agregar_provedores;
import co.edu.unbosque.view.ventana_configuracion;
import co.edu.unbosque.view.ventana_gestion_ventas;
import co.edu.unbosque.view.ventana_principal;

public class InterfazUsuario{
	
		private ventana_principal ventanaPrincipal;
		private ventana_configuracion ventanaConfiguracion;
		
		/**
		 * ==================
		 * VENTANAS CLIENTE
		 * ==================
		 */
		private ventana_agregar_clientes ventanaAgregarCliente;
		private crud_clientes ventanaCrudCliente;
		
		/**
		 * ==================
		 * VENTANAS PROVEEDOR
		 * ==================
		 */
		private crud_proveedor ventanaCrudProveedor;
		private ventana_agregar_provedores ventanaAgregarProvedores;
		
		
		/**
		 * ==================
		 * VENTANAS PRODUCTOS
		 * ==================
		 */
		
		private ventana_agregar_productos ventanaAgregarProductos;
		private crud_productos ventanaCrudProductos;
		
		/**
		 * ==================
		 * VENTANAS VENTAS
		 * ==================
		 */
		private ventana_gestion_ventas ventanaAgregarGestionVentas;
		private crud_gestion_ventas ventanaCrudGestionVentas;

		public InterfazUsuario( Controller control ) {
			
			ventanaPrincipal = new ventana_principal(control);
			ventanaConfiguracion = new ventana_configuracion(control);
			
			ventanaAgregarCliente = new ventana_agregar_clientes(control);
			ventanaCrudCliente = new crud_clientes(control);
			
			ventanaAgregarProductos = new ventana_agregar_productos(control);
			ventanaCrudProductos = new crud_productos(control);
			
			ventanaAgregarProvedores = new ventana_agregar_provedores(control);
			ventanaCrudProveedor = new crud_proveedor(control);
			
			ventanaAgregarGestionVentas = new ventana_gestion_ventas(control);
			ventanaCrudGestionVentas = new crud_gestion_ventas(control);
			
			mostrarVentanaPrincipal();
		}
		
		/***
		 * =====================
		 *       VENTANAS
		 * =====================
		 */
		
		public void mostrarVentanaPrincipal() {
			ventanaPrincipal.setVisible(true);
		}
		
		public void mostrarVentanaConfiguracion() {
			ventanaConfiguracion.setVisible(true);
		}
		
		public void mostrarVentanaCrudClientes() {
			ventanaCrudCliente.setVisible(true);
		}
		
		public void mostrarVentanaAgregarClientes() {
			ventanaAgregarCliente.setVisible(true);
		}
		
		public void mostrarVentanaProveedores() {
			ventanaCrudProveedor.setVisible(true);	
		}
		
		public void mostrarVentanaAgregarProveedores() {
			ventanaAgregarProvedores.setVisible(true);	
		}
		
		public void mostrarVentanaProductos() {
			ventanaCrudProductos.setVisible(true);	
		}
		
		public void mostrarVentanaAgregarProductos() {
			ventanaAgregarProductos.setVisible(true);
		}
		
		public void mostrarVentanaGestionVentas() {
			ventanaCrudGestionVentas.setVisible(true);
		}
		
		public void mostrarVentanaAgregarGestionVentas() {
			ventanaAgregarGestionVentas.setVisible(true);
		}

		/***
		 * =====================
		 *       GETTER
		 * =====================
		 */
		
		public ventana_principal getVentanaPrincipal() {
			return ventanaPrincipal;
		}

		public ventana_configuracion getVentanaConfiguracion() {
			return ventanaConfiguracion;
		}

		public ventana_agregar_clientes getVentanaAgregarCliente() {
			return ventanaAgregarCliente;
		}

		public ventana_agregar_productos getVentanaAgregarProductos() {
			return ventanaAgregarProductos;
		}

		public ventana_agregar_provedores getVentanaAgregarProvedores() {
			return ventanaAgregarProvedores;
		}

		public ventana_gestion_ventas getVentanaAgregarGestionVentas() {
			return ventanaAgregarGestionVentas;
		}
		
		public crud_gestion_ventas getVentanaCrudGestionVentas() {
			return ventanaCrudGestionVentas;
		}

		public crud_clientes getVentanaCrudCliente() {
			return ventanaCrudCliente;
		}
		
		public crud_proveedor getVentanaCrudProveedor() {
			return ventanaCrudProveedor;
		}

		public crud_productos getVentanaCrudProductos() {
			return ventanaCrudProductos;
		}

		public void mostrarMensaje( String msg ){
	        JOptionPane.showMessageDialog(null , msg);
	    }
		
}
