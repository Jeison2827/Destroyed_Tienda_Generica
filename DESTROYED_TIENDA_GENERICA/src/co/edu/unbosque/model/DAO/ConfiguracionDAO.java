package co.edu.unbosque.model.DAO;

import co.edu.unbosque.model.DTO.configuracionDTO;

public class ConfiguracionDAO {
	
	private configuracionDTO configuracionDTO;
	
	public ConfiguracionDAO() {
		
		configuracionDTO = new configuracionDTO();

	}
	
	
	public void setConfiguracionDTO( configuracionDTO  conf ) {
		configuracionDTO = conf;
	}

	
	public configuracionDTO setDatosConfiguracionDTO( String nombreTienda, String tipoComercio, String nitTienda, String ciudadTienda, int iva,
			int tasaInteres, String nombreBanco, String ctaCorriente, String gerenteTienda ) {
		
		configuracionDTO.setNombreTienda(nombreTienda);
		configuracionDTO.setTipoComercio(tipoComercio);
		configuracionDTO.setNitTienda(nitTienda);
		configuracionDTO.setCiudadTienda(ciudadTienda);
		configuracionDTO.setIva(iva);
		configuracionDTO.setTasaInteres(tasaInteres);
		configuracionDTO.setNombreBanco(nombreBanco);
		configuracionDTO.setCtaCorriente(ctaCorriente);
		configuracionDTO.setGerenteTienda(gerenteTienda);

		return this.configuracionDTO;
		
	}

	public configuracionDTO getConfiguracionDTO() {
		return configuracionDTO;
	}
	
	
}
