package solutions;

import java.io.BufferedReader;
import java.io.PrintStream;
import java.io.InputStreamReader;
import java.io.IOException;

public class Exercise2 {
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintStream out = System.out;

    public static void main(String[] args) throws IOException {
        /*
        Haga un algorítmo para una caja de supermercado. Que recibe el nombre del producto, la cantidad de unidades, el precio y si esta excento o no y calcule el subtotal, el IVA (aplicando el 13%) y total de factura.


        Definición del problema: Calcular el subtotal, los impuestos y el total de la factura de un producto de supermercado, del cual conocemos el nombre, la cantidad de unidades, el precio y si esta o no excento.

        Análisis: 

        Entradas
        Descripción                                                    Ejemplo

        Nombre del Producto         (n:nombre, t:string)             Manzana
        Cantidad de unidades        (n:cantidad, t:entero)           10
        Precio del Producto         (n:precio, t:real)               400
        Esta excento                (n:estaExcento, t:string)        Si


        Salidas

        Subtotal                    (n:subtotal, t:real)             4000   4000
        Impuestos                   (n:impuestos, t:real)            0      1500
        Total                       (n:totalFactura, t:real)         4000   5500
        
        */
        // Definición de Variables
        double totalFactura = 0;
        double subtotal = 0;
        double impuestos = 0;
        double iva = 0.13;

        // Entradas
        out.print("Ingresa el Nombre del Producto: ");
        String nombre = in.readLine();
        out.print("Ingresa la cantidad de unidades del producto: ");
        int cantidad = Integer.parseInt(in.readLine());
        out.print("Ingresa el precio del producto: ");
        double precio = Double.parseDouble(in.readLine());
        out.print("¿Esta excento el producto? Si/No: ");
        String estaExcento = in.readLine();

        if (estaExcento.equals("Si")) {
            iva = 0; //Si no esta excento el I.V.A prevalece en 0.13
        }

        //Calcular el subtotal
        subtotal = cantidad * precio;

        //Calcular los impuestos
        impuestos = subtotal * iva; // Si el I.V.A es 0 es porque estaba excento

        //Calcular el total de la factura
        totalFactura = subtotal + impuestos;

        //Salidas
        out.println("Resultados del producto: " + nombre);
        out.println("El subtotal es de " + subtotal + " Colones");
        out.println("Los impuestos son de " + impuestos + " Colones");
        out.println("El total es de " + totalFactura + " Colones");
    }
}