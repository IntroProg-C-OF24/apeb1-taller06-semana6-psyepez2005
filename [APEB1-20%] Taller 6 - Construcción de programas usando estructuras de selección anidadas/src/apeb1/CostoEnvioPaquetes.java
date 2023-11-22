package apeb1.pkg20.taller.pkg6.construcción.de.programas.usando.estructuras.de.selección.anidadas;
import java.util.Scanner;
public class CostoEnvioPaquetes {
    public static void main(String[] args) {
        double peso;
        String region;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresar el peso del paquete: ");
        peso = teclado.nextDouble();
        System.out.println("Ingresar la region: (LOCAL/NACIONAL/OTRO)");
        region = teclado.next();
        if(peso<5&&region.equals("LOCAL"))
            System.out.println("Su tarifa adicional es de 5$");
        else
            if(peso<=10&&region.equals("NACIONAL"))
                System.out.println("Su tarifa adicional es de 10$");
            else
                System.out.println("Su tarifa adicional es de 15$");
    }
}