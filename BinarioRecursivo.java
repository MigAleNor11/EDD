package EDD;

public class BinarioRecursivo {

	public static void main(String[] args) 
	{
      String a="1111";
      int n=misterio(a);
      System.out.println("1111= "+n);
	}
	public static int misterio(String a)
	{
		return Integer.parseInt(a,2);
	}

}
