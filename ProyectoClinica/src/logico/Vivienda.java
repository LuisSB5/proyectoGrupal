package logico;

import java.io.Serializable;

public class Vivienda implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7303780482375372300L;
	private String nombreDue�o;
	private String rolDeldue�o;
    private int cantPersonas;
    private String direccion;
    
	public Vivienda(String nombreDue�o, String rolDeldue�o, int cantPersonas, String direccion) {
		super();
		this.nombreDue�o = nombreDue�o;
		this.rolDeldue�o = rolDeldue�o;
		this.cantPersonas = cantPersonas;
		this.direccion = direccion;
	}

	public String getNombreDue�o() {
		return nombreDue�o;
	}

	public void setNombreDue�o(String nombreDue�o) {
		this.nombreDue�o = nombreDue�o;
	}

	public String getRolDeldue�o() {
		return rolDeldue�o;
	}

	public void setRolDeldue�o(String rolDeldue�o) {
		this.rolDeldue�o = rolDeldue�o;
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

    