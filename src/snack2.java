
import java.util.Scanner;

public class snack2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci la prima parola");
        String parola1 = scanner.nextLine();

        System.out.println("Inserisci la seconda parola");
        String parola2 = scanner.nextLine();

        if(parola1.length() > parola2.length()){
            System.out.println(parola2);
            System.out.println(parola1);
        } else if (parola1.length() < parola2.length()){
            System.out.println(parola1);
            System.out.println(parola2);
        } else {System.out.println(parola1 + "-" +parola2);}
    }
}
