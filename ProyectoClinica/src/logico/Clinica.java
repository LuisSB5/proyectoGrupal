package logico;

import java.util.ArrayList;

public class Clinica {

	private ArrayList<Enfermedad>misEnfermedades;
    private  ArrayList<Vacuna>misVacunas;
	private ArrayList<Consulta>misConsultas;
	private ArrayList<Persona>misPersonas;
	private ArrayList<HistoriaClinica>misHistoriales;
	private ArrayList<Cita>misCitas;
	private  ArrayList<Viviendas>misViviendas;
	
	

	public ArrayList<Enfermedad> getMisEnfermedades() {
		return misEnfermedades;
	}

	public void setMisEnfermedades(ArrayList<Enfermedad> misEnfermedades) {
		this.misEnfermedades = misEnfermedades;
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

	public ArrayList<Persona> getMisPersonas() {
		return misPersonas;
	}

	public void setMisPersonas(ArrayList<Persona> misPersonas) {
		this.misPersonas = misPersonas;
	}

	public ArrayList<HistoriaClinica> getMisHistoriales() {
		return misHistoriales;
	}

	public void setMisHistoriales(ArrayList<HistoriaClinica> misHistoriales) {
		this.misHistoriales = misHistoriales;
	}

	public ArrayList<Cita> getMisCitas() {
		return misCitas;
	}

	public void setMisCitas(ArrayList<Cita> misCitas) {
		this.misCitas = misCitas;
	}

	public ArrayList<Viviendas> getMisViviendas() {
		return misViviendas;
	}

	public void setMisViviendas(ArrayList<Viviendas> misViviendas) {
		this.misViviendas = misViviendas;
	}
	
	
	
}