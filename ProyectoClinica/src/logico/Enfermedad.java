package logico;

import java.io.Serializable;

public class Enfermedad implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8881685758536126047L;
	private String CodEnfermedad;
	private String Nombre;
	private String Status;
	private String sintomas;
	private String tratamiento;
	
	public Enfermedad(String codEnfermedad, String nombre, String status, String sintomas, String tratamiento) {
		super();
		CodEnfermedad = codEnfermedad;
		Nombre = nombre;
		Status = status;
		this.sintomas = sintomas;
		this.tratamiento = tratamiento;
	}
	
	public String getCodEnfermedad() {
		return CodEnfermedad;
	}
	public void setCodEnfermedad(String codEnfermedad) {
		CodEnfermedad = codEnfermedad;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	public String getSintomas() {
		return sintomas;
	}
	public void setSintomas(String sintomas) {
		this.sintomas = sintomas;
	}
	public String getTratamiento() {
		return tratamiento;
	}
	public void setTratamiento(String tratamiento) {
		this.tratamiento = tratamiento;
	}
	
	

}
