package utilidades;

import persona.Persona;
import persona.PersonaData;

public class FactoryPersona {

	public static Persona getPersona(String nombre) throws Exception {
		
		int peso=(int)(Math.random()*101);
		if(peso<=PersonaData.PESO_MIN || peso>=PersonaData.PESO_MAX) {
			throw new Exception("Peso no valido");
		}
		int altura=(int)(Math.random()*201);
		if(altura<=PersonaData.ALTURA_MIN || altura>=PersonaData.ALTURA_MAX) {
			throw new Exception("Altura no valida");
		}
		int edad=(int)(Math.random()*100);
		if(edad<=PersonaData.EDAD_MIN || edad>=PersonaData.EDAD_MAX) {
			throw new Exception("Edad no valida");
		}
		Persona p= new Persona(nombre, peso,altura,edad);

		
		return p;
	}


}
