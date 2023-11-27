package logico;

public class Vivienda {
	
	private String nombre;
	private String direccion;
    private int numeroHab;
	private Persona propietario;
	
	
	public Vivienda(String nombre, String direccion, int numeroHab, Persona propietario) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.numeroHab = numeroHab;
		this.propietario = propietario;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
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
