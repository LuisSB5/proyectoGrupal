package logico;

import java.io.Serializable;

public class Secretaria extends Persona implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6462184455284142704L;
	private int edad;
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public Secretaria(String cedula, String nombre, String direccion, String telefono, char sexo,
			String correoElectronico, int edad) {
		super(cedula, nombre, direccion, telefono, sexo, correoElectronico);
		this.edad = edad;
	}
	
	
	
}
