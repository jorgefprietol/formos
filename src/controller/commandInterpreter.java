package controller;

import classes.globals;
import static java.lang.System.exit;

/**
 *
 * @author Jorge Prieto
 */
public class commandInterpreter {

    globals myglobals = new globals();
    loadInventory myLoadInventory = new loadInventory();
    verifyInv myVerifyInv = new verifyInv();
    showInventory myShowInventory = new showInventory();
    sellDrink mySellDrink = new sellDrink();
    reportSales myReportSales = new reportSales();

    public void listener() {
        try {
            globals.myInventory.setUpdate(0);
            globals.myInventory.setiCondensedMilk(-1);
            globals.myInventory.setiFruitSmoothie(-1);
            globals.myInventory.setiIce(-1);
            globals.myInventory.setiSugar(-1);
            globals.myInventory.setBanana(-1);
            globals.myInventory.setMango(-1);
            globals.myInventory.setStrawBerry(-1);
            // FOR TEST
//            globals.myInventory.setiCondensedMilk(800);
//            globals.myInventory.setiFruitSmoothie(800);
//            globals.myInventory.setiIce(800);
//            globals.myInventory.setiSugar(800);
//            globals.myInventory.setBanana(800);
//            globals.myInventory.setMango(800);
//            globals.myInventory.setStrawBerry(800);
            System.out.println("Welcome to Smoothies Jose\n");
            welcomeMessage();

            while (!globals.sExitMain) {
                try {
                    globals.opcion = globals.input.nextLine();
                    switch (globals.opcion) {
                        case "loadInvetory": {
                            globals.sExitLoadInventory = false;
                            globals.isInventory = true;
                            myLoadInventory.loadInventory();
                            welcomeMessage();
                        }
                        break;
                        case "showInventory": {
                            myShowInventory.showInventory();
                        }
                        break;
                        case "sellDrink": {
                            mySellDrink.sellDrink();
                            globals.succesSell = false;

                        }
                        break;
                        case "salesReport": {
                            myReportSales.getSalesReport();
                        }
                        break;
                        case "help": {
                            welcomeMessage();
                        }
                        break;
                        case "exit": {
                            exit(0);
                        }
                        break;
                        default: {
                            System.out.println("\nERROR: The type option is not valid.");
                        }
                    }
                } catch (java.util.InputMismatchException e) {
                    System.out.println("\nERROR: no se ingreso un entero");
                }
            }
        } catch (Exception e) {
            System.err.println("Error:" + e.getMessage());
            e.printStackTrace();
        }
    }

    private void welcomeMessage() {
        System.out.println("Usage: ");
        System.out.println("To load inventory type          [loadInvetory]");
        System.out.println("To show current inventory type  [showInventory]");
        System.out.println("To sell a drink write           [sellDrink]");
        System.out.println("To Sales Report                 [salesReport]");
        System.out.println("");
    }
}
