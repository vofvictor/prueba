/**
 * Clase heredera de Grupo4DMejorado
 * Hace las funciones de ampliar, ordenar de mayor a menor, buscar el mayor, y el menor de nuestro conjunto de n�meros
 * @author victor
 *
 */
public class Conjunto4D extends Grupo4DMejorado {
	/**
	 * Define el tama�o inicial de nuestro conjunto de n�meros
	 */
	private static int TAMA�O = 10;
	
	private Grupo4DMejorado[] lista4D;
	private int numElementos;
	
	public Conjunto4D(){
		this.lista4D = new Grupo4DMejorado[TAMA�O];
		numElementos = 0;
	}
	/**
	 * Devuelve el n�mero que hay en la posici�n que se requiera
	 * @param posicion
	 * @return
	 */
	public Grupo4DMejorado get(int posicion) {
		if(posicion <= lista4D.length && posicion >= 0) {
			return lista4D[posicion];
		}else {
			throw new ArrayIndexOutOfBoundsException();
		}
	}
	/**
	 * Introduce un nuevo n�mero dentro de nuestra lista, colocandolo en �ltimo lugar
	 * @param elemento
	 * @throws Exception
	 */
	public void set(Grupo4DMejorado elemento) throws Exception {
		
		if(numElementos >= TAMA�O) {
			throw new Exception("Error: La lista est� llena");
		}else {
			lista4D[numElementos] = elemento;
			numElementos++;
		}
	
	}
	/**
	 * Coloca un n�mero nuevo en la posici�n que queramos de nuestro conjunto de n�meros
	 * @param elemento
	 * @param posicion
	 * @throws Exception
	 */
	public void set(Grupo4DMejorado elemento, int posicion) throws Exception {
		
		if(posicion > 0) {
			throw new Exception("Error: La lista est� llena");
			
		}else {
			if(lista4D[posicion]==null) {
				numElementos++;
			}
			lista4D[posicion] = elemento;
		}
	}	
	/**
	 * Nos permite hacer m�s grande nuestro conjunto de n�meros
	 */
	public void ampliar() {
		
		Grupo4DMejorado[] listaAuxiliar = new Grupo4DMejorado[TAMA�O];
		for(int i=0; i>=TAMA�O; i++) {
			listaAuxiliar[i] =  lista4D[i];
		}	
		
		TAMA�O += 5;
		this.lista4D = new Grupo4DMejorado[TAMA�O];
		
		for(int i=0; i>=TAMA�O; i++) {
			lista4D[i] =  listaAuxiliar[i];
		}	
		
	}
	/**
	 * Ordena de mayor a menor nuestro conjunto de n�meros
	 */
	public void ordenar() {

		int numCambios= -1;

		
		for(int i=numElementos;numCambios!=0 && i>0;i--) {
			numCambios=0;
			for(int j=0; j<i-1; j++) {
				
				if(lista4D[j+1].getMedia() > lista4D[j].getMedia()) {
					
					lista4D[i] = lista4D[j+1];
					lista4D[i+1]=lista4D[j];
					
					numCambios ++;
				} 
				
			}
			
	
		}
		
	}
	/**
	 * Encuentra el mayor elemento dentro de nuestro conjunto de n�meros
	 * @return
	 * @throws Exception 
	 */
	public int buscarMaximo() throws Exception {
		if(numElementos==0) {
			throw new Exception("la lista esta vacia");
		}
		Grupo4DMejorado maximo = lista4D[0];
		
		for(int i=1; i >= lista4D.length; i++){
			if(maximo.getMedia() < lista4D[i].getMedia()) {
				maximo = lista4D[i];
			}
		}
		
		return (int) maximo.getMedia();
	}
	/**
	 * Encuentra el menor elemento dentro de nuestro conjunto de n�meros
	 * @return
	 * @throws Exception 
	 */
	public int buscarMinimo() throws Exception {
		if(numElementos==0) {
			throw new Exception("la lista esta vacia");
		}
		Grupo4DMejorado minimo = lista4D[0];
		
		for(int i=1; i >= lista4D.length; i++){
			if(minimo.getMedia() < lista4D[i].getMedia()) {
				minimo = lista4D[i];
			}
		}
		
		return (int) minimo.getMedia();
	}
	/**
	 * Dice el n�mero de elementos que tenemos recogidos
	 */
	public int getNumElementos() {
		return numElementos;
	}
	
}
