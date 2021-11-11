package newOne;
//import java.util.*;
public class Mmm
{

public static void  main(String args[])
{
	   int arr[]= {1,2,3,4,5,6,7,7,8,8,9};
	   int search=7;
	   System.out.println((arr[search]));
	
}
  Mmm(int arr[])
  { 
	
		   int  target,mid ;
		   int start=0,index=-1;
		   int end=arr.length-1;
		   while(start<=end)
		   {
			   mid=(start+end)/2;
			    if (arr[mid]==target)
		         {
		    	   index=mid;
		       	   start=mid+1;
		         }
		        else if(arr[mid]>target)
		        {
		    	  end=mid-1;
		        }
		        else
		        {
		    	   start=mid+1;
		        }
		    	return -1;
		   }  
  }
}
