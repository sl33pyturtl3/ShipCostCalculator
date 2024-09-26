import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in); //allows for user input into sout tabs
        double itemPrice = 0;
        double shipCost = 0;
        double totalCost = 0;
        final double FREE_SHIP = 100;
        final double SHIP_RATE = .02;
        String trash = "";


        System.out.print("Enter the item price: "); // remove ln "line" element
        if(in.hasNextDouble())
        {
            itemPrice = in.nextDouble();
            in.nextLine(); //clears buffer MUST DO WHEN READING NUMBER

            if(itemPrice >= FREE_SHIP)
            {
                shipCost = 0;
                totalCost = itemPrice;

            }
            else // for ship cost
            {
                shipCost = SHIP_RATE * itemPrice;
                totalCost = itemPrice + shipCost;
            }
            //display results
            System.out.println("Shipping costs are " + shipCost);
            System.out.println("Total costs are: " + totalCost);

        }
        else
        {
            trash = in.nextLine();
            System.out.println(trash + " is not a valid number");
            System.out.println("Please run again with proper input!");
        }






    }
}