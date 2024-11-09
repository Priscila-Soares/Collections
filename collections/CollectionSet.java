package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class CollectionSet {

	public static void main(String[] args) {
		

        Set<Integer> numeros = new HashSet<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite 10 valores inteiros não repetidos:");

        
        while (numeros.size() < 10) {
            System.out.print("Digite um número: ");
            int numero = scanner.nextInt();

           
            if (numeros.contains(numero)) {
                System.out.println("Número repetido! Tente novamente.");
            } else {
                numeros.add(numero); 
            }
        }

        scanner.close();

        
        System.out.println("\nElementos da Collection Set:");
        Iterator<Integer> iterator = numeros.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}