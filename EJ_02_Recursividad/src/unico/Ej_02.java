package unico;

public class Ej_02 {

	public static void main(String[] args) {
		/* Calcular el factorial de n recursivamente. Recordar que por definición, el factorial de 1 es 1.*/
		
		int n;
		n=Util.leerInt("Introduce un número: ");
	}
	public static int factorial(int n) {
		int r;
		if (n==1) {
			r= n;
		}else {
			r= n * factorial(n-1);
		}
		return r;
		
	}
}
