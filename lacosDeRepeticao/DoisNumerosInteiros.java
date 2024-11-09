package lacosDeRepeticao;

import java.util.Scanner;

public class DoisNumerosInteiros {

	public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System.in);

        System.out.print("Qual o primeiro número? (menor): ");
        int numero1 = scanner.nextInt();

        System.out.print("Qual o segundo número?(maior): ");
        int numero2 = scanner.nextInt();

        if (numero1 >= numero2) {
            System.out.println("Intervalo inválido.");
        } else {
            System.out.println("Múltiplos de 3 e 5:");
         
            for (int i = numero1; i <= numero2; i++) {
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println(i);
                }
            }
        }

        scanner.close();
    }
}
