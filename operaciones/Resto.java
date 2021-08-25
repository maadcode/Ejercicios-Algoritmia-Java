
package operaciones;

import java.util.Scanner;

public class Resto {
    public static void main(String[] args) {
        // Ejemplo, el resto de la división entre 10 y 3 es 1
        Scanner input = new Scanner(System.in);
        System.out.print("Ingresa el dividendo: ");
        int dividendo = input.nextInt();
        System.out.print("Ingresa el divisor: ");
        int divisor = input.nextInt();
        System.out.println("El resto de la división es " + restoRecursivo(dividendo, divisor));
    }
    
    public static int restoRecursivo(int numberOne, int numberTwo) {
        return (numberOne < numberTwo) ? numberOne : restoRecursivo(numberOne - numberTwo, numberTwo);
    }
}
