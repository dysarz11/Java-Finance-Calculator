import java.util.Scanner;
public class Main {
    public static void main(String [] args) {
        final double NUM_DAYS_IN_YEAR = 365;
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
                case 2 -> { //Cash ratio
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
                case 3 -> { //Current Ratio
                    double currentAsset;
                    double currentLiability;
                    double currentRatio; //answer

                    System.out.print("Enter current assets: ");
                    currentAsset = kb.nextDouble();
                    System.out.println(" ");
                    System.out.print("Enter current liability: ");
                    currentLiability = kb.nextDouble();
                    System.out.println(" ");

                    currentRatio = currentAsset / currentLiability;
                    System.out.printf("%.4f", currentRatio);
                    System.out.println(" ");
                }
                case 4 -> { //Cash flow from operations ratio
                    double cfOperations;
                    double currentLiability;
                    double cfoRatio; //answer

                    System.out.print("Enter Cash flow from operations: ");
                    cfOperations = kb.nextDouble();
                    System.out.println(" ");
                    System.out.println("Enter Current Liability: ");
                    currentLiability = kb.nextDouble();
                    System.out.println(" ");

                    cfoRatio = (cfOperations / currentLiability) * 100;
                    System.out.printf("%.2f", cfoRatio);
                    System.out.println("%");
                }
                case 5 -> { //Receivable Turnover
                    double netAnnualSales;
                    double averageReceivables;
                    double receivableTurnover;

                    System.out.print("Enter net annual sales: ");
                    netAnnualSales = kb.nextDouble();
                    System.out.println(" ");
                    System.out.print("Enter average receivables: ");
                    averageReceivables = kb.nextDouble();
                    System.out.println(" ");

                    receivableTurnover = netAnnualSales / averageReceivables;
                    System.out.printf("%.2f", receivableTurnover);
                    System.out.println("%");
                }
                case 6 -> { //Average Number of days receivables outstanding (Average Collection period)
                    double receivablesTurnover;
                    double avgNumDaysReceivableOutstanding;

                    System.out.print("Enter receivables turnover: ");
                    receivablesTurnover = kb.nextDouble();
                    System.out.println(" ");

                    avgNumDaysReceivableOutstanding = NUM_DAYS_IN_YEAR / receivablesTurnover;
                    System.out.printf("%.4f", avgNumDaysReceivableOutstanding);
                    System.out.println(" ");
                }
                case 7 -> { //Inventory Turnover
                    double cogs;
                    double averageInventory;
                    double inventoryTurnOver;

                    System.out.print("Enter cost of goods sold: ");
                    cogs = kb.nextDouble();
                    System.out.println(" ");
                    System.out.print("Enter the average inventory: ");
                    averageInventory = kb.nextDouble();
                    System.out.println(" ");

                    inventoryTurnOver = cogs / averageInventory;
                    System.out.printf("%.4f", inventoryTurnOver);
                    System.out.println(" ");
                }
                case 8 -> { //Average Number of days in stock
                    double inventoryTurnOver;
                    double averageNumberDaysInStock;

                    System.out.print("Enter inventory turn over: ");
                    inventoryTurnOver = kb.nextDouble();
                    System.out.println(" ");

                    averageNumberDaysInStock = NUM_DAYS_IN_YEAR / inventoryTurnOver;
                    System.out.printf("%.4f", averageNumberDaysInStock);
                    System.out.println(" ");
                }
                case 9 -> { //Payable Turnover
                    double annualPurchases;
                    double averagePayable;
                    double payableTurnover;

                    System.out.print("Enter annual purchases: ");
                    annualPurchases = kb.nextDouble();
                    System.out.println(" ");
                    System.out.print("Enter average pyables: ");
                    averagePayable = kb.nextDouble();
                    System.out.println(" ");

                    payableTurnover = annualPurchases / averagePayable;
                    System.out.printf("%.4f", payableTurnover);
                    System.out.println(" ");
                }
                case 10 -> { //Average Number of days payables outstanding (Average age of payables) =
                    double payableTurnover;
                    double avgAgePay; //average age of payables

                    System.out.print("Enter payable turnover: ");
                    payableTurnover = kb.nextDouble();
                    System.out.println(" ");

                    avgAgePay = NUM_DAYS_IN_YEAR / payableTurnover;
                    System.out.printf("%.4f", avgAgePay);
                    System.out.println(" ");
                }
                case 11 -> { //Cash Conversion Cycle
                    double avgCollectionPeriod;
                    double avgNumDayInStock; //average number of days in stock
                    double avgAgePay; // average age of payables
                    double cashConversionCycle;

                    System.out.print("Enter average collection period: ");
                    avgCollectionPeriod = kb.nextDouble();
                    System.out.println(" ");
                    System.out.print("Enter average number of days in stock: ");
                    avgNumDayInStock = kb.nextDouble();
                    System.out.println(" ");
                    System.out.print("Enter average age of payables");
                    avgAgePay = kb.nextDouble();
                    System.out.println(" ");

                    cashConversionCycle = avgCollectionPeriod + avgNumDayInStock - avgAgePay;
                    System.out.printf("%.4f", cashConversionCycle);
                    System.out.println(" ");
                }
            }

            System.out.println("press q to end program");
            System.out.println("press any other key to use another formula");
            inputToCloseLoop = kb.next();
        } while (!inputToCloseLoop.equals("q"));
    }
}
