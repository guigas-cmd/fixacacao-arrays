package application;

import java.util.Locale;
import java.util.Scanner;
import entities.DataPeople;

public class AlturasPeople {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("quantas pessoas serao digitadas? ");
        int n = sc.nextInt();
        DataPeople[] vect = new DataPeople[n];
        // 1 array que corresponde a classe DataPeople
        // problema do prof n utilizou outra classe...
        // ent ele acabou criando 3 arrays. um pra cada dado correspondente.

        for (int i = 0; i < vect.length; i++) {
            System.out.println();
            System.out.printf("dados da %da pessoa: \n" , 1 + i );
            System.out.print("Nome: ");
            String nome = sc.next();

            System.out.print("Idade: ");
            int idade = sc.nextInt();

            System.out.print("Altura: ");
            double altura = sc.nextDouble();

            vect [i] = new DataPeople(nome, idade, altura);
        }


        // ALG TOTAL ALTURA
        double totalAltura = 0;
        for (int i = 0; i < vect.length; i++) {
            totalAltura += vect[i].getAltura();
        }


        // ALG PERCENT MENORES DE 16 ANOS
        double menores16 = 0;
        for (int i = 0; i < vect.length; i++) {
            if (vect[i].getIdade() < 16){
                menores16++;
            }
        }


        double alturaMedia = totalAltura / n;
        double percentMenores16 = menores16 / n * 100;

        System.out.println("FINAL: ");
        System.out.printf("ALTURA MÉDIA: %.2f \n" , alturaMedia);
        System.out.printf("QUANTIDADE DE MENORES: %.0f \n",menores16 );
        System.out.printf("PORCENTAGEM MENORES: %.2f \n" ,percentMenores16);

        System.out.println();
        System.out.println("MENORES: ");
        for (int i = 0; i < vect.length; i++) {
            if (vect[i].getIdade() < 16 ){
                System.out.print(vect[i].getName()); }
        }


        sc.close();
    }
}
