package main;

import controller.commandInterpreter;

/**
 *
 * @author Jorge Prieto
 */

public class recipesDrinks {

    public static void main(String[] args) {
        commandInterpreter cxCom = new commandInterpreter();
        while (true) {
            try {
                cxCom.listener();
            } catch (Exception ex) {

            }
        }
    }

}
