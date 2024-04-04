package clase_36;

public class Cliente {

	private String nombre;
	private String apellido;
	private String rut;
	private String email;
	
	
	
	
	
	public Cliente() {}
	
	
	
	
	public String getNombre() {
		return this.nombre.toUpperCase();
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre.trim();
	}	
	

	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public String getNombreCompleto() {
		return this.nombre+" "+this.apellido;
	}

	public String getRut() {
		return this.rut;
	}
	
	public void setRut(String rut) {
		this.rut= rut;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public void setEmail(String email) {
		this.email = email.trim().toLowerCase();
	}
	
}
