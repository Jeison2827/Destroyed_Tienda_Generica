package co.edu.unbosque.model.Persistence;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import co.edu.unbosque.model.DTO.ClientesDTO;
import co.edu.unbosque.model.DTO.ProductoDTO;
import co.edu.unbosque.model.DTO.ProveedorDTO;
import co.edu.unbosque.model.DTO.VentasDTO;
import co.edu.unbosque.model.DTO.VentasProductoDTO;
import co.edu.unbosque.model.DTO.configuracionDTO;

public class AdministradorArchivos {
	
	
	public static String rutaArchivoConfiguracion = "config.properties";
	public static String rutaArchivoClientes = "clientes.txt";
	public static String rutaArchivoProveedores = "proveedores.txt";
	public static String rutaArchivoProductos = "productos.txt";
	public static String rutaArchivoGestionVentas = "gestionVentas.txt";
	public static String rutaArchivoDetalleVentas = "detalleVentas.txt";
	
	public AdministradorArchivos() {}
	
	
	/**
	 * ===============================
	 * ARCHIVOS CONFIGURACION
 	 * ===============================
	 */
	
	
	public boolean almacenarDatosConfiguracion( configuracionDTO conf  ) {
		return this.guardarArchivo(conf , rutaArchivoConfiguracion);
	}
	
	
	public configuracionDTO getArchivoConfiguracion(){
        
		try {
 
            FileInputStream fileIn = new FileInputStream(rutaArchivoConfiguracion);
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);
 
            configuracionDTO obj =  (configuracionDTO) objectIn.readObject();
 
            objectIn.close();
            return obj;
 
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
	    
	}
	
	
	/**
	 * ===============================
	 * ARCHIVOS CLIENTES
 	 * ===============================
	 */
	
	
	public boolean almacenarDatosClientes( ArrayList<ClientesDTO> clientes  ) {
		
		try{
            FileOutputStream writeData = new FileOutputStream(rutaArchivoClientes);
            ObjectOutputStream writeStream = new ObjectOutputStream(writeData);

            writeStream.writeObject(clientes);
            writeStream.flush();
            writeStream.close();
            return true;

        }catch (IOException e) {
            e.printStackTrace();
            return false;
        }
		
	}
	
	public ArrayList<ClientesDTO> getDatosClientes() {
		
        try{
            FileInputStream readData = new FileInputStream(rutaArchivoClientes);
            ObjectInputStream readStream = new ObjectInputStream(readData);

            ArrayList clientes = (ArrayList<ClientesDTO>) readStream.readObject();
            readStream.close();
            
            System.out.println(clientes.toString());
            return clientes;
            
        }catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
		
	}
	
	/**
	 * ===============================
	 * ARCHIVOS PROVEEDOR
 	 * ===============================
	 */
	
	public boolean almacenarDatosProveedores( ArrayList<ProveedorDTO> proveedor  ) {
		
		try{
            FileOutputStream writeData = new FileOutputStream(rutaArchivoProveedores);
            ObjectOutputStream writeStream = new ObjectOutputStream(writeData);

            writeStream.writeObject(proveedor);
            writeStream.flush();
            writeStream.close();
            return true;

        }catch (IOException e) {
            e.printStackTrace();
            return false;
        }
		
	}
	
	public ArrayList<ProveedorDTO> getDatosProveedores() {
		
        try{
            FileInputStream readData = new FileInputStream(rutaArchivoProveedores);
            ObjectInputStream readStream = new ObjectInputStream(readData);

            ArrayList proveedores = (ArrayList<ProveedorDTO>) readStream.readObject();
            readStream.close();
            
            System.out.println(proveedores.toString());
            return proveedores;
            
        }catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
		
	}
	
	
	/**
	 * ===============================
	 * ARCHIVOS PRODUCTOS
 	 * ===============================
	 */
	
	
	public boolean almacenarDatosProductos( ArrayList<ProductoDTO> productos  ) {
		
		try{
            FileOutputStream writeData = new FileOutputStream(rutaArchivoProductos);
            ObjectOutputStream writeStream = new ObjectOutputStream(writeData);

            writeStream.writeObject(productos);
            writeStream.flush();
            writeStream.close();
            return true;

        }catch (IOException e) {
            e.printStackTrace();
            return false;
        }
		
	}
	
	public ArrayList<ProductoDTO> getDatosProductos() {
		
        try{
            FileInputStream readData = new FileInputStream(rutaArchivoProductos);
            ObjectInputStream readStream = new ObjectInputStream(readData);

            ArrayList prod = (ArrayList<ProductoDTO>) readStream.readObject();
            readStream.close();
            
            System.out.println(prod.toString());
            return prod;
            
        }catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
		
	}
	
	
	/**
	 * ===============================
	 * ARCHIVOS GESTION VENTAS
 	 * ===============================
	 */
	
	
	public boolean almacenarDatosVentas( ArrayList<VentasDTO> ventas  ) {
		
		try{
            FileOutputStream writeData = new FileOutputStream(rutaArchivoGestionVentas);
            ObjectOutputStream writeStream = new ObjectOutputStream(writeData);

            writeStream.writeObject(ventas);
            writeStream.flush();
            writeStream.close();
            return true;

        }catch (IOException e) {
            e.printStackTrace();
            return false;
        }
		
	}
	
	public ArrayList<VentasDTO> getDatosVentas() {
		
        try{
            FileInputStream readData = new FileInputStream(rutaArchivoGestionVentas);
            ObjectInputStream readStream = new ObjectInputStream(readData);

            ArrayList prod = (ArrayList<ProductoDTO>) readStream.readObject();
            readStream.close();
            
            System.out.println(prod.toString());
            return prod;
            
        }catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
		
	}
	
	/**
	 * ===============================
	 * ARCHIVOS DETALLES FACTURA
 	 * ===============================
	 */
	
	
	public boolean almacenarDatosDetallesFactura( ArrayList<VentasProductoDTO> detalles  ) {
		
		try{
            FileOutputStream writeData = new FileOutputStream(rutaArchivoDetalleVentas);
            ObjectOutputStream writeStream = new ObjectOutputStream(writeData);

            writeStream.writeObject(detalles);
            writeStream.flush();
            writeStream.close();
            return true;

        }catch (IOException e) {
            e.printStackTrace();
            return false;
        }
		
	}
	
	public ArrayList<VentasProductoDTO> getDatosDetallesFactura() {
		
        try{
            FileInputStream readData = new FileInputStream(rutaArchivoDetalleVentas);
            ObjectInputStream readStream = new ObjectInputStream(readData);

            ArrayList ventas = (ArrayList<VentasProductoDTO>) readStream.readObject();
            readStream.close();
            
            System.out.println(ventas.toString());
            return ventas;
            
        }catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
		
	}
	

	private boolean guardarArchivo( Object o , String ruta  ) {
		
		  try {
			  File file = new File(ruta);
			  
	          FileOutputStream fileOut = new FileOutputStream(file);
	          ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
	          objectOut.writeObject(o);
	          objectOut.close();
	          return true;
	      } catch (Exception ex) {
	    	  ex.printStackTrace();
	    	  return false;
	      }
	}
	
	public boolean validarArchivo( String ruta ) {
	    File myObj = new File(ruta);
	    return myObj.exists();
	 }
}
