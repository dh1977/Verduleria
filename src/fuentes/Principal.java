package fuentes;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Principal {
	private static ArrayList<Local> locales = new ArrayList<Local>();
	private static ArrayList<Cliente> clientes = new ArrayList<Cliente>();
	private static ArrayList<Motoboy> motoBoys = new ArrayList<Motoboy>();
	private static ArrayList<Producto> productos = new ArrayList<Producto>();
	private static ArrayList<Venta> ventas = new ArrayList<Venta>();
	
	public static void main(String[] args) {
		// Clases simples
		locales.add( new Local(1,"La Cisterna","Av. El Parrón 123") );
		locales.add( new Local(2,"San Miguel","Salesianos 1545") );

		clientes.add( new Cliente(11, "Sra. Juanita", 9875289, "Casa de la Sra. Juanita") );
		clientes.add( new Cliente(22, "Don Pedro", 87234523, "Casa de don Pedro") );
		
		motoBoys.add( new Motoboy(3,"Andrés",463463,"Casa de Andrés", "ABCD-12","Scooter") );
		motoBoys.add( new Motoboy(5,"Pablo",547457, "Casa de Pablo", "BCDE-21","Citycar") );
		
		productos.add( new Producto(101,"Apio","Verdura","Mata") );
		productos.add( new Producto(201,"Papa","Verdura","Kilo") );
		productos.add( new Producto(301,"Manzana","Fruta","Kilo") );
		
		// Clases compuestas
		
		// Venta a la Sra. Juanita
		ventas.add( 
			new Venta(localXid(1), clienteXid(11), 
						LocalDateTime.of(2022,2,2,11,30), motoBoyXid(3), 10101) );
		// Detalle
		ventaXboleta(10101).getDetVenta().add(new DetalleVenta(productoXid(101), 1, 1000));
		ventaXboleta(10101).getDetVenta().add(new DetalleVenta(productoXid(201), 2, 1400));
		
		// Venta a don Pedro
		ventas.add( 
			new Venta(localXid(2), clienteXid(22), 
						LocalDateTime.of(2022,2,2,13,15),motoBoyXid(5),10130) );
		// Detalle
		ventaXboleta(10130).getDetVenta().add(new DetalleVenta(productoXid(201), 1, 700));
		ventaXboleta(10130).getDetVenta().add(new DetalleVenta(productoXid(301), 1.5f, 1800));
		ventaXboleta(10130).getDetVenta().add(new DetalleVenta(productoXid(101), 1, 1000));
		
		// ---------------- Muestro info -------------------

		// Locales
		System.out.println("Locales:");
		for (Local l:locales) 
			System.out.printf("- ID: %d   Nombre: %s   Direcc.: %s\n", 
							l.getId(), l.getNombre(), l.getDireccion());

		System.out.println("\n--------------");
		
		// Clientes
		System.out.println("Clientes:");
		for (Cliente c:clientes) 
			System.out.printf("- ID: %d   Nombre: %s   Direcc.: %s   Fono: %d\n", 
						c.getId(), c.getNombre(), c.getDireccion(), c.getFono());

		System.out.println("--------------");
		
		// Motoboys
		System.out.println("Repartidores:");
		for (Motoboy mb:motoBoys) 
			System.out.printf("- ID: %d   Nombre: %s   Direcc.: %s   Fono: %d   Tipo veh: %s   Patente: %s\n", 
						mb.getId(), mb.getNombre(), mb.getDireccion(), mb.getFono(),
						mb.getTipoVehiculo(), mb.getPatente());

		System.out.println("--------------");

		// Productos
		System.out.println("Productos:");
		for (Producto p:productos) 
			System.out.printf("- ID: %d   Nombre: %s   Tipo: %s   Unid.medida: %s\n", 
						p.getId(), p.getNombre(), p.getTipo(), p.getUnidadMedida());

		System.out.println("--------------");

		// Ventas
		int n = 0;
		for (Venta v:ventas) {
			System.out.printf("Venta %d: \n",++n);
			
			System.out.printf("- Fecha: %tF   Boleta: %d   Clte.: %s\n", 
						v.getFechaHora(), v.getBoleta(), v.getCliente().getNombre());
			
			System.out.println("Detalle:");
			for (DetalleVenta dv:v.getDetVenta())
				System.out.printf( "- Producto: %s   Cant.: %f (%s)   Precio: $%d\n",
						dv.getProducto().getNombre(), dv.getCantidad(), 
						dv.getProducto().getUnidadMedida(), dv.getPrecio() );
			
			System.out.println("");
		}
		
	} // fin main

	
	// ----------------- Funciones auxiliares ----------------------
	// Rescatan un objeto a través de un atributo identificatorio.
	
	// Rescate de un objeto 'Local' por medio de su id
	private static Local localXid (int id) {
		for (Local l:locales) 
			if ( l.getId() == id )
				return l;
			
		return null;
	}

	// Rescate de un objeto 'Cliente' por medio de su id
	private static Cliente clienteXid (int id) {
		for (Cliente c:clientes) 
			if ( c.getId() == id )
				return c;
			
		return null;
	}

	// Rescate de un objeto 'Motoboy' por medio de su id
	private static Motoboy motoBoyXid (int id) {
		for (Motoboy mb:motoBoys) 
			if ( mb.getId() == id )
				return mb;
			
		return null;
	}

	// Rescate de un objeto 'Producto' por medio de su id
	private static Producto productoXid (int id) {
		for (Producto p:productos) 
			if ( p.getId() == id )
				return p;
			
		return null;
	}

	// Rescate de un objeto 'Venta' por medio de su boleta
	private static Venta ventaXboleta (int b) {
		for (Venta v:ventas) 
			if ( v.getBoleta() == b )
				return v;
			
		return null;
	}
}
