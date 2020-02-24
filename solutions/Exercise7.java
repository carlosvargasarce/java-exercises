package solutions;

import java.io.BufferedReader;
import java.io.PrintStream;
import java.io.InputStreamReader;
import java.io.IOException;

public class Exercise7 {
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintStream out = System.out;

    public static void main(String[] args) throws IOException {
        /*
        Encontrar el menor de tres números
        */

        // Entradas
        out.print("Ingrese el primer número: ");
        int numero1 = Integer.parseInt(in.readLine());
        out.print("Ingrese el segundo número: ");
        int numero2 = Integer.parseInt(in.readLine());
        out.print("Ingrese el tercer número: ");
        int numero3 = Integer.parseInt(in.readLine());

        if (numero1 < numero2 && numero1 < numero3) {
            out.println(numero1 + " es el menor de los tres números");
        }else if (numero2 < numero1 && numero2 < numero3){
            out.println(numero2 + " es el menor de los tres números");
        }else {
            out.println(numero3 + " es el menor de los tres números");
        }
    }
}