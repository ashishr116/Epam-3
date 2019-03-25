import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Sort_the_Array {
	public static ArrayList<Integer>[] sort(int arr[],int n,int k)
	{
		ArrayList<Integer> a[]=new ArrayList[k];
		for(int i=0;i<k;i++)
	    {
	        a[i]=new ArrayList<Integer>();
	    }
		for(int i=0;i<n;i++)
	    {
			a[arr[i]%k].add(arr[i]);
	    }
		for(int i=0;i<k;i++)
		{
			Collections.sort(a[i]);
		}
		return a;
	}
public static void main(String[] args) {
	int n,k;
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
	k=sc.nextInt();
	int arr[]=new int[n];
	for(int i=0;i<n;i++)
	{
		arr[i]=sc.nextInt();
	}
	ArrayList<Integer> a[]=sort(arr,n,k);
	int siz;
	for(int j=k-1;j>=0;j--)
    {
		ArrayList<Integer> ar=a[j];
        siz=ar.size();
        for(int i=0;i<siz;i++)
        {
            System.out.print(ar.get(i)+" ");
        }
        
    }
}
}
