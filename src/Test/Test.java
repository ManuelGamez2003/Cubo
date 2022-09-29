/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import Cubo.Cubo;
import java.util.Scanner;

/**
 *
 * @author Alumno Mañana
 */
public class Test {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Cubo cubo = new Cubo(0,0,0);
        int num1;
        int num2;
        int num3;
        System.out.println("Introduce el alto del cubo");
        num1=teclado.nextInt();
        System.out.println("Introduce el ancho lado del cubo");
        num2=teclado.nextInt();
        System.out.println("Introduce el profundo lado del cubo");
        num3=teclado.nextInt();
        System.out.println("El resultado es " + cubo.volumen(num1, num2, num3));
        System.out.println(cubo.toString());
    }
}
