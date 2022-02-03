package fuentes;

public class DetalleVenta {
	private Producto producto;
	private float cantidad;
	private int precio;      // asumo venta minorista, IVA incl.
	
	public DetalleVenta(Producto producto, float cantidad, int precio) {
		this.producto = producto;
		this.cantidad = cantidad;
		this.precio = precio;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public float getCantidad() {
		return cantidad;
	}

	public void setCantidad(float cantidad) {
		this.cantidad = cantidad;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
}
