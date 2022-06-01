/**
 * Se crea la clase Campaña con sus métodos y atributos
 * 
 * temporada : String
 * 
 * Métodos:
 * 
 * altaTemporada()
 * bajaTemporada()
 * 
 * Los artículos se organizan por campañas para cada temporada (primavera/verano y otoño/invierno) de cada año Las campañas son gestionadas por el administrativo de la tienda que se encargará de dar de baja la campaña anterior y dar de alta la nueva siempre que no haya ningún pedido pendiente de cumplimentar   
 */
public class Campaña {

	private String temporada;

	/**
	 * 
	 * @param temporada
	 */
	public Campaña(String temporada) {
		// TODO - implement Campaña.Campaña
		throw new UnsupportedOperationException();
	}

	public String getTemporada() {
		return this.temporada;
	}

	/**
	 * 
	 * @param temporada
	 */
	public void setTemporada(String temporada) {
		this.temporada = temporada;
	}

	/**
	 * 
	 * @param temporada
	 */
	public boolean gestionCampaña(String temporada) {
		// TODO - implement Campaña.gestionCampaña
		throw new UnsupportedOperationException();
	}

}