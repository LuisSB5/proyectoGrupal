package logico;

import java.io.Serializable;

public class User implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8187152831518070851L;
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
	public User(String username, String password, String tipo, Persona persona) {
		super();
		this.username = username;
		this.password = password;
		this.tipo = tipo;
		this.persona = persona;
	}
	
}
