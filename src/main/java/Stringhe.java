import java.util.*;

public class Stringhe {
    public static void main (String[] args) {
        System.out.println("Eserzizio 1");
        //Esercizio 1
        System.out.println(stampaVocali("pollo"));

        System.out.println("Eserzizio 2");
        //Esercizio 2
        String[] stringhe = {"pollo", "Pollo", "pippo", "Pippo", "Asdrubale", "alberto"};
        System.out.println(stampaMaiuscole(stringhe));

        System.out.println("Eserzizio 3");
        //Esercizio 3
        Stringhe a = new Stringhe();
        System.out.println(a.contaLettera('c', "abracadabrac"));

        System.out.println("Eserzizio 4");
        //Esercizio 4
        System.out.println(reverseString("asdrubale"));

        System.out.println("Eserzizio 5");
        //Esercizio 5
        //Scanner scanner = new Scanner(System.in);
        //String p1 = scanner.nextLine();
        //String p2 = scanner.nextLine();
        //String p3 = scanner.nextLine();
        //System.out.println(concatString(p1, p2, p3));
        System.out.println(concatString("pippo", "pollo", "zuber"));

        System.out.println("Eserzizio 6");
        //Esercizio 6

    }

    public static String stampaVocali(String a){
        StringBuilder vocali = new StringBuilder();
        for(int i=0; i<a.length(); i++){
            switch (a.charAt(i)){
                case 'a':
                    vocali.append(a.charAt(i));
                    break;
                case 'e':
                    vocali.append(a.charAt(i));
                    break;
                case 'i':
                    vocali.append(a.charAt(i));
                    break;
                case 'o':
                    vocali.append(a.charAt(i));
                    break;
                case 'u':
                    vocali.append(a.charAt(i));
            }
        }
        return vocali.toString();
    }

    public static String stampaMaiuscole(String[] a){
        List<String> result = new ArrayList<>();
        for (String parola: a) {
            if(Character.isUpperCase(parola.charAt(0))){
                result.add(parola);
            }
        }
        return result.toString();
    }

    public int contaLettera(char c, String str){
        int conta = 0;
        for (int i=0; i<str.length();i++){
            if(str.charAt(i) == c){
                conta++;
            }
        }
        return conta;
    }

    public static String reverseString(String a){
        StringBuilder result = new StringBuilder();
        for (int i=a.length()-1; i>=0; i--){
            result.append(a.charAt(i));
        }
        return result.toString();
    }

    public static String concatString(String p1, String p2, String p3){
        return p1 + "*" + p2 + "+" + p3;
    }

}

