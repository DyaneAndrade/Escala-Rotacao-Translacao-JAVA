import java.util.Scanner;

public class Translacao {
	
	public static void main(String[] args) {
	
		int [][] matriz = new int[11][11];
		
		int x, y, tx, ty;
		
		Scanner s = new Scanner(System.in);
	
		System.out.println("Quais são os valores de x e y?");
		
		x = s.nextInt();
		y = s.nextInt();
		
		System.out.println(x + " e " + y);
		System.out.println();

		matriz[x][y] = 1;
		
		System.err.println("0 1 2 3 4 5 6 7 8 9 10");
		System.out.println();

		for(int l = 0; l < matriz.length; l++) {
			for (int c = 0; c < matriz[l].length; c++) {
				System.out.print(matriz[l][c] + " ");
			}
			
			System.out.println(" <" + l + ">");
			System.out.println();
		}
		
		System.out.println("Quais são os valores de tx e ty?");
		
		tx = s.nextInt();
		ty = s.nextInt();
		
		x = x + tx;
		y = y + ty;
		
		System.out.println(x + " e " + y);
		System.out.println();

	
		matriz[x][y] = 1;
						
		
		System.err.println("0 1 2 3 4 5 6 7 8 9 10");
		System.out.println();

		for(int l = 0; l < matriz.length; l++) {
			for (int c = 0; c < matriz[l].length; c++) {
				System.out.print(matriz[l][c] + " ");
			}
			
			System.out.println(" <" + l + ">");
			System.out.println();
		}
	
	}
}
	
