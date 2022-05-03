package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        System.out.println("fes un programa que demani 3 valors numeric (a,b,c)");
        //primer valor numeric
        System.out.println("primer valor");
        Scanner valor1 = new Scanner(System.in);
        int a = valor1.nextInt();

        //segundo valor
        System.out.println("segundo valor");
        Scanner valor2 = new Scanner(System.in);
        int b = valor2.nextInt();

        //tercer valor
        System.out.println("tercer valor");
        Scanner valor3 = new Scanner(System.in);
        int c = valor3.nextInt();

        //operaciones
        double raiz;
        raiz = (b * b) - (4 * a * c);
        double x1 = (-b + Math.sqrt(raiz));
        double x2 = (-b - Math.sqrt(raiz));
        x1 = x1 / 2;
        x2 = x2 / 2;

        //condiciones
        if (raiz > 0) {
            System.out.println("son soluciones reales y distintas");
            System.out.println("x1 es mes gran " + x1);
            System.out.println("x2 es mes gran " + x2);
        }
        if (raiz == 0) {

            System.out.println("son soluciones reales y son iguals");
            System.out.println("x1 son iguals " + x1);
            System.out.println("x2 son iguals " + x2);

        }
        if (raiz < 0) {
            System.out.println("son soluciones reales y   mes petit");
            System.out.println("x1 son  mes petit " + x1);
            System.out.println("x2 son  mes petit " + x2);
        }
        //tanquem los Scaner
        valor1.close();
        valor2.close();
        valor3.close();
    }
}
