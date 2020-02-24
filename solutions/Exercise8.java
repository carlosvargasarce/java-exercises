package solutions;

import java.io.BufferedReader;
import java.io.PrintStream;
import java.io.InputStreamReader;
import java.io.IOException;

public class Exercise8 {
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintStream out = System.out;

    public static void main(String[] args) throws IOException {
        /*
            Calcule el Precio de un boleto de avión si el precio base son $785 y se ofrecen las siguientes categorías, de las cuales el usuario indica cual desea comprar

            Turista -> Precio Base
            Ejecutiva -> Doble precio base
            Premier Class -> 3.5 veces el precio base
            Turista Premium -> 1.5 veces el precio base
        */

        //Definición de Variables
        double precioBase = 785;

        //Entradas
        out.printf("Ingrese la categoría que deseas para viajar: %n Turista (1) %n Ejecutiva (2) %n Premier Class (3) %n Turista Premium (4): ");
        int categorias = Integer.parseInt(in.readLine());
        double precioFinal = 0;

        switch (categorias) {
        case 1:
        precioFinal = precioBase;
        break;
        case 2:
        precioFinal = precioBase * 2;
        break;
        case 3:
        precioFinal = precioBase * 3.3;
        break;
        case 4:
        precioFinal = precioBase * 1.5;
        break;
        default:
        precioFinal = 0;
        break;
        }

        if (precioFinal > 0) {
            out.println("El precio final es de" + precioFinal + " $");
        }else {
            out.println("Ingrese una categoría válida");
        }

    }
}