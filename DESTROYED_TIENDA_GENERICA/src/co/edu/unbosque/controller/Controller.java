package co.edu.unbosque.controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import co.edu.unbosque.model.ClaseFachada;
import co.edu.unbosque.model.DAO.ConfiguracionDAO;
import co.edu.unbosque.model.DTO.ClientesDTO;
import co.edu.unbosque.model.DTO.ProductoDTO;
import co.edu.unbosque.model.DTO.ProveedorDTO;
import co.edu.unbosque.model.DTO.configuracionDTO;
import co.edu.unbosque.model.Persistence.AdministradorArchivos;
import co.edu.unbosque.view.ventana_configuracion;
import co.edu.unbosque.view.ventana_gestion_ventas;
import co.edu.unbosque.view.ventana_principal;
import co.edu.unbosque.view.crud_clientes;
import co.edu.unbosque.view.crud_gestion_ventas;
import co.edu.unbosque.view.crud_productos;
import co.edu.unbosque.view.crud_proveedor;
import co.edu.unbosque.view.ventana_agregar_clientes;
import co.edu.unbosque.view.ventana_agregar_productos;
import co.edu.unbosque.view.ventana_agregar_provedores;


public class Controller implements ActionListener {
	
	InterfazUsuario ui;
	ClaseFachada claseFachada;
	AdministradorArchivos gestorArchivos;
	
