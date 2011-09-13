
public class Fibbs {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Fib(0,1,5));
	}
	
	
	static int Fib(int a, int b, int n)
	{
		if(n > 0)
		{
			return Fib(b, a+b, n - 1);
		}
		else
		{
			return a;
		}
		
	}
}
