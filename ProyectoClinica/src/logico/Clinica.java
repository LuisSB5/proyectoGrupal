package logico;

import java.io.Serializable;
import java.util.ArrayList;

import javax.swing.JOptionPane;


public class Clinica implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7715258387587364501L;
	private ArrayList<Enfermedad>misEnfermedades;
    private ArrayList<Vacuna>misVacunas;
	private ArrayList<Consulta>misConsultas;
	private ArrayList<Persona>misPersonas;
	private ArrayList<HistoriaClinica>misHistoriales;
	private ArrayList<Cita>misCitas;
	private ArrayList<Vivienda>misViviendas;
	private ArrayList<User>misUsers;
	private static User loginUser;
	private static int codPatologia;
	private static int codVacuna;
	private static int codConsulta;
	private static int codCita;
	private static int codHistorial;
	
	private static Clinica clinica=null;
	
	private Clinica() {
		super();
		misEnfermedades = new ArrayList<Enfermedad>();
		misVacunas = new ArrayList<Vacuna>();
		misConsultas = new ArrayList<Consulta>();
		misPersonas = new ArrayList<Persona>();
		misHistoriales = new ArrayList<HistoriaClinica>();
		misCitas = new ArrayList<Cita>();
		misUsers = new ArrayList<User>();
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
	
	public ArrayList<User> getMisUsers() {
		return misUsers;
	}

	public void setMisUsers(ArrayList<User> misUsers) {
		this.misUsers = misUsers;
	}

	public static User getLoginUser() {
		return loginUser;
	}

	public static void setLoginUser(User loginUser) {
		Clinica.loginUser = loginUser;
	}

	public static Clinica getClinica() {
		return clinica;
	}

	public static void setClinica(Clinica clinica) {
		Clinica.clinica = clinica;
	}

	public static int getCodPatologia() {
		return codPatologia;
	}

	public static void setCodPatologia(int codPatologia) {
		Clinica.codPatologia = codPatologia;
	}
	public static int getCodVacuna() {
		return codVacuna;
	}

	public static void setCodVacuna(int codVacuna) {
		Clinica.codVacuna = codVacuna;
	}
	
	public static int getCodConsulta() {
		return codConsulta;
	}

	public static void setCodConsulta(int codConsulta) {
		Clinica.codConsulta = codConsulta;
	}

	public static int getCodCita() {
		return codCita;
	}

	public static void setCodCita(int codCita) {
		Clinica.codCita = codCita;
	}
	
	public static int getCodHistorial() {
		return codHistorial;
	}

	public static void setCodHistorial(int codHistorial) {
		Clinica.codHistorial = codHistorial;
	}

	
	public static int getGeneradorCodigoCita() {
		return codCita++;
	}
	
	public static int getGeneradorCodigoConsulta() {
		return codConsulta++;
	}
	
	public static int getGeneradorCodigoPatologia() {
		return codPatologia++;
	}
	
	public static int getGeneradorCodigoVacuna() {
		return codVacuna++;
	}
	public static int getGeneradorCodigoHistorial() {
		return codHistorial++;
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
	/*public void agregarVivienda(Vivienda vivienda) {
        misViviendas.add(vivienda);
    }*/
	public void agregarVivienda(Vivienda vivienda) {
	    if (misViviendas == null) {
	        misViviendas = new ArrayList<>(); 
	    }
	    misViviendas.add(vivienda);
	}

	
	public void agregarHistoriaClinico(HistoriaClinica historial) {
        misHistoriales.add(historial);
    }

	public void regUser(User user) {
		misUsers.add(user);
	}

	
	public Persona buscarPersonaByCodigo(String codigoPersona) {
		Persona aux = null;
		boolean encontrado = false;
		int i=0;
		while (!encontrado && i<misPersonas.size()) {
			if(misPersonas.get(i).getCedula().equalsIgnoreCase(codigoPersona)){
				aux = misPersonas.get(i);
				encontrado = true;
			}
			i++;
		}
		
		return aux;
	}
	
	/*public Doctor buscarDoctorByUser(String codigo) {
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
	*/
	
	/*public void eliminarPersona(logico.Persona selected) {
		misPersonas.remove(selected);
	}*/
	public void eliminarPersona(Persona selected) {
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
	
	public Consulta buscarConsultByCode(String code) {
		
		Consulta consult = null;
		boolean encontrado = false;
		int i = 0;
		while(!encontrado && i<misConsultas.size()) {
			if(misConsultas.get(i).getCodeConsulta().equalsIgnoreCase(code)) {
				consult = misConsultas.get(i);
				encontrado = true;
			}
		}
		
		return consult;
	}
	
	
	public int getCantConsultas() {
		int total = 0;
		int i = 0;
		while(i<misConsultas.size()) {
			total++;
			i++;
		}
		return total;
	}
	
	public boolean confirmLogin(String text, String text2) {
		boolean login = false;
		for (User user : misUsers) {
			if(user.getUsername().equals(text) && user.getPassword().equals(text2)){
				loginUser = user;
				login = true;
			}
		}
		return login;
	}

	public Doctor buscarDoctorByCedula(String cedula) {
		Doctor aux = null;
	    boolean encontrado = false;
	    int i = 0;
	    
	    while (!encontrado && i < misPersonas.size()) {
	        if (misPersonas.get(i) instanceof Doctor) {
	            Doctor doctor = (Doctor) misPersonas.get(i);
	            if (doctor.getCedula().equals(cedula)) {
	                aux = doctor;
	                encontrado = true;
	            }
	        }
	        i++;
	    }
		return aux;
	}
	
	public Paciente buscarPacientePorID(String cedula) {
	    Paciente aux=null;
	    boolean encontrado= false;
	    int i = 0;
	    
	    while (!encontrado && i < misPersonas.size()) {
	        if (misPersonas.get(i) instanceof Paciente) {
	            Paciente paciente = (Paciente) misPersonas.get(i);
	            if (paciente.getCedula().equalsIgnoreCase(cedula)) {
	                aux = paciente;
	                encontrado = true;
	            }
	        }
	        i++;
	    }
		return aux;
	     
	    
	}
	
	public Enfermedad buscarEnfermedadByNomb(String nombre) {
		
		Enfermedad enf = null;
		boolean encontrado = false;
		int i = 0;
		
		 while (!encontrado && i < misEnfermedades.size()) {
		        if (misEnfermedades.get(i).getNombre().equals(nombre)) {
		        		enf = misEnfermedades.get(i);
		        		encontrado = true;
		        }
		        i++;
		    }
		
		return enf;
	}
	
	public Vacuna buscarVacunaByNomb(String nombre) {
		
		Vacuna vac = null;
		boolean encontrado = false;
		int i = 0;
		
		 while (!encontrado && i < misVacunas.size()) {
		        if (misVacunas.get(i).getNombre().equals(nombre)) {
		        		vac = misVacunas.get(i);
		        		encontrado = true;
		        }
		        i++;
		    }
		
		return vac;
	}
	
	public Secretaria buscarSecretariaByCedula(String cedula) {
		Secretaria secre = null;
		boolean encontrado = false;
		int i = 0;
		
		while(!encontrado && i<misPersonas.size()) {
			if(misPersonas.get(i) instanceof Secretaria) {
				if(misPersonas.get(i).getCedula().equals(cedula)) {
					secre = (Secretaria)misPersonas.get(i);
				}
			}
		}
		return secre;
	}
	
	//Prueba
	public Doctor buscarDoctorByNomb (String nombre) {
		Doctor doc = null;
		boolean encontrado = false;
		int i = 0;
		
		while(!encontrado && i<misPersonas.size()) {
			if(misPersonas.get(i) instanceof Doctor) {
				if(misPersonas.get(i).getNombre().equalsIgnoreCase(nombre)) {
					doc = (Doctor) misPersonas.get(i);
				}
			}
		}
		
		return doc;
	}
	
	public HistoriaClinica buscarHistorialByCedulaPaciente(String cedula) {
		
		HistoriaClinica hist = null;
		boolean encontrado = false;
		int i = 0;
		
		while(!encontrado && i<misHistoriales.size()) {
			if(misHistoriales.get(i).getCedPaciente().equalsIgnoreCase(cedula)) {
				hist = misHistoriales.get(i);
			}
		}
		
		return hist;
		
		
	}

	public void actualizarEnfermedad(Enfermedad enf) {
	int index= buscarIndexEnfermedadByCode(enf.getCodEnfermedad());
	misEnfermedades.set(index, enf);
	
		
	}

	private int buscarIndexEnfermedadByCode(String codEnfermedad) {
		int index =-1;
		boolean encontrado = false;
		int i = 0;
		
		 while (!encontrado && i < misEnfermedades.size()) {
		        if (misEnfermedades.get(i).getCodEnfermedad().equals(codEnfermedad)) {
		        		index= i;
		        		encontrado = true;
		        }
		        i++;
		    }
		
		return index;
	}
	public void eliminarEnfermedad(String codEnfermedad) {
	    int index = buscarIndexEnfermedadByCode(codEnfermedad);
	    
	    if (index != -1) {
	        misEnfermedades.remove(index);
	    }
	}

	
}