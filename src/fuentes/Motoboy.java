package fuentes;

public class Motoboy extends Cliente {
	private String patente;
	private String tipoVehiculo;
	
	public Motoboy(int id, String nombre, int fono, String direccion, String patente, String tipoVehiculo) {
		super(id, nombre, fono, direccion);
		this.patente = patente;
		this.tipoVehiculo = tipoVehiculo;
	}

	public String getPatente() {
		return patente;
	}

	public void setPatente(String patente) {
		this.patente = patente;
	}

	public String getTipoVehiculo() {
		return tipoVehiculo;
	}

	public void setTipoVehiculo(String tipoVehiculo) {
		this.tipoVehiculo = tipoVehiculo;
	}
	
}
