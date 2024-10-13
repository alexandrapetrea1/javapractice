import java.util.Arrays;

public class Aufgabe4 {

    public int findCheapestKeyboard(int[] keyboards){
        int minPrice = keyboards[0];
        for(int price : keyboards)
            if(price < minPrice)
                minPrice = price;
        return minPrice;
    }

    public int findMostExpensiveItem(int[] keyboards, int[] usbDrives){
        int maxItem = keyboards[0];
        for (int price : keyboards) {
            if (price > maxItem) {
                maxItem = price;
            }
        }
        for (int price : usbDrives) {
            if (price > maxItem) {
                maxItem = price;
            }
        }

        return maxItem;
    }

    public int findMostExpensiveAffordableUSB(int[] usbDrives, int budget){
        int maxAffordableUSB = -1;
        for(int price : usbDrives)
            if(price <= budget &&  price > maxAffordableUSB)
                maxAffordableUSB = price;
        return maxAffordableUSB;
    }

    public int findMaxSpend(int[] keyboards, int[] usbDrives, int budget){
        int maxSpend = -1;
        for(int keyboardPrice : keyboards){
            for(int usbPrice : usbDrives){
                int totalCost = keyboardPrice + usbPrice;
                if(totalCost <= budget &&  totalCost > maxSpend)
                    maxSpend = totalCost;
            }
        }
        return maxSpend;
    }


}
