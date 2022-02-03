package fuentes;

import java.time.*;
import java.util.*;
public class Venta {
	private Local local;
	private Cliente cliente;
	private LocalDateTime fechaHora;
	private Motoboy motoboyAsignado;
	private int boleta;
	private ArrayList<DetalleVenta> detVenta = new ArrayList<DetalleVenta>();
	
	public Venta(Local local, Cliente cliente, LocalDateTime fechaHora, 
					Motoboy motoboyAsignado, int boleta) 
	{
		this.local = local;
		this.cliente = cliente;
		this.fechaHora = fechaHora;
		this.motoboyAsignado = motoboyAsignado;
		this.boleta = boleta;
	}

	public Local getLocal() {
		return local;
	}

	public void setLocal(Local local) {
		this.local = local;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public LocalDateTime getFechaHora() {
		return fechaHora;
	}

	public void setFechaHora(LocalDateTime fechaHora) {
		this.fechaHora = fechaHora;
	}

	public Motoboy getMotoboyAsignado() {
		return motoboyAsignado;
	}

	public void setMotoboyAsignado(Motoboy motoboyAsignado) {
		this.motoboyAsignado = motoboyAsignado;
	}

	public int getBoleta() {
		return boleta;
	}

	public void setBoleta(int boleta) {
		this.boleta = boleta;
	}

	public ArrayList<DetalleVenta> getDetVenta() {
		return detVenta;
	}

	public void setDetVenta(ArrayList<DetalleVenta> detVenta) {
		this.detVenta = detVenta;
	} 
	
}
