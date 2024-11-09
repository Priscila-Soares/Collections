package java_fullstack;


import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	
        public static void main(String[] args) {
        	    Queue<Integer> fila = new LinkedList<Integer>();
            int opcao;
            
            System.out.println("***********************************");
            System.out.println("1 - Adicionar Cliente na Fila");
            System.out.println("2 - Listar Todos os Clientes");
            System.out.println("3 - Retirar Cliente da Fila");
            System.out.println("0 - Sair");
            System.out.println("***********************************");
            System.out.println("Entre com a opção desejada: ");
            Iterator<Integer> iterator = fila.iterator();
            
    		
    		while(iterator.hasNext()){
    		   System.out.println(iterator.next());
    		}

    		System.out.println("\nLimpar a fila");
    		fila.clear();

    		System.out.println("\nA fila está vazia? " + fila.isEmpty());		

    	}

    }




