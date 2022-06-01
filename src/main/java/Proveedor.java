/**
 * La venta de artículos de firma se realiza a través de proveedores, de forma que un proveedor puede llevar varios artículos de diferentes firmas, y una firma puede ser suministrada por más de un proveedor. Los artículos pertenecen a una firma solamente. De los proveedores debemos conocer su nombre, CIF, y domicilio fiscal. 
 * 
 * Atributos: 
 * 
 * nombre : String 
 * CIF : String 
 * domicioFiscal : String  
 */
public class Proveedor {

	private String nombre;
	private String CIF;
	private String domicilioFiscal;

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
		// TODO - implement Proveedor.getCIF
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param CIF
	 */
	public void setCIF(String CIF) {
		// TODO - implement Proveedor.setCIF
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

	/**
	 * 
	 * @param nombre
	 * @param CIF
	 * @param domicilioFiscal
	 */
	public Proveedor(String nombre, String CIF, String domicilioFiscal) {
		// TODO - implement Proveedor.Proveedor
		throw new UnsupportedOperationException();
	}

}