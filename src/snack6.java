
import java.util.Scanner;

public class snack6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci un numero");
        int n = scanner.nextInt();

        for (int i = 0; i <= n; i++) {
            System.out.println("Il cubo di "+ i + " è: " + (i * i * i));
        }
    }
}
