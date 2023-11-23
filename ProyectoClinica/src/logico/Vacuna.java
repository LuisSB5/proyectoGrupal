package logico;

public class Vacuna {

	private String codVacuna;
	private  String nombre;
	private String descripcion;
	private int cantDisponible;
	private Enfermedad enfermedad;
	
	
	public Vacuna(String codVacuna, String nombre, String descripcion, int cantDisponible, Enfermedad enfermedad) {
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


	public Enfermedad getEnfermedad() {
		return enfermedad;
	}


	public void setEnfermedad(Enfermedad enfermedad) {
		this.enfermedad = enfermedad;
	}
	
	
	
	
}
