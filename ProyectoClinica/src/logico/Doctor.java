package logico;


public class Doctor extends Persona {
	
	private String especialidadMedica;
	
	public Doctor(String cedula, String nombre, String direccion, String telefono, char sexo, String correoElectronico, String especialidadMedica) {
		super(cedula, nombre, direccion, telefono, sexo, correoElectronico);
		this.especialidadMedica = especialidadMedica;
	}

	public String getEspecialidadMedica() {
		return especialidadMedica;
	}

	public void setEspecialidadMedica(String especialidadMedica) {
		this.especialidadMedica = especialidadMedica;
	}
	
}
