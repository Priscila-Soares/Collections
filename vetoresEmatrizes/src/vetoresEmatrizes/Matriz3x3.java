package vetoresEmatrizes;

import java.util.Scanner;
public class Matriz3x3 {

	public static void main(String[] args) {
		

        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int somaDiagonalPrincipal = 0;
        int somaDiagonalSecundaria = 0;

        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Digite o elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        System.out.print("Elementos da Diagonal Principal: ");
        for (int i = 0; i < 3; i++) {
            System.out.print(matriz[i][i] + " ");
            somaDiagonalPrincipal += matriz[i][i];
        }
        System.out.println("\nSoma da Diagonal Principal: " + somaDiagonalPrincipal);

        System.out.print("Elementos da Diagonal Secundária: ");
        for (int i = 0; i < 3; i++) {
            System.out.print(matriz[i][2 - i] + " ");
            somaDiagonalSecundaria += matriz[i][2 - i];
        }
        System.out.println("\nSoma da Diagonal Secundária: " + somaDiagonalSecundaria);
        
        scanner.close();
    }
}
