
import java.util.Arrays;
import java.util.List;

public class Prova {
    public static void main(String[] a){
        System.out.println(fattoriale(5));
        System.out.println(fattoriale1(5));
        prova();
    }
    // n! = n*(n-1)*(n-2).....*1
    public static int fattoriale(int num){
        if(num <0) throw new IllegalArgumentException();

        if(num==0 || num ==1){
            return 1;
        }else{
            return num*fattoriale(num-1);
        }
    }

    public static int fattoriale1(int num){
        int fatt=1;
        for(int i=0; i<num; i++){
            fatt = fatt*(num-i);
        }
//        for(int i=num; i>0; i--){
//            fatt = fatt*i;
//        }
        return fatt;
    }

    public static boolean checkPalindroma(String a){

        int left=0;
        int right = a.length();
        while(left < right){
            if (a.charAt(left) != a.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    //prende una lista di int pos, devo trovare il secondo valore piu grande all'interno della lista

    // 5, 10, 8, 2, 15, 12
    public static void prova(){
        List<Integer> lista = Arrays.asList(5,10,8,2,15,12);
        int max1=0, max2=0;

        for (int n: lista) {
            if (n>max2){
                int temp = max1;
                max1 = max2;
                max2 = n;
            }else if(n>max1){
                max1=n;
            }
        }
        System.out.println(max1 + " - " + max2);
    }
}
