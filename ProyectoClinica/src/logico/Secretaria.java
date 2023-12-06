package logico;

import java.io.Serializable;

public class Secretaria extends Persona implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6462184455284142704L;
	private Doctor doctorAsignado;
	public Doctor getDoctorAsignado() {
		return doctorAsignado;
	}
	public void setDoctorAsignado(Doctor doctorAsignado) {
		this.doctorAsignado = doctorAsignado;
	}
	public Secretaria(String cedula, String nombre, String direccion, String telefono, char sexo,
			String correoElectronico, Doctor doctorAsignado) {
		super(cedula, nombre, direccion, telefono, sexo, correoElectronico);
		this.doctorAsignado = doctorAsignado;
	}

	
}
