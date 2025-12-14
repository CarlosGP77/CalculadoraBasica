import java.util.Scanner;

public class calculator {
    public static void main(String[] args){
        double numero1, numero2, resultado = 0;
        int operacion;
        String op = "s";
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el primer número: ");
        numero1 = scanner.nextDouble();

        System.out.print("Introduce el segundo número: ");
        numero2 = scanner.nextDouble();

        do {
            System.out.print("Introduce la operación (+ = 1, - = 2, * = 3, / = 4, mcm = 5, mcd = 6): ");
            //Es una buena opcion poner para elegir operacion con numeros enteros
            operacion = scanner.nextInt();

            switch (operacion) {//muy util un switch para elegir opciones
                case 1:
                    resultado = numero1 + numero2;
                    op = "+";
                    break;
                case 2:
                    resultado = numero1 - numero2;
                    op = "-";
                    break;
                case 3:
                    resultado = numero1 * numero2;
                    op = "*";
                    break;
                case 4:
                    resultado = numero1 / numero2;
                    op = "/";
                    break;
                case 5: // Mínimo común múltiplo
                    int mcm = mcm((int)numero1, (int)numero2);
                    System.out.println("Mínimo común múltiplo de " + (int)numero1 + " y " + (int)numero2 + " = " + mcm);
                    operacion = 5; // salir del bucle
                    break;
                case 6: // Máximo común divisor
                    int mcd = mcd((int)numero1, (int)numero2);
                    System.out.println("Máximo común divisor de " + (int)numero1 + " y " + (int)numero2 + " = " + mcd);
                    operacion = 6; // salir del bucle
                    break;
                default://importante añadir un default al switch case
                    System.out.println("Operación no válida. Vuelva a intentarlo.");
                    operacion = 0;
                    break;
            }
        } while (operacion == 0); //Es importante hacer un bucle para que puedas elegir varias veces

        // Solo mostrar resultado si es una operación aritmética
        if (operacion >= 1 && operacion <= 4) { //Un if util ya que es para 4 opciones aritmeticas
            System.out.println(numero1 + " " + op + " " + numero2 + " = " + resultado);
        }

        scanner.close();
    }

    // Métodos auxiliares
    public static int mcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static int mcm(int a, int b) {
        return (a * b) / mcd(a, b);
    }
}