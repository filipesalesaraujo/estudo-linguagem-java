
public class processamento_de_dados_e_casting {

	public static void main(String[] args) {

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
		
		int a, b;
		double resultado;
		a = 5;
		b = 2;
		resultado = (double)a / b;
		System.out.println(resultado);
		
		double a3;
		int b3;
		a3 = 5.0;
		b3 = (int) a3;
		System.out.println(b3);

	}

}
