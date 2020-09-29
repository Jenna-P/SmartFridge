import java.text.*;
import java.util.Date;
import java.util.Scanner;

public class Main_Fridge {
    public static void main(String[] args) throws ParseException {
        DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");

        Items items1 = new Items();
        items1.name = "Chicken breast";
        items1.experation = formatter.parse("30/09/2020");

        Items items2 = new Items();
        items2.name = "Milk";
        items2.experation = formatter.parse("05/10/2020");

        Items items3 = new Items();
        items3.name = "Pate";
        items3.experation = formatter.parse("10/10/2020");

        Items items4 = new Items();
        items4.name = "Spinach";
        items4.experation = formatter.parse("08/10/2020");

        System.out.println("Show all Items in the fridge");
        System.out.println("****************************");
        System.out.println(items1.name);
        System.out.println(items2.name);
        System.out.println(items3.name);
        System.out.println(items4.name);


        Scanner input = new Scanner(System.in);
        System.out.println("Which item will you use to cook ? ");
        String cooking_item = input.next();

        switch(cooking_item){
            case "Chicken breast":
                System.out.println("recipe of chicken"); //suppose to show recipes
                System.out.println(" Expired date : " + formatter.format(items1.experation));
                break;
            case "Milk":
                System.out.println("recipe"); //suppose to show recipes
                System.out.println(" Expired date : " + formatter.format(items2.experation));
                break;
            case "Pate":
                System.out.println("recipe"); //suppose to show recipes
                System.out.println(" Expired date : " + formatter.format(items3.experation));
                break;
            case "Spinach":
                System.out.println("recipe"); //suppose to show recipes
                System.out.println(" Expired date : " + formatter.format(items4.experation));
                break;
            default:
                System.out.println("Items not found");

        }

    }
}
