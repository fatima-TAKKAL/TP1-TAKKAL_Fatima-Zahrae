import java.util.Scanner;

public class Calculatrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Calculatrice Simple ===");

        System.out.print("Entrer le premier nombre: ");
        double a = sc.nextDouble();

        System.out.print("Entrer le deuxième nombre: ");
        double b = sc.nextDouble();

        System.out.println("Choisir l'opération (+  -  *  /): ");
        char op = sc.next().charAt(0);

        double result = 0;

        switch(op) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                if(b != 0)
                    result = a / b;
                else {
                    System.out.println("Division par zéro impossible");
                    return;
                }
                break;
            default:
                System.out.println("Opération invalide");
                return;
        }

        System.out.println("Résultat = " + result);
    }
}