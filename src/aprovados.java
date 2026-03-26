import java.util.Locale;
import java.util.Scanner;

public class aprovados {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("quantos alunos serao digitados? ");
        int n = sc.nextInt();

        double[] notas1 = new double[n];
        double[] notas2 = new double[n];
        String[] nomes = new String[n];
        double media;

        for (int i = 0; i < n; i++) {
            System.out.println();
            System.out.printf("Digite nome, primeira e segunda nota do %d aluno: " , i + 1);
            nomes[i] = sc.next();
            notas1[i] = sc.nextDouble();
            notas2[i] = sc.nextDouble();

        }

        for (int i = 0; i < n; i++) {
            media = (notas1[i] + notas2[i]) / 2;

            if(media >= 6){
                System.out.printf("%s \n" , nomes[i]);
            }
        }


        sc.close();
    }
}
