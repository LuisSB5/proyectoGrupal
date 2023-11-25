package logico;

import java.util.ArrayList;

public class Clinica {

	private ArrayList<Enfermedad>misEnfermedades;
    private  ArrayList<Vacuna>misVacunas;
	private ArrayList<Consulta>misConsultas;
	private ArrayList<Persona>misPersonas;
	private ArrayList<HistoriaClinica>misHistoriales;
	private ArrayList<Cita>misCitas;
	private  ArrayList<Vivienda>misViviendas;
	
	private static Clinica clinica=null;
	
	private Clinica() {
		super();
		misEnfermedades = new ArrayList<Enfermedad>();
		misVacunas = new ArrayList<Vacuna>();
		misConsultas = new ArrayList<Consulta>();
		misPersonas = new ArrayList<Persona>();
		misHistoriales = new ArrayList<HistoriaClinica>();
		misCitas = new ArrayList<Cita>();
		
	}
	
	public static Clinica getInstance() {
		
		if (clinica==null)
			clinica = new Clinica();
		return clinica;
		
	}


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

	public ArrayList<Vivienda> getMisViviendas() {
		return misViviendas;
	}

	public void setMisViviendas(ArrayList<Vivienda> misViviendas) {
		this.misViviendas = misViviendas;
	}
	public void agregarPersona(Persona persona) {
        misPersonas.add(persona);
    }
	
	public void agregarVacuna(Vacuna vacuna) {
        misVacunas.add(vacuna);
    }
	
	public void agregarEnfermedad(Enfermedad enfermedad) {
        misEnfermedades.add(enfermedad);
    }
	public void agregarCita (Cita cita) {
        misCitas.add(cita);
    }
	public void agregarConsulta(Consulta consulta) {
        misConsultas.add(consulta);
    }
	public void agregarVivienda(Vivienda vivienda) {
        misViviendas.add(vivienda);
    }
	
	public void agregarHistoriaClinico(HistoriaClinica historial) {
        misHistoriales.add(historial);
    }
	

	public Persona buscarPersonaByCodigo(String codigoPersona) {
		Persona aux = null;
		boolean encontrado = false;
		int i=0;
		while (!encontrado && i<misPersonas.size()) {
			if(misPersonas.get(i).getCodigo().equalsIgnoreCase(codigoPersona)){
				aux = misPersonas.get(i);
				encontrado = true;
			}
			i++;
		}
		
		return aux;
	}
	
	public Doctor buscarDoctorByUser(String codigo) {
	    Doctor aux = null;
	    boolean encontrado = false;
	    int i = 0;
	    
	    while (!encontrado && i < misPersonas.size()) {
	        if (misPersonas.get(i) instanceof Doctor) {
	            Doctor doctor = (Doctor) misPersonas.get(i);
	            if (doctor.getCodigo().equals(codigo)) {
	                aux = doctor;
	                encontrado = true;
	            }
	        }
	        i++;
	    }
	    
	    return aux;
	}
	
	public void eliminarPersona(logico.Persona selected) {
		misPersonas.remove(selected);
	}
	
	public Cita buscarCitaByCode(String Code) {
		Cita aux = null;
		boolean encontrado = false;
		int i=0;
		while (!encontrado && i<misCitas.size()) {
			if(misCitas.get(i).getCodCita().equalsIgnoreCase(Code)){
				aux = misCitas.get(i);
				encontrado = true;
			}
			i++;
		}
		return aux;
	}
	

	
}