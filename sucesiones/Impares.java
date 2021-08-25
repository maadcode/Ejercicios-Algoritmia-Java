
package sucesiones;

import java.util.Scanner;

public class Impares {
    public static void main(String[] args) {
        // 1, 3, 5, 7, 9, 11...
        Scanner input = new Scanner(System.in);
        System.out.print("¿Hasta que número quieres que llegue la serie? : ");
        int size = input.nextInt();
        for(int i = 0; i < size; i++) {
            if(isImpar(i)) {
                System.out.print(i + " ");
            }
        }
    }
    
    public static boolean isImpar(int number) {
        return !(number % 2 == 0);
    }
}
