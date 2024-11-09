package lacosCondicionais;

import java.util.Scanner;
public class Colaboradores_Switch {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		float[] reajuste = {0.1f, 0.07f, 0.09f, 0.06f, 0.05f, 0.08f};
		String[] cargo = {"Gerente", "Vendedor", "Supervisor", "Motorista", "Estoquista", "Técnico de TI"};
		
		System.out.print("Nome do colaborador: ");

        String nome = leitor.nextLine();

        System.out.print("Código do cargo (1-6): ");

        int codigoCargo = leitor.nextInt();

        System.out.print("Salário: ");

        float salario = leitor.nextFloat();

        if (codigoCargo >= 1 && codigoCargo <= 6) {

            float novoSalario = salario + (reajuste[codigoCargo - 1] * salario);

            System.out.println("\nNome: " + nome);

            System.out.println("Cargo: " + cargo[codigoCargo - 1]);

            System.out.println("Novo salário: " + novoSalario);

        } else {

            System.out.println("Código de cargo inválido.");

        }

        leitor.close();

    }


	}

	
	
	
	        