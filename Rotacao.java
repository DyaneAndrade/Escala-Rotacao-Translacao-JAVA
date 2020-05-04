import java.util.Scanner;

public class Rotacao {
	public static void main(String[] args) {

		int [][] matriz = new int[11][11];
		
		int x, y, xr = 1, yr = 1;
		
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
		
		System.out.println("Qual dos valor 30º, 45º, 60º ou 90º?");
		
		int valor = s.nextInt();
		double sen = 0, cos = 0;
		
		if(valor == 30) {
			sen = 0.5;
			cos = 1.22;
		}if(valor == 45) {
			sen = 1;
			cos = 1;
		}if(valor == 60) {
			sen = 1.22;
			cos = 0.5;
		}if(valor == 90) {
			sen = 1;
			cos = 0;
		}
		
		x = (int) (((x-xr)*cos) - ((y-yr)*sen));
		y = (int) (((y-yr)*cos) + ((x-xr)*sen));
		
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
