
import java.util.Scanner;

public class snack3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        int somma = 0;

         for (int i = 1; i <= 10; i++) {
             System.out.println("Inserisci il " + i + " numero");
           int  numero = scanner.nextInt();
             somma += numero;
         }
         System.out.println("La sommma dei numeri inseriti è: " + somma);
    }
}
