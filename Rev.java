import java.util.*;
public class Rev {

	public static int[] display(int arr[],int i,int j)
	{
		if(i<j)
		{
			
		  int temp=arr[i];
	          arr[i]=arr[j];
		  arr[j]=temp;
	          display(arr, i+1, j-1);
		}
		return arr;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.print("ENTER SIZE:");
		n=sc.nextInt();
		int arr[]=new int[n];
		int len=arr.length;
		for(int i=0;i<len;i++)
		{
			arr[i]=sc.nextInt();
		}
		int revArr[]=display(arr,0,len-1);
		for(int i:revArr)
			System.out.print(i+" ");
	
	}

}
	