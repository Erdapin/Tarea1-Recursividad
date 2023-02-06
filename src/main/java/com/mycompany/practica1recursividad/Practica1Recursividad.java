package com.mycompany.practica1recursividad;
import java.util.*;
import com.mycompany.practica1recursividad.Ejercicios;


public class Practica1Recursividad {

    public static void main(String[] args) {
        Ejercicios ej = new Ejercicios();
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        do{
            System.out.print("\nDigite un numero que corresponda:\n"
                    + "1-Ejercicio Eliminar Vocales\n"
                    + "2-Ejercicio Suma Numeros Naturales\n"
                    + "3-Ejercicio Checkear Binario\n"
                    + "4-Ejercicio Calcular Exponencial\n"
                    + "5-Ejercicio Calcular Factorial\n"
                    + "0-Salir\n\n");
            opcion = sc.nextInt();
            switch(opcion){
                case 1:
                    ej.VocalesOracion();
                    break;
                case 2:
                    ej.SumaNumeros();
                    break;
                case 3:
                    ej.CheckBinario();
                    break;
                case 4:
                    ej.CalcExponencial();
                    break;
                case 5:
                    ej.Factorial();
                case 0:
                    break;
            }
        }while(opcion != 0);
    }
}
