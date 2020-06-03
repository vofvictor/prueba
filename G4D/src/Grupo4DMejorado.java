/**
 * Mejora de nuestra clase anterior, añadiendo nuevas funciones
 * @author victor
 *
 */
public class Grupo4DMejorado extends Grupo4D implements Sumable {
	/**
	 * Constructor vacío
	 */
	public Grupo4DMejorado() {
		
	}
	/**
	 * Constructor con 4 números
	 * @param a
	 * @param b
	 * @param c
	 * @param d
	 */
	public Grupo4DMejorado(double a, double b, double c, double d) {
		super (a,b,c,d);
	}
	/**
	 * Constructor que coloca 4 números dentro de una lista
	 * @param vector
	 */
	public Grupo4DMejorado(double[] vector) {
		
		setA(vector[0]);
		setB(vector[1]);
		setC(vector[2]);
		setD(vector[3]);
		
	}
	/**
	 * Suma de nuestros 4 números introducidos
	 */
	public double getSuma() {
		return getA()+getB()+getC()+getD();
	}
	/**
	 * Encuentra la media de los valores introducidos
	 */
	public double getMedia() {
		return getSuma()/4;
	}
	/**
	 * Encuentra el valor máximo de entre nuestro conjunto de números
	 */
	public double getMaximo() {
		
		double max;
		max=getA();
		
		if(getB()>max) max=getB();
		if(getC()>max) max=getC();
		if(getD()>max) max=getD();
		
		return max;
	}
	/**
	 * Encuentra el valor menor de entre nuestro conjunto de números
	 */
	public double getMinimo() {
		
		double min;
		min=getA();
		
		if(getB()<min) min=getB();
		if(getC()<min) min=getC();
		if(getD()<min) min=getD();
		
		return min;
	}
	/**
	 * Permite ver los números dentro de la lista en el orden en el que se encuentran
	 * @return
	 */
	public double[] getValores() {
		
		double vector[] = {getA(), getB(), getC(), getD()};
		
		return vector;
	}
	/**
	 * Le da valores a nuestra lista de números
	 * @param vector
	 */
	public void setValores(double[] vector) {
		setA(vector[0]);
		setB(vector[1]);
		setC(vector[2]);
		setD(vector[3]);
	}
}
