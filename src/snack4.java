import java.util.Scanner;

public class snack4 {
    public static void main(String[] args) {
        String[] invitati = {"Alfredo", "Simone Meoni", "Simone Maria", "Umberto", "Ash Ketchum", "Aldo", "Giovanni", "Giacomo"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci il tuo nome per accedere al party");
        String userName = scanner.nextLine();

        boolean invitatoPresente = false;

        for (int i = 0; i < invitati.length; i++) {
            if(invitati[i].equals(userName)) {
                invitatoPresente = true;
                break;
            }
        }
        if (invitatoPresente) {
            System.out.println("Accesso consentito, Benvenuto!");
        } else {System.out.println("Accesso negato, il tuo nome non è presenta nella lista");}
    }
}
