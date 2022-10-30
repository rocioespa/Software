package ar.edu.unlam.pb2;

import java.util.ArrayList;

public class Departamento {

	private ArrayList<Gerente> gerentes;

	public Departamento() {
		super();
		this.gerentes = new ArrayList<>();
	}

	public ArrayList<Gerente> getGerentes() {
		return gerentes;
	}

	public void setGerentes(ArrayList<Gerente> gerentes) {
		this.gerentes = gerentes;
	}

	public void agregarGerentu(Gerente gerentes) {
		this.gerentes.add(gerentes);
		
	}

	public void agregarUnSoloGerente(Gerente gerentes2) throws YaExisteUnGerenteException {
		
			if(getGerentes().size()>=1) {
				throw new YaExisteUnGerenteException("Ya existe un gerente");
			}else {
				this.gerentes.add(gerentes2);
			}
			
		
		
		
	}
	
	
}
