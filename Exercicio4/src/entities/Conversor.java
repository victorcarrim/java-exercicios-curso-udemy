package entities;

public class Conversor {
	private static double dolar;
	
	public static void setDolar(double d) {
		dolar = d;
	}
	
	public static double compraDolar(double compra) {
		double conversao = (compra  * dolar );
		return conversao + (conversao * 0.06);
	}
}
