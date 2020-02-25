package solutions;

import java.io.BufferedReader;
import java.io.PrintStream;
import java.io.InputStreamReader;
import java.io.IOException;

public class Exercise11 {
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintStream out = System.out;

    static final int RANGO1 = 31043000;
    static final int RANGO2 = 62444000;

    public static void main(String[] args) throws IOException {
        /*
            La empresa de contabilidad “El Evasor" le ha solicitado que diseñe un programa de software que le permita, dada la información necesaria, imprimir el detalle de un proceso sobre la declaración de impuestos de sus clientes jurídicos.
            Para ejecutar el proceso un cliente tiene que indicar su total de ingresos y su total de gastos deducibles de impuesto según la ley; la diferencia de
            estos da como resultado su renta gravable. El proceso de la empresa utiliza esta renta gravable para calcular el impuesto de manera escalonada
            siguiendo el esquema presentado en la tabla número uno.
            A cada cliente la empresa le cobra una comisión basada en el porcentaje que representa la renta gravable de sus ingresos totales, la comisión es
            un porcentaje de la renta gravable como se muestra en la tabla número dos.

            Por ejemplo: si un cliente obtuvo una renta gravable de 70 millones de colones durante el año deberá pagar por los primeros 31 043 000 un 10%, luego tiene que restar a 70 millones los 31 043 000 millones, esto deja un saldo de 38 957 000 colones, sobre estos debe pagar un 20% y así sucesivamente.

            Tabla #1
                Monto de la renta gravable	         Impuesto
                Hasta 31,043,000 colones anuales	   10%
                Hasta 62,444,000 colones anuales	   20%
                Más de 62,444,000 colones anuales	   30%

            Tabla #2
                Porcentaje de la renta gravable de los ingresos 	Comisión
                Menor a 6 %	                                          1.5%
                6% a 10 %	                                          3.8 %
                Más del 10 %	                                      5.5 %


        A usted se le pide imprimir el nombre del cliente, el monto de la renta gravable, el monto de impuestos y el monto de la comisión que deberá cancelar.

        */
        
        //Definición de Variables
        double rentaGravable = 0;
        double impuestos = 0;
        double comision = 0;
        double montoComision = 0;
        double saldo = 0;
        double rentaGravableIngresos = 0;

        //Entradas
        out.println("Sistema de Contabilidad el Evasor");
        out.println(" ");
        out.printf("Ingrese su nombre: ");
        String nombre = in.readLine();
        out.printf("Ingrese sus ingresos totales en Colones: ");
        double ingresos = Integer.parseInt(in.readLine());
        out.printf("Ingrese los gastos totales en Colones: ");
        double gastos = Integer.parseInt(in.readLine());

        rentaGravable = ingresos - gastos;

        if (rentaGravable > 0) {
            if (rentaGravable <= RANGO1) {
                impuestos = rentaGravable * 0.1;
            }else if (rentaGravable <= RANGO2) {
                impuestos = rentaGravable * 0.1;
                impuestos = (rentaGravable - RANGO1) * 0.2;
            }else if (rentaGravable > RANGO2) {
                impuestos = rentaGravable * 0.1;
                impuestos += (RANGO2 - RANGO1) * 0.2;
                impuestos += (rentaGravable - RANGO2) * 0.3;
            }

            rentaGravableIngresos = rentaGravable / ingresos;

            if (rentaGravableIngresos < 0.06) {
                comision = 1.5;
            }else if (rentaGravableIngresos >= 0.06 && rentaGravableIngresos <= 0.1) {
                comision = 3.8;
            }else {
                comision = 5.5;
            }

            montoComision = rentaGravable * (comision/100);

            //Salidas
            out.println("Detalle de la declaración de impuestos de " + nombre + ".");
            out.println("El monto de la Renta Gravable corresponde a " + rentaGravable + ".");
            out.println("Impuestos: " + impuestos);
            out.println("Monto de comisión: " + montoComision);

        } else {
            out.printf("El contribuyente no debe pagar impuestos, ya que no obtuvo ganancias.");  
        }
    }
}