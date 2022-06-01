
import java.util.Date;

/**
 * Los usuarios pueden registrarse en el sitio web para hacerse socios. Cuando un usuario se hace socio debe proporcionar los siguiente datos: nombre completo, correo electrónico y dirección. Los socios pueden hacer pedidos de los artículos. 
 * Los socios pueden visualizar sus pedidos y cancelarlos siempre y cuando no hayan sido cumplimentados por el empleado de almacén. Así mismo puede modificar sus datos personales.   Atributos: 
 * 
 * nombre: String 
 * email : String 
 * direccion : String
 */
public class Socio {

	private String nombre;
	private String email;
	private String direccion;

	public Socio() {
		// TODO - implement Socio.Socio
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param nombre
	 * @param email
	 * @param direccion
	 */
	public Socio(String nombre, String email, String direccion) {
		// TODO - implement Socio.Socio
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

	public String getEmail() {
		return this.email;
	}

	/**
	 * 
	 * @param email
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	public String getDireccion() {
		return this.direccion;
	}

	/**
	 * 
	 * @param direccion
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	/**
	 * 
	 * @param fechaPedido
	 */
	public void verPedido(Date fechaPedido) {
		// TODO - implement Socio.verPedido
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param fechaPedido
	 */
	public boolean cancelarPedido(Date fechaPedido) {
		// TODO - implement Socio.cancelarPedido
		throw new UnsupportedOperationException();
	}

	public void verArticulos() {
		// TODO - implement Socio.verArticulos
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param pago
	 */
	public void verTarjeta(Pago pago) {
		// TODO - implement Socio.verTarjeta
		throw new UnsupportedOperationException();
	}

}