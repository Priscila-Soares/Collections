package variaveisEoperadors;


import java.util.Scanner;

public class ValoresFloat {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Digite o valor 1: ");
		float n1 = leitor.nextFloat();
		
		System.out.print("Digite o valor 2: ");
		float n2 = leitor.nextFloat();
		
		System.out.print("Digite o valor 3: ");
		float n3 = leitor.nextFloat();
		
		System.out.print("Digite o valor 4: ");
		float n4 = leitor.nextFloat();
		
		float diferenca = (n1 * n2) - (n3 * n4);
		
		
		System.out.println("A diferença do produto entre n1 e n2 pelo produto entre n3 e n4 é: " + diferenca);
		
		leitor.close();
	}
}
