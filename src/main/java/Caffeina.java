public class Caffeina {

    public static void main(String[] args) {
        caffeina(3);      // Java
        caffeina(12);     // CoffeeScript
        caffeina(4);      // match_missed!
        caffeina(24);     // CoffeeScript
        caffeina(7);      // match_missed!
        caffeina(6);      // JavaScript
    }

    public static void caffeina(int n) {
        if (n % 3 == 0 && n % 4 == 0) {
            if (n % 2 == 0) {
                System.out.println("CoffeeScript");
            } else {
                System.out.println("Coffee");
            }
        }
        else if (n % 3 == 0) {
            if (n % 2 == 0) {
                System.out.println("JavaScript");
            } else {
                System.out.println("Java");
            }
        }
        else {
            System.out.println("match_missed!");
        }
    }
}