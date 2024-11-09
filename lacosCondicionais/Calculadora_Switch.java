package lacosCondicionais;

import java.util.Scanner;

public class Calculadora_Switch {

	public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        float numero1, numero2, resultado;

        int codigo;

        System.out.print("Digite o primeiro número: ");

        numero1 = scanner.nextFloat();

        System.out.print("Digite o segundo número: ");

        numero2 = scanner.nextFloat();

        System.out.print("Digite o código da operação (1-4): ");

        codigo = scanner.nextInt();

        switch (codigo) {

            case 1:

                resultado = numero1 + numero2;

                System.out.println("Resultado: " + resultado);

                break;

            case 2:

                resultado = numero1 - numero2;

                System.out.println("Resultado: " + resultado);

                break;

            case 3:

                resultado = numero1 * numero2;

                System.out.println("Resultado: " + resultado);

                break;

            case 4:

                if (numero2 == 0) {

                    System.out.println("Erro: Divisão por zero!");

                } else {

                    resultado = numero1 / numero2;

                    System.out.println("Resultado: " + resultado);

                }

                break;

            default:

                System.out.println("Operação Inválida!");

        }

        scanner.close();

    }

}