import java.util.Scanner;

public class matrizes {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantas linhas vai ter a matriz? ");
		int M = sc.nextInt();
		
		System.out.println("Quantas colunas vai ter a matriz? ");
		int N = sc.nextInt();
		
		int[][] mat = new int[M][N];
		
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				System.out.print("Elemento [ " + i + "," + j + "]: ");
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.println();
		System.out.println("MATRIZ DIGITADA:");
		
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
		
		sc.close();

	}

}
