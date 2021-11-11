package mypack;
import java.util.*;
class myClass {

	public static void main(String[] args)
	{
	   Scanner sc=new Scanner(System.in);
	   String word1=sc.nextLine();
	   String word2=sc.nextLine();
	   if(word1.compareTo(word2)>0)
	   {
		   System.out.println("word1 is greater");
	   }
	   if(word1.compareTo(word2)<0)
	   {
		   System.out.println("word2 is greater");
	   }

	}

}