	public Controller() {
	
		ui = new InterfazUsuario(this);
		claseFachada = new ClaseFachada();
		gestorArchivos = new AdministradorArchivos();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// e
		switch( e.getActionCommand() ) {
		
			/**
			 * =========================
			 * VENTANA DE CONFIGURACION
			 * =========================
			 */
		
			case ventana_principal.PANEL_CONFIGURACION:

				ui.mostrarVentanaConfiguracion();
				
				mostrarArchivoConfiguracion();
				
			break;
			
			/**
			 * =========================
			 * CLICK GUARDAR CONFIGURACION
			 * =========================
			 */
			
			case ventana_configuracion.GUARDAR_CONFIGURACION:
				
				if(ui.getVentanaConfiguracion().validarFormulario()) {
					
					configuracionDTO conf = ui.getVentanaConfiguracion().getDatosConfiguracion();
							
					this.claseFachada.getConfiguracionDAO().setConfiguracionDTO(conf);
					
					if( !gestorArchivos.almacenarDatosConfiguracion(conf) ) {
					
						ui.mostrarMensaje("No se pudo almacenar la informacion");
						
					} else {
						ui.mostrarMensaje("Informacion guardada correctamente");
					}
				
				}

			break;
			
			/**
			 * =========================
			 * CLICK PANEL CLIENTES
			 * =========================
			 */
			
			
			case ventana_principal.PANEL_CLIENTES:
				
				ui.mostrarVentanaCrudClientes();
				
				mostrarDatosCliente();
				
			break;
			
			/**
			 * =========================
			 * CLICK PANEL AGREGAR CLIENTE
			 * =========================
			 */
			
			case crud_clientes.VENTANTA_AGREGAR_CLIENTE:
				
				ui.mostrarVentanaAgregarClientes();
				ui.getVentanaAgregarCliente().accionUI(true, "Agregar Cliente");
				
				
			break;
			
			/**
			 * =========================
			 * CLICK PANEL ACTUALIZAR CLIENTE
			 * =========================
			 */
			
			case crud_clientes.VENTANTA_ACTUALIZAR_CLIENTE:
				
				ClientesDTO cliente = ui.getVentanaCrudCliente().obtenerRegistroSeleccionado();
				if(cliente != null) {
					ui.mostrarVentanaAgregarClientes();
					ui.getVentanaAgregarCliente().accionUI(false, "Actualizar Cliente");
					ui.getVentanaAgregarCliente().setTextFormulario(cliente);
				} else {
					ui.mostrarMensaje("Seleccione primero una fila");
				}
				
				 

				
			break;
			
			/**
			 * =========================
			 * CLICK BOTON BORRAR CLIENTE
			 * =========================
			 */
						
			case crud_clientes.VENTANTA_BORRAR_CLIENTE:
				
				ClientesDTO clienteBorrado = ui.getVentanaCrudCliente().obtenerRegistroSeleccionado();
				
				if(clienteBorrado != null) {
					
					borrarCliente(clienteBorrado);
					
				} else {
					ui.mostrarMensaje("Seleccione primero una fila");
				}

			break;
			
			/**
			 * =========================
			 * CLICK GUARDAR CLIENTES
			 * =========================
			 */
			case ventana_agregar_clientes.GUARDAR_CLIENTE:
				
				if(ui.getVentanaAgregarCliente().validarFormulario()) {
					
					ClientesDTO clienteG = ui.getVentanaAgregarCliente().getDatosCliente();
					guardarCliente( ui.getVentanaAgregarCliente().isCreando() , clienteG );

				}

			break;
			
			
			/**
			 * =========================
			 * CLICK PANEL PROVEEDORES
			 * =========================
			 */
			
			case ventana_principal.PANEL_PROVEEDORES:
				
				
				ui.mostrarVentanaProveedores();
				mostrarDatosProveedor();
				
				
			break;
			
			
			/**
			 * =========================
			 * CLICK PANEL AGREGAR PROVEEDOR
			 * =========================
			 */
			
			case crud_proveedor.VENTANTA_AGREGAR_PROVEEDOR:
				
				ui.mostrarVentanaAgregarProveedores();
				ui.getVentanaAgregarProvedores().accionUI(true, "Agregar Proveedor");
				
				
			break;
			
			/**
			 * =========================
			 * CLICK PANEL ACTUALIZAR CLIENTE
			 * =========================
			 */
			
			case crud_proveedor.VENTANTA_ACTUALIZAR_PROVEEDOR:
				
				ProveedorDTO proveedor = ui.getVentanaCrudProveedor().obtenerRegistroSeleccionado();
				if(proveedor != null) {
					ui.mostrarVentanaAgregarProveedores();
					ui.getVentanaAgregarProvedores().accionUI(false, "Actualizar Proveedor");
					ui.getVentanaAgregarProvedores().setTextFormulario(proveedor);
				} else {
					ui.mostrarMensaje("Seleccione primero una fila");
				}
				
				 

				
			break;
			
			/**
			 * =========================
			 * CLICK BOTON BORRAR PROVEEDOR
			 * =========================
			 */
						
			case crud_proveedor.VENTANTA_BORRAR_PROVEEDOR:
				
				ProveedorDTO proveedorBorrado = ui.getVentanaCrudProveedor().obtenerRegistroSeleccionado();
				
				if(proveedorBorrado != null) {
					
					borrarProveedor(proveedorBorrado);
					
				} else {
					ui.mostrarMensaje("Seleccione primero una fila");
				}

			break;
			
			/**
			 * =========================
			 * CLICK GUARDAR PROVEEDOR
			 * =========================
			 */
			case ventana_agregar_provedores.GUARDAR_PROVEEDOR:
				
				if(ui.getVentanaAgregarProvedores().validarFormulario()) {
					
					ProveedorDTO proovedorG = ui.getVentanaAgregarProvedores().getDatosProveedor();
					guardarProveedor(ui.getVentanaAgregarProvedores().isCreando(), proovedorG);
				}

			break;
			

			/**
			 * =========================
			 * CLICK PANEL PRODUCTOS
			 * =========================
			 */
			
			case ventana_principal.PANEL_PRODUCTOS:
				
				//Validar si hay proveedores
				mostrarDatosProveedor();
				
				if(this.claseFachada.getProveedoresDAO().getProveedoresDTO().size() > 0) {
					ui.mostrarVentanaProductos();
					mostrarDatosProductos();
				}else {
					ui.mostrarMensaje("No se puede crear productos hasta crear al menos un proveedor");
				}
				
				
				
				
			break;
			
			
			/**
			 * =========================
			 * CLICK PANEL AGREGAR PROVEEDOR
			 * =========================
			 */
			
			case crud_productos.VENTANTA_AGREGAR_PRODUCTO:
				
				ui.mostrarVentanaAgregarProductos();
				
				ui.getVentanaAgregarProductos().llenarInputNit(this.claseFachada.getProveedoresDAO().getProveedoresDTO()); // Llenar nit de proveedores
				
				ui.getVentanaAgregarProductos().accionUI(true, "Agregar Producto");
				
				
			break;
			
			/**
			 * =========================
			 * CLICK PANEL ACTUALIZAR CLIENTE
			 * =========================
			 */
			
			case crud_productos.VENTANTA_ACTUALIZAR_PRODUCTO:
				
				ProductoDTO producto = ui.getVentanaCrudProductos().obtenerRegistroSeleccionado();
				if(producto != null) {
					ui.mostrarVentanaAgregarProductos();
					ui.getVentanaAgregarProductos().llenarInputNit(this.claseFachada.getProveedoresDAO().getProveedoresDTO()); // Llenar nit de proveedores
					ui.getVentanaAgregarProductos().accionUI(false, "Actualizar Producto");
					ui.getVentanaAgregarProductos().setTextFormulario(producto);
				} else {
					ui.mostrarMensaje("Seleccione primero una fila");
				}
				
				 

				
			break;
			
			/**
			 * =========================
			 * CLICK BOTON BORRAR PROVEEDOR
			 * =========================
			 */
						
			case crud_productos.VENTANTA_BORRAR_PRODUCTO:
				
				ProductoDTO productoBorrado = ui.getVentanaCrudProductos().obtenerRegistroSeleccionado();
				
				if(productoBorrado != null) {
					
					borrarProducto(productoBorrado);
					
				} else {
					ui.mostrarMensaje("Seleccione primero una fila");
				}

			break;
			
			/**
			 * =========================
			 * CLICK GUARDAR PROVEEDOR
			 * =========================
			 */
			case ventana_agregar_productos.GUARDAR_PRODUCTO:
				
				if(ui.getVentanaAgregarProductos().validarFormulario()) {
					
					ProductoDTO productoG = ui.getVentanaAgregarProductos().getDatosProducto();
					guardarProducto(ui.getVentanaAgregarProductos().isCreando(), productoG);
				}

			break;
			
			/**
			 * =========================
			 * CLICK VENTANA PANEL GESTION
			 * =========================
			 */
			case ventana_principal.PANEL_GESTION_VENTAS:
				
				
				mostrarDatosCliente();
				mostrarDatosProveedor();
				mostrarDatosProductos();
				mostrarArchivoConfiguracion();
				
				if(this.claseFachada.getConfiguracionDAO().getConfiguracionDTO().getNitTienda().equals("")) {
					ui.mostrarMensaje("No se puede crear una factura de venta hasta crear el archivo config.properties");
				} else if(this.claseFachada.getClientesDAO().getClientesDTO().size() == 0) {
					ui.mostrarMensaje("No se puede crear una factura de venta hasta crear al menos un Cliente");
				} else if(this.claseFachada.getProveedoresDAO().getProveedoresDTO().size() == 0) {
					ui.mostrarMensaje("No se puede crear una factura de venta hasta crear al menos un proveedor");
				}else if(this.claseFachada.getProductosDAO().getProductosDTO().size() == 0) {
					ui.mostrarMensaje("No se puede crear una factura de venta hasta crear al menos un producto");
				} else {
					ui.mostrarVentanaGestionVentas();
				}
				
			
			break;
			
			
			/**
			 * =========================
			 * CLICK AGREGAR VENTA
			 * =========================
			 */
			case crud_gestion_ventas.VENTANTA_NUEVA_VENTA:
				
				ui.mostrarVentanaAgregarGestionVentas();
				ui.getVentanaAgregarGestionVentas().iniciarVenta(
						this.claseFachada.getConfiguracionDAO().getConfiguracionDTO().getIva(),
						this.claseFachada.getVentasDAO().getVentasDTO().size() + 1 , // Codgio de Factura
						this.claseFachada.getClientesDAO().getClientesDTO() , // Llenar clientes
						this.claseFachada.getProductosDAO().getProductosDTO()); // Llenar Productos
			
			break;
			
			/**
			 * =========================
			 * CLICK AGREGAR PRODUCTO
			 * =========================
			 */
			case ventana_gestion_ventas.AGREGAR_PRODUCTOS_CARRITO:
				
				if(ui.getVentanaAgregarGestionVentas().validarFormulario()){
					
					
					
				
					ui.getVentanaAgregarGestionVentas().siguienteProducto();
				}
				
			
			break;
			
			/**
			 * =========================
			 * CLICK GENERAR FACTURA
			 * =========================
			 */
			case ventana_gestion_ventas.GENERAR_FACTURA:
				
				/*ui.mostrarVentanaAgregarGestionVentas();
				ui.getVentanaAgregarGestionVentas().llenarComboBox(this.claseFachada.getClientesDAO().getClientesDTO() , this.claseFachada.getProductosDAO().getProductosDTO());*/
			
			break;
		}
	}
	
	
	
