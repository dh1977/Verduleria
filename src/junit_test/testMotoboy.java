package junit_test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testMotoboy {

	@Test
	void test() {
		fuentes.Motoboy mb = new fuentes.Motoboy(11,"Juan",123,"direcc.","ABCD-12","moto");
		
		assertTrue( 11 == mb.getId() );
		assertEquals( "direcc.", mb.getDireccion() );
		assertEquals( "abcd-12",mb.getPatente() );      // *** falla ***
		assertTrue( "MOTO" == mb.getTipoVehiculo().toUpperCase() ); 
	}

}
