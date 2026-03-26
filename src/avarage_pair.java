import java.util.Locale;
import java.util.Scanner;

public class avarage_pair {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("quantos elementos vai ter o vetor?");
        int n = sc.nextInt();
        int[] vect = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Digite um numero: ");
            vect[i] = sc.nextInt();
        }

        int countPar = 0;
        int somaPar = 0;
        for (int i = 0; i < n; i++) {
            if (vect[i] % 2 == 0){
                countPar++;
                somaPar += vect[i];
            }

        }

        double avgPar = (double) somaPar / countPar;

        if (somaPar == 0){
            System.out.println("NENHUM NUMERO PAR");
        } else if (somaPar > 0) {
            System.out.println("MEDIA NUMEROS PARES = " + avgPar);
        }


        sc.close();
    }
}
