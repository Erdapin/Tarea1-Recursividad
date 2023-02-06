/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica1recursividad;

import java.util.Scanner;

/**
 *
 * @author salas
 */
public class Ejercicios {
   
    public void VocalesOracion(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Escriba una oracion a la que quitarle "
                + "las vocales:\n");
        String oracion = sc.nextLine();
        System.out.print("El resultado es: "+ VocalesOracionRecursiva(oracion));
    }
    
    public String VocalesOracionRecursiva(String oracion){
        //Retorna de una vez cuando ya no quedan caracteres
        //Este es el caso base.
        if(oracion.length() == 0){
            return oracion;
        }
        //Toma el primer caracter de la oracion para comprobar si es vocal
        char letra = oracion.charAt(0);
        if(letra == 'a' || letra == 'i' || letra == 'u' || letra == 'e' ||
                letra == 'o')
        {
            //En caso de que sea vocal se retorna la funcion ignorando el 
            //caracter recien analizado
            return VocalesOracionRecursiva(oracion.substring(1));
        }
        //En caso de que no sea vocal se agraga la letra correspondiente al 
        //'ciclo' a el retorno de la proxima llamada.
        return letra + VocalesOracionRecursiva(oracion.substring(1));
    }
    
    public void SumaNumeros(){
        //Funcion Base para obtener los datos y realizar presentacion
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Escriba el numero al cual se sumara hasta "
                + "llegar hasta el:\n");
        
        int numero = sc.nextInt();
        
        System.out.print("El resultado de la "
                + "suma es: " + SumaNumerosRecursiva(numero));
    }
    
    public int SumaNumerosRecursiva(int numero){
        //Caso base, una vez se llega a 1 solo se retorna para ser devuelto
        if(numero == 1){
            return 1;
        }
        //Se llama otra vez a la funcion restando uno del numero a llegar.
        //De esta forma se hace la suma en reversa desde el mas grande hasta 1
        return numero + SumaNumerosRecursiva(numero - 1);
    }
    
    public void CheckBinario(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Escriba el numero a detectar si es binario: \n");
        int numero = sc.nextInt();
        if(CheckBinarioRecursivo(numero))
        {
            System.out.print("Es binario");
        }else
        {
            System.out.print("No es binario");
        }
        
    }
    
    public boolean CheckBinarioRecursivo(int numero){
        //Casos base, primero si el numero es negativo entonces no es binario
        //Y luego si se llega al final y es 1 o 0 entonces es verdadero
        if(numero < 0){
            return false;
        }
        if(numero<=1){
            return true;
        }
        //Si es mayor a 1: (Ya que puede ser una combinacion larga (10110))
        //Se revisa el ultimo digito, si es mayor a 1 entonces no es binario
        //num%10 es matematica y obtiene el ultimo numero (unidad)
        int digitoFinal= numero % 10;
        if(digitoFinal > 1){
            return false;
        }
     //Se hace la recursion, sin embargo se elimina el ultimo numero (10 de 101)
     //Esto es matematica otra vez.
        return CheckBinarioRecursivo(numero/10);
    }
    
    public void CalcExponencial(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Escriba el base:\n");
        int numero = sc.nextInt();
        System.out.print("Escriba el exponente a aplicar:\n");
        int exponente = sc.nextInt();
        
        System.out.print("El resultado "
                + "es: " + CalcExponencialRecursivo(numero, exponente));
    }
    
    public int CalcExponencialRecursivo(int numero, int exponente) {
        //Caso base:
        if (exponente == 0) {
          return 1;
          //Basicamente es un retorno nulo ya que al multiplicarse es 
          //igual al numero que se multiplique
        } else {
            //se resta el exponente y se vuelve a multiplicar.
            //Asi hasta que el exponente sea 0
          return numero * CalcExponencialRecursivo(numero, exponente - 1);
        }
    }
    
    public void Factorial(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Escriba el numero a sacar factorial:\n");
        int numero = sc.nextInt();
        System.out.print("El resultado es: " + FactorialRecursivo(numero));
    }
    
    public double FactorialRecursivo(int numero){
        if(numero==0){
            return 1;
        } else{
            return numero * FactorialRecursivo(numero - 1);
        }
    
    }
    
}
