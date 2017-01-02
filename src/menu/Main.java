package menu;

import constants.MenuTitles;
import beans.food.vegetables.Tomato;
import java.util.Scanner;

/**
 *
 * @author Dmitry
 */
public class Main {
    
    boolean runing;

    public Main() {
        runing = true;
        mainMenu();
    }
    
    private void mainMenu(){
        while(this.runing){
            printMainMenu();
            int k;
            k = new Scanner(System.in).nextInt();
            if (k == 0){
                this.runing = false;
                break;
            }
            switch (k){
                case 1:

            }
        }
    }
    
    private void printMainMenu(){
        System.out.println(""
            + "1) " + MenuTitles.CREATE_USER
            + "\n0) " + MenuTitles.EXIT);
    }
    
}
