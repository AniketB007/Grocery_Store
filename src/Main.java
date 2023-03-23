

import java.util.Scanner;

public class Main{

    Scanner sc = new Scanner(System.in);
    double totalBill=0;
    double totalBill1=0;
    double totalBill2=0;
    double totalBill3=0;

    int fc;
    double total;
    double dis;
    int ftotal = 0;
    int vtotal=0;

    int ctotal=0;

    void greet01() {
        System.out.println("=============================================================================================");
        System.out.println("--------------------------------WELCOME TO OUR STORE-----------------------------------------");
        System.out.println("=============================================================================================");
        products();
    }

    void products() {
        System.out.println();

        System.out.println("Available Products in the Store");
        System.out.println();
        System.out.println("______________________________________________");
        System.out.println("   Code                  Products     ");
        System.out.println("______________________________________________");
        System.out.println("     1                  Fruits        ");
        System.out.println("     2                  Vegetables    ");
        System.out.println("     3                  Cosmetics     ");
        System.out.println("______________________________________________");
        System.out.println();
        System.out.println(" Please enter the Code of Product : ");
        int product = sc.nextInt();
        switch (product) {
            case 1: {
                System.out.println("You enter " + product + " for Fruits.");
                fruits();
                break;
            }
            case 2: {
                System.out.println("You enter " + product + " for Vegetables.");
                vegetables();
                break;
            }
            case 3: {
                System.out.println("You enter " + product + " for Cosmetics.");
                cosmetics();
                break;
            }
            default: {
                System.out.println("You enter Invalid entry. Please enter Valid code.");
                products();
            }
        }
    }

    void fruits() {

        System.out.println();
        System.out.println("---------**** WELCOME TO FRUITS MENU ***----------");
        System.out.println();
        int apple = 250;
        int banana = 55;
        int grapes = 95;
        int guava = 55;
        int lychee = 265;
        int mango = 130;
        int orange = 75;
        int papaya = 40;
        int pomegranate = 135;
        int watermelon = 20;

        String first = "Apple";
        String second = "Banana";
        String third = "Grapes";
        String fourth = "Guava";
        String fifth = "Lychee";
        String sixth = "Mango";
        String seventh = "Orange";
        String eighth = "Papaya";
        String nineth = "Pomegranate";
        String tenth = "WaterMelon";

        System.out.println("------------------------------------------------------------");
        System.out.println("  Code         Fruit Name         Quantity          MRP     ");
        System.out.println("------------------------------------------------------------");
        System.out.println("  101         Apple               1 Kg              " + apple + "/Kg ");
        System.out.println("  102         Banana              1 Kg              " + banana + "/Kg ");
        System.out.println("  103         Grapes              1 Kg              " + grapes + "/Kg ");
        System.out.println("  104         Guava               1 Kg              " + guava + "/Kg ");
        System.out.println("  105         Lychee              1 Kg              " + lychee + "/Kg ");
        System.out.println("  106         Mango               1 Kg              " + mango + "/Kg ");
        System.out.println("  107         Orange              1 Kg              " + orange + "/Kg ");
        System.out.println("  108         Papaya              1 Kg              " + papaya + "/Kg ");
        System.out.println("  109         Pomegranate         1 Kg              " + pomegranate + "/Kg ");
        System.out.println("  110         WaterMelon          1 Kg              " + watermelon + "/Kg ");
        System.out.println("------------------------------------------------------------");

        System.out.println();
        System.out.println("Please enter the code of Fruit which you want ?");
        int fruit = sc.nextInt();

        switch (fruit) {
            case 101: {
                System.out.println(first + " is a good Choice. How many Kg's You want ?");
                int f1 = sc.nextInt();
                ftotal = f1 * apple;
                tb1();
                break;
            }
            case 102: {
                System.out.println(second + " is a good Choice. How many Kg's You want ?");
                int f2 = sc.nextInt();
                ftotal = f2 * banana;
                tb1();
                break;
            }
            case 103: {
                System.out.println(third + " is a good Choice. How many Kg's You want ?");
                int f3 = sc.nextInt();
                ftotal = f3 * grapes;
                tb1();
                break;
            }
            case 104: {
                System.out.println(fourth + " is a good Choice. How many Kg's You want ?");
                int f4 = sc.nextInt();
                ftotal = f4 * guava;
                tb1();
                break;
            }
            case 105: {
                System.out.println(fifth + " is a good Choice. How many Kg's You want ?");
                int f5 = sc.nextInt();
                ftotal = f5 * lychee;
                tb1();
                break;
            }
            case 106: {
                System.out.println(sixth + " is a good Choice. How many Kg's You want ?");
                int f6 = sc.nextInt();
                ftotal = f6 * mango;
                tb1();
                break;
            }
            case 107: {
                System.out.println(seventh + " is a good Choice. How many Kg's You want ?");
                int f7 = sc.nextInt();
                ftotal = f7 * orange;
                tb1();
                break;
            }
            case 108: {
                System.out.println(eighth + " is a good Choice. How many Kg's You want ?");
                int f8 = sc.nextInt();
                ftotal = f8 * papaya;
                tb1();

                break;
            }
            case 109: {
                System.out.println(nineth + " is a good Choice. How many Kg's You want ?");
                int f9 = sc.nextInt();
                ftotal = f9 * pomegranate;
                tb1();
                break;
            }
            case 110: {
                System.out.println(tenth + " is a good Choice. How many Kg's You want ?");
                int f10 = sc.nextInt();
                ftotal = f10 * watermelon;
                tb1();
                break;
            }

            default: {
                System.out.println("You enter Invalid entry. Please enter Valid code.");
                fruits();
            }

        }

    }


