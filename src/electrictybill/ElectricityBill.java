package electrictybill;


import java.util.*;
import java.io.*;
public class ElectricityBill
{
    public static void main(String[] args)
     {
          int consumerNo ;//consumerName[50], Month[12];
          String  consumerName, Month;
          long PrevReading;
          long currentReading;
          long totalunit=0;
          double totalAmount=0;
          int Choose = 0;
          Scanner sc = new Scanner(System.in);
          {
          System.out.println("Select the Type of User \n Press'1' for 'Domestic' \n Press '2' for 'Commerical' User");
          Choose = sc.nextInt();
          switch(Choose)
          {
           case 1:
        	       System.out.println("   You are Domestic User!!!\n");
                   System.out.println("Enter Your Name::");
                   consumerName=sc.next();
                   System.out.print(consumerName);
                   System.out.println("  Enter the EB Number::");
                   consumerNo=sc.nextInt();
                   System.out.print(consumerName);
                   System.out.println("  Enter the Paying Month :: ");
                   Month=sc.next();
                   System.out.println("Enter the Previous Month Reading as Units ::");
                   PrevReading=sc.nextLong();
                   System.out.println("  Enter the Current Month Reading as Units ::");
                   currentReading=sc.nextLong();
                   {
                      totalunit=currentReading+PrevReading;
                   }
                   if(totalunit<=100)
                   {
                      totalAmount=totalunit*1;
                   }
                   else if(totalunit<=200)
                   {
                      totalAmount=(100*1+(totalunit-100)*2.50);
                   }
                   else if(totalunit<=500)
                   {
                      totalAmount=(100*1+100*2.50+(totalunit-200)*4);
                   }
                   else if(totalunit>500)
                   {
                      totalAmount=(100*1+100+100*2.50+300*4+(totalunit-500)*6);
                   }
                   else
                   {
                      System.out.println("You Choose Wrong Distination");
                   }
                   System.out.println("consumer Name:   \n"+consumerName);
                   System.out.println("consumer Name:   \n"+consumerNo);
                   System.out.println("Previous units::\n"+PrevReading);
                   System.out.println("Current units ::\n"+currentReading);
                   System.out.println("Total No. of Unit Used:\n"+totalunit);
                   System.out.println("pay Amount      :"+totalAmount);
                   System.out.println("!.........Thank You..........!");
                   break;
               
            case 2:{ 
        	       System.out.println("You are Domestic User\n");
                   System.out.println("Enter Your Name:");
                   consumerName=sc.next();
                   System.out.print(consumerName);
                   System.out.println("  Enter the EB Number:");
                   consumerNo=sc.nextInt();
                   System.out.print(consumerName);
                   System.out.println("  Enter the Paying Month ");
                   Month=sc.next();
                   System.out.println("Enter the Previous Month Reading as Units");
                   PrevReading=sc.nextLong();
                   System.out.println("Enter the Current Month Reading as Units");
                   currentReading=sc.nextLong();
                   {
                      totalunit=currentReading+PrevReading;
                   }
                   if(totalunit<=100)
                   {
                      totalAmount=totalunit*2;
                   }
                   else if(totalunit<=200)
                   {
                      totalAmount=(100*2+(totalunit-100)*4.50);
                   }
                   else if(totalunit<=500)
                   {
                      totalAmount=(100*2+100*4.50+(totalunit-200)*6);
                   }
                   else if(totalunit>500)
                   {
                      totalAmount=(100*2+100*4.50+300*6+(totalunit-500)*7);
                   }
                   else
                   {
                      System.out.println("You Choose Wrong Distination");
                   }
                   System.out.println("consumer Name:   \n"+consumerName);
                   System.out.println("consumer Name:   \n"+consumerNo);
                   System.out.println("Previous units::\n"+PrevReading);
                   System.out.println("Current units ::\n"+currentReading);
                   System.out.println("Total No. of Unit Used:\n"+totalunit);
                   System.out.println("pay Amount      :"+totalAmount);
                   System.out.println("!.........Thank You..........!");
                   break;
                   }
        default :
                    {	
                       System.out.println("You are Choosing the Wrong Distination PlZZ Try Agin");
                    }
                 }
          sc.close();
             }     
}
}                