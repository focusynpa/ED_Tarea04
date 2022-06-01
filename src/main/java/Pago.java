/**
 * El pago se hace a través tarjeta bancaria, cuando se va a pagar una entidad bancaria comprueba la validez de la tarjeta. De la tarjeta interesa conocer el número 
 * 
 * Atributos 
 * 
 * tarjetaBancaria: Float 
 * validezTarjeta: String 
 * numTarjeta: Float 
 * 
 * Métodos: 
 * 
 * comprobarSocio() 
 * comprobarTarjeta() 
 * envioAlmacen(nPaquete: String, destino: String)  
 */
public class Pago {

	private Socio socio;
	private long numTarjeta;
	private String fechaValidez;

	public Socio getSocio() {
		return this.socio;
	}

	/**
	 * 
	 * @param socio
	 */
	public void setSocio(Socio socio) {
		this.socio = socio;
	}

	public void getNumTarjeta() {
		// TODO - implement Pago.getNumTarjeta
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param numTarjeta
	 */
	public void setNumTarjeta(int numTarjeta) {
		// TODO - implement Pago.setNumTarjeta
		throw new UnsupportedOperationException();
	}

	public void getFechaValidez() {
		// TODO - implement Pago.getFechaValidez
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param fechaValidez
	 */
	public void setFechaValidez(String fechaValidez) {
		this.fechaValidez = fechaValidez;
	}

	public Pago() {
		// TODO - implement Pago.Pago
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param socio
	 * @param numTarjeta
	 * @param fechaValidez
	 */
	public Pago(Socio socio, long numTarjeta, String fechaValidez) {
		// TODO - implement Pago.Pago
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param numTarjeta
	 */
	public void verTarjeta(long numTarjeta) {
		// TODO - implement Pago.verTarjeta
		throw new UnsupportedOperationException();
	}

	public void comprobarValidez() {
		// TODO - implement Pago.comprobarValidez
		throw new UnsupportedOperationException();
	}

}