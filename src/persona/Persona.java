package persona;

/**
 * Clase Persona que pondremos los atributos a la persona
 */
public class Persona {

	private String nombre;
	private int peso;
	private int altura;
	private int edad;
	
	/**
	 * Constructor de la clase persona personalizado en el que tendremos que poner los diferentes parametros
	 * @param nombre String que pide el nombre de la persona
	 * @param peso int que pide el peso de la persona
	 * @param altura int que pide la altura de la persona
	 * @param edad int que pide la edad de la persona
	 */
	public Persona(String nombre, int peso, int altura, int edad) {
		this.nombre = nombre;
		this.peso = peso;
		this.altura = altura;
		this.edad = edad;
	}

	/**
	 * Operacion get del nombre
	 * @return nos devuelve el nombre de la persona
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Operacion set del nombre
	 * @param nombre String que ponemos en el setter el nombre de la persona
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	

	/**
	 * Operacion get del peso
	 * @return nos devuelve el nombre de la persona
	 */
	public int getPeso() {
		return peso;
	}

	/**
	 * Operacion set del peso
	 * @param peso int que ponemos en el setter el peso de la persona
	 */
	public void setPeso(int peso) {
		this.peso = peso;
	}

	/**
	 * Operacion get de la altura
	 * @return nos devuelve la altura de la persona
	 */
	public int getAltura() {
		return altura;
	}

	/**
	 * Operacion set de la altura
	 * @param altura int que ponemos en el setter la altura de la persona
	 */
	public void setAltura(int altura) {
		this.altura = altura;
	}

	/**
	 * Operacion get de la edad
	 * @return nos devuelve la edad de la persona
	 */
	public int getEdad() {
		return edad;
	}
	/**
	 * Operacion set de la edad
	 * @param edad int que ponemos en el setter la edad de la persona
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}

	
	public String toString() {
		return "{" + nombre + "<" + peso + "> [" + altura + "] (" + edad + ")}";
	}
	
	
}
