
package sucesiones;

import java.util.Scanner;

public class Primos {
    public static void main(String[] args) {
        // 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31
        Scanner input = new Scanner(System.in);
        System.out.print("Hasta que número quieres que llegue la serie : ");
        int size = input.nextInt();
        System.out.println(checkPrimo(size));
        for (int i = 2; i <= size; i++) {
            if(checkPrimo(i)) {
                System.out.print(i + " ");
            }
        }
    }
    
    public static boolean checkPrimo(int number) {
        for (int i = number - 1; i > 1; i--) {
            if(number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
