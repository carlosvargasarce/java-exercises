package solutions;

import java.io.BufferedReader;
import java.io.PrintStream;
import java.io.InputStreamReader;
import java.io.IOException;

public class Exercise1 {
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintStream out = System.out;

    public static void main(String[] args) throws IOException {
        /*
        Definición del problema: Pide un número entero y muestra si es positivo o negativo y si es par o impar.
        */

        //Entradas
        out.print("Digite un número entero: ");
        int numero = Integer.parseInt(in.readLine());
        //Solución
        boolean isPar = false;
        boolean isPositive = false;

        if (numero == 0) {
            out.println("Debes ingresar un número mayor o menor a 0");
        } else {
            //Determinar si es positivo (Si gustas puedes hacer las salidas aquí directamente)
            if (numero > 0) {
                isPositive = true;
            }else {
                isPositive = false;
            }
            //Determinar si es par
            if (numero % 2 == 0) {
                isPar = true;
            }else {
                isPar = false;
            }
        }
        
        //Salidas
        if (isPar) {
            out.println("El número " + numero + " es par");
        } else {
            out.println("El número " + numero + " es inpar");
        }

        if (isPositive) {
            out.println("El número " + numero + " positivo");
        } else {
            out.println("El número " + numero + " es negativo");
        }
    }
}