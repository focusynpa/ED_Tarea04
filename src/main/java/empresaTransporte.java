/**
 * Del reparto se encarga una empresa de transportes que tiene varias rutas preestablecidas. Según el destino del paquete (la dirección del socio) se asigna a una u otra ruta. De la empresa de transportes se debe conocer su nombre, CIF y domicilio fiscal. Las rutas tienen un área de influencia que determina los destinos, y unos días de reparto asignados. Se debe conocer la fecha en la que se reparte el pedido. Si se produce alguna incidencia durante el reparto de algún pedido se almacena la fecha en la que se ha producido y una descripción  
 */
public class empresaTransporte {

	private String nombre;
	private String CIF;
	private String domicilioFiscal;
	private String numPedido;

	public String getNombre() {
		return this.nombre;
	}

	/**
	 * 
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCIF() {
		// TODO - implement empresaTransporte.getCIF
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param CIF
	 */
	public void setCIF(String CIF) {
		// TODO - implement empresaTransporte.setCIF
		throw new UnsupportedOperationException();
	}

	public String getDomicilioFiscal() {
		return this.domicilioFiscal;
	}

	/**
	 * 
	 * @param domicilioFiscal
	 */
	public void setDomicilioFiscal(String domicilioFiscal) {
		this.domicilioFiscal = domicilioFiscal;
	}

	public int getNumPedido() {
		// TODO - implement empresaTransporte.getNumPedido
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param numPedido
	 */
	public void setNumPedido(int numPedido) {
		// TODO - implement empresaTransporte.setNumPedido
		throw new UnsupportedOperationException();
	}

	public empresaTransporte() {
		// TODO - implement empresaTransporte.empresaTransporte
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param nombre
	 * @param CIF
	 * @param domicilioFiscal
	 */
	public empresaTransporte(String nombre, String CIF, String domicilioFiscal) {
		// TODO - implement empresaTransporte.empresaTransporte
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param numPedido
	 */
	public empresaTransporte(String numPedido) {
		// TODO - implement empresaTransporte.empresaTransporte
		throw new UnsupportedOperationException();
	}

}