import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.concurrent.TimeUnit;

class buycar
{
     String company;
    String carprice;
    String carmodel;
    String carcolor;
    String carmake;
    String cartransmission;
   
    void company(String str)
    {
        company=str;
       
       
       
    }
    void carprice(String str)
    {
        carprice=str;
       
    }
    void carmodel(String str)
    {
        carmodel=str;
    }
    void carcolor(String str)
    {
        carcolor=str;
       
    }
    void carmake(String str)
    {
        carmake=str;
    }
    void cartransmission(String str)
    {
       
        cartransmission=str;
    }
   
}

abstract class car
{
    abstract void nameofp();
    abstract void contact();
    abstract void company();
    abstract void carprice();
    abstract void carmodel();
    abstract void carcolor();
    abstract void carmake();
    abstract void cartransmission();
   
   
}

class sell extends car
{
    Scanner scan=new Scanner(System.in);
    String nameofp;
    String contact;
    String company;
    String carprice;
    String carmodel;
    String carcolor;
    String carmake;
    String cartransmission;
   
    void nameofp()
    {
        System.out.println("\tENTER YOUR NAME:");
        nameofp=scan.next();
    }
    void contact()
    {
        System.out.println("\tENTER YOUR CONTACT DETAILS");
        contact=scan.next();
    }
   
    void company()
    {
        System.out.println("\tENTER THE COMPANY OF YOUR CAR");
        company=scan.next();
       
       
       
    }
    void carprice()
    {
        System.out.println("\tENTER THE PRICE OF YOUR CAR");
        carprice=scan.next();
       
    }
    void carmodel()
    {
        System.out.println("\tENTER THE MODEL NAME OF YOUR CAR");
        carmodel=scan.next();
       
    }
    void carcolor()
    {
        System.out.println("\tENTER THE COLOR OF YOUR CAR");
        carcolor=scan.next();
       
    }
    void carmake()
    {
        System.out.println("\tENTER THE YEAR OF MAKING OF YOUR CAR");
        carmake=scan.next();
       
    }
    void cartransmission()
    {
        System.out.println("\tENTER THE TRANSMISSION-TYPE OF YOUR CAR");
        cartransmission=scan.next();
       
    }
    void scancar()
    {
       
        File fi=new File("car.txt");
        try {
            fi.createNewFile();
        } catch (IOException ex) {
            System.out.println("An unexpected error has occured in the file.");
           
        }
        try {
            FileWriter fw=new FileWriter("car.txt",true);
           fw.append(nameofp);
           fw.append("\n");
           fw.append(contact);
           fw.append("\n");
           fw.append(company);
           fw.append("\n");
           fw.append(carmake);
           fw.append("\n");
           
           fw.append(carmodel);
           fw.append("\n");
            fw.append(cartransmission);
           fw.append("\n");
           fw.append(carcolor);
           fw.append("\n");
           fw.append(carprice);
           fw.append("\n");
           
         
           
           fw.close();
           
           
           
                   
        } catch (IOException ex) {
            System.out.println("An unexpected error has occured in the file.");
           
        }
       
    }
   
   
}



