
import java.util.Scanner;

public class CreatingBranches {
    public static void main(String[] args) {


        System.out.println("Are you joining us? Yes/No answers only.");
        Scanner scanner = new Scanner(System.in);
        String welcome = "Hello World!";
        String goodbye = "Bye, World!";
        String userInput = scanner.nextLine();

        if (userInput.equals("Yes")) {
            System.out.println(welcome);
        } else if (userInput.equals("No")) {
            System.out.println(goodbye);
        }
        scanner.close();
    } }
