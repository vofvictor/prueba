/**
 * Esta parte del programa es la encargada de crear los números que
 * vamos a usar.
 * @author victor
 *
 */
public class Grupo4D {
	
	private double a;
	private double b;
	private double c;
	private double d;
	
	/**
	 * Este es el primer constructor.
	 */
	public Grupo4D() {
		
	}
	/**
	 * Esta parte anuncia los números variables @a @b @c y @d.
	 */
	public Grupo4D (double a, double b, double c, double d) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}
	
	/**
	 * Esta parte devuelve el número a
	 * @return 
	 */
	public double getA() {
		return a;
	}

	/**
	 * Esta parte genera el valor a
	 * @param a
	 */
	public void setA(double a) {
		this.a = a;
	}

	/**
	 * Esta parte devuelve el valor de b
	 * @return
	 */
	public double getB() {
		return b;
	}

	/**
	 * Esta parte declara el valor de b.
	 * @param b
	 */
	public void setB(double b) {
		this.b = b;
	}

	/**
	 * Esta parte devuelve el valor de c.
	 * @return
	 */
	public double getC() {
		return c;
	}

	/**
	 * Esta parte declara el valor de c.
	 * @param c
	 */
	public void setC(double c) {
		this.c = c;
	}

	/**
	 * Esta parte devuelve el valor de d.
	 * @return
	 */
	public double getD() {
		return d;
	}

	/**
	 * Esta parte declara el valor de d.
	 * @param d
	 */
	public void setD(double d) {
		this.d = d;
	}
	
	/**
	 * Esta parte devuelve una lista de los 4 números
	 */
	public String toString(){
		return a + " " + b + " " + c + " " + d;
	}
}

