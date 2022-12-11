package ejercicio2;

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

