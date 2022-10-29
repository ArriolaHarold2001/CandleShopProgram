import java.util.Scanner;

import javax.swing.plaf.basic.BasicOptionPaneUI.ButtonActionListener;

import java.text.DecimalFormat;

// in interaction tab -- > run CandleShop

//The candle names are
//Luscious Lavender
//Fragrent Florals
//Spicy N' Dicey

class Candle {
    private String name;
    private double price;
    private int burnTime;
    private int amount;
    private double totalPrice;
    private int totalBurnTime;
    private double costPerBurnTime;

    public Candle(String name, double price, int burnTime, int amount) {
        this.name = name;
        this.price = price;
        this.burnTime = burnTime;
        this.amount = amount;
    }

    // Getters

    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }

    public int getBurnTime() {
        return this.burnTime;
    }

    public int getAmount() {
        return this.amount;
    }

    // Setters

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setBurnTime(int burnTime) {
        this.burnTime = burnTime;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    // Logic

    public double totalPrice() {
        this.totalPrice = (double) this.amount * this.price;
        return this.totalPrice;
    }

    public int totalBurnTime() {
        this.totalBurnTime = this.amount * this.burnTime;
        return this.totalBurnTime;
    }

    public double costPerBurnTime() {
        this.costPerBurnTime = this.totalPrice() / this.burnTime;
        return costPerBurnTime;
    }

}

public class CandleShop {
    public static void main(String[] args) throws InterruptedException {
        double grandTotal;
        int grandTotalBurnTime;
        double costPerBurnTime;

        // Candle Objects
        Candle candleOne = new Candle("Luscious Lavender", 2.50, 5, 0);
        Candle candleTwo = new Candle("Fragrant Floral's", 3.75, 7, 0);
        Candle candleThree = new Candle("Spicy N' Dicey", 5.99, 12, 0);

        Candle[] candles = new Candle[] { candleOne, candleTwo, candleThree };

        Scanner keyboard = new Scanner(System.in);
        // other variables to help complete the algorithm to sell Candles
        System.out.println("Enter 0 to continue: ");

        for (int i = 0; i < candles.length; i++) {
            keyboard.nextInt();
            System.out.println(String.format(
                    "How many of the %s candles would you like? Enter a number amount.", candles[i].getName()));
            candles[i].setAmount(keyboard.nextInt());

            candles[i].totalPrice();

            grandTotal += candles[i].totalPrice();
            grandTotalBurnTime += candles[i].totalBurnTime();
            costPerBurnTime += candles[i].costPerBurnTime();
        }

        // I used two methods to format my double values
        // This is where I format using an import text method
        DecimalFormat formatter = new DecimalFormat("0.00");
        String formatted1 = formatter.format(updatedBurnTime1);
        String formatted2 = formatter.format(updatedBurnTime2);
        String formatted3 = formatter.format(updatedBurnTime3);
        String formattedTotal = formatter.format(updatedBurnTimeTotal);

        // Easter egg
        if (continuePrompt <= 1000) {

            // prints out each individual price totals
            // This line is used to make the results easier to read from the console
            // Break Line
            System.out.println("\n" + "Receipt");
            System.out.println("\n"
                    + "+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++" + "\n");

            System.out.printf(
                    candleOne.lusciousLavender() + "\n" + "Amount: " + candleOne.lusciousLavenderAmount() + "\n"
                            + "Burn Time: " + candleOne.lusciousLavenderBurnTime() + " hours" + "\n"
                            + "Dollar per Burn Time: " + formatted1 + "\n" + "Price: $" + "%.2f",
                    userCandleChoicePrice1);
            // Break Line
            System.out.println("\n"
                    + "+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++" + "\n");

            System.out.printf(
                    candleTwo.fragrantFlorals() + "\n" + "Amount: " + candleTwo.fragrantFloralsAmount() + "\n"
                            + "Burn Time: " + candleTwo.fragrantFloralsBurnTime() + " hours" + "\n"
                            + "Dollar per Burn Time: " + formatted2 + "\n" + "Price: $" + "%.2f",
                    userCandleChoicePrice2);
            // Break Line
            System.out.println("\n"
                    + "+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++" + "\n");

            System.out.printf(
                    candleThree.spicyNDicey() + "\n" + "Amount: " + candleThree.spicyNDiceyAmount() + "\n"
                            + "Burn Time: " + candleThree.spicyNDiceyBurnTime() + " hours" + "\n"
                            + "Dollar per Burn Time: " + formatted3 + "\n" + "Price: $" + "%.2f",
                    userCandleChoicePrice3);
            // Break Line
            System.out.println("\n"
                    + "+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++" + "\n");

            // prints out the total price of all the candles added together
            System.out.printf("Total Burn Time: " + totalBurnTime + "\n" + "Total Dollar per Burn Time: "
                    + formattedTotal + "\n" + "Total Price: " + "%.2f", userCandleTotalPrice);
            System.out.println("\n");
            // in interaction tab -- > run CandleShop
        } else if (continuePrompt > 1000) {
            System.out.println(
                    "Hey! your not supposed to be back here. Get out of here and put those candles back where you found them! This area is EMPLOYEE ONLY!!");
            Thread.sleep(3000);
            System.out.println("This is my last Warning!");
            Thread.sleep(4000);
            System.out.println("Ok! you made me do it. You are now banned from the Candle Shop!");
        }
    }
}