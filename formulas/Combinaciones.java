
package formulas;

import java.util.Scanner;

public class Combinaciones {
    public static void main(String[] args) {
        // Formula de Combinacion nCr = n! / (n - r)! * r!, donde n es la cantidad de elementos y r es el tamaño de los grupos
        Scanner input = new Scanner(System.in);
        String palabras[] = {"a", "e", "i", "o"};
        System.out.print("¿En cuántos grupos deseas ? : ");
        double grupo = input.nextDouble();
        double resultado = factorial(palabras.length)/(factorial(palabras.length - grupo) * factorial(grupo));
        System.out.println(resultado);
    }
    
    public static double factorial(double n) {
        return (n == 1) ? 1 : n * factorial(n - 1);
    }
}
