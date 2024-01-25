import java.util.Scanner;
public class Main {
    public static void main(String [] args) {
        String inputToCloseLoop;
        int inputToSelectForm;
        inputToCloseLoop = " ";

        Scanner kb = new Scanner(System.in);    // make scanner

        while (!inputToCloseLoop.equals("q")) {//make loop that terminates with input "q"

            System.out.println("""
                    When you see this text input the number that
                    aligns with the formula needed.
                    
                    Quick ratio: 0
                    Cash ratio: 1
                    Net Working capital to total assets: 2
                    Interval measure:3
                    """);
            inputToSelectForm = kb.nextInt();

            switch (inputToSelectForm) {
                case 0 -> {
                    double currentAssets;
                    double currentLiabilities;
                    double inventory;
                    double quickRatio; //answer

                    System.out.print("Enter Current Asset total: ");
                    currentAssets = kb.nextDouble();
                    System.out.println(" ");
                    System.out.print("Enter Current Liability total: ");
                    currentLiabilities = kb.nextDouble();
                    System.out.println(" ");
                    System.out.print("Enter Current Inventory total: ");
                    inventory = kb.nextDouble();

                    quickRatio = (currentAssets - inventory) / currentLiabilities;

                    System.out.printf("%.2f",quickRatio);
                    System.out.println("%");
                }
                case 1 ->
                    System.out.println("test2");
                case 2 ->
                    System.out.println("test3");
                case 3 ->
                    System.out.println("test4");
            }

            inputToSelectForm = -1;

            System.out.println("press q to end program");
            System.out.println("press any other key to use another formula");
            inputToCloseLoop = kb.next();
        }
    }
}
