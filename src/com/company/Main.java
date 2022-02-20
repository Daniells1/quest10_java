/*Leia um valor de ponto flutuante com duas casas decimais. Este valor representa um valor monetário. A seguir, calcule o menor número de notas e moedas possíveis no qual o valor pode ser decomposto. As notas consideradas são de 100, 50, 20, 10, 5, 2. As moedas possíveis são de 1, 0.50, 0.25, 0.10, 0.05 e 0.01. A seguir mostre a relação de notas necessárias.

Entrada
O arquivo de entrada contém um valor de ponto flutuante N (0 ≤ N ≤ 1000000.00).

Saída
Imprima a quantidade mínima de notas e moedas necessárias para trocar o valor inicial, conforme exemplo fornecido.

Obs: Utilize ponto (.) para separar a parte decimal.
 */

package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args)

    {
        Scanner sc = new Scanner(System.in);
        double valor1=sc.nextDouble();

        double valor2=valor1;
        int nota100=0;
        int    nota50 = 0;
        int nota20 = 0;
        int nota10 = 0;
        int nota5 = 0;
        int nota2 = 0;
        int moeda1 = 0;
        int moeda50= 0;
        int moeda25 = 0;
        int moeda10 = 0;
        int moeda5 = 0;
        int moeda01= 0;


        while (valor1 >= 100)

        {

            nota100++;

            valor1 = valor1 - 100;

        }



        while (valor1 >= 50)

        {

            nota50++;

            valor1 = valor1 - 50;

        }



        while (valor1 >= 20)

        {

            nota20++;

            valor1 = valor1 - 20;

        }



        while (valor1 >= 10)

        {

            nota10++;

            valor1 = valor1 - 10;

        }



        while (valor1 >= 5)

        {

            nota5++;

            valor1 = valor1 - 5;

        }



        while (valor1 >= 2)

        {

            nota2++;

            valor1 = valor1 - 2;

        }



        while (valor1 >= 1)

        {

            moeda1++;

            valor1 = valor1 - 1;

        }
        while (valor1 >= 0.50)

        {

            moeda50++;

            valor1 = valor1 - 0.50;

        }
        while (valor1 >= 0.25)

        {

            moeda25++;

            valor1 = valor1 - 0.25;

        }
        while (valor1 >= 0.10)

        {

            moeda10++;

            valor1 = valor1 - 0.10;

        }
        while (valor1 >= 0.05)

        {

            moeda5++;

            valor1 = valor1 - 0.05;

        }

        while (valor1 >= 0.01)

        {

            moeda01++;

            valor1 = valor1 - 0.01;

        }



System.out.println();

        System.out.println("NOTAS:");

        System.out.println(nota100+" nota(s) de R$ 100,00");
        System.out.println(nota50+" nota(s) de R$ 50,00");
        System.out.println( nota20+" nota(s) de R$ 20,00");
        System.out.println( nota10+" nota(s) de R$ 10,00");
        System.out.println( nota5+" nota(s) de R$ 5,00");
        System.out.println( nota2+" nota(s) de R$ 2,00");
        System.out.println("MOEDAS:");
        System.out.println( moeda1+" moeda(s) de R$ 1,00");
        System.out.println(moeda50+" moeda(s) de R$ 0,50");
        System.out.println(moeda25+" moeda(s) de R$ 0,25");
        System.out.println(moeda10+" moeda(s) de R$ 0,10");;
        System.out.println(moeda5+" moeda(s) de R$ 0,05");
        System.out.println(moeda01+" moeda(s) de R$ 0,01");



    }

}