    void vegetables(){
        System.out.println();
        System.out.println("---------**** WELCOME TO VEGETABLES MENU ***----------");
        System.out.println();
        int beetroot = 30;
        int brinjal=35;
        int cabbage = 15;
        int carrot = 30;
        int cauliflower = 35;
        int ginger = 60;
        int mushroom = 95;
        int onion = 25;
        int potato = 40;
        int tomato = 35;

        String first = "BeetRoot";
        String second = "Brinjal";
        String third = "Cabbage";
        String fourth = "Carrot";
        String fifth = "CauliFlower";
        String sixth = "Ginger";
        String seventh = "Mushroom";
        String eighth = "Onion";
        String nineth = "Potato";
        String tenth = "Tomato";
        System.out.println();
        System.out.println("------------------------------------------------------------");
        System.out.println("  Code         Fruit Name         Quantity          MRP     ");
        System.out.println("------------------------------------------------------------");
        System.out.println("  201         BeetRoot             1 Kg              " + beetroot + "/Kg ");
        System.out.println("  202         Brinjal              1 Kg              " + brinjal + "/Kg ");
        System.out.println("  203         Cabbage              1 Kg              " + cabbage + "/Kg ");
        System.out.println("  204         Carrot               1 Kg              " + carrot + "/Kg ");
        System.out.println("  205         CauliFlower          1 Kg              " + cauliflower + "/Kg ");
        System.out.println("  206         Ginger               1 Kg              " + ginger + "/Kg ");
        System.out.println("  207         Mushroom             1 Kg              " + mushroom + "/Kg ");
        System.out.println("  208         Onion                1 Kg              " + onion + "/Kg ");
        System.out.println("  209         Potato               1 Kg              " + potato + "/Kg ");
        System.out.println("  210         Tomato               1 Kg              " + tomato + "/Kg ");
        System.out.println("------------------------------------------------------------");

        System.out.println();
        System.out.println("Please enter the code of Vegetable which you want ?");
        int vege = sc.nextInt();

        switch (vege) {
            case 201: {
                System.out.println(first + " is a good Choice. How many Kg's You want ?");
                int v1 = sc.nextInt();
                vtotal = v1 * beetroot;
                tb2();
                break;
            }
            case 202: {
                System.out.println(second + " is a good Choice. How many Kg's You want ?");
                int v2 = sc.nextInt();
                vtotal = v2 * brinjal;
                tb2();
                break;
            }
            case 203: {
                System.out.println(third + " is a good Choice. How many Kg's You want ?");
                int v3 = sc.nextInt();
                vtotal = v3 * cabbage;
                tb2();
                break;
            }
            case 204: {
                System.out.println(fourth + " is a good Choice. How many Kg's You want ?");
                int v4 = sc.nextInt();
                vtotal = v4 * carrot;
                tb2();
                break;
            }
            case 205: {
                System.out.println(fifth + " is a good Choice. How many Kg's You want ?");
                int v5 = sc.nextInt();
                vtotal = v5 * cauliflower;
                tb2();
                break;
            }
            case 206: {
                System.out.println(sixth + " is a good Choice. How many Kg's You want ?");
                int v6 = sc.nextInt();
                vtotal = v6 * ginger;
                tb2();
                break;
            }
            case 207: {
                System.out.println(seventh + " is a good Choice. How many Kg's You want ?");
                int v7 = sc.nextInt();
                vtotal = v7 * mushroom;
                tb2();
                break;
            }
            case 208: {
                System.out.println(eighth + " is a good Choice. How many Kg's You want ?");
                int v8 = sc.nextInt();
                vtotal = v8 * onion;
                tb2();
                break;
            }
            case 209: {
                System.out.println(nineth + " is a good Choice. How many Kg's You want ?");
                int v9 = sc.nextInt();
                vtotal = v9 * potato;
                tb2();
                break;
            }
            case 210: {
                System.out.println(tenth + " is a good Choice. How many Kg's You want ?");
                int v10 = sc.nextInt();
                vtotal = v10 * tomato;
                tb2();
                break;
            }

            default: {
                System.out.println("You enter Invalid entry. Please enter Valid code.");
                vegetables();
            }
        }
    }

