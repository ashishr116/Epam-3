import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.TreeMap;
class Help_out_the_Indian_Army {
public static void main(String[] args) {
	int query;
	long s,e,x,p,left,right,leftt,rightt,total=0;
	Scanner st=new Scanner(System.in);
	query=st.nextInt();
	s=st.nextLong();
	e=st.nextLong();
	System.out.println(total_dist(query,s,e,st));
	st.close();
}
public static long total_dist(int query,long s,long e,Scanner sc)
{
    long x,p,left,right,leftt,rightt,total=0;
    String str;
    left=s;
	TreeMap<Long, Long> tm=new TreeMap<Long,Long>();
	for(int i=0;i<query;i++)
	{
		str=sc.next();
		String arr[]=str.split(" ");
		x=Long.parseLong(arr[0]);
		p=Long.parseLong(arr[1]);
		tm.put(x-p,x+p);	
	}
	Collection collection1=tm.keySet();
	Collection collection2=tm.values();
	Iterator itr1=collection1.iterator();
	Iterator itr2=collection2.iterator();
	while(itr1.hasNext())
	{
		leftt=(long) itr1.next();
		rightt=(long)itr2.next();
		right=rightt;
		if(e<leftt)
		{
			break;
		}
		if(left<leftt)
		{
			total=total+leftt-left;
		}
		if(right>left)
		{
			left=right;
		}
	}
	if(left<e)
	{
		total=total+e-left;
	}
	return total;
}
}
