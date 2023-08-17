/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.newproyect;
import java.util.Scanner;
/**
 *
 * @author Alumno
 */
public class Newproyect {

    public static void main(String[] args) {
        
      Scanner scanner  = new Scanner (System.in);
      
        System.out.println("Ingrese el primer numero: ");
        double num1 = scanner.nextDouble();
        
        System.out.println("Ingrese el segundo numero: ");
        double num2 = scanner.nextDouble();
        
        System.out.println("seleccione la operacion");
        System.out.println("1. suma");
        System.out.println("2. resta");
        System.out.println("3. multiplicacion");
        System.out.println("4. division");
        
       int opcion = scanner.nextInt();
       double resultado = 0;
       
       switch (opcion){
          case 1:
               resultado = num1 + num2 ;
               break;
                       
          case 2 :
               resultado = num1 - num2;
               break;
                       
          case 3:
               resultado = num1 * num2 ;
               break;
               
          case 4:
              if (num2 != 0){
               resultado = num1 / num2 ;
              }else {
                  System.out.println("No se puede dividir por 0.");
                  scanner.close();
                  return;
              }   
              break ;
          default:
              System.out.println("opcion no  valida");
              scanner.close();
              return;
       }  
             System.out.println("el resultado es: " + resultado);
             scanner.close();
    }

}
