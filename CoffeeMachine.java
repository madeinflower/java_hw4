import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        System.out.println("Click: espresso, americano, cappucino, tea: ");
        Scanner scanner = new Scanner(System.in);
        String drink = scanner.next();
        scanner.close();

        switch (drink) {

            case "espresso":
                System.out.println();
                break;
            case "espresso + water":
                System.out.println("americano");
                break;
            case "espresso + frothed milk":
                System.out.println("cappucino");
                break;
            case "tea + water":
                System.out.println("tea");
                break;

            default:
                break;

        }
    }

}
