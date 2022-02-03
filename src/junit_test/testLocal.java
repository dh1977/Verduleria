package junit_test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testLocal {

	@Test
	void test() {
		fuentes.Local l = new fuentes.Local(1,"local 1","direcc local 1");
		
		assertTrue( 1 == l.getId() );
		assertEquals( "local 1", l.getNombre() );
		assertEquals( "direcc local 1", l.getDireccion() );
	}

}

