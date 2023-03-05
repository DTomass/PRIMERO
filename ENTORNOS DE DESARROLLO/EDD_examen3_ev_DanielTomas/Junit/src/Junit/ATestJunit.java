package Junit;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;
import java.util.Date;

import org.junit.jupiter.api.Test;

import Main.A;

class ATestJunit {

	@Test
	void testdateGreaterThanAWeek() {
		A a = new A();
		long millisInAWeek = 1000 * 60 * 60 * 24 * 7;
		Date hoy = new Date(new Date().getTime());
		Date semana = new Date(new Date().getTime()-millisInAWeek);
		assertTrue(a.dateGreaterThanAWeek(semana));
		assertFalse(a.dateGreaterThanAWeek(hoy));
		
	}
	@Test
	void testipAdressType() {
		String ip1 = "10.0.100.23";
		String mask1 = "";
		String esp1 = "a";
		String obt1 = A.ipAdressType(ip1, mask1);
		assertEquals(esp1, obt1);
		String mask2 = "255.0.0.0";
		String esp2 = "a";
		String obt2 = A.ipAdressType(ip1, mask2);
		assertEquals(esp2, obt2);
		String mask3 = null;
		String esp3 = "a";
		String obt3 = A.ipAdressType(ip1, mask3);
		assertEquals(esp3, obt3);
		String mask4 = "255.255.0.0";
		String esp4 = "b";
		String obt4 = A.ipAdressType(ip1, mask4);
		assertEquals(esp4, obt4);
		String ip2 = "200.30.110.5";
		String mask5 = "255.255.255.0";
		String esp5 = "c";
		String obt5 = A.ipAdressType(ip2, mask5);
		assertEquals(esp5, obt5);
		String mask6 = "";
		String esp6 = "c";
		String obt6 = A.ipAdressType(ip2, mask6);
		assertEquals(esp6, obt6);
		String mask7 = null;
		String esp7 = "c";
		String obt7 = A.ipAdressType(ip2, mask7);
		assertEquals(esp7, obt7);
		String ip3 = "200.30.110.5/24";
		String mask8 = "";
		String esp8 = "c";
		String obt8 = A.ipAdressType(ip3, mask8);
		assertEquals(esp8, obt8);
	}
	@Test
	void testvalueIsDivisibleByNumber() {
		BigDecimal dividendo = new BigDecimal(89);
		BigDecimal divisor = new BigDecimal(10);
		BigDecimal esp = new BigDecimal(9);
		BigDecimal obte = A.valueIsDivisibleByNumber(dividendo, divisor);
		assertEquals(esp, obte);
		BigDecimal dividendo2 = new BigDecimal(-89);
		BigDecimal divisor2 = new BigDecimal(10);
		BigDecimal esp2 = new BigDecimal(-9);
		BigDecimal obte2 = A.valueIsDivisibleByNumber(dividendo2, divisor2);
		assertEquals(esp2, obte2);
		BigDecimal dividendo3 = new BigDecimal(0);
		BigDecimal divisor3 = new BigDecimal(10);
		BigDecimal esp3 = new BigDecimal(0);
		BigDecimal obte3 = A.valueIsDivisibleByNumber(dividendo3, divisor3);
		assertEquals(esp3, obte3);
		
	}
	@Test
	void testisPalindromo() {
		A a = new A();
		String frase = "hola aloh";
		String frasenull = null;
		assertTrue(a.isPalindromo(frase));
	}
}
