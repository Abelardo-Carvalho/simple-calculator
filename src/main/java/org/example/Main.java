package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int menu;
        int num1 = 0;
        int num2 = 0;
        double resultado = 0;

        do {

            System.out.println("======= Calculadora=====");
            System.out.println("Escolha uma operação");
            System.out.println("(1) Somar");
            System.out.println("(2) Subtrair");
            System.out.println("(3) Dividir");
            System.out.println("(4) Multiplicar");
            System.out.println("(5) Sair");
            menu = scan.nextInt();

            switch (menu) {

                case 1:
                    System.out.println("Digite o primeiro número");
                    num1=scan.nextInt();
                    System.out.println("Digite o segundo número");
                    num2=scan.nextInt();
                    resultado = num1+num2;
                    System.out.println("O resultado da soma é: " + resultado);

                break;

                case 2:
                    System.out.println("Digite o primeiro número");
                    num1=scan.nextInt();
                    System.out.println("Digite o segundo número");
                    num2=scan.nextInt();
                    resultado= num1-num2;
                    System.out.println("O resultado da subtração é: " + resultado);

                    break;
                case 3:
                    System.out.println("Digite o primeiro número");
                    num1=scan.nextInt();
                    System.out.println("Digite o segundo número");
                    num2=scan.nextInt();
                    resultado = num1/num2;
                    System.out.println("O resultado da divisão é: " + resultado);

                    break;
                case 4:
                    System.out.println("Digite o primeiro número");
                    num1=scan.nextInt();
                    System.out.println("Digite o segundo número");
                    num2=scan.nextInt();
                    resultado = num1*num2;
                    System.out.println("O resultado da multiplicação é: " + resultado);

                    break;
                default:
                    break;

            }

        } while (menu != 5);

        System.out.println("Calculadora finalizada");

    }
}