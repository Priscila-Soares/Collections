package lacosCondicionais;

import java.util.Scanner;

public class ParImpar_PositivoNegativo {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        char continuar; 

        do {
            
            System.out.print("Digite um número inteiro: ");
            int numero = scanner.nextInt();

            if (numero % 2 == 0) {
                System.out.print("O número " + numero + " é Par ");
            } else {
                System.out.print("O número " + numero + " é Ímpar ");
            }

          
            if (numero > 0) {
                System.out.println("e Positivo.");
            } else if (numero < 0) {
                System.out.println("e Negativo.");
            } 

            
            System.out.print("Quer analisar outro número? (s/n): ");
            continuar = scanner.next().toLowerCase().charAt(0); 
        } while (continuar == 's'); 

        scanner.close(); 
    }
}



