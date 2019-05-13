/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;
// Importación de librerías y paquetes
import java.util.Scanner;
import secundario.*;
/**
 *
 * @author royerjmasache
 */
public class ClasePrincipal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declaración del Scanner
        Scanner entrada = new Scanner(System.in);
        // Declaración e importación de variables
        String mensajeFinal1 = "";
        String mensajeFinal2 = "";
        String mensajeFinal3 = "";
        String mensajeFinal4 = "";
        String mensajeFinal5 = "";
        String nombre = "";
        String apellido = "";
        String option1 = "";
        int option2 = 0;
        float sueldo = 0;
        int hijos = 0;
        float pasaje = 0;
        float bar = 0;
        float salida = 0;
        boolean bandera1 = true;
        boolean bandera2 = true;
        int contador1 = 1;
        int contador2 = 1;
        int n = 1;
        int reportet  = 1;
        float totalp = 0;
        float totalb = 0;
        float totals = 0;
        float total = 0;
        String reporte = Datos.reporte1;
        String nreporte = Datos.nreporte1;
        String padre = Datos.padre1;
        String sueldos = Datos.sueldo1;
        String nhijos = Datos.hijos1;
        String gastos = Datos.gastos1;
        String freporte = Datos.freporte1;
        while (bandera2 = true){
            mensajeFinal4 = String.format("%s\n", mensajeFinal4);
            System.out.println("Ingrese su nombre:");
            nombre = entrada.nextLine();
            System.out.println("Ingrese su apellido:");
            apellido = entrada.nextLine();
            System.out.println("Ingrese su sueldo semanal");
            sueldo = entrada.nextFloat();
            System.out.println("Ingrese su número de hijos");
            hijos = entrada.nextInt();
            mensajeFinal1 = String.format("Persona\t\tPasajes\t\tBar\t\t"
                    + "Salidas\n");
            while (bandera1 == true){
            System.out.printf("Ingrese el gasto semanal en pasajes"
                    + " de  su hijo %d:\n", n);
            pasaje = entrada.nextFloat();
            totalp = totalp + pasaje;
            System.out.printf("Ingrese el gasto semanal en bar"
                    + " de su hijo %d:\n", n);
            bar = entrada.nextFloat();
            totalb = totalb + bar;
            System.out.printf("Ingrese el gasto semanal en salidas"
                    + "de su hijo %d:\n", n);
            salida = entrada.nextFloat();
            totals = totals + salida;
            // Acumulación de cadenas (String.format)
            mensajeFinal1 = String.format("%sHijo %d\t\t%.2f\t\t%.2f\t\t%.2f\n",
                    mensajeFinal1, n, pasaje, bar, salida);
            // Incremento del contador
            contador1 = contador1 + 1;
            // Limpieza del Buffer
            entrada.nextLine();
            mensajeFinal2 = String.format("%sTotales\t\t%.2f\t\t%.2f\t\t%.2f",
                    mensajeFinal1, totalp, totalb, totals);
            System.out.println("¿Desea ingresar los datos de su siguiente"
                    + " hijo?\n1. Sí\n2. No");
            option1 = entrada.nextLine();
            if(option1.equals("1")){
                bandera1 = true;
                n = n + 1;
            } else {
                bandera1 = false;
                }
            }
            total = totalp + totalb + totals;
            if (total < sueldo){
                mensajeFinal3 = String.format("%s\nEl padre de familia %s %s le"
                        + " alcanza el dinero semanal para sus gastos", 
                        mensajeFinal2, nombre, apellido);
            } else {
                mensajeFinal3 = String.format("%s\nEl padre de familia %s %s no"
                        + " le alcanza el dinero semanal para sus gastos",
                        mensajeFinal2, nombre, apellido);
            }
            mensajeFinal4 = String.format("%s\n%s\n\n%s%d\n\n%s%s%s\n%s%.2f\n"
                    + "%s%d\n\n%s\n%s\n\n%s %d",
                    mensajeFinal4, reporte, nreporte, reportet, padre, nombre,
                    apellido, sueldos, sueldo,nhijos, hijos, gastos,
                    mensajeFinal3, freporte, reportet);
            contador2 = contador2 + 1;
            System.out.println("¿Desea seguir ingresando datos?\n"
                    + "1. Sí\n2. No");
            option2 = entrada.nextInt();
            entrada.nextLine();
            if(option2 == 1){
                bandera2 = true;
            } else {
                if(option2 == 2){
                bandera2 = false;
                System.out.printf("%s", mensajeFinal4);
                }
            }
        }
    }
}