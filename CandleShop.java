import java.util.Scanner;
import java.text.DecimalFormat;
//The candle names are
//Luscious Lavender
//Fragrent Florals
//Spicy N' Dicey

//List out the Type attributes for candle one
class TypeCandleOne {
    public final String TYPE_CANDLE_NAME_1;
    private double typeCandlePrice1;
    private int typeCandleBurnTime1;
    private int typeCandleAmount1;

    public TypeCandleOne(String lusciousLavender, double lusciousLavenderPrice, int lusciousLavenderBurnTime,
            int lusciousLavenderAmount) {
        this.TYPE_CANDLE_NAME_1 = lusciousLavender;
        this.typeCandlePrice1 = lusciousLavenderPrice;
        this.typeCandleBurnTime1 = lusciousLavenderBurnTime;
        this.typeCandleAmount1 = lusciousLavenderAmount;
    }

    // getters for type one candle, I am making this to make getting and setting
    // easier for math part later
    public int lusciousLavenderAmount() {
        return this.typeCandleAmount1;
    }

    public double lusciousLavenderPrice() {
        return this.typeCandlePrice1;
    }

    public String lusciousLavender() {
        return this.TYPE_CANDLE_NAME_1;
    }

    public int lusciousLavenderBurnTime() {
        return this.typeCandleBurnTime1;
    }

    public void setLusciousLavenderAmount(int newLusciousLavenderAmount) {
        this.typeCandleAmount1 = newLusciousLavenderAmount;
    }

    public void setLusciousLavenderPrice(double newLusciousLevenderPrice) {
        this.typeCandlePrice1 = newLusciousLevenderPrice;
    }

    public void setLusciousLavenderBurnTime(int newLusciousLavenderBurnTime) {
        this.typeCandleBurnTime1 = newLusciousLavenderBurnTime;
    }
}

// List out the Type attributes for candle two
class TypeCandleTwo {
    public final String TYPE_CANDLE_NAME_2;
    private double typeCandlePrice2;
    private int typeCandleBurnTime2;
    private int typeCandleAmount2;

    public TypeCandleTwo(String fragrantFlorals, double fragrantFloralsPrice, int fragrantFloralsBurnTime,
            int fragrantFloralsAmount) {
        this.TYPE_CANDLE_NAME_2 = fragrantFlorals;
        this.typeCandlePrice2 = fragrantFloralsPrice;
        this.typeCandleBurnTime2 = fragrantFloralsBurnTime;
        this.typeCandleAmount2 = fragrantFloralsAmount;
    }

    public int fragrantFloralsAmount() {
        return this.typeCandleAmount2;
    }

    public double fragrantFloralsPrice() {
        return this.typeCandlePrice2;
    }

    public String fragrantFlorals() {
        return this.TYPE_CANDLE_NAME_2;
    }

    public int fragrantFloralsBurnTime() {
        return this.typeCandleBurnTime2;
    }

    public void setFragrantFloralsAmount(int newFragrantFloralsAmount) {
        this.typeCandleAmount2 = newFragrantFloralsAmount;
    }

    public void setFragrantFloralsPrice(double newFragrantFloralsPrice) {
        this.typeCandlePrice2 = newFragrantFloralsPrice;
    }

    public void setFragrantFloralsBurnTime(int newFragrantFloralsBurnTime) {
        this.typeCandleBurnTime2 = newFragrantFloralsBurnTime;
    }
}

// List out the Type attributes for candle three
class TypeCandleThree {
    public final String TYPE_CANDLE_NAME_3;
    private double typeCandlePrice3;
    private int typeCandleBurnTime3;
    private int typeCandleAmount3;

    public TypeCandleThree(String spicyNDicey, double spicyNDiceyPrice, int spicyNDiceyBurnTime,
            int spicyNDiceyAmount) {
        this.TYPE_CANDLE_NAME_3 = spicyNDicey;
        this.typeCandlePrice3 = spicyNDiceyPrice;
        this.typeCandleBurnTime3 = spicyNDiceyBurnTime;
        this.typeCandleAmount3 = spicyNDiceyAmount;
    }

    public int spicyNDiceyAmount() {
        return this.typeCandleAmount3;
    }

    public double spicyNDiceyPrice() {
        return this.typeCandlePrice3;
    }

    public String spicyNDicey() {
        return this.TYPE_CANDLE_NAME_3;
    }

    public int spicyNDiceyBurnTime() {
        return this.typeCandleBurnTime3;
    }

    public void setSpicyNDiceyAmount(int newSpicyNDiceyAmount) {
        this.typeCandleAmount3 = newSpicyNDiceyAmount;
    }

    public void setSpicyNDicey(double newSpicyNDiceyPrice) {
        this.typeCandlePrice3 = newSpicyNDiceyPrice;
    }

