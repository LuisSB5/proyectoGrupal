package logico;

public class Viviendas {
	
	private String direccion;
    private int numeroHab;
	private Persona propietario;
	
	
	public Viviendas(String direccion, int numeroHab, Persona propietario) {
		super();
		this.direccion = direccion;
		this.numeroHab = numeroHab;
		this.propietario = propietario;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public int getNumeroHab() {
		return numeroHab;
	}
	public void setNumeroHab(int numeroHab) {
		this.numeroHab = numeroHab;
	}
	public Persona getPropietario() {
		return propietario;
	}
	public void setPropietario(Persona propietario) {
		this.propietario = propietario;
	}

}
