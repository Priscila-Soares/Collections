package lacosDeRepeticao;

import java.util.Scanner;

public class NumerosInteiros {

	public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numero;
        int soma = 0;

        do {
            System.out.print("Digite um número: (Para sair digite 0: ");
            numero = scanner.nextInt();

            if (numero > 0) {
                soma += numero;
            }
        } while (numero != 0);

        System.out.println("O resultado da soma é: " + soma);
    }
}
