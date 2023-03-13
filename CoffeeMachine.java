import java.util.Scanner;

public class HomeWork01032023 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Pls choose a drink (0 - espresso, 1 - americano, 2 - capuccino, 3 - tea) : ");
        int choice = scanner.nextInt();
        scanner.close();

        switch (choice) {
            case 0:
                getEspresso();
                getFinalWords();
                break;
            case 1:
                System.out.println("==Making americano==");
                getEspresso();
                addSomeWater();
                getFinalWords();
                break;
            case 2:
                System.out.println("==Capuccino==");
                getEspresso();
                System.out.println("Adding some milk");
                getFinalWords();
                break;
            case 3:
                System.out.println("==Tea==");
                System.out.println("Choosing a package");
                addSomeWater();
                getFinalWords();
                break;
            default:
                System.out.println("Wrong number");
        }

    }

    public static void getEspresso() {
        System.out.println("Making espresso");}

    public static void addSomeWater() {
        System.out.println("Adding some water");}

    public static void getFinalWords() {
        System.out.println("Your drink is ready");}
}
