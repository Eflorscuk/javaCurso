package fundamentos;
//Estudados os conceitos de variáveis e constantes


public class AreaCircunferencia {
	public static void main(String[] args) {
		//System.out.println(2+3);
		
		//int raio = 3;
		double raio = 3.4;
		final double pi = 3.14;
		
		double area = pi * raio * raio;
		
		System.out.println("A circunferência é " + area);
	}
}
