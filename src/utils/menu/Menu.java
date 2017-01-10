package utils.menu;

import inventory.AbstractInventory;
import inventory.Inventory;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Dmitry
 */
public class Menu {

    boolean runable = false;

    AbstractInventory inventory = new Inventory(500, 400);

    private static final Menu INSTANCE = new Menu();

    private Menu() {
        runable = true;
        loop();
    }

    public static Menu getINSTANCE() {
        return INSTANCE;
    }

    private void loop() {

        while (runable) {
            System.out.println(Constants.MAIN_MENU);
            int input;
            try {
                input = new Scanner(System.in).nextInt();

                switch (input) {
                    case 0:
                        runable = false;
                        System.out.println("Auf Wiedersehen");
                        break;
                    case 1:
                        break;
                    case 2:
                        printLoop();
                        break;
                    default:
                        System.out.println(Constants.DEFAULT);
                        break;
                }

            } catch (InputMismatchException ime) {
                System.out.println(Constants.IME);
            }
        }

    }

    private void printLoop() {
        boolean a = true;
        while (a) {
            System.out.println(Constants.PRINT_MENU);
            int input;
            try {
                input = new Scanner(System.in).nextInt();
                switch (input) {
                    case 0:
                        a = false;
                        break;
                    case 1:
                        if (!inventory.getInventory().getObjects().isEmpty()) {
                            System.out.println(inventory.getInventoryObjects());
                        }else{
                            System.out.println("Inventory is empty");
                        }
                        break;
                    case 2:
                        System.out.println("Free Volume: " + inventory.getFreeVolume());
                        break;
                    case 3:
                        System.out.println("Free Weight: " + inventory.getFreeWeight());
                        break;
                    default:
                        System.out.println(Constants.DEFAULT);
                        break;
                }
            } catch (InputMismatchException ime) {
                System.out.println(Constants.IME);
            }
        }
    }

}
