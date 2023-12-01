package logico;

public class User extends Persona{

	private String username;
	private String password;
	private String tipo;
	private Persona persona;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public Persona getPersona() {
		return persona;
	}
	public void setPersona(Persona persona) {
		this.persona = persona;
	}
	public User(String cedula, String nombre, String codigo, String telefono, char sexo, String correoElectronico, String username, String password, String tipo, Persona persona) {
		super(cedula, nombre, codigo, telefono, sexo, correoElectronico);
		this.username = username;
		this.password = password;
		this.tipo = tipo;
		this.persona = persona;
	}
	
	
}
