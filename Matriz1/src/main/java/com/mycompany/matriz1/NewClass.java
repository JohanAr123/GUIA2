/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.matriz1;

/**
 *
 * @author ASUS TUF
 */
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS TUF
 */

public class NewClass {
    // main
    public static void main(String[] args) throws InterruptedException {
    //funcion para lectura de variables
     Scanner entrada=new Scanner (System.in);
   
     // variables:
     int num,nf,nc;
        //limpiamos la consola
        for(int o=0; o<30 ; o++){
        System.out.println("");
             }
     //MENU :
     System.out.println("MENU MATRICES ");
     System.out.println("1.SUMA");
     System.out.println("2.PRODUCTO ");
     System.out.println("3.PRODUCTO ESCALAR ");
     System.out.println("4.TRASPUESTA ");
     System.out.println("ingrese la opcion de su interes");
     // Lectura variable n
     num= entrada.nextInt();
     if(num >5 || num <1 ){
         System.out.println("Esa opcion no existe.");
         Thread.sleep(5000);
     }
     //creamos el switch para el menu
     switch(num)
     {
         case 1 ://CASO DE SUMA DE MATRICES
             //limpiamos la consola
             for(int i=0; i<30 ; i++){
                 System.out.println("");
             }
             //PEDIMOS AL USUARIO INGRESAR EL NUMERO DE FILAS Y COLUMNAS
             System.out.println("ingrese el numero de filas ");
             nf= entrada.nextInt();
             System.out.println("ingrese el numero de columnas ");
             nc= entrada.nextInt();
             matriz.SumarMatriz(nf,nc);
             
             break;
             
         case 2: //CASO DE MULTIPLICACION DE MATRICES
             
              //limpiamos la consola
             for(int i=0; i<30 ; i++){
                 System.out.println("");
             }
             //PEDIMOS AL USUARIO INGRESAR EL NUMERO DE FILAS Y COLUMNAS
             System.out.println("ingrese el numero de filas ");
             nf= entrada.nextInt();
             System.out.println("ingrese el numero de columnas ");
             nc= entrada.nextInt();
             matriz.multmatriz(nf, nc);
             break;
             
         case 3: //producto escalar de una matriz 
              //limpiamos la consola
             for(int i=0; i<30 ; i++){
                 System.out.println("");
             }
             //PEDIMOS AL USUARIO INGRESAR EL NUMERO DE FILAS Y COLUMNAS
             System.out.println("ingrese el numero escalar ");
             float es= entrada.nextInt();
             System.out.println("ingrese el numero de filas ");
             nf= entrada.nextInt();
             System.out.println("ingrese el numero de columnas ");
             nc= entrada.nextInt();
             matriz.escalarmatriz(nf,nc,es);
             break;
             
         case 4: //transpuesta de una matriz 
             
              //limpiamos la consola
             for(int i=0; i<30 ; i++){
                 System.out.println("");
             }
             //PEDIMOS AL USUARIO INGRESAR EL NUMERO DE FILAS Y COLUMNAS
             System.out.println("ingrese el numero de filas ");
             nf= entrada.nextInt();
             System.out.println("ingrese el numero de columnas ");
             nc= entrada.nextInt();
             matriz.transmatriz(nf,nc);
             break;
     }
    }
}