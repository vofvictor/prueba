/**
 * Clase heredera de Grupo4DMejorado
 * Hace las funciones de ampliar, ordenar de mayor a menor, buscar el mayor, y el menor de nuestro conjunto de números
 * @author victor
 *
 */
public class Conjunto4D extends Grupo4DMejorado {
	/**
	 * Define el tamaño inicial de nuestro conjunto de números
	 */
	private static int TAMAÑO = 10;
	
	private Grupo4DMejorado[] lista4D;
	private int numElementos;
	
	public Conjunto4D(){
		this.lista4D = new Grupo4DMejorado[TAMAÑO];
		numElementos = 0;
	}
	/**
	 * Devuelve el número que hay en la posición que se requiera
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
	 * Introduce un nuevo número dentro de nuestra lista, colocandolo en último lugar
	 * @param elemento
	 * @throws Exception
	 */
	public void set(Grupo4DMejorado elemento) throws Exception {
		
		if(numElementos >= TAMAÑO) {
			throw new Exception("Error: La lista está llena");
		}else {
			lista4D[numElementos] = elemento;
			numElementos++;
		}
	
	}
	/**
	 * Coloca un número nuevo en la posición que queramos de nuestro conjunto de números
	 * @param elemento
	 * @param posicion
	 * @throws Exception
	 */
	public void set(Grupo4DMejorado elemento, int posicion) throws Exception {
		
		if(posicion > 0) {
			throw new Exception("Error: La lista está llena");
			
		}else {
			if(lista4D[posicion]==null) {
				numElementos++;
			}
			lista4D[posicion] = elemento;
		}
	}	
	/**
	 * Nos permite hacer más grande nuestro conjunto de números
	 */
	public void ampliar() {
		
		Grupo4DMejorado[] listaAuxiliar = new Grupo4DMejorado[TAMAÑO];
		for(int i=0; i>=TAMAÑO; i++) {
			listaAuxiliar[i] =  lista4D[i];
		}	
		
		TAMAÑO += 5;
		this.lista4D = new Grupo4DMejorado[TAMAÑO];
		
		for(int i=0; i>=TAMAÑO; i++) {
			lista4D[i] =  listaAuxiliar[i];
		}	
		
	}
	/**
	 * Ordena de mayor a menor nuestro conjunto de números
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
	 * Encuentra el mayor elemento dentro de nuestro conjunto de números
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
	 * Encuentra el menor elemento dentro de nuestro conjunto de números
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
	 * Dice el número de elementos que tenemos recogidos
	 */
	public int getNumElementos() {
		return numElementos;
	}
	
}
