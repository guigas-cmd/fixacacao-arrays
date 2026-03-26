import java.util.*;


public class negativos {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.println("quantos numeros voce vai digitar??");
        int n = sc.nextInt();
        int[] vect = new int[n];



        for(int i=0; i<n; i++){
            System.out.println("digite um numero: ");
            vect[i] = sc.nextInt();

            // armazenou numeros no vect[i]
        }


        System.out.println("NUMEROS NEGATIVOS: ");
        for(int i=0; i<n; i++){
            if(vect[i] < 0){System.out.printf("%d \n ", vect[i]); }
        }


        System.out.println("NUMEROS POSITIVOS: ");
        for(int i=0; i<n; i++){
            if(vect[i] > 0){System.out.printf("%d \n ", vect[i]); }
        }

        sc.close();
    }
}