    void cosmetics(){

        System.out.println();
        System.out.println("---------**** WELCOME TO COSMETICS MENU ***----------");
        System.out.println();
        int aloeveragel = 65;
        int bodylotion = 60;
        int facecream = 135;
        int facewash=155;
        int hairoil = 70;
        int lipbalm = 60;
        int powder = 85;
        int rosewater = 95;
        int shampoo = 115;
        int soap = 30;


        String first = "AloeveraGel";
        String second = "BodyLotion";
        String third = "FaceCream";
        String fourth = "FaceWash";
        String fifth = "HairOil";
        String sixth = "LipBalm";
        String seventh = "Powder";
        String eighth = "RoseWater";
        String nineth = "Shampoo";
        String tenth = "Soap";
        System.out.println();
        System.out.println("------------------------------------------------------------");
        System.out.println("  Code         Fruit Name         Quantity          MRP     ");
        System.out.println("------------------------------------------------------------");
        System.out.println("  301         AloeveraGel         100 gm            " + aloeveragel + " Rs. ");
        System.out.println("  302         BodyLotion          100 gm            " + bodylotion + " Rs .");
        System.out.println("  303         FaceCream           100 gm            " + facecream + " Rs. ");
        System.out.println("  304         FaceWash            100 gm            " + facewash + " Rs. ");
        System.out.println("  305         HairOil             100 gm            " + hairoil + " Rs. ");
        System.out.println("  306         LipBalm             100 gm            " + lipbalm + " Rs. ");
        System.out.println("  307         Powder              100 gm            " + powder + " Rs. ");
        System.out.println("  308         RoseWater           100 gm            " + rosewater + " Rs. ");
        System.out.println("  309         Shampoo             100 gm            " + shampoo + " Rs. ");
        System.out.println("  310         Soap                100 gm            " + soap + " Rs. ");
        System.out.println("------------------------------------------------------------");
        System.out.println();
        System.out.println("Please enter the code of Cosmetics which you want ?");
        int cos = sc.nextInt();
        switch (cos) {
            case 301: {
                System.out.println(first + " is a good Choice. How many Unit's You want ?");
                int c1 = sc.nextInt();
                ctotal = c1 * aloeveragel;
                tb3();
                break;
            }
            case 302: {
                System.out.println(second + " is a good Choice. How many Unit's You want ?");
                int c2 = sc.nextInt();
                ctotal = c2 * bodylotion;
                tb3();
                break;
            }
            case 303: {
                System.out.println(third + " is a good Choice. How many Unit's You want ?");
                int c3 = sc.nextInt();
                ctotal = c3 * facecream;
                tb3();
                break;
            }
            case 304: {
                System.out.println(fourth + " is a good Choice. How many Unit's You want ?");
                int c4 = sc.nextInt();
                ctotal = c4 * facewash;
                tb3();
                break;
            }
            case 305: {
                System.out.println(fifth + " is a good Choice. How many Unit's You want ?");
                int c5 = sc.nextInt();
                ctotal = c5 * hairoil;
                tb3();
                break;
            }
            case 306: {
                System.out.println(sixth + " is a good Choice. How many Unit's You want ?");
                int c6 = sc.nextInt();
                ctotal = c6 * lipbalm;
                tb3();
                break;
            }
            case 307: {
                System.out.println(seventh + " is a good Choice. How many Unit's You want ?");
                int c7 = sc.nextInt();
                ctotal = c7 * powder;
                tb3();
                break;
            }
            case 308: {
                System.out.println(eighth + " is a good Choice. How many Unit's You want ?");
                int c8 = sc.nextInt();
                ctotal = c8 * rosewater;
                tb3();
                break;
            }
            case 309: {
                System.out.println(nineth + " is a good Choice. How many Unit's You want ?");
                int c9 = sc.nextInt();
                ctotal = c9 * shampoo;
                tb3();
                break;
            }
            case 310: {
                System.out.println(tenth + " is a good Choice. How many Unit's You want ?");
                int c10 = sc.nextInt();
                ctotal = c10 * soap;
                tb3();
                break;
            }

            default: {
                System.out.println("You enter Invalid entry. Please enter Valid code.");
                cosmetics();
            }
        }
    }

