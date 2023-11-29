package logico;

import java.util.ArrayList;

public class Doctor extends Persona {

	
	private String especialidadMedica;
	private ArrayList<Consulta>misConsultas;
	
	public Doctor(String cedula, String nombre, String codigo, String telefono, char sexo, String correoElectronico, String especialidadMedica, ArrayList<Consulta> misConsultas) {
		super(cedula, nombre, codigo, telefono, sexo, correoElectronico);
		this.especialidadMedica = especialidadMedica;
		this.misConsultas = misConsultas;
	}

	public String getEspecialidadMedica() {
		return especialidadMedica;
	}

	public void setEspecialidadMedica(String especialidadMedica) {
		this.especialidadMedica = especialidadMedica;
	}

	public ArrayList<Consulta> getMisConsultas() {
		return misConsultas;
	}

	public void setMisConsultas(ArrayList<Consulta> misConsultas) {
		this.misConsultas = misConsultas;
	}
	
	
	
	
}
