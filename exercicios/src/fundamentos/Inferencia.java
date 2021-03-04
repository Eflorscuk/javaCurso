package fundamentos;

public class Inferencia {
	public static void main(String[] args) {
		double a = 4.5;
		System.out.println(a);
		
		var b = 4.5;
		System.out.println(b); //Aqui ele irá inferir
		
		var c = "Texto"; //Aqui ele irá inferir
		System.out.println(c);
		
		//c = 4.5 isso não vai permitir
		//Porque as variáveis em Java sempre são de determinado tipo após a mesma ter sido declarada
		
		double d; //variável foi declarada
		d = 123.65; //Variável foi inicializada
		System.out.println(d);//usada!!!
		
		//var e; Isso não é possível com var
		//e = 123.45;
		
		var e = 123.45;
		System.out.println(e);
	}
}
