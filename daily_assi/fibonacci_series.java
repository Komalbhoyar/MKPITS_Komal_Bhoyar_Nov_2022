class fibonacci_series
{
	//fibonacci series
	public static void main(String[] args)
	{
		int n1=0,n2=1,n=100;
		System.out.print("fibonacci series");
		while(n1<=n)
		{
			int n3=n1+n2;
			n1=n2;
			n2=n3;
			System.out.print(" "+n3);
		}
	}
}

