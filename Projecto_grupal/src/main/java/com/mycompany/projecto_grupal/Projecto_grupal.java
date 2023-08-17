/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projecto_grupal;
import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class Projecto_grupal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Calculadora basica 2: ");
        System.out.println("Operaciones Disponibles: ");
        System.out.println("1: Suma");
        System.out.println("2: Resta");
        System.out.println("3: Multiplicacion");
        System.out.println("4: Division");
        System.out.println("Selecciona una operacion (1/2/3/4): ");
        int option =sc.nextInt();
        System.out.println("Ingresa el primer numero: ");
        double n1 =sc.nextDouble();
        System.out.println("Ingresa el segundo numero:");
        double n2 =sc.nextDouble();
        double result=0.0;
        switch (option){
            case 1:
                result=n1+n2;
                break;
            case 2:
                result=n1-n2;
                break;
            case 3:
                result=n1*n2;
                break;
            case 4:
                if (n2!=0){
                    result=n1/n2;
                    
                }else{
                    System.out.println("No se puede dividir por 0");
                    return;
                }
                break;
            default:
                System.out.println("Operacion Invalida.");
                return;
            
        }
    }
}
