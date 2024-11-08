package variaveisEoperadors;

import java.util.Scanner;

public class Notas {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Digite a nota 1: ");
		float nota1 = leitor.nextFloat();
		
		System.out.print("Digite a nota 2: ");
		float nota2 = leitor.nextFloat();
		
		System.out.print("Digite a nota 3: ");
		float nota3 = leitor.nextFloat();
		
		System.out.print("Digite a nota 4: ");
		float nota4 = leitor.nextFloat();
		
		float media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		System.out.println("Média: " + media);
		
		leitor.close();
	}
}
