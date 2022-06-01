
import java.util.Date;

/**
 * Existe un empleado de almac�n que revisa los pedidos a diario y los cumplimenta. Esto consiste en recopilar los art�culos que aparecen en el pedido y empaquetarlos. Cuando el paquete est� listo se pasa al almac�n a la espera de ser repartido.    
 */
public class Incidencia {

	private Date fechaIncidencia;
	private String descripcion;

	public Date getFechaIncidencia() {
		return this.fechaIncidencia;
	}

	/**
	 * 
	 * @param fechaIncidencia
	 */
	public void setFechaIncidencia(Date fechaIncidencia) {
		this.fechaIncidencia = fechaIncidencia;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	/**
	 * 
	 * @param descripcion
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Incidencia() {
		// TODO - implement Incidencia.Incidencia
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param fechaIncidencia
	 * @param descripcion
	 */
	public Incidencia(Date fechaIncidencia, String descripcion) {
		// TODO - implement Incidencia.Incidencia
		throw new UnsupportedOperationException();
	}

}