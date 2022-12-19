package ISO2_2022_BC02_Testing_P2.Testing_P2;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class TrianguloTest {

	@Test
	public void testTriangulo() throws numCero, numNegativo, anguloNoValido{
		Triangulo t = null;
		try {
			t = new Triangulo("11", "12", "12", "60", "60", "60");
		}catch (numCero numCero) {
			System.out.println(numCero.getMessage());
			fail();
		}catch (numNegativo numNegativo) {
			System.out.println(numNegativo.getMessage());
			fail();
		}catch (anguloNoValido anguloNoValido) {
			System.out.println(anguloNoValido.getMessage());
			fail();
		}
		assert(true);
		
	}

	@Test
	public void testGetL1() throws numCero, numNegativo, anguloNoValido{
		Triangulo t = new Triangulo("11", "12", "12", "60", "60", "60");
		assertEquals(11, t.getL1());
	}

	@Test
	public void testSetL1numNegativo() throws numCero, numNegativo, anguloNoValido{
		Triangulo t = new Triangulo("11", "12", "12", "60", "60", "60");
		try {
			t.setL1("-5");
		}catch (numNegativo numnegativo) {
			assertEquals("El n�mero no puede ser negativo", numnegativo.getMessage());
		}
		try {
			t.setL1("-1");
		}catch (numNegativo numnegativo) {
			assertEquals("El n�mero no puede ser negativo", numnegativo.getMessage());
		}
		
	}
	@Test
	public void testSetL1numCero() throws numCero, numNegativo, anguloNoValido{
		Triangulo t = new Triangulo("11", "12", "12", "60", "60", "60");
		try {
			t.setL1("0");
		}catch (numCero numcero) {
			assertEquals("El lado no puede medir cero.", numcero.getMessage());
		}
	}
	@Test
	public void testSetL1numPositivo() throws numCero, numNegativo, anguloNoValido{
		Triangulo t = new Triangulo("11", "12", "12", "60", "60", "60");
		t.setL1("1");
		assertEquals(1, t.getL1());
	}
	@Test
	public void testSetL1numLong() throws numCero, numNegativo, anguloNoValido{
		Triangulo t = new Triangulo("11", "12", "12", "60", "60", "60");
		try {
		t.setL1("999999999999999999");
		}catch (NumberFormatException numberformatexception) {
			assertEquals("No es un numero entero", numberformatexception.getMessage());
		}
	}
	@Test
	public void testSetL1String() throws numCero, numNegativo, anguloNoValido{
		Triangulo t = new Triangulo("11", "12", "12", "60", "60", "60");
		try {
			t.setL1("b");
		}catch (NumberFormatException numberformatexception) {
			assertEquals("No es un numero entero", numberformatexception.getMessage());
		}
	}

	@Test
	public void testGetL2() throws numCero, numNegativo, anguloNoValido{
		Triangulo t = new Triangulo("11", "12", "12", "60", "60", "60");
		assertEquals(12, t.getL2());
	}
	@Test
	public void testSetL2numNegativo() throws numCero, numNegativo, anguloNoValido{
		Triangulo t = new Triangulo("11", "12", "12", "60", "60", "60");
		try {
			t.setL2("-5");
		}catch (numNegativo numnegativo) {
			assertEquals("El n�mero no puede ser negativo", numnegativo.getMessage());
		}
		try {
			t.setL2("-1");
		}catch (numNegativo numnegativo) {
			assertEquals("El n�mero no puede ser negativo", numnegativo.getMessage());
		}
		
	}
	@Test
	public void testSetL2numCero() throws numCero, numNegativo, anguloNoValido{
		Triangulo t = new Triangulo("11", "12", "12", "60", "60", "60");
		try {
			t.setL2("0");
		}catch (numCero numcero) {
			assertEquals("El lado no puede medir cero.", numcero.getMessage());
		}
	}
	@Test
	public void testSetL2numPositivo() throws numCero, numNegativo, anguloNoValido{
		Triangulo t = new Triangulo("11", "12", "12", "60", "60", "60");
		t.setL2("1");
		assertEquals(1, t.getL2());
	}
	@Test
	public void testSetL2numLong() throws numCero, numNegativo, anguloNoValido{
		Triangulo t = new Triangulo("11", "12", "12", "60", "60", "60");
		try {
		t.setL2("999999999999999999");
		}catch (NumberFormatException numberformatexception) {
			assertEquals("No es un numero entero", numberformatexception.getMessage());
		}
	}
	@Test
	public void testSetL2String() throws numCero, numNegativo, anguloNoValido{
		Triangulo t = new Triangulo("11", "12", "12", "60", "60", "60");
		try {
			t.setL2("b");
		}catch (NumberFormatException numberformatexception) {
			assertEquals("No es un numero entero", numberformatexception.getMessage());
		}
	}

	@Test
	public void testGetL3() throws numCero, numNegativo, anguloNoValido{
		Triangulo t = new Triangulo("11", "12", "12", "60", "60", "60");
		assertEquals(12, t.getL3());
	}
	@Test
	public void testSetL3numNegativo() throws numCero, numNegativo, anguloNoValido{
		Triangulo t = new Triangulo("11", "12", "12", "60", "60", "60");
		try {
			t.setL3("-5");
		}catch (numNegativo numnegativo) {
			assertEquals("El n�mero no puede ser negativo", numnegativo.getMessage());
		}
		try {
			t.setL3("-1");
		}catch (numNegativo numnegativo) {
			assertEquals("El n�mero no puede ser negativo", numnegativo.getMessage());
		}
		
	}
	@Test
	public void testSetL3numCero() throws numCero, numNegativo, anguloNoValido{
		Triangulo t = new Triangulo("11", "12", "12", "60", "60", "60");
		try {
			t.setL3("0");
		}catch (numCero numcero) {
			assertEquals("El lado no puede medir cero.", numcero.getMessage());
		}
	}
	@Test
	public void testSetL3numPositivo() throws numCero, numNegativo, anguloNoValido{
		Triangulo t = new Triangulo("11", "12", "12", "60", "60", "60");
		t.setL3("1");
		assertEquals(1, t.getL3());
	}
	@Test
	public void testSetL3numLong() throws numCero, numNegativo, anguloNoValido{
		Triangulo t = new Triangulo("11", "12", "12", "60", "60", "60");
		try {
		t.setL3("999999999999999999");
		}catch (NumberFormatException numberformatexception) {
			assertEquals("No es un numero entero", numberformatexception.getMessage());
		}
	}
	@Test
	public void testSetL3String() throws numCero, numNegativo, anguloNoValido{
		Triangulo t = new Triangulo("11", "12", "12", "60", "60", "60");
		try {
			t.setL3("b");
		}catch (NumberFormatException numberformatexception) {
			assertEquals("No es un numero entero", numberformatexception.getMessage());
		}
	}

	@Test
	public void testGetA1() throws numCero, numNegativo, anguloNoValido{
		Triangulo t = new Triangulo("11", "12", "12", "90", "45", "45");
		assertEquals(90, t.getA1());
	}

	@Test
	public void testSetA1numNegativo() throws numCero, numNegativo, anguloNoValido{
		Triangulo t = new Triangulo("11", "12", "12", "60", "60", "60");
		try {
			t.setA1("-5");
		}catch (numNegativo numnegativo) {
			assertEquals("El n�mero no puede ser negativo", numnegativo.getMessage());
		}
		try {
			t.setA1("-1");
		}catch (numNegativo numnegativo) {
			assertEquals("El n�mero no puede ser negativo", numnegativo.getMessage());
		}
	}
	
	
	@Test
	public void testSetA1num_0_180() throws numCero, numNegativo, anguloNoValido{
		Triangulo t = new Triangulo("11", "12", "12", "60", "60", "60");
		try {
			t.setA1("0");
		}catch (anguloNoValido angulonovalido) {
			assertEquals("El �ngulo no puede ser 0.", angulonovalido.getMessage());
		}
		try {
			t.setA1("180");
		}catch (anguloNoValido angulonovalido) {
			assertEquals("El �ngulo no puede ser 0.", angulonovalido.getMessage());
		}
	}
	
	
	@Test
	public void testSetA1numEnteroPositivo() throws numCero, numNegativo, anguloNoValido{
		Triangulo t = new Triangulo("11", "12", "12", "60", "60", "60");
		t.setA1("150");
		assertEquals(150, t.getA1());
		t.setA1("200");
		assertEquals(200, t.getA1());
		t.setA1("250");
		assertEquals(250, t.getA1());
	}
	
	@Test
	public void testSetA1numMas360() throws numCero, numNegativo, anguloNoValido{
		Triangulo t = new Triangulo("11", "12", "12", "60", "60", "60");
		try {
			t.setA1("361");
		}catch (anguloNoValido angulonovalido) {
			assertEquals("El angulo debe de encontrarse en el intervalo (0,360).", angulonovalido.getMessage());
		}
		try {
			t.setA1("400");
		}catch (anguloNoValido angulonovalido) {
			assertEquals("El angulo debe de encontrarse en el intervalo (0,360).", angulonovalido.getMessage());
		}
	}
	@Test
	public void testSetA1String() throws numCero, numNegativo, anguloNoValido{
		Triangulo t = new Triangulo("11", "12", "12", "60", "60", "60");
		try {
			t.setA1("b");
		}catch (NumberFormatException numberformatexception) {
			assertEquals("No es un numero entero", numberformatexception.getMessage());
		}
	}
	@Test
	public void testSetA1numLong() throws numCero, numNegativo, anguloNoValido{
		Triangulo t = new Triangulo("11", "12", "12", "60", "60", "60");
		try {
			t.setA1("999999999999999999");
		}catch (NumberFormatException numberformatexception) {
			assertEquals("No es un numero entero", numberformatexception.getMessage());
		}
	}
	
	@Test
	public void testGetA2() throws numCero, numNegativo, anguloNoValido{
		Triangulo t = new Triangulo("11", "12", "12", "45", "90", "45");
		assertEquals(90, t.getA2());
	}
	@Test
	public void testSetA2numNegativo() throws numCero, numNegativo, anguloNoValido{
		Triangulo t = new Triangulo("11", "12", "12", "60", "60", "60");
		try {
			t.setA2("-5");
		}catch (numNegativo numnegativo) {
			assertEquals("El n�mero no puede ser negativo", numnegativo.getMessage());
		}
		try {
			t.setA2("-1");
		}catch (numNegativo numnegativo) {
			assertEquals("El n�mero no puede ser negativo", numnegativo.getMessage());
		}
	}
	
	
	@Test
	public void testSetA2num_0_180() throws numCero, numNegativo, anguloNoValido{
		Triangulo t = new Triangulo("11", "12", "12", "60", "60", "60");
		try {
			t.setA2("0");
		}catch (anguloNoValido angulonovalido) {
			assertEquals("El �ngulo no puede ser 0.", angulonovalido.getMessage());
		}
		try {
			t.setA2("180");
		}catch (anguloNoValido angulonovalido) {
			assertEquals("El �ngulo no puede ser 0.", angulonovalido.getMessage());
		}
	}
	
	
	@Test
	public void testSetA2numEnteroPositivo() throws numCero, numNegativo, anguloNoValido{
		Triangulo t = new Triangulo("11", "12", "12", "60", "60", "60");
		t.setA2("150");
		assertEquals(150, t.getA2());
		t.setA2("200");
		assertEquals(200, t.getA2());
		t.setA2("250");
		assertEquals(250, t.getA2());
	}
	
	@Test
	public void testSetA2numMas360() throws numCero, numNegativo, anguloNoValido{
		Triangulo t = new Triangulo("11", "12", "12", "60", "60", "60");
		try {
			t.setA2("361");
		}catch (anguloNoValido angulonovalido) {
			assertEquals("El angulo debe de encontrarse en el intervalo (0,360).", angulonovalido.getMessage());
		}
		try {
			t.setA2("400");
		}catch (anguloNoValido angulonovalido) {
			assertEquals("El angulo debe de encontrarse en el intervalo (0,360).", angulonovalido.getMessage());
		}
	}
	@Test
	public void testSetA2String() throws numCero, numNegativo, anguloNoValido{
		Triangulo t = new Triangulo("11", "12", "12", "60", "60", "60");
		try {
			t.setA2("b");
		}catch (NumberFormatException numberformatexception) {
			assertEquals("No es un numero entero", numberformatexception.getMessage());
		}
	}
	@Test
	public void testSetA2numLong() throws numCero, numNegativo, anguloNoValido{
		Triangulo t = new Triangulo("11", "12", "12", "60", "60", "60");
		try {
			t.setA2("999999999999999999");
		}catch (NumberFormatException numberformatexception) {
			assertEquals("No es un numero entero", numberformatexception.getMessage());
		}
	}
	@Test
	public void testGetA3() throws numCero, numNegativo, anguloNoValido{
		Triangulo t = new Triangulo("11", "12", "12", "45", "45", "90");
		assertEquals(90, t.getA3());
	}
	@Test
	public void testSetA3numNegativo() throws numCero, numNegativo, anguloNoValido{
		Triangulo t = new Triangulo("11", "12", "12", "60", "60", "60");
		try {
			t.setA3("-5");
		}catch (numNegativo numnegativo) {
			assertEquals("El n�mero no puede ser negativo", numnegativo.getMessage());
		}
		try {
			t.setA3("-1");
		}catch (numNegativo numnegativo) {
			assertEquals("El n�mero no puede ser negativo", numnegativo.getMessage());
		}
	}
	
	
	@Test
	public void testSetA3num_0_180() throws numCero, numNegativo, anguloNoValido{
		Triangulo t = new Triangulo("11", "12", "12", "60", "60", "60");
		try {
			t.setA3("0");
		}catch (anguloNoValido angulonovalido) {
			assertEquals("El �ngulo no puede ser 0.", angulonovalido.getMessage());
		}
		try {
			t.setA3("180");
		}catch (anguloNoValido angulonovalido) {
			assertEquals("El �ngulo no puede ser 0.", angulonovalido.getMessage());
		}
	}
	
	
	@Test
	public void testSetA3numEnteroPositivo() throws numCero, numNegativo, anguloNoValido{
		Triangulo t = new Triangulo("11", "12", "12", "60", "60", "60");
		t.setA3("150");
		assertEquals(150, t.getA3());
		t.setA3("200");
		assertEquals(200, t.getA3());
		t.setA3("250");
		assertEquals(250, t.getA3());
	}
	
	@Test
	public void testSetA3numMas360() throws numCero, numNegativo, anguloNoValido{
		Triangulo t = new Triangulo("11", "12", "12", "60", "60", "60");
		try {
			t.setA3("361");
		}catch (anguloNoValido angulonovalido) {
			assertEquals("El angulo debe de encontrarse en el intervalo (0,360).", angulonovalido.getMessage());
		}
		try {
			t.setA3("400");
		}catch (anguloNoValido angulonovalido) {
			assertEquals("El angulo debe de encontrarse en el intervalo (0,360).", angulonovalido.getMessage());
		}
	}
	@Test
	public void testSetA3String() throws numCero, numNegativo, anguloNoValido{
		Triangulo t = new Triangulo("11", "12", "12", "60", "60", "60");
		try {
			t.setA3("b");
		}catch (NumberFormatException numberformatexception) {
			assertEquals("No es un numero entero", numberformatexception.getMessage());
		}
	}
	@Test
	public void testSetA3numLong() throws numCero, numNegativo, anguloNoValido{
		Triangulo t = new Triangulo("11", "12", "12", "60", "60", "60");
		try {
			t.setA3("999999999999999999");
		}catch (NumberFormatException numberformatexception) {
			assertEquals("No es un numero entero", numberformatexception.getMessage());
		}
	}

	@Test
	public void testGetTipoAngulos() throws numCero, numNegativo, anguloNoValido{
		Triangulo t = new Triangulo("11", "12", "12", "120", "30", "30");
		assertEquals(segunAngulos.OBTUSANGULO, t.getTipoAngulos());
		t = new Triangulo("11", "12", "12", "45", "80", "55");
		assertEquals(segunAngulos.ACUTANGULO, t.getTipoAngulos());
		t = new Triangulo("11", "12", "12", "90", "45", "45");
		assertEquals(segunAngulos.RECTANGULO, t.getTipoAngulos());
	}

	@Test
	public void testSetTipoAngulos() throws numCero, numNegativo, anguloNoValido{
		Triangulo t = new Triangulo("11", "12", "12", "120", "30", "30");
		t.setTipoAngulos(segunAngulos.OBTUSANGULO);
		assertEquals(segunAngulos.OBTUSANGULO, t.getTipoAngulos());
		t.setTipoAngulos(segunAngulos.ACUTANGULO);
		assertEquals(segunAngulos.ACUTANGULO, t.getTipoAngulos());
		t.setTipoAngulos(segunAngulos.RECTANGULO);
		assertEquals(segunAngulos.RECTANGULO, t.getTipoAngulos());
	}

	@Test
	public void testGetTipoLados() throws numCero, numNegativo, anguloNoValido{
		Triangulo t = new Triangulo("10", "10", "10", "120", "30", "30");
		assertEquals(segunLados.EQUILATERO, t.getTipoLados());
		t = new Triangulo("10", "12", "12", "45", "80", "55");
		assertEquals(segunLados.ISOSCELES, t.getTipoLados());
		t = new Triangulo("11", "12", "13", "90", "45", "45");
		assertEquals(segunLados.ESCALENO, t.getTipoLados());	
	}

	@Test
	public void testSetTipoLados() throws numCero, numNegativo, anguloNoValido{
		Triangulo t = new Triangulo("10", "10", "10", "120", "30", "30");
		t.setTipoLados(segunLados.EQUILATERO);
		assertEquals(segunLados.EQUILATERO, t.getTipoLados());
		t.setTipoLados(segunLados.ISOSCELES);
		assertEquals(segunLados.ISOSCELES, t.getTipoLados());
		t.setTipoLados(segunLados.ESCALENO);
		assertEquals(segunLados.ESCALENO, t.getTipoLados());

	}

	@Test
	public void testComprobarLado() throws numCero, numNegativo, anguloNoValido{
		Triangulo t = new Triangulo("11", "12", "12", "60", "60", "60");
		try {
			t.comprobarLado("0");
		}catch (numCero numcero) {
			assertEquals("El lado no puede medir cero." ,numcero.getMessage());
		}
		try {
			t.comprobarLado("a");
		}catch (NumberFormatException excepcion) {
			assertEquals("No es un numero entero" ,excepcion.getMessage());
		}
		try {
			t.comprobarLado("-10");
		}catch (numNegativo numnegativo) {
			assertEquals("El n�mero no puede ser negativo" ,numnegativo.getMessage());
		}
		assertEquals(20 ,t.comprobarLado("20"));
	}

	@Test
	public void testComprobarAngulo() throws numCero, numNegativo, anguloNoValido{
		Triangulo t = new Triangulo("11", "12", "12", "60", "60", "60");
		try {
			t.comprobarAngulo("0");
		}catch (anguloNoValido angulonovalido) {
			assertEquals("El �ngulo no puede ser 0." ,angulonovalido.getMessage());
		}
		try {
			t.comprobarAngulo("a");
		}catch (NumberFormatException excepcion) {
			assertEquals("No es un numero entero" ,excepcion.getMessage());
		}
		try {
			t.comprobarAngulo("-10");
		}catch (numNegativo numnegativo) {
			assertEquals("El n�mero no puede ser negativo" ,numnegativo.getMessage());
		}
		try {
			t.comprobarAngulo("400");
		}catch (anguloNoValido angulonovalido) {
			assertEquals("El angulo debe de encontrarse en el intervalo (0,360)." ,angulonovalido.getMessage());
		}
		try {
			t.comprobarAngulo("180");
		}catch (anguloNoValido angulonovalido) {
			assertEquals("El �ngulo no puede ser 0." ,angulonovalido.getMessage());
		}
		assertEquals(20 ,t.comprobarAngulo("20"));
	}

	@Test
	public void testComprobarInt() throws numCero, numNegativo, anguloNoValido{
		Triangulo t = new Triangulo("11", "12", "12", "60", "60", "60");
		try {
			t.comprobarInt("a");
		}catch (NumberFormatException excepcion) {
			assertEquals("No es un numero entero" ,excepcion.getMessage());
		}
		try {
			t.comprobarInt("-10");
		}catch (numNegativo numnegativo) {
			assertEquals("El n�mero no puede ser negativo" ,numnegativo.getMessage());
		}
		assertEquals(10, t.comprobarInt("10"));
	}

	@Test
	public void testClasificarPorAngulos() throws numCero, numNegativo, anguloNoValido{
		Triangulo t = new Triangulo("11", "12", "12", "90", "45", "45");
		assertEquals(segunAngulos.RECTANGULO,  t.clasificarPorAngulos(t.getA1(), t.getA2(), t.getA3()));
		
		t = new Triangulo("11", "12", "12", "45", "90", "45");
		assertEquals(segunAngulos.RECTANGULO,  t.clasificarPorAngulos(t.getA1(), t.getA2(), t.getA3()));
		
		t = new Triangulo("11", "12", "12", "45", "45", "90");
		assertEquals(segunAngulos.RECTANGULO,  t.clasificarPorAngulos(t.getA1(), t.getA2(), t.getA3()));
		
		t = new Triangulo("11", "12", "12", "270", "45", "45");
		assertEquals(segunAngulos.RECTANGULO,  t.clasificarPorAngulos(t.getA1(), t.getA2(), t.getA3()));
		
		t = new Triangulo("11", "12", "12", "45", "270", "45");
		assertEquals(segunAngulos.RECTANGULO,  t.clasificarPorAngulos(t.getA1(), t.getA2(), t.getA3()));
		
		t = new Triangulo("11", "12", "12", "45", "45", "270");
		assertEquals(segunAngulos.RECTANGULO,  t.clasificarPorAngulos(t.getA1(), t.getA2(), t.getA3()));
		
		t = new Triangulo("11", "12", "12", "120", "30", "30");
		assertEquals(segunAngulos.OBTUSANGULO,  t.clasificarPorAngulos(t.getA1(), t.getA2(), t.getA3()));
		t = new Triangulo("11", "12", "12", "80", "45", "55");
		assertEquals(segunAngulos.ACUTANGULO,  t.clasificarPorAngulos(t.getA1(), t.getA2(), t.getA3()));
		
		t = new Triangulo("11", "12", "12", "30", "120", "30");
		assertEquals(segunAngulos.OBTUSANGULO,  t.clasificarPorAngulos(t.getA1(), t.getA2(), t.getA3()));
		
		t = new Triangulo("11", "12", "12", "30", "30", "120");
		assertEquals(segunAngulos.OBTUSANGULO,  t.clasificarPorAngulos(t.getA1(), t.getA2(), t.getA3()));
		
		t = new Triangulo("11", "12", "12", "200", "30", "30");
		assertEquals(segunAngulos.OBTUSANGULO,  t.clasificarPorAngulos(t.getA1(), t.getA2(), t.getA3()));
		
		t = new Triangulo("11", "12", "12", "30", "30", "200");
		assertEquals(segunAngulos.OBTUSANGULO,  t.clasificarPorAngulos(t.getA1(), t.getA2(), t.getA3()));
		
		t = new Triangulo("11", "12", "12", "30", "200", "30");
		assertEquals(segunAngulos.OBTUSANGULO,  t.clasificarPorAngulos(t.getA1(), t.getA2(), t.getA3()));
	}

	@Test
	public void testClasificarPorLados() throws numCero, numNegativo, anguloNoValido{
		Triangulo t = new Triangulo("12", "12", "11", "90", "45", "45");
		assertEquals(segunLados.ISOSCELES, t.clasificarPorLados(t.getL1(), t.getL2(), t.getL3()));
		
		t = new Triangulo("12", "12", "12", "90", "45", "45");
		assertEquals(segunLados.EQUILATERO, t.clasificarPorLados(t.getL1(), t.getL2(), t.getL3()));
		
		t = new Triangulo("11", "12", "12", "90", "45", "45");
		assertEquals(segunLados.ISOSCELES, t.clasificarPorLados(t.getL1(), t.getL2(), t.getL3()));
		
		t = new Triangulo("11", "12", "11", "90", "45", "45");
		assertEquals(segunLados.ISOSCELES, t.clasificarPorLados(t.getL1(), t.getL2(), t.getL3()));
		
		t = new Triangulo("11", "12", "13", "90", "45", "45");
		assertEquals(segunLados.ESCALENO, t.clasificarPorLados(t.getL1(), t.getL2(), t.getL3()));
	}

}