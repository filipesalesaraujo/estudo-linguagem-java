import java.util.Locale;

public class saida_de_dados {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		System.out.print("Bom dia");
		System.out.print("Boa noite");
		
		System.out.println("Bom dia");
		System.out.println("Boa noite");
		
		int x1, y1;
		x1 = 10;
		y1 = 20;
		System.out.println(x1);
		System.out.println(y1);
		
		double x2;
		x2 = 2.3456;
		System.out.println(String.format("%.2f", x2));

		int idade;
		double salario;
		String nome;
		char sexo;
		idade = 32;
		salario = 4560.9;
		nome = "Maria Silva";
		sexo = 'F';
		System.out.println("A funcionaria " + nome + ", sexo " + sexo + ", ganha " + String.format("%.2f", salario) + " e tem " + idade + " anos");
		
		int x3, y3;
		x3 = 5;
		y3 = 2 * x3;
		System.out.println(x3);
		System.out.println(y3);
		
		int x4;
		double y4;
		x4 = 5;
		y4 = 2 * x4;
		System.out.println(x4);
		System.out.println(String.format("%.1f", y4));
		
		double b1, b2, h, area;
		b1 = 6.0;
		b2 = 8.0;
		h = 5.0;
		area = (b1 + b2) / 2.0 * h;
		System.out.println(area);
		
		int a, b, resultado;
		a = 5;
		b = 2;
		resultado = a / b;
		System.out.println(resultado);
		
		double a3;
		int b3;
		a3 = 5.0;
		b3 = (int) a3;
		System.out.println(b3);
		
	}

}
