
package operaciones;

import java.util.Scanner;

public class Potencia {
    public static void main(String[] args) {
        // Ejemplo, la potencia de 4 elevado a 3 es 64
        Scanner input = new Scanner(System.in);
        System.out.print("Ingresa la base: ");
        int base = input.nextInt();
        System.out.print("Ingresa el exponente: ");
        int exponente = input.nextInt();
        System.out.println("La potencia es " + potenciaRecursiva(base, exponente));
    }
    
    public static int potenciaRecursiva(int base, int exponente) {
        return (exponente == 1) ? base : base * potenciaRecursiva(base, exponente - 1);
    }
}
