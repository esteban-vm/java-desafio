import java.util.Scanner;

public class Challenge {
    public static void main(String[] args) {
        String customer = "Tony Stark";
        String accountType = "Corriente";

        double balance = 1599.99;
        int option = 0;

        System.out.println("********************************\n");
        System.out.println("Nombre del cliente: " + customer);
        System.out.println("Tipo de cuenta: " + accountType);
        System.out.println("Saldo disponible: " + balance + "$");
        System.out.println("\n********************************");

        Scanner scanner = new Scanner(System.in);

        String menu = """
                
                Escriba el número de la opción deseada:
                1. Consular saldo.
                2. Retirar.
                3. Depositar.
                9. Salir.
                """;


        while (option != 9) {
            System.out.println(menu);
            option = scanner.nextInt();
        }
    }
}
