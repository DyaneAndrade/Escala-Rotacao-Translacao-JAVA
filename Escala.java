import java.util.Scanner;

public class Escala {

	public static void main(String[] args) {
		int [][] matriz = new int[11][11];
		
		int x, y, sx, sy;
		
		Scanner s = new Scanner(System.in);
	
		System.out.println("Quais são os valores de x e y?");
		
		x = s.nextInt();
		y = s.nextInt();
		
		System.out.println(x + " e " + y);
		System.out.println();

		for(int l = 0; l < matriz.length; l++) {
			for(int c = 0; c < matriz.length; c++) {
				if(l == Math.round(x) && c <= Math.round(y)) {
						matriz[c][l] = 1;
						
				}
			}
		}
		
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
		
		sx = s.nextInt();
		sy = s.nextInt();
		
		x = x * sx;
		y = y * sy;
		
		System.out.println(x + " e " + y);
		System.out.println();

	
		for(int l = 0; l < matriz.length; l++) {
			for(int c = 0; c < matriz.length; c++) {
				if(l == Math.round(x) && c <= Math.round(y)) {
						matriz[c][l] = 1;
						
				}
			}
		}						
		
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
