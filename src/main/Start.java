package main;

import java.util.List;

import clonadorPersona.ClonadorPersona;
import persona.Persona;

public class Start {

	public static void main(String[] args) {
		
		ClonadorPersona cp= new ClonadorPersona("Marcos");
		
		List<Persona> personas=cp.generarClon();
		System.out.println(personas);
	}

}
