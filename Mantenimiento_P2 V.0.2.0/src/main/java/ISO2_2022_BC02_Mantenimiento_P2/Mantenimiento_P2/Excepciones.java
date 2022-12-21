package ISO2_2022_BC02_Mantenimiento_P2.Mantenimiento_P2;

class numNegativo extends Exception { //los numeros no pueden ser negativos
	public numNegativo (String cadena) {
		super(cadena);
	}	
}

class numCero extends Exception{ //para lados, no pueden tener longitud = 0
	public numCero(String cadena) {
		super(cadena);
	}
}

class anguloNoValido extends Exception{
	public anguloNoValido (String cadena) {
		super(cadena);
	}
}

