package controller;

import classes.globals;

/**
 *
 * @author Jorge Prieto
 */
public class verifySell {

    public void analyze(String flavor, String size) {
        switch (size) {
            case "SMALL": {
                switch (flavor) {
                    case "Strawberry": {
                        if (globals.myInventory.getStrawBerry() >= globals.recipe100mlStraw) {
                            if (globals.myInventory.getiIce() >= globals.recipe100mlIce) {
                                if (globals.myInventory.getiCondensedMilk() >= globals.recipe100mlCondensedMilk) {
                                    if (globals.myInventory.getiSugar() >= globals.recipe100mlSugar) {
                                        globals.myInventory.setStrawBerry(
                                                globals.myInventory.getStrawBerry() - globals.recipe100mlStraw);
                                        globals.myInventory.setiIce(
                                                globals.myInventory.getiIce() - globals.recipe100mlIce);
                                        globals.myInventory.setiCondensedMilk(
                                                globals.myInventory.getiCondensedMilk() - globals.recipe100mlCondensedMilk);
                                        globals.myInventory.setiSugar(
                                                globals.myInventory.getiSugar() - globals.recipe100mlSugar);
                                        System.out.println("Sale successful");
                                        System.out.println("The cost of the drink is $" + globals.costSmall);
                                        globals.totalSoldSmall += globals.costSmall;
                                        globals.salesSmallStraw += 1;
                                        globals.succesSell = true;
                                    } else {
                                        System.out.println("Failed sale, add the necessary products to inventory");
                                    }

                                } else {
                                    System.out.println("Failed sale, add the necessary products to inventory");
                                }
                            } else {
                                System.out.println("Failed sale, add the necessary products to inventory");
                            }

                        } else {
                            System.out.println("Failed sale, add the necessary products to inventory");
                        }

                    }
                    break;
                    case "Banana": {
                        if (globals.myInventory.getBanana() >= globals.recipe100mlBanana) {
                            if (globals.myInventory.getiIce() >= globals.recipe100mlIce) {
                                if (globals.myInventory.getiCondensedMilk() >= globals.recipe100mlCondensedMilk) {
                                    if (globals.myInventory.getiSugar() >= globals.recipe100mlSugar) {
                                        globals.myInventory.setBanana(
                                                globals.myInventory.getBanana() - globals.recipe100mlBanana);
                                        globals.myInventory.setiIce(
                                                globals.myInventory.getiIce() - globals.recipe100mlIce);
                                        globals.myInventory.setiCondensedMilk(
                                                globals.myInventory.getiCondensedMilk() - globals.recipe100mlCondensedMilk);
                                        globals.myInventory.setiSugar(
                                                globals.myInventory.getiSugar() - globals.recipe100mlSugar);
                                        System.out.println("Sale successful");
                                        System.out.println("The cost of the drink is $" + globals.costSmall);
                                        globals.totalSoldSmall += globals.costSmall;
                                        globals.salesSmallBanana += 1;
                                        globals.succesSell = true;
                                    } else {
                                        System.out.println("Failed sale, add the necessary products to inventory");
                                    }

                                } else {
                                    System.out.println("Failed sale, add the necessary products to inventory");
                                }
                            } else {
                                System.out.println("Failed sale, add the necessary products to inventory");
                            }

                        } else {
                            System.out.println("Failed sale, add the necessary products to inventory");
                        }

                    }
                    break;
                    case "Mango": {
                        if (globals.myInventory.getMango() >= globals.recipe100mlMango) {
                            if (globals.myInventory.getiIce() >= globals.recipe100mlIce) {
                                if (globals.myInventory.getiCondensedMilk() >= globals.recipe100mlCondensedMilk) {
                                    if (globals.myInventory.getiSugar() >= globals.recipe100mlSugar) {
                                        globals.myInventory.setMango(
                                                globals.myInventory.getMango() - globals.recipe100mlMango);
                                        globals.myInventory.setiIce(
                                                globals.myInventory.getiIce() - globals.recipe100mlIce);
                                        globals.myInventory.setiCondensedMilk(
                                                globals.myInventory.getiCondensedMilk() - globals.recipe100mlCondensedMilk);
                                        globals.myInventory.setiSugar(
                                                globals.myInventory.getiSugar() - globals.recipe100mlSugar);
                                        System.out.println("Sale successful");
                                        System.out.println("The cost of the drink is $" + globals.costSmall);
                                        globals.totalSoldSmall += globals.costSmall;
                                        globals.salesSmallMango += 1;
                                        globals.succesSell = true;
                                    } else {
                                        System.out.println("Failed sale, add the necessary products to inventory");
                                    }

                                } else {
                                    System.out.println("Failed sale, add the necessary products to inventory");
                                }
                            } else {
                                System.out.println("Failed sale, add the necessary products to inventory");
                            }

                        } else {
                            System.out.println("Failed sale, add the necessary products to inventory");
                        }

                    }
                    break;
                }

            }
            break;
            case "MEDIUM": {
                switch (flavor) {
                    case "Strawberry": {
                        if (globals.myInventory.getStrawBerry() >= globals.recipe300mlStraw) {
                            if (globals.myInventory.getiIce() >= globals.recipe300mlIce) {
                                if (globals.myInventory.getiCondensedMilk() >= globals.recipe300mlCondensedMilk) {
                                    if (globals.myInventory.getiSugar() >= globals.recipe300mlSugar) {
                                        globals.myInventory.setStrawBerry(
                                                globals.myInventory.getStrawBerry() - globals.recipe300mlStraw);
                                        globals.myInventory.setiIce(
                                                globals.myInventory.getiIce() - globals.recipe300mlIce);
                                        globals.myInventory.setiCondensedMilk(
                                                globals.myInventory.getiCondensedMilk() - globals.recipe300mlCondensedMilk);
                                        globals.myInventory.setiSugar(
                                                globals.myInventory.getiSugar() - globals.recipe300mlSugar);
                                        System.out.println("Sale successful");
                                        System.out.println("The cost of the drink is $" + globals.costMedium);
                                        globals.totalSoldMedium += globals.costMedium;
                                        globals.salesMediumStraw += 1;
                                        globals.succesSell = true;
                                    } else {
                                        System.out.println("Failed sale, add the necessary products to inventory");
                                    }

                                } else {
                                    System.out.println("Failed sale, add the necessary products to inventory");
                                }
                            } else {
                                System.out.println("Failed sale, add the necessary products to inventory");
                            }

                        } else {
                            System.out.println("Failed sale, add the necessary products to inventory");
                        }

                    }
                    break;
                    case "Banana": {
                        if (globals.myInventory.getBanana() >= globals.recipe300mlBanana) {
                            if (globals.myInventory.getiIce() >= globals.recipe300mlIce) {
                                if (globals.myInventory.getiCondensedMilk() >= globals.recipe300mlCondensedMilk) {
                                    if (globals.myInventory.getiSugar() >= globals.recipe300mlSugar) {
                                        globals.myInventory.setBanana(
                                                globals.myInventory.getBanana() - globals.recipe300mlBanana);
                                        globals.myInventory.setiIce(
                                                globals.myInventory.getiIce() - globals.recipe300mlIce);
                                        globals.myInventory.setiCondensedMilk(
                                                globals.myInventory.getiCondensedMilk() - globals.recipe300mlCondensedMilk);
                                        globals.myInventory.setiSugar(
                                                globals.myInventory.getiSugar() - globals.recipe300mlSugar);
                                        System.out.println("Sale successful");
                                        System.out.println("The cost of the drink is $" + globals.costMedium);
                                        globals.totalSoldMedium += globals.costMedium;
                                        globals.salesMediumBanana += 1;
                                        globals.succesSell = true;
                                    } else {
                                        System.out.println("Failed sale, add the necessary products to inventory");
                                    }

                                } else {
                                    System.out.println("Failed sale, add the necessary products to inventory");
                                }
                            } else {
                                System.out.println("Failed sale, add the necessary products to inventory");
                            }

                        } else {
                            System.out.println("Failed sale, add the necessary products to inventory");
                        }

                    }
                    break;
                    case "Mango": {
                        if (globals.myInventory.getMango() >= globals.recipe300mlMango) {
                            if (globals.myInventory.getiIce() >= globals.recipe300mlIce) {
                                if (globals.myInventory.getiCondensedMilk() >= globals.recipe300mlCondensedMilk) {
                                    if (globals.myInventory.getiSugar() >= globals.recipe300mlSugar) {
                                        globals.myInventory.setMango(
                                                globals.myInventory.getMango() - globals.recipe300mlMango);
                                        globals.myInventory.setiIce(
                                                globals.myInventory.getiIce() - globals.recipe300mlIce);
                                        globals.myInventory.setiCondensedMilk(
                                                globals.myInventory.getiCondensedMilk() - globals.recipe300mlCondensedMilk);
                                        globals.myInventory.setiSugar(
                                                globals.myInventory.getiSugar() - globals.recipe300mlSugar);
                                        System.out.println("Sale successful");
                                        System.out.println("The cost of the drink is $" + globals.costMedium);
                                        globals.totalSoldMedium += globals.costMedium;
                                        globals.salesMediumMango += 1;
                                        globals.succesSell = true;
                                    } else {
                                        System.out.println("Failed sale, add the necessary products to inventory");
                                    }

                                } else {
                                    System.out.println("Failed sale, add the necessary products to inventory");
                                }
                            } else {
                                System.out.println("Failed sale, add the necessary products to inventory");
                            }

                        } else {
                            System.out.println("Failed sale, add the necessary products to inventory");
                        }

                    }
                    break;
                }

            }
            break;
            case "LARGE": {
                switch (flavor) {
                    case "Strawberry": {
                        if (globals.myInventory.getStrawBerry() >= globals.recipe500mlStraw) {
                            if (globals.myInventory.getiIce() >= globals.recipe500mlIce) {
                                if (globals.myInventory.getiCondensedMilk() >= globals.recipe500mlCondensedMilk) {
                                    if (globals.myInventory.getiSugar() >= globals.recipe500mlSugar) {
                                        globals.myInventory.setStrawBerry(
                                                globals.myInventory.getStrawBerry() - globals.recipe500mlStraw);
                                        globals.myInventory.setiIce(
                                                globals.myInventory.getiIce() - globals.recipe500mlIce);
                                        globals.myInventory.setiCondensedMilk(
                                                globals.myInventory.getiCondensedMilk() - globals.recipe500mlCondensedMilk);
                                        globals.myInventory.setiSugar(
                                                globals.myInventory.getiSugar() - globals.recipe500mlSugar);
                                        System.out.println("Sale successful");
                                        System.out.println("The cost of the drink is $" + globals.costLarge);
                                        globals.totalSoldLarge += globals.costLarge;
                                        globals.salesLargeStraw += 1;
                                        globals.succesSell = true;
                                    } else {
                                        System.out.println("Failed sale, add the necessary products to inventory");
                                    }

                                } else {
                                    System.out.println("Failed sale, add the necessary products to inventory");
                                }
                            } else {
                                System.out.println("Failed sale, add the necessary products to inventory");
                            }

                        } else {
                            System.out.println("Failed sale, add the necessary products to inventory");
                        }

                    }
                    break;
                    case "Banana": {
                        if (globals.myInventory.getBanana() >= globals.recipe500mlBanana) {
                            if (globals.myInventory.getiIce() >= globals.recipe500mlIce) {
                                if (globals.myInventory.getiCondensedMilk() >= globals.recipe500mlCondensedMilk) {
                                    if (globals.myInventory.getiSugar() >= globals.recipe500mlSugar) {
                                        globals.myInventory.setBanana(
                                                globals.myInventory.getBanana() - globals.recipe500mlBanana);
                                        globals.myInventory.setiIce(
                                                globals.myInventory.getiIce() - globals.recipe500mlIce);
                                        globals.myInventory.setiCondensedMilk(
                                                globals.myInventory.getiCondensedMilk() - globals.recipe500mlCondensedMilk);
                                        globals.myInventory.setiSugar(
                                                globals.myInventory.getiSugar() - globals.recipe500mlSugar);
                                        System.out.println("Sale successful");
                                        System.out.println("The cost of the drink is $" + globals.costLarge);
                                        globals.totalSoldLarge += globals.costLarge;
                                        globals.salesLargeBanana += 1;
                                        globals.succesSell = true;
                                    } else {
                                        System.out.println("Failed sale, add the necessary products to inventory");
                                    }

                                } else {
                                    System.out.println("Failed sale, add the necessary products to inventory");
                                }
                            } else {
                                System.out.println("Failed sale, add the necessary products to inventory");
                            }

                        } else {
                            System.out.println("Failed sale, add the necessary products to inventory");
                        }

                    }
                    break;
                    case "Mango": {
                        if (globals.myInventory.getMango() >= globals.recipe500mlMango) {
                            if (globals.myInventory.getiIce() >= globals.recipe500mlIce) {
                                if (globals.myInventory.getiCondensedMilk() >= globals.recipe500mlCondensedMilk) {
                                    if (globals.myInventory.getiSugar() >= globals.recipe500mlSugar) {
                                        globals.myInventory.setMango(
                                                globals.myInventory.getMango() - globals.recipe500mlMango);
                                        globals.myInventory.setiIce(
                                                globals.myInventory.getiIce() - globals.recipe500mlIce);
                                        globals.myInventory.setiCondensedMilk(
                                                globals.myInventory.getiCondensedMilk() - globals.recipe500mlCondensedMilk);
                                        globals.myInventory.setiSugar(
                                                globals.myInventory.getiSugar() - globals.recipe500mlSugar);
                                        System.out.println("Sale successful");
                                        System.out.println("The cost of the drink is $" + globals.costLarge);
                                        globals.totalSoldLarge += globals.costLarge;
                                        globals.salesLargeMango += 1;
                                        globals.succesSell = true;
                                    } else {
                                        System.out.println("Failed sale, add the necessary products to inventory");
                                    }

                                } else {
                                    System.out.println("Failed sale, add the necessary products to inventory");
                                }
                            } else {
                                System.out.println("Failed sale, add the necessary products to inventory");
                            }

                        } else {
                            System.out.println("Failed sale, add the necessary products to inventory");
                        }

                    }
                    break;
                }

            }
            break;
        }
    }

    public void setSell(String flavor, String size) {
        this.analyze(flavor, size);
    }
}
