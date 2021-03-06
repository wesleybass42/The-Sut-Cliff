import java.util.Scanner;
import java.io.*;
//=============================================================================
public class FileAllShonkyCars {
//-----------------------------------------------------------------------------
    private static Scanner keyboard = new Scanner(System.in);
//-----------------------------------------------------------------------------
    public static void main(String[] args) {

        FileAllCarDealer marinoo;
        int sellIndex;
        char option;
        String buyMake;
        double price;
        double profit;
        String fileName;

        if (args.length > 0) {
            fileName = args[0];
            try {
                if ((marinoo = FileAllCarDealer.loadCarDealer(fileName))
== null) {
                    return;
                }
            } catch (IOException e) {
                System.out.println("ERROR loading " + e.getMessage());
                return;
            }
        } else {
            fileName = "MarinooCarFile";
            marinoo = new FileAllCarDealer("Marinoo Used Wrecks");
            marinoo.buyCar("Dodge RAM",1000.0);
            marinoo.buyCar("Suzuki Samurai",1200.0);
            marinoo.buyCar("Jeep Wrangle",4990.0);
        }

        do {
            System.out.println();
            marinoo.display();
            System.out.print("(B)uy, (S)ell, or e(X)it : ");
            option = Character.toUpperCase(keyboard.nextLine().charAt(0));
            switch (option) {
                case 'B':
                    System.out.print("Enter make and model : ");
                    buyMake = keyboard.nextLine();
                    System.out.print("Enter purchase price : ");
                    price = keyboard.nextDouble();
                    keyboard.nextLine();
                    marinoo.buyCar(buyMake,price);
                    break;
                case 'S':
                    System.out.print("Enter index of car   : ");
                    sellIndex = keyboard.nextInt();
                    System.out.print("Enter sale price     : ");
                    price = keyboard.nextDouble();
                    keyboard.nextLine();
                    profit = marinoo.sellCar(sellIndex,price);
                    System.out.printf("The profit is $%.2f\n",profit);
                    break;
                case 'X':
                    System.out.println("Goodbye");
                    break;
                default:
                    System.out.println("ERROR: Invalid option");
                    break;
            }
        } while (option != 'X');

        try {
            FileAllCarDealer.saveCarDealer(fileName,marinoo);
        } catch (IOException e) {
            System.out.println("ERROR saving " + e.getMessage());
            return;
        }
    }
//-----------------------------------------------------------------------------
}
//=============================================================================
