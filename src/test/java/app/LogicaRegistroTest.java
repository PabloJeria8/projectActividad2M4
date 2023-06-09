package app;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class LogicaRegistroTest {
	
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
	public void testconcatenarPersona() {
		logicaRegistro.agregarPersona(persona1);
		assertEquals("Los datos de la persona son: Frank Serrano - frankserrano.ktd@orakle.cl",logicaRegistro.concatenarPersona(persona1));
	}
	

	

}
