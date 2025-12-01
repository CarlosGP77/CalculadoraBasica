import java.util.Scanner;
public class calculator {
    public static void main(String[] args){
        double numero1, numero2, resultado = 0;
        int operacion;
        char op = 'o';
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el primer número: ");
        numero1 = scanner.nextDouble();

        System.out.print("Introduce el segundo número: ");
        numero2 = scanner.nextDouble();

        do {
            System.out.print("Introduce la operación (+ = 1  , - = 2, * = 3, / = 4): ");
            operacion = scanner.nextInt();

            switch (operacion) {
                case 1:
                    resultado = numero1 + numero2;
                    op ='+';
                    break;
                case 2:
                    resultado = numero1 - numero2;
                    op ='-';
                    break;
                case 3:
                    resultado = numero1 * numero2;
                    op = '*';
                    break;
                case 4:
                    resultado = numero1 / numero2;
                    op = '/';
                    break;
                default:
                    System.out.println("Operación no válida. Vuelva a intentarlo.");
                    operacion = 0;
                    break;
            }
        }while (operacion == 0);
        System.out.println(numero1 + " " + op + " " + numero2 + " = " + resultado);

        scanner.close();
    }
}