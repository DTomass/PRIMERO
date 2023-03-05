package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Main.Potencias2;

class Potencias2Test {

	@Test
	void testPovOf2negativo() {
		String esp = "1";
		String res = Potencias2.PovOf2(-4);
		assertEquals(esp, res);
	}
	@Test
	void testPovOf2Cero() {
		String esp = "0";
		String res = Potencias2.PovOf2(0);
		assertEquals(esp, res);
	}
	@Test
	void testPovOf2positivo() {
		String esp = "4";
		String res = Potencias2.PovOf2(2);
		assertEquals(esp, res);
	}
}