    void options() {
        System.out.println("Press 1 to Shopping in Fruit Section ....");
        System.out.println("Press 2 to Shopping in Vegetable Section ....");
        System.out.println("Press 3 to Shopping in Cosmetics Section ....");
        System.out.println("Press 4 for Main Menu.......");
        System.out.println("Press 5 for exit ");
        fc = sc.nextInt();
        switch (fc) {
            case 1: {
                fruits();
                break;
            }
            case 2: {
                vegetables();
                break;
            }
            case 3: {
                cosmetics();
                break;
            }
            case 4: {
                products();
                break;
            }

            case 5: {
                bill();
                break;
            }

            default:
            {
                System.out.println("You entered  Invalid value. Please enter Valid code.");
                options();

            }

        }

    }

    void tb1(){
        totalBill1=ftotal+totalBill1;
        tb();
    }

    void tb2(){
        totalBill2=vtotal+totalBill2;
        tb();
    }

    void tb3(){
        totalBill3=ctotal+totalBill3;
        tb();
    }
    void tb() {

        totalBill = totalBill1 +totalBill2+ totalBill3;
        System.out.println("Your bill  till now : "+totalBill);
        options();
    }
    void bill(){
        System.out.println("=========================================================================");
        System.out.println("-----------------------------Product Bill--------------------------------");
        System.out.println("=========================================================================");
        System.out.println("Note:- If your bill is above 500 Rs then you got a discount of 5%.");
        System.out.println("-------------------------------------------------------------------------");
        if(totalBill>=500){
            System.out.println("  Your bill in Fruit Section            :  "+totalBill1 +" Rs.");
            System.out.println("  Your bill in Vegetable Section        :  "+totalBill2+" Rs." );
            System.out.println("  Your bill in Cosmetics Section        :  "+totalBill3 +" Rs.");
            System.out.println("  Your total bill                       :  "+totalBill+" Rs.");
            dis= totalBill * 0.05;
            double cbill=(totalBill-dis);
            System.out.println("  You save                              :   "+dis+" Rs.");
            System.out.println("-------------------------------------------------------------------------");
            System.out.println("  Your Final Bill                       :   "+(int)(cbill)+" Rs.");
            System.out.println("-------------------------------------------------------------------------");


        }else {
            System.out.println("  Your bill in Fruit Section            :  "+totalBill1 +" Rs.");
            System.out.println("  Your bill in Vegetable Section        :  "+totalBill2+" Rs." );
            System.out.println("  Your bill in Cosmetics Section        :  "+totalBill3 +" Rs.");
            System.out.println("  Your Final Bill                       :  "+totalBill+" Rs.");
            System.out.println("-------------------------------------------------------------------------");

        }

        System.out.println("=========================================================================");
        System.out.println("--------------------------*-*-*-[*]-*-*-*--------------------------------");
        System.out.println("=========================================================================");
        System.out.println("---------------------THANK YOU FOR SHOPPPING-----------------------------");

    }

    public static void main(String[] args) {
        Main store=new Main();
        store.greet01();
//        store.products();
//        store.fruits();
//        store.bill();
//        store.vegetables();
//        store.bill1();
//        store.cosmetics();


    }
}
