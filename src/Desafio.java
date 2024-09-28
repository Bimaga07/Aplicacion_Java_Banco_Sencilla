import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        String nombre = "Brigitte Bolaños";
        String tipoDeCuenta = "Ahorros";
        double saldoDeCuenta = 5000.89;

        System.out.println("\nNombre del usuario" + nombre);
        System.out.println("tipo de cuenta " + tipoDeCuenta);
        System.out.println("Saldo de la cuenta" + saldoDeCuenta + "$");


        Scanner scanner = new Scanner(System.in);
        boolean salir = false;
        int opcion;
        while(!salir){
            System.out.println("1. Consultar saldo");
            System.out.println("2. retirar");
            System.out.println("3. depositar");
            System.out.println("4. Salir");
            System.out.println("Escribe una de las opciones");
            opcion = scanner.nextInt();

            switch (opcion){
                case 1:
                    System.out.println(saldoDeCuenta);
                    break;
                case 2:
                    System.out.println("¿cuanto desea retirar?");
                    int montoAretirar = scanner.nextInt();
                    if (montoAretirar > saldoDeCuenta){
                        System.out.println("Fondos insuficientes");
                    }else{
                        saldoDeCuenta -= montoAretirar;
                        System.out.println("Retiro existoso. Su nuevo saldo es" + saldoDeCuenta);

                    }
                    break;
                case 3:
                    System.out.println("¿Cuanto deseas depositar?");
                    int newDeposito = scanner.nextInt();
                    if (newDeposito < 0){
                        System.out.println("el deposito tiene que ser mayor");
                    }else{
                        saldoDeCuenta += newDeposito;
                        System.out.println("Deposito exitoso. Su nuevo saldo es" + saldoDeCuenta);
                    }
                    break;
                case 4:
                    salir = true;

                default:
                    System.out.println("Gracias por usar nuestro servicios");
                    break;
            }
        }
    }
}
