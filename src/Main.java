import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // player start

        Scanner scanner = new Scanner(System.in);

        System.out.println("Quanti elementi multimediali vuoi caricare? Inserisci un numero (Default = 5)");

        String input = scanner.nextLine();
        int arrayLength;
        if (input.isBlank()) {
            arrayLength = 5;
        } else {
            arrayLength = Integer.parseInt(input);
        }

        System.out.println("Hai deciso di caricare " + arrayLength + " elementi.");

    }
}
