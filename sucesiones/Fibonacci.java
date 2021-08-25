
package sucesiones;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        // 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144
        Scanner input = new Scanner(System.in);
        System.out.print("Hasta que número quieres que llegue la serie : ");
        int size = input.nextInt();
        recursividad(0, 0, 1, size);
    }
    
    public static void recursividad(int suma, int ultimo, int auxiliar, int limite) {
        if (ultimo >= limite ) {
            System.out.println("");
        } else {
            System.out.print(ultimo + " ");
            suma = auxiliar + ultimo;
            ultimo = auxiliar;
            auxiliar = suma; 
            recursividad(suma, ultimo, auxiliar, limite);
        }
    }
}
