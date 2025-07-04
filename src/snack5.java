
import java.util.Scanner;

public class snack5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quanti numeri vuoi inserire"); 
        int num = scanner.nextInt();

        for (int i = 0; i < num; i++) {
            System.out.println("Inserisci un numero");
            int numeriInseriti = scanner.nextInt();
            if (numeriInseriti % 2 != 0){ 
                System.out.println("Il tuo numero è dispari");
            } else {System.out.println("Il tuo numero è pari");};
        }
    }
}