    public void setSpicyNDiceyBurnTime(int newSpicyNDiceyBurnTime) {
        this.typeCandleBurnTime3 = newSpicyNDiceyBurnTime;
    }
}

public class CandleShop {
    public static void main(String[] args) {
        // Candle Objects
        TypeCandleOne candleOne = new TypeCandleOne("Luscious Lavender", 2.50, 5, 0);
        TypeCandleTwo candleTwo = new TypeCandleTwo("Fragrant Floral's", 3.75, 7, 0);
        TypeCandleThree candleThree = new TypeCandleThree("Spicy N' Dicey", 5.99, 12, 0);

        Scanner keyboard = new Scanner(System.in);
        // other variables to help complete the algorithm to sell Candles
        System.out.println("Welcome to the Candle Shop! Enter 0 to enter the next prompt.");
        int continuePrompt = keyboard.nextInt();
        System.out.println(
                "How many of the " + candleOne.lusciousLavender() + " candles would you like? Enter a number amount.");
        int lusciousLavenderKey = keyboard.nextInt();
        System.out.println("How many of the Fragrant Floral's candles would you like? Enter a number amount.");
        int fragrantFloralsKey = keyboard.nextInt();
        System.out.println("How many of the Spice N' Dice candles would you like? Enter a number amount.");
        int spicyNDiceyKey = keyboard.nextInt();
        System.out.println("\n" + "Receipt");

        candleOne.setLusciousLavenderAmount((int) lusciousLavenderKey);
        candleTwo.setFragrantFloralsAmount((int) fragrantFloralsKey);
        candleThree.setSpicyNDiceyAmount((int) spicyNDiceyKey);

        // gets the price of each candle individually
        double userCandleChoicePrice1 = (double) candleOne.lusciousLavenderAmount() * candleOne.lusciousLavenderPrice();
        double userCandleChoicePrice2 = (double) candleTwo.fragrantFloralsAmount() * candleTwo.fragrantFloralsPrice();
        double userCandleChoicePrice3 = (double) candleThree.spicyNDiceyAmount() * candleThree.spicyNDiceyPrice();
        // adds up the total of each individual candle
        double userCandleTotalPrice = (double) userCandleChoicePrice1 + userCandleChoicePrice2 + userCandleChoicePrice3;
        // Determines the amount per burn time of each candle
        double updatedBurnTime1 = (double) userCandleChoicePrice1 / candleOne.lusciousLavenderBurnTime();
        double updatedBurnTime2 = (double) userCandleChoicePrice2 / candleTwo.fragrantFloralsBurnTime();
        double updatedBurnTime3 = (double) userCandleChoicePrice3 / candleThree.spicyNDiceyBurnTime();
        double updatedBurnTimeTotal = (double) updatedBurnTime1 + updatedBurnTime2 + updatedBurnTime3;

        // I used two methods to format my double values
        // This is where I format using an import text method
        DecimalFormat formatter = new DecimalFormat("0.00");
        String formatted1 = formatter.format(updatedBurnTime1);
        String formatted2 = formatter.format(updatedBurnTime2);
        String formatted3 = formatter.format(updatedBurnTime3);
        String formattedTotal = formatter.format(updatedBurnTimeTotal);

        // prints out each individual price totals
        // This line is used to make the results easier to read from the console
        // Break Line
        System.out.println(
                "\n" + "+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++" + "\n");

        System.out.printf(candleOne.lusciousLavender() + "\n" + "Amount: " + candleOne.lusciousLavenderAmount() + "\n"
                + "Dollar per Burn Time: " + formatted1 + "\n" + "Price: $" + "%.2f", userCandleChoicePrice1);
        // Break Line
        System.out.println(
                "\n" + "+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++" + "\n");

        System.out.printf(candleTwo.fragrantFlorals() + "\n" + "Amount: " + candleTwo.fragrantFloralsAmount() + "\n"
                + "Dollar per Burn Time: " + formatted2 + "\n" + "Price: $" + "%.2f", userCandleChoicePrice2);
        // Break Line
        System.out.println(
                "\n" + "+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++" + "\n");

        System.out.printf(candleThree.spicyNDicey() + "\n" + "Amount: " + candleThree.spicyNDiceyAmount() + "\n"
                + "Dollar per Burn Time: " + formatted3 + "\n" + "Price: $" + "%.2f", userCandleChoicePrice3);
        // Break Line
        System.out.println(
                "\n" + "+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++" + "\n");

        // prints out the total price of all the candles added together
        System.out.printf("Total Dollar per Burn Time: " + formattedTotal + "\n" + "Total Price: " + "%.2f",
                userCandleTotalPrice);
        System.out.println("\n");

    }
}