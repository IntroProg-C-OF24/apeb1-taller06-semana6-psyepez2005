
package apeb1.pkg20.taller.pkg6.construcción.de.programas.usando.estructuras.de.selección.anidadas;
import java.util.Scanner;
public class TipoOperacion {
    public static void main(String[] args) {
        int operacion;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresar el numero de operacion basica");
        operacion=teclado.nextInt();
        switch(operacion){
            case 1:
                System.out.println("Suma");
            break;
            case 2:
                System.out.println("Resta");
            break;
            case 3:
                System.out.println("Multiplicacion");
            break;
            case 4:
                System.out.println("Division");
            break;
            default:
                System.out.println("Solo existen 4 operaciones basicas");
        } 
    }
}    
