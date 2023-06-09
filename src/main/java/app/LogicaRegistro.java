package app;

import java.util.ArrayList;
import java.util.List;

public class LogicaRegistro {
	
	private List<Persona> personas;

	public LogicaRegistro() {
		// super();
		personas = new ArrayList<>();
	}

	public List<Persona> getPersonas() {
		return personas;
	}
	
	public void agregarPersona(Persona persona) {
		this.personas.add(persona);
	}

	public void eliminarPersona(Persona persona) {
		this.personas.remove(persona);
	}
	
	public String concatenarPersona(Persona persona) {
		String resultado;
		
		resultado = "Los datos de la persona son: " + persona.getNombre()+" "+ persona.getApellido() + " - " +persona.getEmail();
		return resultado;
	}
	
	public int promedioEdadPersonas(List<Persona> personas) {
		int total = 0;

		for (Persona persona: personas) {
			// total = producto.getPrecio()+total;
			total += persona.getEdad();
		}
		
		total = (total/personas.size());

		return total;
		
	}

}
