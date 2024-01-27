import java.util.Scanner;
public class Main {
    public static void main(String [] args) {
        String inputToCloseLoop;
        int inputToSelectForm;

        Scanner kb = new Scanner(System.in);    // make scanner

        do {//make loop that terminates with input "q"

            System.out.println("""
                    Liquidity ratios:
                    When you see this text input the number that
                    aligns with the formula needed.
                    
                    Quick ratio: 1
                    Cash ratio: 2
                    Current Ratio: 3
                    Cash flow from operations ratio: 4
                    Receivable turnover: 5
                    Average number of days receivables outstanding (Average collection period): 6
                    Inventory turnover: 7
                    Average number of days in stock: 8
                    Payable turnover: 9
                    Average number of days parables outstanding (Average age oof parables): 10
                    Cash conversion Cycle: 11
                    """); // Instructions for liquidity ratios
            inputToSelectForm = kb.nextInt(); // get input to select formula

            switch (inputToSelectForm) {
                case 1 -> { //Quick ratio
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

                    quickRatio = ((currentAssets - inventory) / currentLiabilities) * 100.0;

                    System.out.printf("%.2f",quickRatio);
                    System.out.println("%");
                }
                case 2 -> { // Cash ratio
                    double cash;
                    double marketSec;
                    double currentLiability;
                    double cashRatio;

                    System.out.print("Enter Cash: ");
                    cash = kb.nextDouble();
                    System.out.println(" ");
                    System.out.print("Enter Marketable securities: ");
                    marketSec =kb.nextDouble();
                    System.out.println(" ");
                    System.out.print("Enter current liability: ");
                    currentLiability = kb.nextDouble();

                    cashRatio = (cash + marketSec) /currentLiability;
                    System.out.printf("%.4f", cashRatio);
                    System.out.println(" ");
                }
                case 3 -> { // Current Ratio
                    double currentAsset;
                    double currentLiability;
                    double currentRatio;

                    System.out.print("Enter current assets: ");
                    currentAsset = kb.nextDouble();
                    System.out.println(" ");
                    System.out.print("Enter current liabilities");
                    currentLiability = kb.nextDouble();

                    currentRatio = currentAsset / currentLiability;

                    System.out.printf("%.4f", currentRatio);
                    System.out.println(" ");
                }
                case 4 ->
                    System.out.println("test4");
                case 5 ->
                        System.out.println("test5");
                case 6 ->
                        System.out.println("test6");
                case 7 ->
                        System.out.println("test7");
                case 8 ->
                        System.out.println("test8");
                case 9 ->
                        System.out.println("test9");
                case 10 ->
                        System.out.println("test10");
                case 11 ->
                        System.out.println("test11");
            }

            System.out.println("press q to end program");
            System.out.println("press any other key to use another formula");
            inputToCloseLoop = kb.next();
        } while (!inputToCloseLoop.equals("q"));
    }
}
