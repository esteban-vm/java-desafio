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
                
                ** Escriba el número de la opción deseada: **
                1. Consular saldo.
                2. Retirar.
                3. Depositar.
                9. Salir.
                """;


        while (option != 9) {
            System.out.println(menu);
            option = scanner.nextInt();

            switch (option) {
                case 1: {
                    System.out.println("El saldo actualizado es: " + balance + "$");
                    break;
                }

                case 2: {
                    System.out.println("¿Qué monto desea retirar?");
                    double withdrawal = scanner.nextDouble();

                    if (withdrawal > balance) {
                        System.out.println("Saldo insuficiente");
                    } else {
                        balance -= withdrawal;
                        System.out.println("El saldo actualizado es: " + balance + "$");
                    }

                    break;
                }

                case 3: {
                    System.out.println("¿Qué monto desea depositar?");
                    double deposit = scanner.nextDouble();
                    balance += deposit;
                    System.out.println("El saldo actualizado es: " + balance + "$");
                    break;
                }

                case 9: {
                    System.out.println("Gracias por utilizar nuestros servicios");
                    System.out.println("Saliendo del programa…");
                    scanner.close();
                    break;
                }

                default: {
                    System.out.println("Opción no válida");
                }
            }
        }
    }
}
