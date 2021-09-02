package controller;

import classes.globals;

/**
 *
 * @author Jorge Prieto
 */
public class warningStock {

    public void warningAdvert() {

        if (globals.myInventory.getMango() < globals.warningMango) {
            System.out.println("Mango inventory is running out");
        }
        if (globals.myInventory.getBanana() < globals.warningBanana) {
            System.out.println("Banana inventory is running out");
        }
        if (globals.myInventory.getStrawBerry() < globals.warningStraw) {
            System.out.println("Strawberry inventory is running out");
        }
        if (globals.myInventory.getiIce() < globals.warningBIce) {
            System.out.println("Ice inventory is running out");
        }
        if (globals.myInventory.getiCondensedMilk() < globals.warningCondensedMilk) {
            System.out.println("Condensed Milk inventory is running out");
        }
        if (globals.myInventory.getiSugar() < globals.warningSugar) {
            System.out.println("Sugar inventory is running out");
        }
    }
}
