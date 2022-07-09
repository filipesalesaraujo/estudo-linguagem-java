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
		
		
	}

}
