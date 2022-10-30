package ar.edu.unlam.pb2;

public class Gerente extends Empleado {
	
	private Integer cod_cochera;

	public Gerente(String nombre, String apellido, Double salario, String fecha_naciemiento, Integer legajo,
			Integer cod_cochera) {
		super(nombre, apellido, salario, fecha_naciemiento, legajo);
		this.cod_cochera = cod_cochera;
	}

	@Override
	public String toString() {
		return "Gerente [cod_cochera=" + cod_cochera + ", getNombre()=" + getNombre() + ", getApellido()="
				+ getApellido() + ", getSalario()=" + getSalario() + ", getFecha_naciemiento()="
				+ getFecha_naciemiento() + ", getLegajo()=" + getLegajo() + ", calcularSalario()=" + calcularSalario()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	


	
	

}
