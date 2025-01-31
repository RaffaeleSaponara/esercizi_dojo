import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class BancaFraud {

    public static void main(String args[]) throws IOException {
        String fileName = "C:\\Users\\Raffaele\\Desktop\\file.txt";

        String[] lines = readFile(fileName);

        if (lines != null) {
            for (String line : lines) {
                System.out.println(line);
            }
        }else{
            System.out.println("Il file é vuoto!");
        }
        System.out.println("");
        totOperazioni(lines);
    }


    public static String[] readFile(String fileName) {
        ArrayList<String> linesList = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                linesList.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }

        return linesList.toArray(new String[0]);
    }

    public static void totOperazioni(String[] operazioni){
        int nn =0;
        double bb=0,ss=0;
        String[] components;
        ArrayList<String> discard = new ArrayList<>();

        for (String a: operazioni) {

            // chiamata funzione controllo correttezza riga

            components = a.split(" ");
           if(checkRiga(components)){
               if(components[3].equals("B")){
                   bb = bb + (Double.parseDouble(components[1])*Integer.parseInt(components[2]));
               }else if(components[3].equals("S")){
                   ss = ss + (Double.parseDouble(components[1])*Integer.parseInt(components[2]));
               }
           }else{
               discard.add(a);
           }
            nn++;
        }
        System.out.println("Op: " + nn + " Buy: " + bb + " Sell: " + ss);

        System.out.println("\nErr:");
        for (String discarded: discard) {
            System.out.println(discarded);
        }
    }

    public static boolean checkRiga(String[] riga) {
        if(riga.length != 4){ return false; }
        if(!riga[3].equals("B") & !riga[3].equals("S")){ return false; }
        try {
            double a = (Double.parseDouble(riga[1]));
            int b = (Integer.parseInt(riga[2]));
        }catch (NumberFormatException e){
            return false;
        }

        return true;
    }

}

