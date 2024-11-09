package lacosDeRepeticao;

import java.util.Scanner;

public class IdadeWhile {

	public static void main(String[] args) {
	
        Scanner scanner = new Scanner(System.in);

        int idade;
        int menoresDe21 = 0;
        int maioresde50 = 0;
        
        while (true) {
            
            System.out.print("Digite a idade): ");
            idade = scanner.nextInt();

            
            if (idade < 0) {
                break;
            }

            
            if (idade < 21) {
                menoresDe21++;
            } else if (idade > 50) {
            } maioresde50++;
        }

        
        System.out.println("Total de pessoas com menos de 21 anos: " + menoresDe21);
        System.out.println("Total de pessoas com mais de 50 anos: " + maioresDe50);

        scanner.close();
    }
}