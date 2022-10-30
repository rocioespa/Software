package ar.edu.unlam.pb2;

import java.util.ArrayList;
import java.util.HashMap;

public class Software {
	
	private HashMap<Integer, Empleado> empleados;
	private ArrayList <Departamento> departamentos;
	
	public Software() {
		super();
		this.empleados = new HashMap<>();
		this.departamentos = new ArrayList<>();
	}

	public void agregarEmpleado(Integer i, Empleado empleado)  throws YaExisteEmpleado {
		if(this.empleados.containsKey(i)) {
			throw new YaExisteEmpleado("Dni Duplicado");
		}
		this.empleados.put(i, empleado);
		
	}

	public HashMap<Integer, Empleado> getEmpleados() {
		return empleados;
	}

	public void setEmpleados(HashMap<Integer, Empleado> empleados) {
		this.empleados = empleados;
	}

	public ArrayList<Departamento> getDepartamentos() {
		return departamentos;
	}

	public void setDepartamentos(ArrayList<Departamento> departamentos) {
		this.departamentos = departamentos;
	}

	public void agregarDepartamento(Departamento depa) {
		this.departamentos.add(depa);
		
	}
	
	

}
