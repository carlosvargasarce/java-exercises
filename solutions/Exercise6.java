package solutions;

import java.io.BufferedReader;
import java.io.PrintStream;
import java.io.InputStreamReader;
import java.io.IOException;

public class Exercise6 {
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintStream out = System.out;

    public static void main(String[] args) throws IOException {
        /*
        . Se trata de calcular el precio de un artículo al cual se le hace un descuento dependiendo del cliente. Si
        el cliente es normal se le hace un 5% de descuento, pero si el cliente es frecuente se le hace un 10%
        de descuento.

        */
        // Definición de Variables
        double precioFinal = 0;

        // Entradas
        out.print("Ingrese el precio del artículo: ");
        int precio = Integer.parseInt(in.readLine());
        out.print("Ingrese el tipo de cliente: Normal (N) o Frecuente (F): ");
        char tipoCliente = in.readLine().charAt(0);

        precioFinal = tipoCliente == 'N' ? precio * 1.05 : precio * 1.1;

        //Salidas
        out.println("El precio final es de: " + precioFinal + " Colones.");
    }
}