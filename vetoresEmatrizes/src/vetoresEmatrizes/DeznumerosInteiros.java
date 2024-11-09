package vetoresEmatrizes;

import java.util.Scanner;
public class DeznumerosInteiros {

	public static void main(String[] args) {
		
		
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        int soma = 0;

        
    for (int i = 0; i < 10; i++) {
    System.out.print("Digite um número inteiro: ");
            numeros[i] = scanner.nextInt();
        }

        
    System.out.println("Ímpares:");
    for (int i = 1; i < 10; i += 2) {
            System.out.println(numeros[i]);
        }

        
    System.out.println("Pares:");
    for (int i = 0; i < 10; i++) {
            if (numeros[i] % 2 == 0) {
                System.out.println(numeros[i]);
            }
        }

        
    for (int i = 0; i < 10; i++) {
            soma += numeros[i];
        }

        
    double media = soma / 10.0;

       
    System.out.println("Soma: " + soma);
    System.out.println("Média: " + media);

        scanner.close();
    }
}
