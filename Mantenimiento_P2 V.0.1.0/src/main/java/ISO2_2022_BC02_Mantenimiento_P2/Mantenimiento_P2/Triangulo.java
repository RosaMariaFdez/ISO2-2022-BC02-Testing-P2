package ISO2_2022_BC02_Mantenimiento_P2.Mantenimiento_P2;

public class Triangulo extends Exception {
	private int l1, l2, l3; // lados en cm
	private int a1, a2, a3; // �ngulos en grados dec

	private segunAngulos tipoAngulos;
	private segunLados tipoLados;

	public Triangulo(String l1, String l2, String l3, String a1, String a2, String a3)
			throws numCero, numNegativo, anguloNoValido {
		this.setL1(l1);
		this.setL2(l2);
		this.setL3(l3);
		this.setA1(a1);
		this.setA2(a2);
		this.setA3(a3);
		this.setTipoAngulos(clasificarPorAngulos(this.getA1(), this.getA2(), this.getA3()));
		this.setTipoLados(clasificarPorLados(this.getL1(), this.getL2(), this.getL3()));
	}

	public int getL1() {
		return l1;
	}

	public void setL1(String l1) throws numCero, numNegativo {
		this.l1 = comprobarLado(l1);
	}

	public int getL2() {
		return l2;
	}

	public void setL2(String l2) throws numCero, numNegativo {
		this.l2 = comprobarLado(l2);
	}

	public int getL3() {
		return l3;
	}

	public void setL3(String l3) throws numCero, numNegativo {
		this.l3 = comprobarLado(l3);
	}

	public int getA1() {
		return a1;
	}

	public void setA1(String a1) throws anguloNoValido, numNegativo {
		this.a1 = comprobarAngulo(a1);
	}

	public int getA2() {
		return a2;
	}

	public void setA2(String a2) throws anguloNoValido, numNegativo {
		this.a2 = comprobarAngulo(a2);
	}

	public int getA3() {
		return a3;
	}

	public void setA3(String a3) throws anguloNoValido, numNegativo {
		this.a3 = comprobarAngulo(a3);
		;
	}

	public segunAngulos getTipoAngulos() {
		return tipoAngulos;
	}

	public void setTipoAngulos(segunAngulos tipoAngulos) {
		this.tipoAngulos = tipoAngulos;
	}

	public segunLados getTipoLados() {
		return tipoLados;
	}

	public void setTipoLados(segunLados tipoLados) {
		this.tipoLados = tipoLados;
	}

	public int comprobarLado(String posibleLado) throws numCero, numNegativo {
		int lado = comprobarInt(posibleLado);

		if (lado == 0)
			throw new numCero("El lado no puede medir cero.");

		return lado;
	}

	public int comprobarAngulo(String posibleAngulo) throws anguloNoValido, numNegativo {
		int angulo = comprobarInt(posibleAngulo);

		if (angulo < 0 && angulo > 360)
			throw new anguloNoValido("El angulo debe de encontrarse en el intervalo (0,360).");

		if (angulo == 0 || angulo == 180)
			throw new anguloNoValido("El ángulo no puede ser 0.");

		return angulo;
	}

	public int comprobarInt(String posibleInt) throws numNegativo {
		int resultado = 0;

		try {
			resultado = Integer.parseInt(posibleInt);
		} catch (NumberFormatException excepcion) {
			throw new NumberFormatException("No es un numero entero");
		}

		if (resultado < 0)
			throw new numNegativo("El número no puede ser negativo");

		return resultado;
	}

	public segunAngulos clasificarPorAngulos(int a1, int a2, int a3) {

		segunAngulos tipoAngulo = null;

		if (a1 > 90 && a1 < 180 || a1 > 180 && a1 < 269 || a2 > 90 && a2 < 180 || a2 > 180 && a2 < 269
				|| a3 > 90 && a3 < 180 || a3 > 180 && a3 < 269)
			tipoAngulo = segunAngulos.OBTUSANGULO;
		else if (a1 == 90 || a1 == 270 || a2 == 90 || a2 == 270 || a3 == 90 || a3 == 270)
			tipoAngulo = segunAngulos.RECTANGULO;
		else
			tipoAngulo = segunAngulos.ACUTANGULO;

		return tipoAngulo;
	}

	public segunLados clasificarPorLados(int l1, int l2, int l3) {

		segunLados tipoLados = null;
		if (l1 == l2 && l2 == l3)
			tipoLados = segunLados.EQUILATERO;
		else if (l1 != l2 && l2 != l3 && l1 != l3)
			tipoLados = segunLados.ESCALENO;
		else
			tipoLados = segunLados.ISOSCELES;

		return tipoLados;
	}

}
