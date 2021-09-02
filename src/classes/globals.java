package classes;

import controller.loadInventory;
import java.util.Scanner;

/**
 *
 * @author Jorge Prieto
 */
public class globals {

    public static boolean sExitMain = false;
    public static boolean sExitLoadInventory = false;
    public static boolean sExitLoadSell = false;
    public static boolean isInventory = false;
    public static String opcion;
    public static boolean inventoryIsLoaded = false;
    public static Scanner input = new Scanner(System.in);
    public static inventory myInventory = new inventory();
    public static loadInventory myLoadInventory = new loadInventory();
    public static String[] drinks = new String[]{"Strawberry", "Banana", "Mango"};
    public static boolean succesSell = false;
    public static int recipe100mlStraw = 100 / 2;
    public static int recipe100mlMango = 140 / 2;
    public static int recipe100mlBanana = 120 / 2;
    public static int warningStraw = ((100 / 2) * 4);
    public static int warningMango = ((140 / 2) * 4);
    public static int warningBanana = ((120 / 2) * 4);
    public static int warningBIce = 120;
    public static int warningCondensedMilk = 80;
    public static int warningSugar = 32;
    public static int recipe300mlStraw = 150;
    public static int recipe300mlMango = 210;
    public static int recipe300mlBanana = 180;
    public static int recipe500mlStraw = 250;
    public static int recipe500mlMango = 350;
    public static int recipe500mlBanana = 300;
    public static int recipe100mlIce = 30;
    public static int recipe100mlCondensedMilk = 20;
    public static int recipe100mlSugar = 8;
    public static int recipe300mlIce = 90;
    public static int recipe300mlCondensedMilk = 60;
    public static int recipe300mlSugar = 24;
    public static int recipe500mlIce = 150;
    public static int recipe500mlCondensedMilk = 100;
    public static int recipe500mlSugar = 40;
    public static int salesSmallStraw = 0;
    public static int salesSmallBanana = 0;
    public static int salesSmallMango = 0;
    public static int salesMediumStraw = 0;
    public static int salesMediumBanana = 0;
    public static int salesMediumMango = 0;
    public static int salesLargeStraw = 0;
    public static int salesLargeBanana = 0;
    public static int salesLargeMango = 0;
    public static double costSmall = 10;
    public static double costMedium = 20;
    public static double costLarge = 30;
    public static double totalSoldSmall = 0;
    public static double totalSoldMedium = 0;
    public static double totalSoldLarge = 0;

}
