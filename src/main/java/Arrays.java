import java.util.*;

public class Arrays {
    public static void main (String[] args) {

        int[] a = {3, 55, 23, 87, 66, 22, 1, 100, 99, 82, 94, 58, 37, 13, 23, 1, 1, 27, 55, 82, 3, 3, 3, 3, 3};

        //Esercizio 1
        System.out.println("Eserzizio 1");
        int max=0;
        for (int i=0; i<a.length; i++){
            if (a[i] > max){
                max = a[i];
            }
        }
        System.out.println(max);

        //Esercizio 2
        System.out.println("Eserzizio 2");
        for (int i=0; i<a.length; i++){
            if (a[i] == max){
                System.out.println(i);
            }
        }

        //Esercizio 3
        System.out.println("Eserzizio 3");
        System.out.println(contains(55, a));

        //Esercizio 4
        System.out.println("Eserzizio 4");
        System.out.println(isCrescente(a));

        //Esercizio 5
        System.out.println("Eserzizio 5");
        System.out.println(mostRecurrent(a));

        //Esercizio 6
        System.out.println("Eserzizio 6");
        System.out.println(mediaMultipliDiTre(a));

        //Esercizio 7
        System.out.println("Eserzizio 7");
        stampaZigZag(a);

        //Esercizio 8
        System.out.println("Eserzizio 8");
        System.out.println(media(a));

    }

    public static boolean contains(int e, int[] array){
        for (int a: array) {
            if (a == e) return true;
        }
        return false;
    }

    public static Object contains(Object e, Object[] array){
        for (Object a: array) {
            if (a.equals(e)) return true;
        }
        return false;
    }

    public static boolean isCrescente(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i] <= array[i - 1]) {
                return false;
            }
        }
        return true;
    }

    public static int mostRecurrent(int[] array) {
        HashMap<Integer, Integer> countMap = new HashMap<>();
        for (int num : array) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        int mostRecurring = array[0];
        int maxCount = 0;

        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                mostRecurring = entry.getKey();
            }
        }

        return mostRecurring;
    }

    public static double mediaMultipliDiTre(int[] array) {
        int sum = 0, count = 0;
        for (int num : array) {
            if (num % 3 == 0) {
                sum += num;
                count++;
            }
        }
        return count > 0 ? (double) sum / count : 0;
    }

    public static void stampaZigZag(int[] array) {
        int n = array.length;
        for (int i = 0; i < n / 2; i++) {
            System.out.print(array[i] + " ");
            System.out.print(array[n - 1 - i] + " ");
        }
        // Se l'array ha un numero dispari di elementi, stampiamo l'elemento centrale
        if (n % 2 != 0) {
            System.out.print(array[n / 2]);
        }
        System.out.println();
    }

    public static double media(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return (double) sum / array.length;
    }


}
