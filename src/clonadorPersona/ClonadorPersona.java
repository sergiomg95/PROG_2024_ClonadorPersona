package clonadorPersona;

import java.util.ArrayList;
import java.util.List;
import persona.Persona;
import utilidades.FactoryPersona;

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
		for(int i=0;i<=10;i++) {
			Persona p= FactoryPersona.getPersona(nombre);
			
			personas.add(0,p);
		}
		return personas;	
	}
	
}
