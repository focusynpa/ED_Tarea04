
import java.util.Date;

/**
 * Los socios pueden hacer pedidos de los artículos. Un pedido está formado por un conjunto de detalles de pedido que son parejas formadas por artículo y la cantidad. De los pedidos interesa saber la fecha en la que se realizó y cuanto debe pagar el socio en total. El pago se hace a través tarjeta bancaria, cuando se va a pagar una entidad bancaria comprueba la validez de la tarjeta. De la tarjeta interesa conocer el número. 
 * 
 * Atributos: 
 * 
 * fechaPedido: String 
 * nPedido: int 
 * articulo : articulo 
 * cantidad: int 
 * totalPago: float 
 * socio : socio 
 * 
 * Método: 
 * 
 * datosPedido() 
 * 
 *   
 */
public class Pedido {

	private Date fechaPedido;
	private double total;
	private Socio socio;
	private String numPedido;
	private String destino;

	/**
	 * 
	 * @param articulo
	 * @param cantidad
	 * @param precio
	 */
	public void detallePedido(Articulos articulo, int cantidad, double precio) {
		// TODO - implement Pedido.detallePedido
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param fechaPedido
	 * @param total
	 * @param socio
	 */
	public Pedido(Date fechaPedido, double total, Socio socio) {
		// TODO - implement Pedido.Pedido
		throw new UnsupportedOperationException();
	}

	public Date getFechaPedido() {
		return this.fechaPedido;
	}

	/**
	 * 
	 * @param fechaPedido
	 */
	public void setFechaPedido(Date fechaPedido) {
		this.fechaPedido = fechaPedido;
	}

	public double getTotal() {
		return this.total;
	}

	/**
	 * 
	 * @param total
	 */
	public void setTotal(double total) {
		this.total = total;
	}

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

	/**
	 * 
	 * @param cantidad
	 * @param precio
	 */
	public double calcularTotal(int cantidad, double precio) {
		// TODO - implement Pedido.calcularTotal
		throw new UnsupportedOperationException();
	}

	public String getNumPaquete() {
		// TODO - implement Pedido.getNumPaquete
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param numPedido
	 */
	public void setNumPaquete(String numPedido) {
		// TODO - implement Pedido.setNumPaquete
		throw new UnsupportedOperationException();
	}

	public String getDestino() {
		return this.destino;
	}

	/**
	 * 
	 * @param destino
	 */
	public void setDestino(String destino) {
		this.destino = destino;
	}

}