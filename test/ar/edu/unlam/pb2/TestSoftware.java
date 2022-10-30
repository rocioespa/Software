package ar.edu.unlam.pb2;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestSoftware {

	@Test
	public void queSePuedaPuedaCrearUnSoftware() {
		Software soft = new Software();
		assertNotNull(soft);
	}
	
	@Test
	public void queSePuedaAgregarEmpleadosAlSoftware()  throws YaExisteEmpleado{
		Software soft = new Software();
		Empleado empleado = new Empleado("rocio","apellido",150000.0,"2001",1);
		soft.agregarEmpleado(1, empleado);
		assertEquals(1,soft.getEmpleados().size());
	}

	@Test 
	public void queSePuedaAgregarDepartamentoAlSoftware() {
		Software soft = new Software();
		Departamento depa = new Departamento ();
		soft.agregarDepartamento(depa);
		assertEquals(1,soft.getDepartamentos().size());
	}
	
	@Test
	public void queSePuedaAgregarVariosGerentesAlSoftware()  {
		Software soft = new Software();
		Departamento depa = new Departamento ();
		Gerente gerentes = new Gerente("lola","pipu",180000.0,"2001",2,101); 
		Gerente gerentes1 = new Gerente("lola","pipu",180000.0,"2001",3,102); 
		depa.agregarGerentu(gerentes);
		depa.agregarGerentu(gerentes1);
		assertEquals(2,depa.getGerentes().size());
	}
	
	@Test
	public void queSePuedaCalcularElSalarioDeUnIngeniero() {
		Software soft = new Software();
		Ingeniero feto = new Ingeniero("lola","pipu",180000.0,"2001",3);
		assertEquals(198000.0,feto.calcularSalario(), 0.01);
	}
	
	@Test
	public void queSePuedaCalcularElSalarioDeUnDirector() {
		Software soft = new Software();
		Director elDire = new Director("lola","pipu",180000.0,"2001",3,103);
		assertEquals(216000.0,elDire.calcularSalario(), 0.01);
	}
	
	@Test (expected = YaExisteUnGerenteException.class)
	public void queNoSePuedaAgregarMasDeUnGerenteAlDepartamento() throws YaExisteUnGerenteException {
		Software soft = new Software();
		Departamento depa = new Departamento ();
		Gerente gerentes = new Gerente("lola","pipu",180000.0,"2001",2,101); 
		Gerente gerentes1 = new Gerente("lola","pipu",180000.0,"2001",3,102); 
		depa.agregarUnSoloGerente(gerentes);
		depa.agregarUnSoloGerente(gerentes1);
	}
	
	@Test(expected = YaExisteEmpleado.class)
	public void queNoSePuedaAgregarEmpleadosDeUnMismoLegajo()  throws YaExisteEmpleado{
		Software soft = new Software();
		Empleado empleado = new Empleado("rocio","apellido",150000.0,"2001",1);
		Empleado empleado1 = new Empleado("rocio","apellido",150000.0,"2001",1);
		soft.agregarEmpleado(1, empleado);
		soft.agregarEmpleado(1, empleado1);
	}
}
