package logico;

import java.io.Serializable;

public class Persona implements Serializable{
	
	  /**
	 * 
	 */
	private static final long serialVersionUID = -5445810864987070054L;
	private String cedula;
	  private String nombre;
	  private String direccion;
	  private String telefono;
	  private char sexo;
	  private String correoElectronico;
	  
	  
	public Persona(String cedula, String nombre, String direccion, String telefono, char sexo, String correoElectronico) {
		super();
		this.cedula = cedula;
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
		this.sexo = sexo;
		this.correoElectronico = correoElectronico;

	}
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public String getCorreoElectronico() {
		return correoElectronico;
	}
	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	  

}
