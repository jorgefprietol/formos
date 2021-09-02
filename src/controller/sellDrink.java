package controller;

import classes.globals;
import java.util.Scanner;

/**
 *
 * @author Jorge Prieto
 */
public class sellDrink {

    public void sellDrink() {
        verifySell myVerifySell = new verifySell();
        warningStock myWarningStock = new warningStock();
        System.out.println("These are the drinks available");
        for (int i = 0; i < globals.drinks.length; i++) {
            System.out.println(globals.drinks[i]);
        }
        System.out.println("\nThese are the available sizes, SMALL(100ml), MEDIUM(300ml) and LARGE(500ml)");
        System.out.println("Type the name of the drink of your choice.");
        System.out.println("Example type : [Strawberry MEDIUM], type exit to finish.");
        while (!globals.succesSell) {
            try {
                String readLInve = globals.input.nextLine();
                if (!globals.succesSell) { // cambiar al final
                    String item[] = readLInve.split(" ");
                    switch (item[0]) {
                        case "Strawberry": {
                            try {
                                myVerifySell.setSell(item[0], item[1]);
                                myWarningStock.warningAdvert();
                            } catch (Exception e) {
                                System.out.println("ERROR: Format Error.");
                            }
                        }
                        break;
                        case "Banana": {
                            try {
                                myVerifySell.setSell(item[0], item[1]);
                                myWarningStock.warningAdvert();
                            } catch (Exception e) {
                                System.out.println("ERROR: Format Error.");
                            }
                        }
                        break;
                        case "Mango": {
                            try {
                                myVerifySell.setSell(item[0], item[1]);
                                myWarningStock.warningAdvert();
                            } catch (Exception e) {
                                System.out.println("ERROR: Format Error.");
                            }
                        }
                        break;
                        case "exit": {
                            globals.sExitLoadSell = true;
                        }
                        break;
                        default: {
                            System.out.println("ERROR: enter a valid Flavor.");
                        }
                    }
                } else {
                    globals.sExitLoadSell = true;
                }

            } catch (java.util.InputMismatchException e) {
                System.out.println("ERROR: You can only enter numbers.");
                globals.input = new Scanner(System.in);

            }
        }
    }
}