	private void mostrarArchivoConfiguracion() {
		
		if(  gestorArchivos.validarArchivo( AdministradorArchivos.rutaArchivoConfiguracion) ) {
			
			this.claseFachada.getConfiguracionDAO().setConfiguracionDTO(gestorArchivos.getArchivoConfiguracion());
			
			ui.getVentanaConfiguracion().setTextFormulario( this.claseFachada.getConfiguracionDAO().getConfiguracionDTO() );
	
		}
		
	}
	
	/**
	 * =========================
	 * METODOS CLIENTE
	 * =========================
	 */
	
	private void guardarCliente( boolean creando, ClientesDTO cliente  ) {
		
		if(creando) {
			
			if( claseFachada.getClientesDAO().getClientePorCedula(cliente.getCedula()) != null  ) {
				// Existe un usuario con esa cedula.
				ui.mostrarMensaje("Error, la cedula ingresada ya existe.");
			} else {
				
				//La cedula no existe.
				this.claseFachada.getClientesDAO().addClientesDTO( cliente  );
				
				if( !gestorArchivos.almacenarDatosClientes(  this.claseFachada.getClientesDAO().getClientesDTO() ) ) {
				
					ui.mostrarMensaje("No se pudo almacenar la informacion");
					
				} else {
					ui.mostrarMensaje("Informacion guardada correctamente");
					ui.getVentanaAgregarCliente().limpiarFormulario();
				}
			}
			
			
		} else {
			
			if( !gestorArchivos.almacenarDatosClientes(  this.claseFachada.getClientesDAO().actualizarClientePorCedula(cliente) ) ) {
				
				ui.mostrarMensaje("No se pudo almacenar la informacion");
				
			} else {
				ui.mostrarMensaje("Informacion actualizada correctamente");
				ui.getVentanaAgregarCliente().limpiarFormulario();
			}
			
			
		}
		
		mostrarDatosCliente();
		
	}

