
import java.util.Scanner;

public class snack8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci un numero di 4 cifre");
        String num = scanner.nextLine();

        int somma = 0;

        for (int i = 0; i < num.length(); i++) {
            somma += Character.getNumericValue(num.charAt(i));
        }
        System.out.println("La somma dei tuoi numeri è: " + somma);
    }
}
