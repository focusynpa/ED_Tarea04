/**
 * Los art�culos son de fabricaci�n propia, pero, opcionalmente, pueden venderse art�culos de otras firmas. De las firmas nos interesa saber su nombre, CIF y domicilio fiscal. La venta de art�culos de firma se realiza a trav�s de proveedores, de forma que un proveedor puede llevar varios art�culos de diferentes firmas, y una firma puede ser suministrada por m�s de un proveedor. Los art�culos pertenecen a una firma solamente. De los proveedores debemos conocer su nombre, CIF, y domicilio fiscal. 
 * 
 * Atributos: 
 * nombre: String 
 * CIF: String 
 * domicilio fiscal : String  
 */
public class Firmas {

	private String nombre;
	private String CIF;
	private String domicilioFiscal;

	/**
	 * 
	 * @param nombre
	 * @param CIF
	 * @param domicilioFiscal
	 */
	public Firmas(String nombre, String CIF, String domicilioFiscal) {
		// TODO - implement Firmas.Firmas
		throw new UnsupportedOperationException();
	}

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
		// TODO - implement Firmas.getCIF
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param CIF
	 */
	public void setCIF(String CIF) {
		// TODO - implement Firmas.setCIF
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

}