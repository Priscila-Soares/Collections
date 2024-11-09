package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayString {

	public static void main(String[] args) {


        ArrayList<String> cores = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

         

    for (int i = 0; i < 5; i++) {
    System.out.print("Escolha uma cor " + (i + 1) + ": ");
    String cor = scanner.nextLine();
    cores.add(cor);
    }

        

    System.out.println("Cores escolhidas: " + cores);

        
        
    System.out.println("Cores em ordem crescente: " + cores);

        
        scanner.close();
    }
}
