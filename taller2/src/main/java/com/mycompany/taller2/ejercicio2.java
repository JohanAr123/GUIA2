/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.taller2;

import static com.mycompany.taller2.ordenar.bubbleSort;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author ASUS TUF
 */
public class ejercicio2 {
    
    public static void main(String[] args) throws InterruptedException{ //main
        
        double min = 0.0;
        double max = 100.0;
        //numero aleatorio 
         Random random = new Random();
        // lectura de datos
        Scanner entrada= new Scanner(System.in);
       
        //limpiamos pantalla 
        for(int i=0; i<30; i++){
            System.out.println("");
        }
        //variable
         int n,m;
        System.out.println("Ingrese la cantidad de numeros aleatorios");
        n=entrada.nextInt();
        
        //arreglo : 
       double arreglo []= new double [n];
       for (int i=0 ; i<n ;i++){
       double randomInRange = min + ( max - min ) * random.nextDouble();
        arreglo[i]= randomInRange;
       }
      
         //limpiamos pantalla 
        for(int i=0; i<30; i++){
            System.out.println("");
        }
       //ORDENAR ARREGLO CON METODOS DE LA CLASE ORDENAR : 
       System.out.println("MENU Metodo a utilizar: ");
       System.out.println("1.Burbuja");
       System.out.println("2.Insercion");
       System.out.println("3.Seleccion");
       System.out.println("4.Megersort");
       System.out.println("Ingrese la opcion de interes : ");
       m=entrada.nextInt();
       
       if(m<1||m>4){
            System.out.println("Esa opcion no existe");
       }
       //Metodo burbuja : 
       switch(m){
       case 1:// metodo burbuja
  
          //limpiamos pantalla 
        for(int i=0; i<30; i++){
            System.out.println("");
        }
        //escribimos el arreglo:
        System.out.println("Arreglo antes de bubble-sort");
       for(int j= 0 ; j<n; j++){
           System.out.print(arreglo[j]+" ");
       }
       System.out.println("");
       long inicio = System.currentTimeMillis();
       bubbleSort(arreglo);
       System.out.println("Arreglo despues de bubble-sort");
       for(int j= 0 ; j<n; j++){
           System.out.print("|"+arreglo[j]+" ");
       }
       System.out.println("");
       long fin = System.currentTimeMillis();
       long tiempoTotal = fin - inicio;
       System.out.println("Tiempo de ejecución del método: " + tiempoTotal + " milisegundos");
       Thread.sleep(5000);
       break;
       case 2://metodo de insercion 
        //limpiamos pantalla 
        for(int i=0; i<30; i++){
            System.out.println("");
        }
        //escribimos el arreglo:
        System.out.println("Arreglo antes del metodo de insercion");
        for(int j= 0 ; j<n; j++){
        System.out.print(arreglo[j]+" ");
       }
       System.out.println("");
        inicio = System.currentTimeMillis();
       ordenar.ordInsercion(arreglo);
       
       System.out.println("Arreglo despues  del metodo de insercion ");
       for(int j= 0 ; j<n; j++){
           System.out.print(arreglo[j]+" ");
       }
       System.out.println("");
        fin = System.currentTimeMillis();
        tiempoTotal = fin - inicio;
       System.out.println("Tiempo de ejecución del método: " + tiempoTotal + " milisegundos");
       Thread.sleep(5000);
           break;
           
       case 3: //metodo de seleccion 
           for(int i=0; i<30; i++){
            System.out.println("");
        }
        //escribimos el arreglo:
        System.out.println("Arreglo antes del metodo de seleccion");
        for(int j= 0 ; j<n; j++){
        System.out.print(arreglo[j]+" ");
       }
       System.out.println("");
       inicio = System.currentTimeMillis();
       ordenar.ordenarPorSeleccion(arreglo);
       
       System.out.println("Arreglo despues del metodo de seleccion ");
       for(int j= 0 ; j<n; j++){
           System.out.print(arreglo[j]+" ");
       }
       System.out.println("");
        fin = System.currentTimeMillis();
        tiempoTotal = fin - inicio;
       System.out.println("Tiempo de ejecución del método: " + tiempoTotal + " milisegundos");
       Thread.sleep(5000);
           break;
           
       case 4: //metodo mergesort
           //limpiamos pantalla 
        for(int i=0; i<30; i++){
            System.out.println("");
        }
        //escribimos el arreglo:
        System.out.println("Arreglo antes de mergesort");
       for(int j= 0 ; j<n; j++){
           System.out.print(arreglo[j]+" ");
       }
       System.out.println("");
       inicio = System.currentTimeMillis();
       ordenar.sort(arreglo,0,arreglo.length-1);
       
       System.out.println("Arreglo despues de mergesort ");
       for(int j= 0 ; j<n; j++){
           System.out.print(arreglo[j]+" ");
       }
       System.out.println("");
        fin = System.currentTimeMillis();
        tiempoTotal = fin - inicio;
       System.out.println("Tiempo de ejecución del método: " + tiempoTotal + " milisegundos");
       Thread.sleep(5000);
               break;
       }
    }
}
