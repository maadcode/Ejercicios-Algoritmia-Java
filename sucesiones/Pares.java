
package sucesiones;

import java.util.Scanner;

public class Pares {
    public static void main(String[] args) {
        // 2, 4, 6, 8, 10, 12...
        Scanner input = new Scanner(System.in);
        System.out.print("¿Hasta que número quieres que llegue la serie? : ");
        int size = input.nextInt();
        for(int i = 1; i <= size; i++) {
            if (isPar(i)) {
                System.out.print(i + " ");
            }
        }
    }
    
    public static boolean isPar(int number) {
        return number % 2 == 0;
    }
}
