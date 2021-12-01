package Restarentproject;

import java.util.Scanner;

public class MGGRANDRESTAURENT {
    public static void main(String[] args) {
        int ch,vstr=0,tvstr=0,amount=0,tamt=0,tnvstr=0,nvstr=0,vfd=0,tvfd=0,c=0,tc=0,dr=0,tdr=0;
        String str,choice="Y";
        double vat=0.0;
        Scanner sc=new Scanner(System.in);
        System.out.println("\t\t\t\t\t\t\twelcome to MG GRAND RESTAURANT");
        System.out.println("Starter corner:1");
        System.out.println("Main course:2");
        System.out.println("Deserts:3");
        System.out.println("");
        System.out.println("");
        System.out.println("press 1 for Starter Corner");
        System.out.println("press 2 for Main course");
        System.out.println("Press 3 for Deserts");
        System.out.println("");
        System.out.println("");
        System.out.println("Entre your choice from the above list");
        ch=sc.nextInt();
        switch (ch){
            case 1:
                System.out.println("Welcome to starter menu");
                System.out.println("Enter VS for veg Starter and NVS for non veg Starters");
                str=sc.next();
                if(str.equalsIgnoreCase("vs")){
                    System.out.println("Starter veg names and their Rs...");
                    System.out.println("1.Panner tikka  \t\t\t110");
                    System.out.println("2.gobi rise     \t\t\t110");
                    System.out.println("3.curd rise     \t\t\t120");
                    System.out.println("4.Laman rise    \t\t\t200");
                    System.out.println("5.mash rooms    \t\t\t160");
                    System.out.println("6.roti          \t\t\t140");
                    System.out.println("7.nuddlis       \t\t\t150");
                    System.out.println("8.chilli channa \t\t\t130");
                    System.out.println("9.Chilli potato \t\t\t130");
                    System.out.println("10.Tomoto rise  \t\t\t130");
                    while (choice.equalsIgnoreCase("y"))
                    {
                        System.out.println("choose your starter from the above list by entering numbers");

                        vstr=sc.nextInt();
                        System.out.println("enter the total no.of starters you want");
                        tvstr=sc.nextInt();
                        if (vstr==1||vstr==2)
                            amount=tvstr*110;
                        if (vstr==3)
                            amount=tvstr*120;
                        if (vstr==4)
                            amount=tvstr*200;
                        if(vstr==5)
                            amount=tvstr*160;
                        if(vstr==6)
                            amount=tvstr*140;
                        if (vstr==7)
                            amount=tvstr*150;
                        if (vstr>7&&vstr<=10)
                            amount=tvstr*130;
                        tamt=tamt+amount;
                        System.out.println("your amount="+tamt);
                        System.out.println("do you want place one more order enter y or n");
                        choice=sc.next();

                    }
                }
                if (str.equalsIgnoreCase("nvs")){

                    System.out.println("Starter non veg starters names and their Rs...");
                    System.out.println("1.chicken rise   \t\t\t110");
                    System.out.println("2.chicken kabab  \t\t\t110");
                    System.out.println("3.fried chicken  \t\t\t110");
                    System.out.println("4.chicken tikka  \t\t\t150");
                    System.out.println("5.family chicken \t\t\t150");
                    System.out.println("6.roti chicke    \t\t\t180");
                    System.out.println("7.nuddlis chicken\t\t\t180");
                    System.out.println("8.chilli chicken \t\t\t180");
                    System.out.println("9.Chilli chicken \t\t\t120");
                    System.out.println("10.dalrise rise  \t\t\t120");
                    while (choice.equalsIgnoreCase("y")) {
                        System.out.println("choose your choice from the about list by enter the numbers");
                        nvstr = sc.nextInt();
                        System.out.println("Enter how many plats  non veg starters you want");
                        tnvstr = sc.nextInt();
                        if (nvstr >= 1 && nvstr <= 3)
                            amount = tnvstr * 110;
                        if (nvstr == 4 || nvstr == 5)
                            amount = tnvstr * 150;
                        if (nvstr >= 6 && nvstr <= 8)
                            amount = tvstr * 180;
                        if (nvstr == 9 || nvstr == 10)
                            amount = tnvstr * 120;
                        tamt = tamt + amount;
                        System.out.println("your amount=" + tamt);
                        System.out.println("do you want to place one more order by press y or n");
                        choice = sc.next();
                    }


                }
                System.out.println("********** GRAND RESTAURANT  ***********");
                System.out.println("**** Bill ******");
                System.out.println("total cost Rs.."+tamt);
                vat=Math.round(14.5/100.0*tamt);
                System.out.println("VAT=14.5%");
                System.out.println("Total VAT=Rs.."+vat);
                System.out.println("Total amount to be paid Rs..."+(vat+tamt));
                System.out.println("thank you for your visiting");
                break;
            case 2:
                System.out.println("Main course :indian and china dishes");
                System.out.println("v for Indian VEG dishes and nv for china non VEG dishes and c for china dishes");
                str=sc.next();
                if (str.equalsIgnoreCase("v")){
                    System.out.println("Welcome to Indian non veg dishes");
                    System.out.println("1.Panner tikka  \t\t\t110");
                    System.out.println("2.gobi rise     \t\t\t110");
                    System.out.println("3.curd rise     \t\t\t120");
                    System.out.println("4.Laman rise    \t\t\t200");
                    System.out.println("5.mash rooms    \t\t\t160");
                    System.out.println("6.roti          \t\t\t140");
                    System.out.println("7.nuddlis       \t\t\t130");
                    System.out.println("8.chilli channa \t\t\t130");
                    System.out.println("9.Chilli potato \t\t\t130");
                    System.out.println("10.Tomoto rise  \t\t\t130");
                    while (choice.equalsIgnoreCase("y")){
                        System.out.println("Chose your main veg course from above list by clicking number");
                        vfd=sc.nextInt();
                        System.out.println("Enter how many plates do you want ");
                        tvfd=sc.nextInt();
                        if (vfd==1&&vfd==2)
                            amount=tvfd*110;
                        if (vfd==3)
                            amount=tvfd*120;
                        if (vfd==4)
                            amount=tvfd*200;
                        if (vfd==5)
                            amount=tvfd*160;
                        if(vfd==6)
                            amount=tvfd*140;
                        if (vfd>=7||vfd<=10)
                            amount=tvfd*130;
                        tamt=tamt+amount;
                        System.out.println("your amount is="+tamt);
                        System.out.println("do you want to place another order  by click y or n");
                        choice=sc.next();
                    }
                }
                if (str.equalsIgnoreCase("nv")){
                    System.out.println("Welcome to Indian non veg dishes");
                    System.out.println("Indian non veg dishes names and their Rs...");
                    System.out.println("1.chicken rise   \t\t\t110");
                    System.out.println("2.chicken kabab  \t\t\t110");
                    System.out.println("3.fried chicken  \t\t\t110");
                    System.out.println("4.chicken tikka  \t\t\t150");
                    System.out.println("5.family chicken \t\t\t150");
                    System.out.println("6.roti chicke    \t\t\t180");
                    System.out.println("7.nuddlis chicken\t\t\t180");
                    System.out.println("8.chilli chicken \t\t\t180");
                    System.out.println("9.Chilli chicken \t\t\t120");
                    System.out.println("10.dalrise rise  \t\t\t120");
                    while (choice.equalsIgnoreCase("y")) {
                        System.out.println("choose your choice from the about list by enter the numbers");
                        vfd= sc.nextInt();
                        System.out.println("Enter how many plats  non veg starters you want");
                        tvfd = sc.nextInt();
                        if (vfd >= 1 && vfd <= 3)
                            amount = tvfd * 110;
                        if (vfd == 4 || tvfd == 5)
                            amount = tvfd * 150;
                        if (vfd >= 6 && vfd <= 8)
                            amount = tvfd * 180;
                        if (vfd == 9 || vfd == 10)
                            amount = tvfd * 120;
                        tamt = tamt + amount;
                        System.out.println("your amount=" + tamt);
                        System.out.println("do you want to place one more order by press y or n");
                        choice = sc.next();
                    }


                }
                if (str.equalsIgnoreCase("c")){
                    System.out.println("Welcome to China non veg dishes ");
                    System.out.println("china non veg dishes and their cost in Rs...");
                    System.out.println("1.chicken-1    \t\t\t110");
                    System.out.println("2.chicken-2    \t\t\t110");
                    System.out.println("3.chicken-3    \t\t\t110");
                    System.out.println("4.chicken-4    \t\t\t150");
                    System.out.println("5.chicken-5    \t\t\t150");
                    System.out.println("6.chicken-6    \t\t\t150");
                    System.out.println("7.chicken-7    \t\t\t190");
                    System.out.println("8.chicken-8    \t\t\t190");
                    System.out.println("9.chicken-9    \t\t\t190");
                    System.out.println("10.chicken-10  \t\t\t200");
                    while (choice.equalsIgnoreCase("y")) {
                        System.out.println("choose your main stream non veg dishes from the above list by click number");
                        c = sc.nextInt();
                        System.out.println("enter how many plates do you want to order ");
                        tc = sc.nextInt();
                        if (c >= 1 && c <= 3)
                            amount = tc * 110;
                        if (c >= 4 && c <= 6)
                            amount = tc * 150;
                        if (c >= 7 && c <= 9)
                            amount = tc * 190;
                        if (c == 10)
                            amount = tc * 200;
                        tamt = amount + tamt;
                        System.out.println("your amount=" + tamt);
                        System.out.println("do you want to place another order then press Y or n");
                        choice = sc.next();
                    }
                }
                System.out.println("********** GRAND RESTAURANT ***********");
                System.out.println("**** Bill ******");
                System.out.println("total cost Rs.."+tamt);
                vat=Math.round(14.5/100.0*tamt);
                System.out.println("VAT=14.5%");
                System.out.println("Total VAT=Rs.."+vat);
                System.out.println("Total amount to be paid Rs..."+(vat+tamt));
                System.out.println("thank you for your visiting");
                break;
            case 3:
                System.out.println("Welcome to Indian deserts ");
                System.out.println("Enter CD for cool drinks and enter IC for ice creams ");
                str=sc.next();
                if (str.equalsIgnoreCase("cd")){
                    System.out.println("Welcome to Indian cool drinks ");
                    System.out.println("Indian cool drinks names and their  Rs");
                    System.out.println("1.laman juse        \t\t\t200");
                    System.out.println("2.pepsi             \t\t\t200");
                    System.out.println("3.thamsap           \t\t\t140");
                    System.out.println("4.maja              \t\t\t140");
                    System.out.println("5.apple juise       \t\t\t80");
                    System.out.println("6.bindhu            \t\t\t80");
                    System.out.println("7.water             \t\t\t30");
                    System.out.println("8.soop              \t\t\t50");
                    System.out.println("9.fruts drinks      \t\t\t50");
                    System.out.println("10.staberry         \t\t\t50");
                    while (choice.equalsIgnoreCase("Y")){
                    System.out.println("choose your choic from the above list by click any number you want..");
                    dr=sc.nextInt();
                    System.out.println("Enter how many iteams do you want  ");
                    tdr=sc.nextInt();
                    if (dr==1||dr==2)
                        amount=tdr*200;
                    if (dr==3||dr==4)
                        amount=tdr*140;
                    if (dr==5||tdr==6)
                        amount=tdr*80;
                    if (dr==7)
                        amount=tdr*30;
                    if (dr>=8&&dr<=10)
                        amount=tdr*50;
                    tamt=tamt+amount;
                        System.out.println("your amount is ="+amount);
                        System.out.println("do you want to place one more oredr then press y or n");
                        choice=sc.next();


                    }
                }
                if (str.equalsIgnoreCase("ic")){
                    System.out.println("Welcome to Indian Ice creams  ");
                    System.out.println("Indian Ice creams  names and their  Rs");
                    System.out.println("1.venal               \t\t\t200");
                    System.out.println("2.strawberry          \t\t\t200");
                    System.out.println("3.cup ice             \t\t\t140");
                    System.out.println("4.badam ice           \t\t\t140");
                    System.out.println("5.apple               \t\t\t80");
                    System.out.println("6.stick ice           \t\t\t80");
                    System.out.println("7.Ice cubes           \t\t\t30");
                    System.out.println("8.flavor              \t\t\t50");
                    System.out.println("9.cake                \t\t\t50");
                    System.out.println("10.soft ice           \t\t\t50");
                    while (choice.equalsIgnoreCase("Y")){
                        System.out.println("choose your choice from the above list by click any number you want..");
                        dr=sc.nextInt();
                        System.out.println("Enter how many items do you want  ");
                        tdr=sc.nextInt();
                        if (dr==1||dr==2)
                            amount=tdr*200;
                        if (dr==3||dr==4)
                            amount=tdr*140;
                        if (dr==5||tdr==6)
                            amount=tdr*80;
                        if (dr==7)
                            amount=tdr*30;
                        if (dr>=8&&dr<=10)
                            amount=tdr*50;
                        tamt=tamt+amount;
                        System.out.println("your amount is ="+amount);
                        System.out.println("do you want to place one more order then press y or n");
                        choice=sc.next();


                    }
                }
                System.out.println("********** GRAND RESTAURANT ***********");
                System.out.println("**** Bill ******");
                System.out.println("total cost Rs.."+tamt);
                vat=Math.round(14.5/100.0*tamt);
                System.out.println("VAT=14.5%");
                System.out.println("Total VAT=Rs.."+vat);
                System.out.println("Total amount to be paid Rs..."+(vat+tamt));
                System.out.println("thank you for your visiting");
                break;
            default:
                System.out.println("thank for visiting ***** GRAND RESTAURANT ******");
                System.out.println("you can press wrong button so you can run the program again");
                System.out.println("Invalid type of letters");

        }



    }
}
