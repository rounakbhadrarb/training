import java.util.ArrayList;


public class Odd {
	
	public ArrayList<Integer> getOdd(int n)
	{
		ArrayList<Integer> l=new ArrayList<Integer>();
		for(int i=1;i<=n;i++)
		{
	     if(i%2==1)
	     {
	     	l.add(i);
		
       	}	
		}
		return l;
	}
}
