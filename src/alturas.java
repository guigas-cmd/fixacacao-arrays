import java.util.Locale;
import java.util.Scanner;

public class alturas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("quantas pessoas serao digitadas? ");
        int n = sc.nextInt();

        String[] name = new String[n];
        int[] idades = new int[n];
        double[] altura = new double[n];




        for (int i = 0; i < n; i++) {
            System.out.println();
            System.out.printf("Dados da %da pessoa: \n", 1 + i);

            System.out.print("Nome: ");
            name[i] = sc.next();

            System.out.print("Idade: ");
            idades[i] = sc.nextInt();

            System.out.print("Altura: ");
            altura[i] = sc.nextDouble();

        }


        double countMenores16 = 0;
        double somaMenores16 = 0;
        for (int i = 0; i < n; i++) {
            if (idades[i] <= 16){
                countMenores16++;
                somaMenores16 += idades[i];
            }
        }

        double somaAlturas = 0;
        for (int i = 0; i < n; i++) {
            somaAlturas += altura[i];
        }
        double mediaAlturas = somaAlturas / (double) n;

        double menores16Percent = somaMenores16 / countMenores16;
        System.out.printf("Altura média: %.2f \n" , mediaAlturas);
        System.out.printf("Pessoas com menos de 16 anos: %.2f \n " , menores16Percent);
        for (int i = 0; i < n; i++) {
            if (idades[i] <= 16){
                System.out.println(name[i]);
            }
        }

        sc.close();
    }
}
