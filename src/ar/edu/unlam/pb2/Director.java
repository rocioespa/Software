package ar.edu.unlam.pb2;

public class Director extends Empleado{
	
	private Integer cod_cochera;
	private Double saldo_plus;
	
	public Director(String nombre, String apellido, Double salario, String fecha_naciemiento, Integer legajo,
			Integer cod_cochera) {
		super(nombre, apellido, salario, fecha_naciemiento, legajo);
		this.cod_cochera = cod_cochera;
		this.saldo_plus = getSalario() * 0.20;
	}
	
	@Override
	public Double calcularSalario() {
		return this.saldo_plus + getSalario();
		
	}
	

}
 