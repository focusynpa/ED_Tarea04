/**
 * Se crea la clase Campa�a con sus m�todos y atributos
 * 
 * temporada : String
 * 
 * M�todos:
 * 
 * altaTemporada()
 * bajaTemporada()
 * 
 * Los art�culos se organizan por campa�as para cada temporada (primavera/verano y oto�o/invierno) de cada a�o Las campa�as son gestionadas por el administrativo de la tienda que se encargar� de dar de baja la campa�a anterior y dar de alta la nueva siempre que no haya ning�n pedido pendiente de cumplimentar   
 */
public class Campa�a {

	private String temporada;

	/**
	 * 
	 * @param temporada
	 */
	public Campa�a(String temporada) {
		// TODO - implement Campa�a.Campa�a
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
	public boolean gestionCampa�a(String temporada) {
		// TODO - implement Campa�a.gestionCampa�a
		throw new UnsupportedOperationException();
	}

}