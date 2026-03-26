import java.util.Locale;
import java.util.Scanner;

public class dados_pessoais {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serao digitadas? ");
        int n = sc.nextInt();


        double[] altura = new double[n];
        char[] gender = new char[n];


        for (int i = 0; i < n; i++) {
            System.out.println();
            System.out.printf("Altura da %da pessoa: \n" , i + 1);
            altura[i] = sc.nextDouble();

            System.out.printf("Genero da %da pessoa(F/M): \n" , i + 1);
            gender[i] = Character.toUpperCase(sc.next().charAt(0)); // formatacao obrigatoria para maiusculo


            if (gender[i] != 'F' && gender[i] != 'M'){
                i--;
            }
        }


        double maiorAltura = altura[0];
        double menorAltura = altura[0];
        for (int i = 0; i < n; i++) {
            if(altura[i] < menorAltura){
                menorAltura = altura[i];
            }
            if(altura[i] > maiorAltura){
                maiorAltura = altura[i];
            }

        }


        double totalMulheres = 0;
        double somaAlturaM = 0;
        for (int i = 0; i < n; i++) {
            if (gender[i] == 'F'){ // estrutura for faz calculo de quantas Female tem em N, altura delas no total
                // somaAlturaM = somaAlturaM + altura[i];
                somaAlturaM += altura[i];
                totalMulheres++;
            }
        }
        double mediaMulheres = somaAlturaM / totalMulheres;


        // NUMERO DE HOMENS >>
        int quantityMen = 0;
        for (int i = 0; i < gender.length; i++) {
            if(gender[i] == 'M'){
                ++quantityMen;
            }
        }


        System.out.printf("Menor altura = %.2f \n" , menorAltura);
        System.out.printf("Maior altura = %.2f \n" , maiorAltura);
        System.out.printf("Media das alturas das mulheres: %.2f \n" , mediaMulheres );
        System.out.printf("Numero de homens = %d \n" , quantityMen);

        sc.close();
    }
}
