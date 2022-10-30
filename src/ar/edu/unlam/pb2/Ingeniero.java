package ar.edu.unlam.pb2;

public class Ingeniero extends Empleado{
	
	private Double saldo_produ;

	public Ingeniero(String nombre, String apellido, Double salario, String fecha_naciemiento, Integer legajo) {
		super(nombre, apellido, salario, fecha_naciemiento, legajo);
		this.saldo_produ = getSalario() * 0.10;
	}
	
	
	public Double getSaldo_produ() {
		return saldo_produ;
	}



	public void setSaldo_produ(Double saldo_produ) {
		this.saldo_produ = saldo_produ;
	}
	
	@Override
	public Double calcularSalario() {
		return this.saldo_produ + getSalario();
		
	}
	
	

}
