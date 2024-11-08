package variaveisEoperadors;

import java.util.Scanner;

public class SalarioLiquido {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		float salarioBruto, adicionalNoturno, horasExtras, descontos, salarioLiquido;
		
		System.out.print("Digite o salário bruto: ");
		 salarioBruto = leitor.nextFloat();
		 
		 System.out.print("Digite o adicional noturno: ");
		 adicionalNoturno = leitor.nextFloat();
		 
		 System.out.print("Digite as horas extras: ");
		 horasExtras = leitor.nextFloat();
		 
		 System.out.print("Digite os descontos: ");
		descontos = leitor.nextFloat();
		
		salarioLiquido = salarioBruto + adicionalNoturno + (horasExtras * 5) - descontos;
		
		System.out.print("Salário líquido: " + salarioLiquido);
		 
		leitor.close();
		
		

	}

}
