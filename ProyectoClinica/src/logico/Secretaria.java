package logico;

public class Secretaria extends Persona{

	private String doctorAsignado;

	public String getDoctorAsignado() {
		return doctorAsignado;
	}

	public void setDoctorAsignado(String doctorAsignado) {
		this.doctorAsignado = doctorAsignado;
	}

	public Secretaria(String cedula, String nombre, String codigo, String telefono, char sexo, String correoElectronico,
			String doctorAsignado) {
		super(cedula, nombre, codigo, telefono, sexo, correoElectronico);
		this.doctorAsignado = doctorAsignado;
	}
}
