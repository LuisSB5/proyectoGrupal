package logico;

import java.io.Serializable;
import java.util.Date;

public class Consulta implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8017941757232106462L;
	private String codeConsulta;
	private  Date fechaConsulta;
	private String diagnostico;
	private Enfermedad enfermedad;
	private Paciente paciente;
	private Doctor doctor;
	private  Vacuna vacuna;
	private char status;
	
	
	public Consulta(String codeConsulta, Date fechaConsulta, String diagnostico, Enfermedad enfermedad,
			Paciente paciente, Doctor doctor, Vacuna vacuna, char status) {
		super();
		this.codeConsulta = codeConsulta;
		this.fechaConsulta = fechaConsulta;
		this.diagnostico = diagnostico;
		this.enfermedad = enfermedad;
		this.paciente = paciente;
		this.doctor = doctor;
		this.vacuna = vacuna;
		this.status = status;
	}
	public String getCodeConsulta() {
		return codeConsulta;
	}
	public void setCodeConsulta(String codeConsulta) {
		this.codeConsulta = codeConsulta;
	}
	public Date getFechaConsulta() {
		return fechaConsulta;
	}
	public void setFechaConsulta(Date fechaConsulta) {
		this.fechaConsulta = fechaConsulta;
	}
	public String getDiagnostico() {
		return diagnostico;
	}
	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}
	public Enfermedad getEnfermedad() {
		return enfermedad;
	}
	public void setEnfermedad(Enfermedad enfermedad) {
		this.enfermedad = enfermedad;
	}
	public Paciente getPaciente() {
		return paciente;
	}
	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
	public Doctor getDoctor() {
		return doctor;
	}
	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}
	public Vacuna getVacuna() {
		return vacuna;
	}
	public void setVacuna(Vacuna vacuna) {
		this.vacuna = vacuna;
	}
	public char getStatus() {
		return status;
	}
	public void setStatus(char status) {
		this.status = status;
	}

	
	
}
