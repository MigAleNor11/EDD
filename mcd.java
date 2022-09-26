package EDD;

public class mcd {

	public static void main(String[] args) 
	{
		int m=50, n=120;
		int c=MaxComDiv(m,n);
		System.out.println("MCD: "+ c);
		
	}
	
	public static int MaxComDiv(int m, int n)
	{
		if(n==0)return m;
		return MaxComDiv(n,m%n);
	}

}
