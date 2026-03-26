import java.util.Locale;
import java.util.Scanner;

public class soma_vetor {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();
        double [] vect = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("digite um numero: ");
            vect[i] = sc.nextDouble();
        }

        System.out.print("VALORES: ");
        for (int i = 0; i < n; i++) {
            System.out.print(vect[i] + " || ");
        }
        System.out.println();

        double soma = 0.0;
        for (int i = 0; i < n; i++) {
            soma += vect[i];
        }

        System.out.println("SOMA = " + soma);
        double media = soma / n;
        System.out.println("MEDIA " + media);

        sc.close();
    }
}
