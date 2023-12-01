package logico;

import java.util.ArrayList;

public class Paciente extends Persona{

	private String SeguroMedico;
	private HistoriaClinica hist;
	private int peso;
	private int altura;
	private  String tipoDeSangre;
	private ArrayList<Consulta>misConsultas;
	
	
	public Paciente(String cedula, String nombre, String codigo, String telefono, char sexo, String correoElectronico) {
		super(cedula, nombre, codigo, telefono, sexo, correoElectronico);
		// TODO Auto-generated constructor stub
	}

	public String getSeguroMedico() {
		return SeguroMedico;
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
