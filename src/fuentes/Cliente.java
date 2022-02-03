package fuentes;

// Clase base
public class Cliente {
	int id;
	String nombre;
	int fono;
	String direccion;
	
	public Cliente(int id, String nombre, int fono, String direccion) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.fono = fono;
		this.direccion = direccion;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getFono() {
		return fono;
	}

	public void setFono(int fono) {
		this.fono = fono;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
}