	private void mostrarDatosCliente() {

		if(  gestorArchivos.validarArchivo( AdministradorArchivos.rutaArchivoClientes) ) {
			
			this.claseFachada.getClientesDAO().setClientesDTO(gestorArchivos.getDatosClientes());
			
			ui.getVentanaCrudCliente().agregarClientesTabla(this.claseFachada.getClientesDAO().getClientesDTO());
	
		}
	}
	
	private void borrarCliente( ClientesDTO cliente  ) {

		ArrayList<ClientesDTO> clientes = claseFachada.getClientesDAO().borrarClientePorCedula(cliente.getCedula());
		
		if( !gestorArchivos.almacenarDatosClientes( clientes )) {
			
			ui.mostrarMensaje("No se pudo borrar la informacion");
			
		} else {
			ui.mostrarMensaje("Informacion borrada correctamente");
			ui.getVentanaCrudCliente().borrarFilaSeleccionada();
			mostrarDatosCliente();
		}
	}
	
	
	/**
	 * =========================
	 * METODOS PROVEEDOR
	 * =========================
	 */
	
	
	private void guardarProveedor( boolean creando, ProveedorDTO proveedor  ) {
		
		if(creando) {
			
			if( claseFachada.getProveedoresDAO().getProveedorPorNit(proveedor.getNit()) != null  ) {
				// Existe un proveedor con ese nit.
				ui.mostrarMensaje("Error, El proveedor con el nit ingresado ya existe.");
			} else {
				
				//Nit no existe.
				this.claseFachada.getProveedoresDAO().addProveedorDTO(proveedor);
				
				if( !gestorArchivos.almacenarDatosProveedores(  this.claseFachada.getProveedoresDAO().getProveedoresDTO() ) ) {
				
					ui.mostrarMensaje("No se pudo almacenar la informacion");
					
				} else {
					ui.mostrarMensaje("Informacion guardada correctamente");
					ui.getVentanaAgregarProvedores().limpiarFormulario();
				}
			}
			
			
		} else {
			
			if( !gestorArchivos.almacenarDatosProveedores(  this.claseFachada.getProveedoresDAO().actualizarProveedorPorNit(proveedor) ) ) {
				
				ui.mostrarMensaje("No se pudo almacenar la informacion");
				
			} else {
				ui.mostrarMensaje("Informacion actualizada correctamente");
				ui.getVentanaAgregarProvedores().limpiarFormulario();
			}
			
			
		}
		
		mostrarDatosProveedor();
		
	}

