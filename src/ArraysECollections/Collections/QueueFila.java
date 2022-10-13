package ArraysECollections.Collections;

import java.util.LinkedList;
import java.util.Queue;

public class QueueFila {
    public static void main(String[] args) {

        Queue<String> fila = new LinkedList<String>();

        // Offer e Add -> adicionam elementos na fila
        // Diferença é o comportamento ocorre
        // quando a fila esta cheia
        fila.add("Ana"); // retorna false
        fila.offer("Bia"); // Lança uma exceção
        fila.offer("Carlos");
        fila.offer("Daniel");
        fila.offer("Rafaela");
        fila.offer("Luca");

        // Peek e Element -> obter o próximo elementos
        // da fila (sem remover)

        // Diferença é o comportamento ocorre
        // quando as fila está vazia!
        /*
        System.out.println(fila.peek()); // retorna null
        System.out.println(fila.peek());
        System.out.println(fila.element()); //lança uma exceção
        System.out.println(fila.element());
        */


        //fila.size();
        //fila.clear();
        //fila.isEmpty();

        System.out.println(fila.poll()); // chama e remove
        System.out.println(fila.poll());
        System.out.println(fila.remove());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());




    }
}
