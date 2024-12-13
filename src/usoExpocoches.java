import java.util.Scanner;

public class usoExpocoches{

    public static void main(String[] args) {
        // Crear las tres zonas con su número de entradas
        Expocoches salaPrincipal = new Expocoches(1000);
        Expocoches compraVenta = new Expocoches(200);
        Expocoches vip = new Expocoches(25);

        Scanner scanner = new Scanner(System.in);
        int opcion;

        do { 
            // Mostrar menú
            System.out.println("Gestión de Entradas");
            System.out.println("1. Mostrar entradas disponibles");
            System.out.println("2. Vender entradas");
            System.out.println("3. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    // Mostrar entradas disponibles
                    System.out.println("Entradas disponibles:");
                    System.out.println("Sala principal: " + salaPrincipal.getEntradasPorVender());
                    System.out.println("Compra-venta: " + compraVenta.getEntradasPorVender());
                    System.out.println("VIP: " + vip.getEntradasPorVender());
                    break;

                case 2:
                    // Vender entradas
                    System.out.println("Elige una zona:");
                    System.out.println("1. Sala principal");
                    System.out.println("2. Compra-venta");
                    System.out.println("3. VIP");
                    System.out.print("Zona: ");
                    int zona = scanner.nextInt();

                    System.out.print("Número de entradas a vender: ");
                    int entradas = scanner.nextInt();

                    switch (zona) {
                        case 1:
                            salaPrincipal.vender(entradas);
                            break;
                        case 2:
                            compraVenta.vender(entradas);
                            break;
                        case 3:
                            vip.vender(entradas);
                            break;
                        default:
                            System.out.println("Zona no válida.");
                    }
                    break;

                case 3:
                    // Salir
                    System.out.println("Gracias por usar el sistema de gestión de entradas.");
                    break;

                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        } while (opcion != 3);

        scanner.close();
    }
}

