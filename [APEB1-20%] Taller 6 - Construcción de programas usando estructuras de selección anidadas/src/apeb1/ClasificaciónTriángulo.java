package apeb1.pkg20.taller.pkg6.construcción.de.programas.usando.estructuras.de.selección.anidadas;
import java.util.Scanner;
public class ClasificaciónTriángulo {
    public static void main(String[] args) {
        double ladoA, ladoB, ladoC;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresar lado A del triangulo: ");
        ladoA = teclado.nextDouble();
        System.out.println("Ingresar lado B del triangulo: ");
        ladoB = teclado.nextDouble();
        System.out.println("Ingresar lado C del triangulo: ");
        ladoC = teclado.nextDouble();
        if(ladoA>ladoB+ladoC||ladoB>ladoA+ladoC||ladoC>ladoA+ladoC)
            System.out.println("No es un triangulo");
        else
            if(ladoA == ladoB && ladoA == ladoC)
                System.out.println("El triangulo es equilatero");
            else
                if(ladoA==ladoB || ladoA==ladoB || ladoB==ladoC)
                    System.out.println("El triangulo es isoseles");
                else
                    System.out.println("El triangulo es escaleno");
    }
}