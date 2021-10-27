import java.util.ArrayList;


public class Even {

	public ArrayList<Integer> getEven(int n)
	{
		ArrayList<Integer> l=new ArrayList<Integer>();
		for(int i=1;i<=n;i++)
		{
	     if(i%2==0)
	     {
	     	l.add(i);
		
       	}	
		}
		return l;
	}
}
