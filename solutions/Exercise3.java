package solutions;

import java.io.BufferedReader;
import java.io.PrintStream;
import java.io.InputStreamReader;
import java.io.IOException;

public class Exercise3 {
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintStream out = System.out;

    public static void main(String[] args) throws IOException {
        /*

        Definición del problema: Calcular el salario de una persona según sus horas trabajadas. El salario varía según la cantidad de horas. Si realiza horas extra se le pagan un 50% más de las regulares, esto aplica solo si trabaja más de 40 horas.

        Análisis: 

        Entradas
        Descripción                                                    Ejemplo

        Horas Trabajadas            (n:horas, t:int)                 20 
        Precio por hora             (n:precio, t:real)               1500.5

        Salidas

        Salario                     (n:salario, t:real)              20000
        

        */
        // Definición de Variables
        double salario = 0;
        int horasExtra = 0;
        double montoHorasExtra = 0;

        // Entradas
        out.print("Ingresa las horas trabajadas: ");
        int horas = Integer.parseInt(in.readLine());
        out.print("Ingrese el precio por hora: ");
        double precio = Double.parseDouble(in.readLine());

        if (horas > 40) {
           horasExtra = horas - 40;
           montoHorasExtra = horasExtra * (precio * 1.5);
           salario = (40 * precio) + montoHorasExtra;
        }else {
           salario = horas * precio;
        }

        //Salidas
        out.println("El salario es de : " + salario);
    }
}