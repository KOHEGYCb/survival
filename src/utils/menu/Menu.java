package utils.menu;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Logger;

/**
 *
 * @author Dmitry
 */
public class Menu {

    private static final Menu INSTANCE = new Menu();

    private Menu() {
        loop();
    }

    public static Menu getINSTANCE() {
        return INSTANCE;
    }

    private void loop() {

        System.out.println(Constants.MAIN_MENU);
        int input;
        try {
            input = new Scanner(System.in).nextInt();

            switch (input) {
                case 0:
                    break;
                case 1:
                    break;
                case 2:
                    break;
                default:
                    break;
            }
        } catch (InputMismatchException ime) {
            System.out.println(Constants.IME);
        }
    }

}
