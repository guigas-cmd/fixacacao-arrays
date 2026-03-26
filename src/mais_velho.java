import java.util.Locale;
import java.util.Scanner;

public class mais_velho {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Quantas pessoas voce vai digitar? ");
        int n = sc.nextInt();

        String[] name = new String[n];
        int [] age = new int[n];


        // armazena name e age nos arrays[i], posicao i
        for (int i = 0; i < n; i++) {
            System.out.println();
            System.out.printf("Dados da %da pessoa: \n" , i + 1);
            System.out.print("nome: "); name[i] = sc.next();

            System.out.print("Idade: "); age[i] = sc.nextInt();

        }

        // mutacao
        int maiorIdade = age[0];
        String nomeMaisVelho = name[0];
        for (int i = 0; i < n; i++) {
            if(age[i] > maiorIdade){
                maiorIdade = age[i];
                nomeMaisVelho = name[i];
            }
        }

        System.out.printf("Pessoa mais velha: %s || %d", nomeMaisVelho , maiorIdade);


        sc.close();
    }
}
