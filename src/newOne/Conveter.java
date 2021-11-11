package newOne;

import java.util.Scanner;

public class Conveter
{//1
  public static void main (String arg[])
  {//2
       Scanner sc=new Scanner(System.in);
       int choose = 0;
       
       System.out.println("....Welcome..... \n Plzz Enter Your Choice");
       System.out.println("1. Currency Convertsion \n 2.Distance Conversion \n 3.Time Conversion");
       choose=sc.nextInt();
  switch(choose)
{//3
  case 1:
  {
	  int chooseInr = 0;
	  System.out.println("You Choose Currency Conversion");
	  System.out.println("Choose the Which Amount to Convert");
	  System.out.println("1.Doller TO INR \n 2.Euro To INR \n 3.Yen To INR");
	  chooseInr=sc.nextInt();
  switch(chooseInr)
	  {
	  case 1:
	      {
	    	  double AmountConvert=0.0;
	    	  double doller=0.0;
	    	  double todayRate=0.0;
	    	  System.out.println("User Choose  Doller to INR Conversion");
	    	  System.out.println("Enter the Total Doller You Want To Convert ");
	    	  doller = sc.nextDouble();
	    	  System.out.println("Enter the today's Rate Per Doller");
	    	  todayRate=sc.nextDouble();
	    	  AmountConvert = todayRate*doller;
	    	  System.out.println("user Amount in INR :"+AmountConvert);
	    	  break;
	      } 
	  case 2:
	      {

		    	  double AmountConvert=0.0;
		    	  double Euro=0.0;
		    	  double todayRate=0.0;
		    	  System.out.println("User Choose  Euro to INR Conversion");
		    	  System.out.println("Enter the Total Euro You Want To Convert ");
		    	  Euro = sc.nextDouble();
		    	  System.out.println("Enter the today's Rate Per Euro");
		    	  todayRate=sc.nextDouble();
		    	  AmountConvert = todayRate*Euro;
		    	  System.out.println("user Amount in INR :"+AmountConvert);
		    	  break;
	       }
	  case 3:
	       {
	    	      double AmountConvert=0.0;
		    	  double Yen=0.0;
		    	  double todayRate=0.0;
		    	  System.out.println("User Choose  Yen to INR Conversion");
		    	  System.out.println("Enter the Total Yen You Want To Convert ");
		    	  Yen = sc.nextDouble();
		    	  System.out.println("Enter the today's Rate Per Yen");
		    	  todayRate=sc.nextDouble();
		    	  AmountConvert = todayRate*Yen;
		    	  System.out.println("user Amount in INR :"+AmountConvert);
		    	  break;
	       }
		 
      default :
           {
	   	      System.out.println("You are Choosing the Worng Distination...Plzz Try Agin ");
           }
         
     }
      break;
  }
 case 2:
 {
	 int chooseKm = 0;
	 System.out.println("You Choose Distance Conversion");
	 System.out.println("Choose the Which KM to Convert");
	 System.out.println("1.Meter to KM \n 2.Miles to KM");
	 chooseKm=sc.nextInt();
	 switch(chooseKm)
	 {
	 case 1:
	      {
	    	  double meter=0.0;
	    	  double Km=0.0;  
	  	      System.out.println("user Choose Meter to KM Conversion");
	  	      System.out.println("Enter the NO. Meter to Convert in KM ");
	  	      meter=sc.nextDouble();
	  	      Km=meter*0.001;
	  	      System.out.println("Meter To KM COnversion is :"+Km);
	  	      break;
	      }
	 case 2:
     {
   	      double mile=0.0;
   	      double Km=0.0;  
 	      System.out.println("user Choose mile to KM Conversion");
 	      System.out.println("Enter the NO. mile to Convert in KM ");
 	      mile=sc.nextDouble();
 	      Km=mile*0.001;
 	      System.out.println("mile To KM COnversion is :"+Km);
 	      break;   
	 }
     default :
     {
 	   	      System.out.println("You are Choosing the Worng Distination...Plzz Try Agin ");
     }
   }
	 break;
 }
 case 3:
 {
	 int chooseTime = 0 ;
	 System.out.println("You choose Hour Conversion");
	 System.out.println("Choose the Which Hour to Convert");
	 System.out.println("1.Minutes \n 2.Second");
	 chooseTime=sc.nextInt();
	 switch(chooseTime)
	 {
	 case 1:
	      {
	    	    double minutes=0.0;
	            double hour=0.0; 
		        System.out.println("You are choosing the Hour to Minutes Conversion");
	  	   	    System.out.println("Enter the no.of Hour you want to Convert in Minutes");
	  	   	    hour=sc.nextDouble();
	  	   	    minutes=hour*60;
	  	   	    System.out.println(" The minutes is"+minutes);
	  	   	    break;
		   }
	 case 2:
           {
   	            double second=0.0;
                double hour=0.0; 
	            System.out.println("You are choosing the Hour to seconds Conversion");
 	   	        System.out.println("Enter the no.of Hour you want to Convert in Minutes");
 	   	        hour=sc.nextDouble();
 	   	        second=hour*60*60;
 	   	        System.out.println(" The Seconds is"+second);
 	   	        break;
	       }
     default :
           {
 	   	        System.out.println("You are Choosing the Worng Distination...Plzz Try Agin ");
           }     
     
     }
	 break;
 }
	 
	 
default :
     {
	  	      System.out.println("You are Choosing the Worng Distination...Plzz Try Agin ");
      }
}
  sc.close();
  System.out.println("\n!........Thank You..........!");
}
}