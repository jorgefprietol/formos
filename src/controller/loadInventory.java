package controller;

import classes.globals;
import java.util.Scanner;

/**
 *
 * @author Jorge Prieto
 */
public class loadInventory {

    public void loadInventory() {
        verifyStructInvent cxVrfyStu = new verifyStructInvent();

        System.out.println("Enter the name of the ingredient, followed by its value");
        System.out.println("The ingredients to register in the unit of grams or milliliters are \n"
                + "[Strawberry][Banana][Mango][Ice][CondensedMilk][Sugar].");
        System.out.println("Example type : [FruitSmoothie 100], type exit to finish.");
        while (!globals.sExitLoadInventory) {
            try {
                String readLInve = globals.input.nextLine();
                if (!cxVrfyStu.verifyStructInventory(globals.myInventory)) {
                    String item[] = readLInve.split(" ");
                    switch (item[0]) {
                        case "FruitSmoothie": {
                            try {
                                globals.myInventory.setiFruitSmoothie(Integer.parseInt(item[1]));
                                System.out.println("Type next item.");
                            } catch (Exception e) {
                                System.out.println("ERROR: Format Error.");
                            }
                        }
                        break;
                        case "Ice": {
                            try {
                                globals.myInventory.setiIce(Integer.parseInt(item[1]));
                                System.out.println("Type next item.");
                            } catch (Exception e) {
                                System.out.println("ERROR: Format Error.");
                            }
                        }
                        break;
                        case "CondensedMilk": {
                            try {
                                globals.myInventory.setiCondensedMilk(Integer.parseInt(item[1]));
                                System.out.println("Type next item.");
                            } catch (Exception e) {
                                System.out.println("ERROR: Format Error.");
                            }
                        }
                        break;
                        case "Sugar": {
                            try {
                                globals.myInventory.setiSugar(Integer.parseInt(item[1]));
                                System.out.println("Type next item.");
                            } catch (Exception e) {
                                System.out.println("ERROR: Format Error.");
                            }
                        }
                        break;
                        case "Strawberry": {
                            try {
                                globals.myInventory.setStrawBerry(Integer.parseInt(item[1]));
                                System.out.println("Type next item.");
                            } catch (Exception e) {
                                System.out.println("ERROR: Format Error.");
                            }
                        }
                        break;
                        case "Banana": {
                            try {
                                globals.myInventory.setBanana(Integer.parseInt(item[1]));
                                System.out.println("Type next item.");
                            } catch (Exception e) {
                                System.out.println("ERROR: Format Error.");
                            }
                        }
                        break;
                        case "Mango": {
                            try {
                                globals.myInventory.setMango(Integer.parseInt(item[1]));
                                System.out.println("Type next item.");
                            } catch (Exception e) {
                                System.out.println("ERROR: Format Error.");
                            }
                        }
                        break;
                        case "exit": {
                            globals.sExitLoadInventory = true;
                        }
                        break;
                        default: {
                            System.out.println("ERROR: enter a valid option.");
                        }
                    }
                } else {
                    System.out.println("Inventory loaded correctly.\n");
                    globals.sExitLoadInventory = true;
                }

            } catch (java.util.InputMismatchException e) {
                System.out.println("ERROR: You can only enter numbers.");
                globals.input = new Scanner(System.in);

            }
        }
    }

}
