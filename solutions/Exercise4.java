package solutions;

import java.io.BufferedReader;
import java.io.PrintStream;
import java.io.InputStreamReader;
import java.io.IOException;

public class Exercise4 {
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintStream out = System.out;

    public static void main(String[] args) throws IOException {
        /*
        Calcular el peso ideal de una persona.

        Queremos que el programa solicite el sexo (H/M) y la altura (cm) al usuario por pantalla y que calcule el peso ideal.
        
        Peso ideal mujeres = altura-120
        Peso ideal hombres = altura-110.

        */
        // Definición de Variables
        double pesoIdeal = 0;

        // Entradas
        out.print("Ingresa el sexo de la persona (H/M): ");
        char sexo = in.readLine().charAt(0);
        out.print("Ingrese la altura de la persona en cm: ");
        double altura = Double.parseDouble(in.readLine());

        
        if (sexo == 'M') {
            pesoIdeal = altura - 120;
        }else {
            pesoIdeal = altura - 110;
        }

        //Salidas
        out.println("El peso ideal de la persona es de : " + pesoIdeal + " kilos.");
    }
}