package app;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Before;
import org.junit.Test;

public class LogicaRegistroTest_Calculo {
	
	private LogicaRegistro logicaRegistro;
	private Persona persona1;
	private Persona persona2;
	
	@Before
	public void setUp() {
		logicaRegistro = new LogicaRegistro();
		persona1 = new Persona("Frank","Serrano","frankserrano.ktd@orakle.cl", 35);
		persona2 = new Persona("Cristian","Hidalgo","christianhidalgo.ktd@orakle.cl",36);

		logicaRegistro.agregarPersona(persona1);
		logicaRegistro.agregarPersona(persona2);
	}
	
	@Test
	public void promedioEdadPersonas_Exito() {
		int promEdad = 0;
		
		promEdad = logicaRegistro.promedioEdadPersonas(logicaRegistro.getPersonas());
		assertEquals(35,promEdad);
	}
	
	@Test
	public void promedioEdadPersonas_Fallo() {
		int promEdad = 0;
		
		promEdad = logicaRegistro.promedioEdadPersonas(logicaRegistro.getPersonas());
		//assertEquals(20,promEdad);
		assertNotEquals(20, promEdad);
	}

}
