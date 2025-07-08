
import java.util.Scanner;

public class snack10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci l'altezza della tua piramide");
        int altezza = scanner.nextInt();

    for (int i = 0; i < altezza ; i++) {
        for (int j = 0; j < altezza - i - 1; j++) {
            System.out.print(" ");
        }
        for (int k = 0; k < 2 * i + 1; k++) {
            System.out.print("*");
        }
        System.out.println();
    }
        
    
    }
}
