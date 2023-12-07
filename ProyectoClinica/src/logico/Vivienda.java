package logico;

import java.io.Serializable;

public class Vivienda implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7303780482375372300L;
	private String nombreDueño;
	private String rolDeldueño;
    private int cantPersonas;
    private String direccion;
    
	public Vivienda(String nombreDueño, String rolDeldueño, int cantPersonas, String direccion) {
		super();
		this.nombreDueño = nombreDueño;
		this.rolDeldueño = rolDeldueño;
		this.cantPersonas = cantPersonas;
		this.direccion = direccion;
	}

	public String getNombreDueño() {
		return nombreDueño;
	}

	public void setNombreDueño(String nombreDueño) {
		this.nombreDueño = nombreDueño;
	}

	public String getRolDeldueño() {
		return rolDeldueño;
	}

	public void setRolDeldueño(String rolDeldueño) {
		this.rolDeldueño = rolDeldueño;
	}

	public int getCantPersonas() {
		return cantPersonas;
	}

	public void setCantPersonas(int cantPersonas) {
		this.cantPersonas = cantPersonas;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
    
}

    