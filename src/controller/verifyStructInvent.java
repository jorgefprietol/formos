package controller;

import classes.inventory;

/**
 *
 * @author Jorge Prieto
 */
public class verifyStructInvent {

    public boolean verifyStructInventory(inventory myInventory) {
        return !(myInventory.getiCondensedMilk() < 0
                || myInventory.getBanana() < 0
                || myInventory.getStrawBerry() < 0
                || myInventory.getMango() < 0
                || myInventory.getiIce() < 0
                || myInventory.getiSugar() < 0);
    }
}
