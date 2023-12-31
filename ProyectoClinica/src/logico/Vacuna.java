package logico;

import java.io.Serializable;

public class Vacuna implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5824133997724623245L;
	private String codVacuna;
	private  String nombre;
	private String descripcion;
	private int cantDisponible;
	private String enfermedad;
	
	
	public Vacuna(String codVacuna, String nombre, String descripcion, int cantDisponible, String enfermedad) {
		super();
		this.codVacuna = codVacuna;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.cantDisponible = cantDisponible;
		this.enfermedad = enfermedad;
	}


	public String getCodVacuna() {
		return codVacuna;
	}


	public void setCodVacuna(String codVacuna) {
		this.codVacuna = codVacuna;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public int getCantDisponible() {
		return cantDisponible;
	}


	public void setCantDisponible(int cantDisponible) {
		this.cantDisponible = cantDisponible;
	}


	public String getEnfermedad() {
		return enfermedad;
	}


	public void setEnfermedad(String enfermedad) {
		this.enfermedad = enfermedad;
	}
	
	
	
	
}
