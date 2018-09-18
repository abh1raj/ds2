import java.util.*;
public class Searching {

	public static boolean search(int arr[],int num)
	{
		if(arr.length==0)
		{
			return false;
		}
		int smallArray[]=new int[arr.length-1];
		for(int i=0;i<smallArray.length;i++)
		{
			smallArray[i]=arr[i+1];
		}
		boolean smallAns=search(smallArray,num);
		if(smallAns)
		{
			return true;
		}
		else
		{
			if(arr[0]==num)
			{
				return true;
			}
			else{
				return search(smallArray,num);
			} 
				
		}
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size,m;
		System.out.print("Enter the size of array:");
		size=sc.nextInt();
		int arr[]=new int[size];
		System.out.print("Enter elements:");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.print("Enter the number to be searched:");
		m=sc.nextInt();
	    System.out.println(search(arr,m));
		
	}

}
