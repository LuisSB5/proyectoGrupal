package logico;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

public class Paciente extends Persona implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3306698431925793358L;
	private String SeguroMedico;
	private HistoriaClinica hist;
	private int peso;
	private int altura;
	private  String tipoDeSangre;
	private Date fechaNacim;
	private ArrayList<Consulta>misConsultas;

	public Paciente(String cedula, String nombre, String direccion, String telefono, char sexo,
			String correoElectronico, String seguroMedico, HistoriaClinica hist, int peso, int altura,
			String tipoDeSangre, Date fechaNacim, ArrayList<Consulta> misConsultas) {
		super(cedula, nombre, direccion, telefono, sexo, correoElectronico);
		SeguroMedico = seguroMedico;
		this.hist = hist;
		this.peso = peso;
		this.altura = altura;
		this.tipoDeSangre = tipoDeSangre;
		this.fechaNacim = fechaNacim;
		this.misConsultas = misConsultas;
	}


	public String getSeguroMedico() {
		return SeguroMedico;
	}


	public Date getFechaNacim() {
		return fechaNacim;
	}

	public void setFechaNacim(Date fechaNacim) {
		this.fechaNacim = fechaNacim;
	}

	public void setSeguroMedico(String seguroMedico) {
		SeguroMedico = seguroMedico;
	}


	public HistoriaClinica getHist() {
		return hist;
	}


	public void setHist(HistoriaClinica hist) {
		this.hist = hist;
	}


	public int getPeso() {
		return peso;
	}


	public void setPeso(int peso) {
		this.peso = peso;
	}


	public int getAltura() {
		return altura;
	}


	public void setAltura(int altura) {
		this.altura = altura;
	}


	public String getTipoDeSangre() {
		return tipoDeSangre;
	}


	public void setTipoDeSangre(String tipoDeSangre) {
		this.tipoDeSangre = tipoDeSangre;
	}


	public ArrayList<Consulta> getMisConsultas() {
		return misConsultas;
	}


	public void setMisConsultas(ArrayList<Consulta> misConsultas) {
		this.misConsultas = misConsultas;
	}
	
}
