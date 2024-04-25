package clonadorPersona;

import java.util.ArrayList;
import java.util.List;
import persona.Persona;

/**
 * Clase ClonadorPersona que clonara la persona que queremos
 */
public class ClonadorPersona {

	private String nombre;

	public ClonadorPersona(String nombre) {
		this.nombre=nombre;
	}
	
	public List<Persona> generarClon(){
		
		List<Persona> personas = new ArrayList<Persona>();
		for(int i=0;i>=10;i++) {
			Persona p= new Persona(nombre,(int)(Math.random()*101),(int)(Math.random()*201),(int)(Math.random()*100));
			personas.add(p);
		}
		return personas;
		
	}
}
