package solutions;

import java.io.BufferedReader;
import java.io.PrintStream;
import java.io.InputStreamReader;
import java.io.IOException;

public class Exercise5 {
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintStream out = System.out;

    public static void main(String[] args) throws IOException {
        /*
        Calcular el mayor de dos números

        */
        // Definición de Variables
        String resultado;

        // Entradas
        out.print("Ingrese el primer número: ");
        int numero1 = Integer.parseInt(in.readLine());
        out.print("Ingrese el segundo número: ");
        int numero2 = Integer.parseInt(in.readLine());

        resultado = numero1 > numero2 ? numero1 + " es mayor que " + numero2  : numero2 + " es mayor que " + numero1;

        //Salidas
        out.println(resultado);
    }
}