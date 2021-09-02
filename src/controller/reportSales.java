package controller;

import classes.globals;

/**
 *
 * @author Jorge Prieto
 */
public class reportSales {
    
    public void getSalesReport(){
        System.out.println("Report of Sales\n");
        if(globals.salesSmallStraw >0 ){
            System.out.println("Strawberry Small  :: " + globals.salesSmallStraw * globals.costSmall);
        }
        if(globals.salesSmallMango >0 ){
            System.out.println("Mango Small       :: " + globals.salesSmallMango * globals.costSmall);
        }
        if(globals.salesSmallBanana >0 ){
            System.out.println("Banana Small      :: " + globals.salesSmallBanana * globals.costSmall);
        }
        if(globals.salesMediumStraw >0 ){
            System.out.println("Strawberry Medium :: " + globals.salesMediumStraw * globals.costMedium);
        }
        if(globals.salesMediumMango >0 ){
            System.out.println("Mango Medium      :: " + globals.salesMediumMango * globals.costMedium);
        }
        if(globals.salesMediumBanana >0 ){
            System.out.println("Banana Medium     :: " + globals.salesMediumBanana * globals.costMedium);
        }
        if(globals.salesLargeStraw >0 ){
            System.out.println("Strawberry Large  :: " + globals.salesLargeStraw * globals.costLarge);
        }
        if(globals.salesLargeMango >0 ){
            System.out.println("Mango Large       :: " + globals.salesLargeMango * globals.costLarge);
        }
        if(globals.salesLargeBanana >0 ){
            System.out.println("Banana Large      :: " + globals.salesLargeBanana * globals.costLarge);
        }
        if(globals.salesSmallStraw <= 0 
                && globals.salesSmallMango <= 0 
                && globals.salesSmallBanana <= 0 
                && globals.salesMediumStraw <= 0 
                && globals.salesMediumMango <= 0 
                && globals.salesMediumBanana <= 0 
                && globals.salesLargeStraw <= 0 
                && globals.salesLargeMango <= 0 
                && globals.salesLargeBanana <= 0 ){
            System.out.println("No sales yet");
        }
        
    
    }
}
