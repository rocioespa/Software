package ar.edu.unlam.pb2;

public class Empleado {
	
	private String nombre;
	private String apellido;
	private Double salario;
	private String fecha_naciemiento;
	private Integer legajo;
	
	public Empleado(String nombre, String apellido, Double salario, String fecha_naciemiento, Integer legajo) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.salario = salario;
		this.fecha_naciemiento = fecha_naciemiento;
		this.legajo = legajo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public String getFecha_naciemiento() {
		return fecha_naciemiento;
	}

	public void setFecha_naciemiento(String fecha_naciemiento) {
		this.fecha_naciemiento = fecha_naciemiento;
	}

	public Integer getLegajo() {
		return legajo;
	}

	public void setLegajo(Integer legajo) {
		this.legajo = legajo;
	}

	public Double calcularSalario() {
		return 0.0;
	}
	
}
