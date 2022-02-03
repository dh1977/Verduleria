package fuentes;

public class Producto {
	private int id;
	private String nombre;
	private String tipo;
	private String unidadMedida;
	
	public Producto(int id, String nombre, String tipo, String unidadMedida) {
		this.id = id;
		this.nombre = nombre;
		this.tipo = tipo;
		this.unidadMedida = unidadMedida;
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

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getUnidadMedida() {
		return unidadMedida;
	}

	public void setUnidadMedida(String unidadMedida) {
		this.unidadMedida = unidadMedida;
	}
	
	
}
