
import java.util.Scanner;

public class snack1 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci il primo numero");
        int num1 = scanner.nextInt();

        System.out.println( "Inserisci il secondo numero");
        int num2 = scanner.nextInt();

        if(num1 > num2){
            System.out.println("Il numero più grande è " + num1);
        } else if(num1 < num2){
            System.out.println("Il numero più grande è " + num2);
        } else {
            System.out.println("I due numeri sono uguali");
        }
    }
}
