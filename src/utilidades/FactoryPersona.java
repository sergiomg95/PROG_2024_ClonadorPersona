package utilidades;

import persona.Persona;

public class FactoryPersona {

	public static Persona getPersona(String nombre) {
		
		int peso=(int)(Math.random()*101);
		int altura=(int)(Math.random()*201);
		int edad=(int)(Math.random()*100);
		Persona p= new Persona(nombre, peso,altura,edad);

		
		return p;
	}


}
