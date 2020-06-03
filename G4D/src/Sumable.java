/**
 * Esta parte del programa se encarga de definir todas las cosas b�sicas 
 * de las listas de n�meros que este programa vaya a crear.
 * 
 * @author victor
 *
 */
public interface Sumable {
	
	/**
	 * Suma los n�meros que le hayamos dado
	 * @return
	 */
	public double getSuma();
	
	/**
	 * Hace una media de los n�meros que le hayamos dado
	 * @return
	 */
	public double getMedia();
	
	/**
	 * Encuentra el n�mero mayor de entre los que le hayamos dado
	 * @return
	 */
	public double getMaximo();
	
	/**
	 * Encuentra el n�mero menor de entre todos los que le hayamos dado
	 * @return
	 */
	public double getMinimo();
		
	
}