public class oopsinnovativenew {

   
    @SuppressWarnings("empty-statement")
    public static void main(String args[]) throws InterruptedException {
       
        Scanner scan=new Scanner(System.in);
        String px;
        String nx;
        int nou=0;
        System.out.print("\n\n\n");
        System.out.println("---------------------------------------_________________-------------------------------------");
        System.out.println("                                       |               |");
        System.out.println("                                 ______|               |_____");
        System.out.println("-  -------    --------    ------|          CARWORLD         |------  -----  ------     ------");
        System.out.println("                                |                           |");
        System.out.println("                                |___________________________|");
        System.out.println("---------------------------------------------------------------------------------------------");
        buycar cartobuy=new buycar();
       
       
       
       
        sell[] carsell=new sell[3];
        for(int i=0;i<3;i++)
        {
            carsell[i]=new sell();
        }
        int s=0;
        for(int i=0;;i++)
        {
            int menu;
           System.out.println("\n\n*****************************************************************************************************\n");
           System.out.println("****************************************************MAIN MENU****************************************");
            System.out.println("\n\tENTER 1 TO BUY CARS.\n\tENTER 2 TO LOGIN TO YOUR SELLER'S ACCOUNT AND CHECK YOUR STATUS\n\tENTER 3 TO TERMINATE THIS PROGRAM\n\t");
            menu=scan.nextInt();
            if(menu==1)
            {
                int buymenu;
                System.out.println("**************************************************************************************************************");
                System.out.println("\tENTER 1 TO BUY A BRAND NEW CAR\n\tENTER 2 to BUY A SECOND HAND AFFORDABLE CAR\n\t");
                buymenu=scan.nextInt();
               
                if(buymenu==1)
                {
                    System.out.println("\tBELOW ARE THE BRAND NEW CARS WE OWN. DO HAVE A LOOK.\n");
                    File cs=new File("scannedcar.txt");
                    System.out.println("Index\t\tCompany\t\tMake\t\tModel\t\tTransmission Type\tColor\t\tPrice\n");
                    try {
                       
                        Scanner scannedcar=new Scanner(cs);
                        int a=0;
                        while(scannedcar.hasNextLine())
                        {
                            if(a%7==0)
                            {
                                System.out.println();
                            }
                        String scline=scannedcar.nextLine();
                        System.out.print(scline+"\t\t");
                        a++;
                       
                        }
                       
                        search:
                        {
                        int ctb;
                       
                        System.out.println("\n\n\tENTER THE INDEX NUMBER OF THE CAR YOU WANT TO BUY.\n");
                        System.out.println("\tENTER 0 IF YOU DON'T WANT TO BUY ANY OF THESE CARS.\n\t");
                        ctb=scan.nextInt();
                        Scanner scannedcar2=new Scanner(cs);
                        String str;
                     
                        if(ctb==1)
                        {
                            a=1;
                           
                            for(int j=0;;j++)
                            {
                                if(j!=a)
                                {
                                    str=scannedcar2.nextLine();
                                }
                                if(j==a)
                                {
                                    str=scannedcar2.nextLine();
                                    cartobuy.company(str);
                                    j++;
                                }
                                if(j==a+1)
                                {
                                    str=scannedcar2.nextLine();
                                    cartobuy.carmake(str);
                                    j++;
                                }
                                if(j==a+2)
                                {
                                    str=scannedcar2.nextLine();
                                    cartobuy.carmodel(str);
                                    j++;
                                }
                                if(j==a+3)
                                {
                                    str=scannedcar2.nextLine();
                                    cartobuy.cartransmission(str);
                                    j++;
                                }
                                if(j==a+4)
                                {
                                    str=scannedcar2.nextLine();
                                    cartobuy.carcolor(str);
                                    j++;
                                }
                                if(j==a+5)
                                {
                                    str=scannedcar2.nextLine();
                                    cartobuy.carprice(str);
                                    j++;
                                    break;
                                }
                            }      
                           
                        }
                        else if(ctb==2)
                        {
                            a=8;
                           
                            for(int j=0;;j++)
                            {
                                 if(j!=a)
                                {
                                    str=scannedcar2.nextLine();
                                }
                                if(j==a)
                                {
                                    str=scannedcar2.nextLine();
                                    cartobuy.company(str);
                                    j++;
                                }
                                if(j==a+1)
                                {
                                    str=scannedcar2.nextLine();
                                    cartobuy.carmake(str);
                                    j++;
                                }
                                if(j==a+2)
                                {
                                    str=scannedcar2.nextLine();
                                    cartobuy.carmodel(str);
                                    j++;
                                }
                                if(j==a+3)
                                {
                                    str=scannedcar2.nextLine();
                                    cartobuy.cartransmission(str);
                                    j++;
                                }
                                if(j==a+4)
                                {
                                    str=scannedcar2.nextLine();
                                    cartobuy.carcolor(str);
                                    j++;
                                }
                                if(j==a+5)
                                {
                                    str=scannedcar2.nextLine();
                                    cartobuy.carprice(str);
                                    j++;
                                    break;
                                }
                            }    
                        }
                        else if(ctb==3)
                        {
                            a=15;
                           
                            for(int j=0;;j++)
                            {
                                if(j!=a)
                                {
                                    str=scannedcar2.nextLine();
                                }
                                if(j==a)
                                {
                                    str=scannedcar2.nextLine();
                                    cartobuy.company(str);
                                    j++;
                                }
                                if(j==a+1)
                                {
                                    str=scannedcar2.nextLine();
                                    cartobuy.carmake(str);
                                    j++;
                                }
                                if(j==a+2)
                                {
                                    str=scannedcar2.nextLine();
                                    cartobuy.carmodel(str);
                                    j++;
                                }
                                if(j==a+3)
                                {
                                    str=scannedcar2.nextLine();
                                    cartobuy.cartransmission(str);
                                    j++;
                                }
                                if(j==a+4)
                                {
                                    str=scannedcar2.nextLine();
                                    cartobuy.carcolor(str);
                                    j++;
                                }
                                if(j==a+5)
                                {
                                    str=scannedcar2.nextLine();
                                    cartobuy.carprice(str);
                                    j++;
                                    break;
                                }
                            }    
                        }
                        else if(ctb==4)
                        {
                            a=22;
                           
                            for(int j=0;;j++)
                            {
                                if(j!=a)
                                {
                                    str=scannedcar2.nextLine();
                                }
                                if(j==a)
                                {
                                    str=scannedcar2.nextLine();
                                    cartobuy.company(str);
                                    j++;
                                }
                                if(j==a+1)
                                {
                                    str=scannedcar2.nextLine();
                                    cartobuy.carmake(str);
                                    j++;
                                }
                                if(j==a+2)
                                {
                                    str=scannedcar2.nextLine();
                                    cartobuy.carmodel(str);
                                    j++;
                                }
                                if(j==a+3)
                                {
                                    str=scannedcar2.nextLine();
                                    cartobuy.cartransmission(str);
                                    j++;
                                }
                                if(j==a+4)
                                {
                                    str=scannedcar2.nextLine();
                                    cartobuy.carcolor(str);
                                    j++;
                                }
                                if(j==a+5)
                                {
                                    str=scannedcar2.nextLine();
                                    cartobuy.carprice(str);
                                    j++;
                                    break;
                                }
                            }    
                        }
                        else if(ctb==5)
                        {
                            a=29;
                           
                            for(int j=0;;j++)
                            {
                                 if(j!=a)
                                {
                                    str=scannedcar2.nextLine();
                                }
                                if(j==a)
                                {
                                    str=scannedcar2.nextLine();
                                    cartobuy.company(str);
                                    j++;
                                }
                                if(j==a+1)
                                {
                                    str=scannedcar2.nextLine();
                                    cartobuy.carmake(str);
                                    j++;
                                }
                                if(j==a+2)
                                {
                                    str=scannedcar2.nextLine();
                                    cartobuy.carmodel(str);
                                    j++;
                                }
                                if(j==a+3)
                                {
                                    str=scannedcar2.nextLine();
                                    cartobuy.cartransmission(str);
                                    j++;
                                }
                                if(j==a+4)
                                {
                                    str=scannedcar2.nextLine();
                                    cartobuy.carcolor(str);
                                    j++;
                                }
                                if(j==a+5)
                                {
                                    str=scannedcar2.nextLine();
                                    cartobuy.carprice(str);
                                    j++;
                                    break;
                                }
                            }    
                        }
                        else if(ctb==6)
                        {
                            a=36;
                           
                            for(int j=0;;j++)
                            {
                                 if(j!=a)
                                {
                                    str=scannedcar2.nextLine();
                                }
                                if(j==a)
                                {
                                    str=scannedcar2.nextLine();
                                    cartobuy.company(str);
                                    j++;
                                }
                                if(j==a+1)
                                {
                                    str=scannedcar2.nextLine();
                                    cartobuy.carmake(str);
                                    j++;
                                }
                                if(j==a+2)
                                {
                                    str=scannedcar2.nextLine();
                                    cartobuy.carmodel(str);
                                    j++;
                                }
                                if(j==a+3)
                                {
                                    str=scannedcar2.nextLine();
                                    cartobuy.cartransmission(str);
                                    j++;
                                }
                                if(j==a+4)
                                {
                                    str=scannedcar2.nextLine();
                                    cartobuy.carcolor(str);
                                    j++;
                                }
                                if(j==a+5)
                                {
                                    str=scannedcar2.nextLine();
                                    cartobuy.carprice(str);
                                    j++;
                                    break;
                                }
                            }    
                        }
                        else if(ctb==7)
                        {
                            a=43;
                           
                            for(int j=0;;j++)
                            {
                                 if(j!=a)
                                {
                                    str=scannedcar2.nextLine();
                                }
                                if(j==a)
                                {
                                    str=scannedcar2.nextLine();
                                    cartobuy.company(str);
                                    j++;
                                }
                                if(j==a+1)
                                {
                                    str=scannedcar2.nextLine();
                                    cartobuy.carmake(str);
                                    j++;
                                }
                                if(j==a+2)
                                {
                                    str=scannedcar2.nextLine();
                                    cartobuy.carmodel(str);
                                    j++;
                                }
                                if(j==a+3)
                                {
                                    str=scannedcar2.nextLine();
                                    cartobuy.cartransmission(str);
                                    j++;
                                }
                                if(j==a+4)
                                {
                                    str=scannedcar2.nextLine();
                                    cartobuy.carcolor(str);
                                    j++;
                                }
                                if(j==a+5)
                                {
                                    str=scannedcar2.nextLine();
                                    cartobuy.carprice(str);
                                    j++;
                                    break;
                                }
                            }    
                        }
                        else if(ctb==8)
                        {
                            a=50;
                           
                            for(int j=0;;j++)
                            {
                                if(j!=a)
                                {
                                    str=scannedcar2.nextLine();
                                }
                                if(j==a)
                                {
                                    str=scannedcar2.nextLine();
                                    cartobuy.company(str);
                                    j++;
                                }
                                if(j==a+1)
                                {
                                    str=scannedcar2.nextLine();
                                    cartobuy.carmake(str);
                                    j++;
                                }
                                if(j==a+2)
                                {
                                    str=scannedcar2.nextLine();
                                    cartobuy.carmodel(str);
                                    j++;
                                }
                                if(j==a+3)
                                {
                                    str=scannedcar2.nextLine();
                                    cartobuy.cartransmission(str);
                                    j++;
                                }
                                if(j==a+4)
                                {
                                    str=scannedcar2.nextLine();
                                    cartobuy.carcolor(str);
                                    j++;
                                }
                                if(j==a+5)
                                {
                                    str=scannedcar2.nextLine();
                                    cartobuy.carprice(str);
                                    j++;
                                    break;
                                }
                            }    
                        }
                        else if(ctb==9)
                        {
                            a=57;
                           
                           
                            for(int j=0;;j++)
                            {
                                if(j!=a)
                                {
                                    str=scannedcar2.nextLine();
                                }
                                if(j==a)
                                {
                                    str=scannedcar2.nextLine();
                                    cartobuy.company(str);
                                    j++;
                                }
                                if(j==a+1)
                                {
                                    str=scannedcar2.nextLine();
                                    cartobuy.carmake(str);
                                    j++;
                                }
                                if(j==a+2)
                                {
                                    str=scannedcar2.nextLine();
                                    cartobuy.carmodel(str);
                                    j++;
                                }
                                if(j==a+3)
                                {
                                    str=scannedcar2.nextLine();
                                    cartobuy.cartransmission(str);
                                    j++;
                                }
                                if(j==a+4)
                                {
                                    str=scannedcar2.nextLine();
                                    cartobuy.carcolor(str);
                                    j++;
                                }
                                if(j==a+5)
                                {
                                    str=scannedcar2.nextLine();
                                    cartobuy.carprice(str);
                                    j++;
                                    break;
                                }
                            }    
                        }
                        else if(ctb==10)
                        {
                            a=64;
                           
                            for(int j=0;;j++)
                            {
                                if(j!=a)
                                {
                                    str=scannedcar2.nextLine();
                                }
                                if(j==a)
                                {
                                    str=scannedcar2.nextLine();
                                    cartobuy.company(str);
                                    j++;
                                }
                                if(j==a+1)
                                {
                                    str=scannedcar2.nextLine();
                                    cartobuy.carmake(str);
                                    j++;
                                }
                                if(j==a+2)
                                {
                                    str=scannedcar2.nextLine();
                                    cartobuy.carmodel(str);
                                    j++;
                                }
                                if(j==a+3)
                                {
                                    str=scannedcar2.nextLine();
                                    cartobuy.cartransmission(str);
                                    j++;
                                }
                                if(j==a+4)
                                {
                                    str=scannedcar2.nextLine();
                                    cartobuy.carcolor(str);
                                    j++;
                                }
                                if(j==a+5)
                                {
                                    str=scannedcar2.nextLine();
                                    cartobuy.carprice(str);
                                    j++;
                                    break;
                                }
                               
                            }    
                        }
                        if(ctb!=0)
                        {
                            System.out.println("**************************************************************************************************************");
                        System.out.println("\tTHE DETAILS OF THE CAR YOU HAVE OPTED TO BUY ARE:\n");
                        System.out.println("\t"+cartobuy.company+" "+cartobuy.carmodel);
                        System.out.println("\tYEAR:-"+cartobuy.carmake);
     
                        System.out.println("\tTRANSMISSION:-"+cartobuy.cartransmission);
                        System.out.println("\tCOLOR:-"+cartobuy.carcolor);
                        System.out.println("---------------------------------");
                        System.out.println("\n\tPRICE:-Rs "+cartobuy.carprice);
                        System.out.println("---------------------------------");
                        System.out.println("\t\n\tENTER 1 TO CONFIRM YOUR PURCHASE");
                        System.out.println("\tENTER 2 TO GO BACK");
                       
                        int k=scan.nextInt();
                       
                        if(k==1)
                        {
                           
                            while(true)
                          {
                              System.out.println("**************************************************************************************************************");
                            System.out.println("\tENTER YOUR NAME:-");
                            String n1=scan.nextLine();
                            n1=scan.nextLine();
                            System.out.println("\tENTER YOUR PHONE NUMBER:-");
                            String pn=scan.nextLine();
                            System.out.println("\tENTER YOUR DELIVERY ADDRESS:-");
                           String address=scan.nextLine();
                           System.out.println("\tTHE DETAILS ENTERED ARE:-");
                           System.out.println("\n\tNAME:- "+n1);
                           System.out.println("\tCONTACT NUMBER:- "+pn);
                           System.out.println("\tADDRESS:- "+address);
                           System.out.println("\n\tENTER 1 TO PROCEED");
                           System.out.println("\tENTER 2 TO REENTER DETAILS");
                           int k2=scan.nextInt();
                           if(k2==1)
                           {
                               System.out.println("**************************************************************************************************************");
                               System.out.println("\tPLEASE WAIT FOR THE TRANSACTION TO PROCEED.........");
                               System.out.println("\tPROCESSING..........");
                               TimeUnit.SECONDS.sleep(3);
                                System.out.println("\n\tYOUR CAR WOULD BE DELIVERED TO YOUR ADDRESS SOON ");
                                System.out.println("\n\tTHANK YOU FOR USING CARWORLD! WE HOPE TO SEE YOU AGAIN!");
                                return;
                           }
                           else
                           {
                               continue;
                           }
                            }
                            }
                        }
                        else
                        {
                            break search;
                       
                        }
                        }
                   
                    }
                    catch (FileNotFoundException ex) {
                       System.out.println("An unexpected error has occured in the file.");
                    }
                   
                   
                   
                           
                }
                else if(buymenu==2)
                {
                   
                    System.out.println("BELOW ARE THE SECOND HAND CARS WE HAVE GOT. IF THE LIST IS EMPTY THEN NO SELLER HAS SOLD HIS CAR.\n");
                    System.out.println("Index   Name\t          Contact\t\tCompany\t\tMake\t\tModel\t\tTransmission Type\tColor\t\tPrice\n");
                    File scar=new File("car.txt");
                    try {
                       
                        Scanner scannedcar=new Scanner(scar);
                        int a=0;
                        int index=1;
                        while(scannedcar.hasNextLine())
                        {
                            if(a%8==0)
                            {
                                System.out.print("\n");
                                System.out.print(index+"     ");
                                index++;
                            }
                        String scline=scannedcar.nextLine();
                        System.out.print(scline+"\t\t");
                        a++;
                       
                        }
                        
                        System.out.println("\n\tENTER THE INDEX OF THE CAR YOU WANT TO BUY\n\tENTER 0 TO NOT BUY ANY OF THSESE CARS.\n\t");
                        index=scan.nextInt();
                        if(index==0)
                        {
                           
                        }
                        else if(index==1)
                        {
                             File cs=new File("car.txt");
                             Scanner scannedcar2=new Scanner(cs);
                             String str;
                            int b=0;
                             for(int j=0;;j++)
                            {
                                if(j!=b+1)
                                {
                                    str=scannedcar2.nextLine();
                                }
                                if(j==b+2)
                                {
                                    str=scannedcar2.nextLine();
                                    cartobuy.company(str);
                                    j++;
                                }
                                if(j==b+3)
                                {
                                    str=scannedcar2.nextLine();
                                    cartobuy.carmake(str);
                                    j++;
                                }
                                if(j==b+4)
                                {
                                    str=scannedcar2.nextLine();
                                    cartobuy.carmodel(str);
                                    j++;
                                }
                                if(j==b+5)
                                {
                                    str=scannedcar2.nextLine();
                                    cartobuy.cartransmission(str);
                                    j++;
                                }
                                if(j==b+6)
                                {
                                    str=scannedcar2.nextLine();
                                    cartobuy.carcolor(str);
                                    j++;
                                }
                                if(j==b+7)
                                {
                                    str=scannedcar2.nextLine();
                                    cartobuy.carprice(str);
                                    j++;
                                    break;
                                }
                               
                            }
                             System.out.println("**************************************************************************************************************");
                           
                              System.out.println("\tTHE DETAILS OF THE CAR YOU HAVE OPTED TO BUY ARE:\n");
                        System.out.println("\t"+cartobuy.company+" "+cartobuy.carmodel);
                        System.out.println("\tYEAR:-"+cartobuy.carmake);
     
                        System.out.println("\tTRANSMISSION:-"+cartobuy.cartransmission);
                        System.out.println("\tCOLOR:-"+cartobuy.carcolor);
                        System.out.println("---------------------------------");
                        System.out.println("\n\tPRICE:-Rs "+cartobuy.carprice);
                        System.out.println("---------------------------------");
                       System.out.println("**************************************************************************************************************");
                         System.out.println("\t\n\tENTER 1 IF YOU WISH TO CONFIRM THIS PURCHASE");
                        System.out.println("\tENTER 2 TO GO BACK");
                       
                        int g2=scan.nextInt();
                       
                        if(g2==1)
                        {
                           
                            while(true)
                          {
                              System.out.println("**************************************************************************************************************");
                            System.out.println("\tENTER YOUR NAME:");
                            nx=scan.nextLine();
                            nx=scan.nextLine();
                            System.out.println("\tENTER YOUR PHONE NUMBER");
                            px=scan.nextLine();
                           
                           System.out.println("\tTHE DETAILS YOU ENTERED ARE");
                           System.out.println("\n\tNAME: "+nx);
                           System.out.println("\tCONTACT NUMBER: "+px);
                       
                           System.out.println("\n\tENTER 1 TO CONFIRM AND PROCEED\n");
                           System.out.println("\tENTER 2 TO ENTER THE DETAILS AGAIN.\n");
                           int g3=scan.nextInt();
                           if(g3==1)
                           {
                               System.out.println("**************************************************************************************************************");
                             System.out.println("\tPLEASE WAIT FOR THE TRANSACTION TO PROCEED.........");
                               System.out.println("\tPROCESSING..........");
                               TimeUnit.SECONDS.sleep(3);
                                System.out.println("\n\tYOUR CAR WOULD BE DELIVERED TO YOUR ADDRESS SOON ");
                                System.out.println("\n\tTHANK YOU FOR USING CARWORLD! WE HOPE TO SEE YOU AGAIN!");
                              File finalptr=new File("user1.txt");
                            try {
                                FileWriter finalfw=new FileWriter(finalptr,true);
                                finalfw.append("\n"+"YOUR CAR HAS BEEN SOLD");
                                finalfw.close();
                               
                            } catch (IOException ex) {
                               System.out.println("An unexpected error has occured in the file");
                            }
                            return;
                           }
                           else
                               continue;
                           
                          }
                        }  
                       
                        else
                            break;
                       
                             
                           
                           
                        }
                        else if(index==2)
                        {
                             File cs=new File("car.txt");
                             Scanner scannedcar2=new Scanner(cs);
                             String str;
                            int b=8;
                             for(int j=0;;j++)
                            {
                                if(j!=b+1)
                                {
                                    str=scannedcar2.nextLine();
                                }
                                if(j==b+2)
                                {
                                    str=scannedcar2.nextLine();
                                    cartobuy.company(str);
                                    j++;
                                }
                                if(j==b+3)
                                {
                                    str=scannedcar2.nextLine();
                                    cartobuy.carmake(str);
                                    j++;
                                }
                                if(j==b+4)
                                {
                                    str=scannedcar2.nextLine();
                                    cartobuy.carmodel(str);
                                    j++;
                                }
                                if(j==b+5)
                                {
                                    str=scannedcar2.nextLine();
                                    cartobuy.cartransmission(str);
                                    j++;
                                }
                                if(j==b+6)
                                {
                                    str=scannedcar2.nextLine();
                                    cartobuy.carcolor(str);
                                    j++;
                                }
                                if(j==b+7)
                                {
                                    str=scannedcar2.nextLine();
                                    cartobuy.carprice(str);
                                    j++;
                                    break;
                                }
                               
                            }
                             System.out.println("**************************************************************************************************************");
                              System.out.println("\tTHE DETAILS OF THE CAR YOU HAVE OPTED TO BUY ARE:\n");
                        System.out.println("\t"+cartobuy.company+" "+cartobuy.carmodel);
                        System.out.println("\tYEAR:-"+cartobuy.carmake);
     
                        System.out.println("\tTRANSMISSION:-"+cartobuy.cartransmission);
                        System.out.println("\tCOLOR:-"+cartobuy.carcolor);
                        System.out.println("---------------------------------");
                        System.out.println("\n\tPRICE:-Rs "+cartobuy.carprice);
                        System.out.println("---------------------------------");
                       System.out.println("**************************************************************************************************************");
                         System.out.println("\t\n\tENTER 1 IF YOU WISH TO CONFIRM THIS PURCHASE");
                        System.out.println("\tENTER 2 TO GO BACK");
                       
                        int g2=scan.nextInt();
                       
                        if(g2==1)
                        {
                           
                            while(true)
                          {
                              System.out.println("**************************************************************************************************************");
                            System.out.println("\tENTER YOUR NAME:");
                            nx=scan.nextLine();
                            nx=scan.nextLine();
                            System.out.println("\tENTER YOUR PHONE NUMBER");
                            px=scan.nextLine();
                           
                           System.out.println("\tTHE DETAILS YOU ENTERED ARE");
                           System.out.println("\n\tNAME: "+nx);
                           System.out.println("\tCONTACT NUMBER: "+px);
                       
                           System.out.println("\n\tENTER 1 TO CONFIRM AND PROCEED\n");
                           System.out.println("\tENTER 2 TO ENTER THE DETAILS AGAIN.\n");
                           int g3=scan.nextInt();
                           if(g3==1)
                           {
                               System.out.println("**************************************************************************************************************");
                              System.out.println("\tPLEASE WAIT FOR THE TRANSACTION TO PROCEED.........");
                               System.out.println("\tPROCESSING..........");
                               TimeUnit.SECONDS.sleep(3);
                                System.out.println("\n\tYOUR CAR WOULD BE DELIVERED TO YOUR ADDRESS SOON ");
                                System.out.println("\n\tTHANK YOU FOR USING CARWORLD! WE HOPE TO SEE YOU AGAIN!");
                              File finalptr=new File("user2.txt");
                            try {
                                FileWriter finalfw=new FileWriter(finalptr,true);
                                finalfw.append("\n"+"YOUR CAR HAS BEEN SOLD");
                                finalfw.close();
                               
                            } catch (IOException ex) {
                               System.out.println("An unexpected error has occured in the file");
                            }
                            return;
                           }
                           else
                               continue;
                           
                          }
                        }  
                       
                        else
                            break;
                        
                             
                           
                        }
                        else if(index==3)
                        {
                            File cs=new File("car.txt");
                             Scanner scannedcar2=new Scanner(cs);
                             String str;
                            int b=16;
                             for(int j=0;;j++)
                            {
                                if(j!=b+1)
                                {
                                    str=scannedcar2.nextLine();
                                }
                                if(j==b+2)
                                {
                                    str=scannedcar2.nextLine();
                                    cartobuy.company(str);
                                    j++;
                                }
                                if(j==b+3)
                                {
                                    str=scannedcar2.nextLine();
                                    cartobuy.carmake(str);
                                    j++;
                                }
                                if(j==b+4)
                                {
                                    str=scannedcar2.nextLine();
                                    cartobuy.carmodel(str);
                                    j++;
                                }
                                if(j==b+5)
                                {
                                    str=scannedcar2.nextLine();
                                    cartobuy.cartransmission(str);
                                    j++;
                                }
                                if(j==b+6)
                                {
                                    str=scannedcar2.nextLine();
                                    cartobuy.carcolor(str);
                                    j++;
                                }
                                if(j==b+7)
                                {
                                    str=scannedcar2.nextLine();
                                    cartobuy.carprice(str);
                                    j++;
                                    break;
                                }
                               
                            }
                             System.out.println("**************************************************************************************************************");
                              System.out.println("\tTHE DETAILS OF THE CAR YOU HAVE OPTED TO BUY ARE:\n");
                        System.out.println("\t"+cartobuy.company+" "+cartobuy.carmodel);
                        System.out.println("\tYEAR:-"+cartobuy.carmake);
     
                        System.out.println("\tTRANSMISSION:-"+cartobuy.cartransmission);
                        System.out.println("\tCOLOR:-"+cartobuy.carcolor);
                        System.out.println("---------------------------------");
                        System.out.println("\n\tPRICE:-Rs "+cartobuy.carprice);
                        System.out.println("---------------------------------");
                       System.out.println("**************************************************************************************************************");
                         System.out.println("\t\n\tENTER 1 IF YOU WISH TO CONFIRM THIS PURCHASE");
                        System.out.println("\tENTER 2 TO GO BACK");
                       
                        int g2=scan.nextInt();
                       
                        if(g2==1)
                        {
                           
                            while(true)
                          {
                              System.out.println("**************************************************************************************************************");
                            System.out.println("\tENTER YOUR NAME:");
                            nx=scan.nextLine();
                            nx=scan.nextLine();
                            System.out.println("\tENTER YOUR PHONE NUMBER");
                            px=scan.nextLine();
                           
                           System.out.println("\tTHE DETAILS YOU ENTERED ARE");
                           System.out.println("\n\tNAME: "+nx);
                           System.out.println("\tCONTACT NUMBER: "+px);
                       
                           System.out.println("\n\tENTER 1 TO CONFIRM AND PROCEED\n");
                           System.out.println("\tENTER 2 TO ENTER THE DETAILS AGAIN.\n");
                           int g3=scan.nextInt();
                           if(g3==1)
                           {
                               System.out.println("**************************************************************************************************************");
                              System.out.println("\tPLEASE WAIT FOR THE TRANSACTION TO PROCEED.........");
                               System.out.println("\tPROCESSING..........");
                               TimeUnit.SECONDS.sleep(3);
                                System.out.println("\n\tYOUR CAR WOULD BE DELIVERED TO YOUR ADDRESS SOON ");
                                System.out.println("\n\tTHANK YOU FOR USING CARWORLD! WE HOPE TO SEE YOU AGAIN!");
                              
                              
                              File finalptr=new File("user3.txt");
                            try {
                                FileWriter finalfw=new FileWriter(finalptr,true);
                                finalfw.append("\n"+"YOUR CAR HAS BEEN SOLD");
                                finalfw.close();
                               
                            } catch (IOException ex) {
                               System.out.println("An unexpected error has occured in the file");
                            }
                            return;
                           }
                           else
                               continue;
                           
                          }
                        }  
                       
                        else
                            break;
                        
                             
                        }
                   
                }
                    catch(FileNotFoundException e)
                    {
                        System.out.println("An unexpected error has occured in the file.");
                    }
                   
                }
               
            }
            else if(menu==2)
            {
                for(int k=0;;k++)
                {
                    System.out.println("**************************************************************************************************************");
                System.out.println("\tENTER 1 TO CREATE A NEW ACCOUNT(FOR NEW USERS)\n\tENTER 2 TO LOGIN TO AN EXISTING ACCOUNT\n\tENTER 3 TO RETURN TO THE MAIN MENU\n\t");
                int sellmenu;
                sellmenu=scan.nextInt();
                if(sellmenu==1)
                {
                    System.out.println("**************************************************************************************************************");
                    String uname;
                    String pass;
                    System.out.println("\tENTER YOUR USERNAME:\n\t");
                    uname=scan.next();
                    System.out.println("\tENTER YOUR PASSWORD:\n\t");
                    pass=scan.next();
                   
                   
                    if(nou==0)
                    {
                       File fptr=new File("user1.txt");
                        try {
                            FileWriter fwn=new FileWriter(fptr,true);
                            nou++;
                            fwn.append(uname+"\n");
                           
                            fwn.append(pass);
                           
                            fwn.close();
                            System.out.println("\tYOUR ACCOUNT HAS BEEN SUCCESSFULLY CREATED!\n\n");
                           
                           
                           
                        } catch (IOException ex) {
                            System.out.println("Sorry an unexpected error has occured in the file");
                        }
                       
                       
                    }
                    else if(nou==1)
                    {
                       File fptr=new File("user2.txt");
                        try {
                            FileWriter fwn=new FileWriter(fptr,true);
                            nou++;
                            fwn.append(uname);
                           fwn.append("\n");
                           
                            fwn.append(pass);
                           
                            fwn.close();
                            System.out.println("\tYOUR ACCOUNT HAS BEEN SUCCESSFULLY CREATED!\n\n");
                           
                           
                           
                        } catch (IOException ex) {
                            System.out.println("Sorry an unexpected error has occured in the file");
                        }
                       
                       
                    }
                     else if(nou==2)
                    {
                       File fptr=new File("user3.txt");
                        try {
                            FileWriter fwn=new FileWriter(fptr,true);
                            nou++;
                           fwn.append(uname+"\n");
                           
                            fwn.append(pass);
                           
                            fwn.close();
                            System.out.println("\tYOUR ACCOUNT HAS BEEN SUCCESSFULLY CREATED!\n\n");
                           
                           
                           
                        } catch (IOException ex) {
                            System.out.println("Sorry an unexpected error has occured in the file");
                        }
                       
                       
                    }
                   
                }
                else if(sellmenu==3)
                {
                    break;
                }
                else if(sellmenu==2)
                {
                    String uname;
                    String pass;
                    System.out.println("**************************************************************************************************************");
                    System.out.println("\tENTER YOUR USERNAME:\n\t");
                    uname=scan.next();
                    System.out.println("\tENTER YOUR SECRET PASSWORD:\n\t");
                    pass=scan.next();
                    File fptr=new File("user1.txt");
                    try {
                        Scanner scannew=new Scanner(fptr);
                        String newstr;
                        newstr=scannew.nextLine();
                       
                       
                        if(newstr.equals(uname))
                        {
                            newstr=scannew.nextLine();
                           
                           
                           
                            if(newstr.equals(pass))
                            {
                                System.out.println("**************************************************************************************************************");
                                System.out.println("\n\tYOU HAVE SUCCESSFULLY LOGGED INTO YOUR ACCOUNT.\n\n");
                                System.out.println("\tTHE DETAILS OF THIS ACCOUNT ARE:\n");
                                System.out.println("\tUSERNAME: " +uname);
                                System.out.println("\tPASSWORD: " +pass);
                                int choice;
                                 try{
                                
                                     newstr=scannew.nextLine();
                                System.out.println("\tINBOX:-\n"+newstr);
                                
                               
                               
                                System.out.println("\tENTER 1 IF YOU WISH TO SELL A CAR\n\tENTER 2 IF YOU WANT TO LOG OUT OF YOUR ACCOUNT\n\t");
                                 choice=scan.nextInt();
                                    if(choice==2)
                                    {
                                    break;
                                    }
                                    else if(choice==1)
                                    {
                                        carsell[s].nameofp();
                                        carsell[s].contact();
                                         carsell[s].company();
                                         carsell[s].carmake();
                                        carsell[s].carmodel();
                                         carsell[s].cartransmission();
                                         carsell[s].carcolor();
                                         carsell[s].carprice();
                                         carsell[s].scancar();
                                    }
                                    else
                                    {
                                        break;
                                    }
                                break;
                                }
                                catch(Exception e)
                                {
                                    System.out.println("INBOX:\nEMPTY\n");
                                   System.out.println("\tENTER 1 IF YOU WISH TO SELL A CAR\n\tENTER 2 IF YOU WANT TO LOG OUT OF YOUR ACCOUNT\n\t");
                                    choice=scan.nextInt();
                                    if(choice==2)
                                    {
                                    break;
                                    }
                                    else if(choice==1)
                                    {
                                        carsell[s].nameofp();
                                        carsell[s].contact();
                                         carsell[s].company();
                                         carsell[s].carmake();
                                        carsell[s].carmodel();
                                         carsell[s].cartransmission();
                                         carsell[s].carcolor();
                                         carsell[s].carprice();
                                         carsell[s].scancar();
                                    }
                                    else
                                    {
                                        break;
                                    }
                                    break;
                                   
                                }
                            }
                            else
                            {
                                System.out.println("\tINCORRECT USER-ID OR PASSWORD.PLEASE TRY AGAIN\n");
                                System.out.println("**************************************************************************************************************");
                                break;
                            }
                        }
                       
                       
                       
                    } catch (FileNotFoundException ex) {
                        System.out.println("Sorry an unexpected error has occured in the file");
                    }
                      File fptr2=new File("user2.txt");
                       try {
                        Scanner scannew1=new Scanner(fptr2);
                        String newstr1;
                        newstr1=scannew1.nextLine();
                        if(newstr1.equals(uname))
                        {
                            newstr1=scannew1.nextLine();
                            if(newstr1.equals(pass))
                            {
                                System.out.println("\n\tYOU HAVE SUCCESSFULLY LOGGED INTO YOUR ACCOUNT.\n\n");
                                System.out.println("\tTHE DETAILS OF THIS ACCOUNT ARE:\n");
                                System.out.println("\tUSERNAME: " +uname);
                                System.out.println("\tPASSWORD: " +pass);
                                int choice;
                                 try{
                                newstr1=scannew1.nextLine();
                                System.out.println("INBOX:" +newstr1);
                               System.out.println("\tENTER 1 IF YOU WISH TO SELL A CAR\n\tENTER 2 IF YOU WANT TO LOG OUT OF YOUR ACCOUNT\n\t");
                                 choice=scan.nextInt();
                                    if(choice==2)
                                    {
                                    break;
                                    }
                                    else if(choice==1)
                                    {
                                        carsell[s].nameofp();
                                        carsell[s].contact();
                                         carsell[s].company();
                                         carsell[s].carmake();
                                        carsell[s].carmodel();
                                         carsell[s].cartransmission();
                                         carsell[s].carcolor();
                                         carsell[s].carprice();
                                         carsell[s].scancar();
                                    }
                                    else
                                    {
                                        break;
                                    }
                                }
                                catch(Exception e)
                                {
                                    System.out.println("INBOX:\nEMPTY\n");
                                    System.out.println("\tENTER 1 IF YOU WISH TO SELL A CAR\n\tENTER 2 IF YOU WANT TO LOG OUT OF YOUR ACCOUNT\n\t");
                                    choice=scan.nextInt();
                                    if(choice==2)
                                    {
                                    break;
                                    }
                                    else if(choice==1)
                                    {
                                        carsell[s].nameofp();
                                        carsell[s].contact();
                                         carsell[s].company();
                                         carsell[s].carmake();
                                        carsell[s].carmodel();
                                         carsell[s].cartransmission();
                                         carsell[s].carcolor();
                                         carsell[s].carprice();
                                         carsell[s].scancar();
                                    }
                                    else
                                    {
                                        break;
                                    }
                                    break;
                                }
                            }
                            else
                            {
                                System.out.println("\tINCORRECT USER-ID OR PASSWORD.PLEASE TRY AGAIN\n");
                                System.out.println("**************************************************************************************************************");
                                break;
                            }
                        }
                       
                       
                       
                    } catch (FileNotFoundException ex) {
                        System.out.println("Sorry an unexpected error has occured in the file");
                    }
                       File fptr3=new File("user3.txt");
                        try {
                        Scanner scannew2=new Scanner(fptr3);
                        String newstr2;
                        newstr2=scannew2.nextLine();
                        if(newstr2.equals(uname))
                        {
                            newstr2=scannew2.nextLine();
                            if(newstr2.equals(pass))
                            {
                                System.out.println("\n\tYOU HAVE SUCCESSFULLY LOGGED INTO YOUR ACCOUNT.\n\n");
                                System.out.println("\tTHE DETAILS OF THIS ACCOUNT ARE:\n");
                                System.out.println("\tUSERNAME: " +uname);
                                System.out.println("\tPASSWORD: " +pass);
                                int choice;
                                try{
                                newstr2=scannew2.nextLine();
                                System.out.println("INBOX:" +newstr2+"\n");
                                System.out.println("\tENTER 1 IF YOU WISH TO SELL A CAR\n\tENTER 2 IF YOU WANT TO LOG OUT OF YOUR ACCOUNT\n\t");
                                 choice=scan.nextInt();
                                    if(choice==2)
                                    {
                                    break;
                                    }
                                    else if(choice==1)
                                    {
                                        carsell[s].nameofp();
                                        carsell[s].contact();
                                         carsell[s].company();
                                         carsell[s].carmake();
                                        carsell[s].carmodel();
                                         carsell[s].cartransmission();
                                         carsell[s].carcolor();
                                         carsell[s].carprice();
                                         carsell[s].scancar();
                                    }
                                    else
                                    {
                                        break;
                                    }
                               
                                }
                                catch(Exception e)
                                {
                                    System.out.println("INBOX:\nEMPTY\n");
                                    System.out.println("\tENTER 1 IF YOU WISH TO SELL A CAR\n\tENTER 2 IF YOU WANT TO LOG OUT OF YOUR ACCOUNT\n\t");
                                    choice=scan.nextInt();
                                    if(choice==2)
                                    {
                                    break;
                                    }
                                    else if(choice==1)
                                    {
                                        carsell[s].nameofp();
                                        carsell[s].contact();
                                         carsell[s].company();
                                         carsell[s].carmake();
                                        carsell[s].carmodel();
                                         carsell[s].cartransmission();
                                         carsell[s].carcolor();
                                         carsell[s].carprice();
                                         carsell[s].scancar();
                                    }
                                    else
                                    {
                                        break;
                                    }
                                }
                               
                               
                              }
                            else
                            {
                                System.out.println("\tINCORRECT USER-ID OR PASSWORD.PLEASE TRY AGAIN\n");
                                System.out.println("**************************************************************************************************************");
                                break;
                            }
                        }
                       
                       
                       
                    } catch (FileNotFoundException ex) {
                        System.out.println("Sorry an unexpected error has occured in the file");
                    }
                   
                   
                   
                   
                   
                   
                }
                else
                {
                    System.out.println("\tPLEASE CHOOSE A CORRECT MENU OPTION TO PROCEED.\n");
                }
               
              }
               
               
               
               
            }
            else if(menu==3)
            {
                System.out.println("\tTHANKYOU FOR VISITING. WE HOPE TO SEE YOU AGAIN.\n");
                System.out.println("**************************************************************************************************************");
                break;
            }
           
           
           
       
       
       
       
       
            
       
    }
}}
