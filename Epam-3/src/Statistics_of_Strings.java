import java.util.Scanner;
class Statistics_of_Strings {
 int arr[]=new int[25];
	public  int find(int x){
		if(arr[x]==x)
		{
			return x;
		}
		else
		{
			arr[x]=find(arr[x]);
			return arr[x];
		}
	}
	public void Solve()
	{
		long p=1;
		Scanner st=new Scanner(System.in);
		for(int i=0;i<25;i++)
		 {
			 arr[i]=0;
		 }
		int n = st.nextInt();
		int ans=0;
		int power=(int) (Math.pow(10, 5)+7);
		int a = st.nextInt();
		power = st.nextInt();	
		st.close();
		for(int i=1;i<n;i++)
		{
			for (long j=1,s; j<(1<<(n-i)); j++)
            { s=-1;
			    for (int k=0; k<n; k++)  {arr[k]=k;}
			    for (int k=1; k<=n-i; k++)
                 { 
            	 if((j&(1<<(k-1)))>0)
            	 {
            		 s=-s;
            		 for (int l=0; l<i; l++)
            		 { 
            			 if (find(l)!=find(k+l))
                             {
            				 arr[find(k+l)]=find(l);
            				 
            				 }
            		 }
            	  }
                   }
			   
			    if (s<0) { s+=power;}
                for (int k=0; k<n; k++)
                    if (find(k)==k) { s=p*(s*a)%power;}
                ans=(int) ((ans+s)%power);
            }
			
			
		}
		System.out.println(ans);
	}
	public static void main(String[] args) {
		new Statistics_of_Strings().Solve();
		}
}
