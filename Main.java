/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg27072019_6;

import java.security.SecureRandom;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author wardog
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Date fecha_actual = new Date();

        Scanner entradaDatos = new Scanner(System.in);
        SecureRandom folio = new SecureRandom();
        int miFolio = folio.nextInt(100) + 1;

        String[] misProductos = {"Laptop HP Gamer", "Mause Logitech", "Impresora Epson", "Teclado Gamer"};
        int[] precios = {8500, 159, 4895, 500};
        int precio = 0, codigo = 0, cant = 0;
        double subTotal = 0, iva = 0, total = 0;

        char continuar;

        System.out.println("Bienvenido a TIENDAS AMERICANTECH\n     Soluciones en tecnologia\n");
        System.out.println("** N U E S T R O S  P R O D U C T O S **\n");

        System.out.println("==================================+================================================");
        System.out.println("Codigo \t\tDescripcion\t\t\t\t\t\tPrecio");
        System.out.println("=========================+========+================================================");
        System.out.println();

        for (int i = 0; i < misProductos.length; i++) {
            System.out.printf("%-15d %-55s $%s", i, misProductos[i], precios[i]);
            System.out.println();
        }
        System.out.println("==================================+================================================\n");

        System.out.print("Desea realizar una compra ? [S/n]..:");
        continuar = entradaDatos.next().charAt(0);

        if (continuar == 'n' || continuar == 'N') {
            System.exit(0);
        }

        do {

            System.out.print("\nIngresa el codigo del articulo: ");
            codigo = entradaDatos.nextInt();

            switch (codigo) {
                case 0:
                    precio = precios[0];
                    break;
                case 1:
                    precio = precios[1];
                    break;
                case 2:
                    precio = precios[2];
                    break;
                case 3:
                    precio = precios[3];
                    break;
                default:
                    System.out.println("Has ingresado una opcion incorrecta...!! ");
                    System.exit(0);
                    break;
            }

            System.out.print("Numero de piezas [?]..: ");
            cant = entradaDatos.nextInt();
            subTotal = precios[codigo] * cant;
            iva = subTotal * .16;
            total = subTotal + iva;
            System.out.println();
            System.out.println("\t\t\t\t** S U T I C K E T **");
            System.out.println();

            System.out.println(fecha_actual);
            System.out.println("\n*** TIENDAS AMERICANTECH ***");
            System.out.println("Folio: " + miFolio + "\n");
            System.out.println("==================================+================================================");
            System.out.println("CANT \t\tDESCRIPCION\t\t\t\t\t\tCOSTO");
            System.out.println("=========================+========+================================================");
            System.out.println();
            System.out.printf("%-15d %-55s $ %d", cant, misProductos[codigo], precios[codigo]);
            System.out.println("\n\n\n\n---------------------------------------------------------Sub-total: $ " + subTotal);
            System.out.printf("--------------------------------------------------------------------iva:$ %.2f ", iva);
            System.out.println();
            System.out.println("------------------------------------------------------------------total:$ " + total);
            System.out.println("=========================+========+================================================");

            System.out.print("Quire realizar otra compra ? ... [S/n] ");
            continuar = entradaDatos.next().charAt(0);

        } while (continuar != 'n');

    }

}
