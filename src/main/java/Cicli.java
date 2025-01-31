import java.util.*;

public class Cicli {
    public static void main (String[] args) {
        System.out.println("Eserzizio 1");
        /*Eserzizio 1*/
        for (int i = 0; i <= 10; i++) {
            System.out.print(i + ", ");
        }
        System.out.println("\nEserzizio 2");

        /*Eserzizio 2*/
        for (int i = 0; i <= 20; i++) {
            System.out.print(i + ", ");
            i = i + 1;
        }

        System.out.println("\nEserzizio 3");

        /*Eserzizio 3*/
        System.out.println("Digita il numero di cui vuoi stampare la tabellina: ");
        Scanner input = new Scanner(System.in);
        Cicli a = new Cicli();
        //a.tabellina(input.nextInt());
        a.tabellina(3);


        System.out.println("\nEserzizio 4");

        /*Eserzizio 4*/
        for (int i = 0; i <= 5; i++) {
            for(int j = 5; j >= i; j--){
                System.out.print("*");
            }
            System.out.println("");
        }

        System.out.println("\nEserzizio 5 ");

        /*Eserzizio 5*/
        for (int i = 0; i <= 5; i++) {
            for(int j = 0; j <= i; j++){
                System.out.print("#");
            }
            System.out.println("");
        }

        System.out.println("\nEserzizio 6 ");

        /*Eserzizio 6*/
        for (int i = 1; i <= 6; i++) {
            for(int j = 1; j <= i; j++){
                if(j<=i){
                    System.out.print(j);
                }else {
                    System.out.print("#");
                }
            }

            System.out.print("  ");

            for(int j = 6; j >= 1; j--){
                if(j>=i){
                    System.out.print(j-i+1);
                }else {
                    System.out.print(" ");
                }
            }

            System.out.println("");
        }

        System.out.println("\nEserzizio 7 ");

        /*Eserzizio 7*/
        for (int i=0; i <= 10; i++){
            System.out.print(fibonacci(i)+", ");
        }

        System.out.println("\nEserzizio 8 ");

        /*Eserzizio 8*/

        for (int i = 0; i <= 10; i++) {
            for(int j = 0; j <= i; j++){
                if (i == j){
                    System.out.print(fibonacci(j));
                }else{
                    System.out.print(fibonacci(j)+", ");
                }
            }
            System.out.println("");
        }


    }

    public static void tabellina(int num){
        for (int i = 0; i<=10; i++){
            System.out.print(num*i + ", ");
        }
    }

    public static int fibonacci(int n){
        if(n == 0){
            return 0;
        }
        if(n == 1 || n == 2){
            return 1;
        }
        return fibonacci(n-2) + fibonacci(n-1);
    }

}