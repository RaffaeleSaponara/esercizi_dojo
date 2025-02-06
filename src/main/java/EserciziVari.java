import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class EserciziVari {

    public static void main (String[] args){
        System.out.println(fattoriale(5));
        System.out.println(fibonacci(20));
        int[] a = bubbleSort(new int[]{1, 5, 7, 3, 2, 9, 8, 10, 4});
        for (int i = 0; i<a.length; i++){System.out.print(a[i]+",");}
        System.out.println("");
        System.out.println(invertiStringa("pollo"));
        System.out.println(invertiStringa2("pollo"));
        System.out.println(anagramma("pollo","llopo"));
        System.out.println(palindroma("dfafd"));
        cercaSommaTarget(new int[]{1,2,3,4,5,6,7,8,9}, 13);
        cercaMax(new int[]{1,2,3,4,5,6,7,8,9});
        rearrange("vi6olino ragn5o se1i 4bel prop2rio un3");
    }

    public static int fattoriale(int n){

        int fatt=0;
        if(n == 0){
            fatt = 1;
        }else{
            fatt = n * fattoriale(n-1);
        }
        return fatt;
    }

    public static int fibonacci(int n){
        if(n==0){
            return 0;
        }
        if(n==1 || n==2){
            return 1;
        }
        return fibonacci(n-2)+fibonacci(n-1);
    }


    public static int[] bubbleSort(int[] myArray) {

        int temp = 0;

// parte confrontando i primi due elementi dell'array e se il primo dei due è maggiore li inverte appoggiandosi
// su una variabile temp. Poi confronta quindi il secondo(che è a questo punto è il max tra i primi due) col terzo e fa la stessa cosa
// in modo tale da portare l'elemento più grande in fondo.
// Dopo la prima iterazione quindi avremo che l'ultimo elemento sarà il max dell'intero array, quindi si procede con la seconda iterazione ma escludendo l'ultimo elemento,
// Per questo --> j < (myArray.length - i)  .

        for (int i = 0; i < myArray.length; i++) {
            for (int j = 1; j < (myArray.length - i); j++) {

                if (myArray[j - 1] > myArray[j]) {
                    temp = myArray[j - 1];
                    myArray[j - 1] = myArray[j];
                    myArray[j] = temp;
                }
            }
        }
        return myArray;
    }

    public static String invertiStringa(String stringa){
        StringBuilder inversa = new StringBuilder();
        for(int i=0; i<stringa.length(); i++){
            inversa.append(stringa.charAt(stringa.length()-1-i));
        }
        return inversa.toString();
    }

    public static String invertiStringa2(String stringa){
        char[] a = new char[stringa.length()];
        for(int i=0; i<stringa.length(); i++){
            a[stringa.length()-1-i] = stringa.charAt(i);
        }
        return Arrays.toString(a);
    }

    public static boolean anagramma (String a, String b){
        int CHARACTER_RANGE= 256;
        if (a.length() != b.length()) {
            return false;
        }
        int count[] = new int[CHARACTER_RANGE];
        for (int i = 0; i < a.length(); i++) {
            count[a.charAt(i)]++;
            count[b.charAt(i)]--;
        }
        for (int i = 0; i < CHARACTER_RANGE; i++) {
            if (count[i] != 0) {
                return false;
            }
        }
        return true;
    }


    public static boolean palindroma (String a){
       int left=0;
       int right=a.length()-1;

       while(left<right){

            if(a.charAt(left) != a.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void cercaMax(int[] a){
        int max=0;
        for(int i=0; i<a.length; i++){
            if(a[i] > max){
                max=a[i];
            }
        }
        System.out.println(max);
    }

    public static void cercaSommaTarget(int[] a, int target){
        for(int i=0; i<a.length; i++){
            for(int j=0; j<a.length; j++){
                if(a[i]+a[j]==target){
                    System.out.println(a[i] + " + " + a[j] + " = " + target);
                }
            }
        }
    }

    public static boolean isPrimo(int a){
        if(a<2) {
            return false;
        }

        for (int i = 2; i<a; i++){
            if(a%i == 0){
                return false;
            }
        }
        return true;
    }


    //scrivere un metodo che data una stringa in input (ad esempio "vi6olino ragn5o se1i 4bel prop2rio un3")
    public static void rearrange(String stringa){

        String[] a = stringa.split(" ");
        String[] ordered = new String[a.length+1];

        for (String s: a) {
            char[] c = s.toCharArray();

            for (char d: c) {
                if(Character.isDigit(d)){
                   // map.put(Character.getNumericValue(d), s);
                    ordered[Character.getNumericValue(d)] = s;
                }
            }
        }

        for(int i=1; i<ordered.length; i++){
            System.out.print(ordered[i] + " ");
        }

    }


}
