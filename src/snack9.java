
import java.util.Scanner;

public class snack9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int somma = 0;           
        System.out.println("Quanti numeri vuoi inserire?");
        int numeriDaInserire = scanner.nextInt();                       //aggiunte: l'utente decide quante cifre mettere e quali inserire all'interno del programma

        for (int i = 0; i < numeriDaInserire; i++) {
            System.out.println("Inserisci il " + (i+1) + " numero:");
            int numero = scanner.nextInt();
            somma += numero;   
        }
        double media = somma / numeriDaInserire;

        System.out.println("La somma dei numeri inseriti è: " + somma);
        System.out.println("La media dei numeri inseriti è: " + media);
    }
}
