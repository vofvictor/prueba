/**
 * Esta parte del programa se encarga de definir todas las cosas básicas 
 * de las listas de números que este programa vaya a crear.
 * 
 * @author victor
 *
 */
public interface Sumable {
	
	/**
	 * Suma los números que le hayamos dado
	 * @return
	 */
	public double getSuma();
	
	/**
	 * Hace una media de los números que le hayamos dado
	 * @return
	 */
	public double getMedia();
	
	/**
	 * Encuentra el número mayor de entre los que le hayamos dado
	 * @return
	 */
	public double getMaximo();
	
	/**
	 * Encuentra el número menor de entre todos los que le hayamos dado
	 * @return
	 */
	public double getMinimo();
		
	
}
