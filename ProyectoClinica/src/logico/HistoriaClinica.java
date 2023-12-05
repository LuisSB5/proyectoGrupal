package logico;

import java.io.Serializable;
import java.util.ArrayList;

public class HistoriaClinica implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2732017642219657821L;
	private  String codigo;
	private String cedPaciente;
    private  ArrayList<Vacuna>misVacunas;
	private  ArrayList<Consulta>misConsultas;
	private ArrayList<Enfermedad>misEnfermedades;
	
	
	
	public HistoriaClinica(String codigo, String cedPaciente, ArrayList<Vacuna> misVacunas,
			ArrayList<Consulta> misConsultas, ArrayList<Enfermedad> misEnfermedades) {
		super();
		this.codigo = codigo;
		this.cedPaciente = cedPaciente;
		this.misVacunas = misVacunas;
		this.misConsultas = misConsultas;
		this.misEnfermedades = misEnfermedades;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getCedPaciente() {
		return cedPaciente;
	}
	public void setCedPaciente(String cedPaciente) {
		this.cedPaciente = cedPaciente;
	}
	public ArrayList<Vacuna> getMisVacunas() {
		return misVacunas;
	}
	public void setMisVacunas(ArrayList<Vacuna> misVacunas) {
		this.misVacunas = misVacunas;
	}
	public ArrayList<Consulta> getMisConsultas() {
		return misConsultas;
	}
	public void setMisConsultas(ArrayList<Consulta> misConsultas) {
		this.misConsultas = misConsultas;
	}
	public ArrayList<Enfermedad> getMisEnfermedades() {
		return misEnfermedades;
	}
	public void setMisEnfermedades(ArrayList<Enfermedad> misEnfermedades) {
		this.misEnfermedades = misEnfermedades;
	}
	
	

}
