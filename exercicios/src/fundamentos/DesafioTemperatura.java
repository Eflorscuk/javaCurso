package fundamentos;

public class DesafioTemperatura {
	public static void main(String[] args) {
		//(F - 32) * 5/9 = C
		double c, f;
		final int constante = 32;
		final double constante2 = 5.0/9.0;
				
		f = 100;
		
		c = (f - constante) * constante2;
		
		System.out.println(c);
	}
}
