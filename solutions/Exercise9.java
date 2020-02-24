package solutions;

import java.io.BufferedReader;
import java.io.PrintStream;
import java.io.InputStreamReader;
import java.io.IOException;

public class Exercise9 {
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintStream out = System.out;

    public static void main(String[] args) throws IOException {
        /*
            Dada una letra indique si es una vocal o una consonante. Puede ignorar letras mayúsculas y hacer el ejercicio pensando que solo se ingresen minúsculas.
        */

        //Definición de Variables
        boolean isVowel = false;

        //Entradas
        out.printf("Ingresá una letra del abecedario: ");
        char letra = in.readLine().charAt(0);

        switch (letra) {
        case 'a':
        isVowel = true;
        break;
        case 'e':
        isVowel = true;
        break;
        case 'i':
        isVowel = true;
        break;
        case 'o':
        isVowel = true;
        break;
        case 'u':
        isVowel = true;
        break;
        default:
        isVowel = false;
        break;
        }

        /* 
            if (letra == 'a' || letra == 'e', || letra == 'i' || letra == 'o' || letra == 'u') {
                isVowel = true;
            }else {
                isVowel = false;
            }
        */


        //Salidas
        out.println("La letra es una " + (isVowel ? "vocal." : "consonante."));
    }
}