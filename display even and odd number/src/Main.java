import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the upper limit");
		int x=sc.nextInt();
		Even e=new Even();
		Odd o=new Odd();
		System.out.println("even numbers are"+e.getEven(x));
		System.out.println("odd numbers are"+o.getOdd(x));
	    sc.close();
	}

}
