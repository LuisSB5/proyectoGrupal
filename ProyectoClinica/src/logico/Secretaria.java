package logico;

import java.io.Serializable;

public class Secretaria extends Persona implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6462184455284142704L;
	private String doctorAsignado;

	public String getDoctorAsignado() {
		return doctorAsignado;
	}

	public void setDoctorAsignado(String doctorAsignado) {
		this.doctorAsignado = doctorAsignado;
	}

	public Secretaria(String cedula, String nombre, String direccion, String telefono, char sexo, String correoElectronico,
			String doctorAsignado) {
		super(cedula, nombre, direccion, telefono, sexo, correoElectronico);
		this.doctorAsignado = doctorAsignado;
	}
}