	private void mostrarDatosProveedor() {

		if(  gestorArchivos.validarArchivo( AdministradorArchivos.rutaArchivoProveedores) ) {
			
			this.claseFachada.getProveedoresDAO().setProveedoresDTO(gestorArchivos.getDatosProveedores());
			
			ui.getVentanaCrudProveedor().agregarProveedoresTabla(this.claseFachada.getProveedoresDAO().getProveedoresDTO());
	
		}
	}
	
	private void borrarProveedor( ProveedorDTO proveedor  ) {

		ArrayList<ProveedorDTO> proveedores = claseFachada.getProveedoresDAO().borrarProveedorPorNit(proveedor.getNit());
		
		if( !gestorArchivos.almacenarDatosProveedores( proveedores )) {
			
			ui.mostrarMensaje("No se pudo borrar la informacion");
			
		} else {
			ui.mostrarMensaje("Informacion borrada correctamente");
			ui.getVentanaCrudProveedor().borrarFilaSeleccionada();
			mostrarDatosProveedor();
		}
	}
	
	/**
	 * =========================
	 * METODOS PRODUCTOS
	 * =========================
	 */
	
	
	private void guardarProducto( boolean creando, ProductoDTO producto  ) {
		
		if(creando) {
			
			if( claseFachada.getProductosDAO().getProductoPorCodigo(producto.getCodigoProducto()) != null  ) {
				// Existe un PRODUCTO con ese CODIGO.
				ui.mostrarMensaje("Error, El producto con el codigo ingresado ya existe.");
			} else {
				
				//Nit no existe.
				this.claseFachada.getProductosDAO().addProductoDTO(producto);
				
				if( !gestorArchivos.almacenarDatosProductos(  this.claseFachada.getProductosDAO().getProductosDTO() ) ) {
				
					ui.mostrarMensaje("No se pudo almacenar la informacion");
					
				} else {
					ui.mostrarMensaje("Informacion guardada correctamente");
					ui.getVentanaAgregarProductos().limpiarFormulario();
				}
			}
			
			
		} else {
			
			if( !gestorArchivos.almacenarDatosProductos(  this.claseFachada.getProductosDAO().actualizarProductoPorCodigo(producto) ) ) {
				
				ui.mostrarMensaje("No se pudo almacenar la informacion");
				
			} else {
				ui.mostrarMensaje("Informacion actualizada correctamente");
				ui.getVentanaAgregarProductos().limpiarFormulario();
			}
			
			
		}
		
		mostrarDatosProductos();
		
	}

	private void mostrarDatosProductos() {

		if(  gestorArchivos.validarArchivo( AdministradorArchivos.rutaArchivoProductos ) ) {
			
			this.claseFachada.getProductosDAO().setProductosDTO(gestorArchivos.getDatosProductos());
			
			
			ui.getVentanaCrudProductos().agregarProductosTabla(this.claseFachada.getProductosDAO().getProductosDTO());
	
		}
	}
	
	private void borrarProducto( ProductoDTO producto  ) {

		ArrayList<ProductoDTO> productos = claseFachada.getProductosDAO().borrarProductoPorCodigo(producto.getCodigoProducto());
		
		if( !gestorArchivos.almacenarDatosProductos( productos )) {
			
			ui.mostrarMensaje("No se pudo borrar la informacion");
			
		} else {
			ui.mostrarMensaje("Informacion borrada correctamente");
			ui.getVentanaCrudProductos().borrarFilaSeleccionada();
			mostrarDatosProductos();
		}
	}
	
}
