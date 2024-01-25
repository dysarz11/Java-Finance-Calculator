import java.util.Scanner;
public class Main {
    public static void main(String [] args) {
        String inputToCloseLoop;

        inputToCloseLoop = " ";

        Scanner kb = new Scanner(System.in);    // make scanner

        while (!inputToCloseLoop.equals("q")) {             //make loop that terminates with input "q"
            System.out.println("press q to end program");
            inputToCloseLoop = kb.nextLine();
        }
    }
}
