package apeb1.pkg20.taller.pkg6.construcción.de.programas.usando.estructuras.de.selección.anidadas;
import java.util.Scanner;
public class Facturacion2Productos {
    public static void main(String[] args) {
        double compra, coniva, iPhonecantidad, iPadtotal, iPhonetotal, iPhoneprecio,
                iPadprecio, iPadcantidad,
                envio, iva, descuento5, descuento20, sinEnvio, condescuento5,
                condescuento20;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de iPads compradas: ");
        iPadcantidad = teclado.nextDouble();
        System.out.println("Ingrese el precio de un iPad : ");
        iPadprecio = teclado.nextDouble();
        System.out.println("Ingrese la cantidad de Iphones comprados: ");
        iPhonecantidad = teclado.nextDouble();
        System.out.println("Ingrese el precio de un Iphone: ");
        iPhoneprecio = teclado.nextDouble();
        System.out.println("Ingrese el precio del envio: ");
        envio = teclado.nextDouble();
        iPadtotal = iPadcantidad * iPadprecio;
        iPhonetotal = iPhonecantidad * iPhoneprecio;
        compra = iPhonetotal + iPadtotal;
        iva = compra * 0.12;
        coniva = iva + compra;
        System.out.println("Producto: iPad - Cantidad: " + iPadcantidad
                    + " Precio: " + iPadprecio + " Subtotal: " + iPadtotal);
        System.out.println("Producto: iPhone - Cantidad: " + iPhonecantidad
                    + " Precio:" + iPhoneprecio + " Subtotal: " + iPhonetotal);
        System.out.println("Subtotal: " + compra);
        System.out.println("IVA: " + iva);
        System.out.println("Subtotal + IVA: " + coniva);
        if (coniva <= 1000) {
            descuento5 = coniva * 0.05;
            condescuento5 = coniva - descuento5 + envio;
            System.out.println("Descuento: " + descuento5);
            System.out.println("Gastos de envio: " + envio);
            System.out.println("MONTO FACTURA: " + condescuento5);
        } 
        else {
            descuento20 = coniva * 0.2;
            if (coniva <= 5000) {
                condescuento20 = coniva - descuento20 + envio;
                System.out.println("Descuento: " + descuento20);
                System.out.println("Gastos de envio: " + envio);
                System.out.println("MONTO FACTURA: " + condescuento20);
            } 
            else {
                sinEnvio = coniva - descuento20;
                System.out.println("Descuento: " + descuento20);
                System.out.println("Gastos de envio: 0");
                System.out.println("MONTO FACTURA: " + sinEnvio);
            }
        }
    }
}