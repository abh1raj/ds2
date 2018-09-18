import java.util.*;
public class Sum
{
 public static int sumOfDigits(int num)
  {
    int sum=0;
    if (num == 0)
    return sum;
            sum = num%10 + sumOfDigits(num/10);
    return sum;
  }
 public static void main(String args[]) 
  {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter a number:");
    int num=sc.nextInt();
    int s=sumOfDigits(num);
    System.out.println("Sum = "+s);
  }
}