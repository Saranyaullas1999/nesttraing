package shop;

import java.util.ArrayList;
import java.util.Scanner;

public class Coffeeshop {

    public static void main(String[] args) {
        int choice;
        ArrayList <String> itemName = new ArrayList<>();
        ArrayList<Integer> quantity = new ArrayList<>();
        ArrayList<Integer> price = new ArrayList<>();

        FoodItems foodItems = new FoodItems(6,5,10,10,8,5);
        FoodItems takeawayFoodItems = new FoodItems(12,17,13,14,16,12);

        while (true){
            System.out.println("Select an option");
            System.out.println("1. Coffee " +foodItems.getCoffee());
            System.out.println("2. Tea " +foodItems.getTea());
            System.out.println("3. GreenTea " +foodItems.getGreenTea());
            System.out.println("4. Cake " +foodItems.getCake());
            System.out.println("5. Puffs " +foodItems.getPuffs());
            System.out.println("6. Samosa " +foodItems.getSamosa());
            System.out.println("7. Bill");
            System.out.println("8. Exit");

            Scanner sc = new Scanner(System.in);
            choice = sc.nextInt();
            int qty;
            switch (choice)
            {
                case 1 :
                    System.out.println("Enter the Quantity");
                    qty = sc.nextInt();
                    itemName.add("Coffee");
                    quantity.add(qty);
                    price.add(qty*6);
                    break;
                case 2 :
                    System.out.println("Enter the Quantity");
                    qty = sc.nextInt();
                    itemName.add("Tea");
                    quantity.add(qty);
                    price.add(qty*5);
                    break;
                case 3 :
                    System.out.println("Enter the Quantity");
                    qty = sc.nextInt();
                    itemName.add("GreenTea");
                    quantity.add(qty);
                    price.add(qty*10);
                    break;
                case 4 :
                    System.out.println("Enter the Quantity");
                    qty = sc.nextInt();
                    itemName.add("Cake");
                    quantity.add(qty);
                    price.add(qty*10);
                    break;
                case 5 :
                    System.out.println("Enter the Quantity");
                    qty = sc.nextInt();
                    itemName.add("Puffs");
                    quantity.add(qty);
                    price.add(qty*8);
                    break;
                case 6 :
                    System.out.println("Enter the Quantity");
                    qty = sc.nextInt();
                    itemName.add("Samosa");
                    quantity.add(qty);
                    price.add(qty*5);
                    break;
                case 7 :
                    System.out.println("**********************************************");
                    int sum =0;
                    for(int i=0;i<=itemName.size()-1;i++)
                    {
                        System.out.println(itemName.get(i)+ " " +quantity.get(i)+ " " +price.get(i));
                        sum+=price.get(i);
                    }
                    System.out.println("Total bill is " +sum);
                    break;
                case 8 :
                    System.exit(0);


            }

        }
    }
}
