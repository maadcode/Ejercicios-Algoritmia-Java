
package formulas;

import java.util.Scanner;

public class Permutaciones {

    public static void main(String[] args) {
        // Formula de Permutacion nPr = n! / (n - r)!, donde n es la cantidad de elementos y r es el tamaño de los grupos
        Scanner input = new Scanner(System.in);
        String palabras[] = {"a", "e", "i", "o"};
        System.out.print("¿En cuántos grupos deseas ? : ");
        double grupo = input.nextDouble();
        double resultado = factorial(palabras.length)/factorial(palabras.length - grupo);
        System.out.println(resultado);
    }
    
    public static double factorial(double n) {
        return (n == 1) ? 1 : n * factorial(n - 1);
    }
    
}
