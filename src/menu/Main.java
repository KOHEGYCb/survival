package menu;

import beans.food.vegetables.Tomato;
import constants.MenuTitles;
import inventory.Inventory;
import java.util.Scanner;

/**
 *
 * @author Dmitry
 */
public class Main {

    Inventory a = new Inventory(1000, 1000);
    boolean runing;

    public Main() {
        runing = true;
        mainMenu();
    }

    private void mainMenu() {
        while (this.runing) {
            printMainMenu();
            int k;
            k = new Scanner(System.in).nextInt();
            if (k == 0) {
                this.runing = false;
                break;
            }
            
            switch (k) {
                case 1:
                    
                    break;
                case 2:
                    a.addObject(new Tomato());
                    break;
                case 3:
                    System.out.println(a.getInventoryStatus());
                    break;
            }
        }
    }

    private void printMainMenu() {
        System.out.println(""
                + "1) Create Inventory"
                + "\n2) Add Tomato"
                + "\n3) Print Inventory"
                + "\n0) " + MenuTitles.EXIT);
    }

}
