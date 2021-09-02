package controller;

import classes.globals;

/**
 *
 * @author Jorge Prieto
 */
public class showInventory {

    public void showInventory() {
        System.out.println("Existing inventory\n");
        System.out.println("StrawBerry     :: " + globals.myInventory.getStrawBerry());
        System.out.println("Banana         :: " + globals.myInventory.getBanana());
        System.out.println("Mango          :: " + globals.myInventory.getMango());
        System.out.println("Ice            :: " + globals.myInventory.getiIce());
        System.out.println("Condensed Milk :: " + globals.myInventory.getiCondensedMilk());
        System.out.println("Sugar          :: " + globals.myInventory.getiSugar());
        System.out.println("");
    }
}
