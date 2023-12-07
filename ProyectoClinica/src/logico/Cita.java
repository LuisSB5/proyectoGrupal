package logico;

import java.io.Serializable;
import java.time.LocalTime;
import java.util.Date;

public class Cita implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3570706958928703217L;
	private String codCita;
	private  Date fecha;
	private Paciente paciente;
    private Doctor doctor;
	//private LocalTime hora;
	
	public Cita(String codCita, Date fecha, Paciente paciente, Doctor doctor) {
		super();
		this.codCita = codCita;
		this.fecha = fecha;
		this.paciente = paciente;
		this.doctor = doctor;
		//this.hora = hora;
	}

	

	public String getCodCita() {
		return codCita;
	}

	public void setCodCita(String codCita) {
		this.codCita = codCita;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
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

	/*
	public LocalTime getHora() {
		return hora;
	}

	public void setHora(LocalTime hora) {
		this.hora = hora;
	}

	*/

	

	
	
	
	

}
