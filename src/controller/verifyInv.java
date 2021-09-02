package controller;

import classes.globals;

/**
 *
 * @author Jorge Prieto
 */
public class verifyInv {

    public boolean verifyInventory() {
        return globals.inventoryIsLoaded;
    }
}
