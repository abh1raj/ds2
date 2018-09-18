import java.util.*;
public class Pwr
 {
   public static int power(int x, int y) 
    { 
        if (y == 0) 
            return 1; 
        else if (y % 2 == 0) 
            return power(x, y / 2) * power(x, y / 2); 
        else
            return x * power(x, y / 2) * power(x, y / 2); 
    } 
  public static void main(String args[])
   {
	Scanner sc=new Scanner(System.in);
	int x,y;
	System.out.print("Enter 2 no.:");
	x=sc.nextInt();
	y=sc.nextInt();
	System.out.print("Result:"+ power(x, y));

   }
 }

  
   