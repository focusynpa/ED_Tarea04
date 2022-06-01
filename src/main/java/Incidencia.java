
import java.util.Date;

/**
 * Existe un empleado de almacén que revisa los pedidos a diario y los cumplimenta. Esto consiste en recopilar los artículos que aparecen en el pedido y empaquetarlos. Cuando el paquete está listo se pasa al almacén a la espera de ser repartido.    
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