package EDD;

public class Int_String {

	public static void main(String[] args) 
	{
		int a=4,cadena;
		String caden="10",gn="";
		cadena=Integer.parseInt(caden);
		String nv=intstring(a,gn);
		System.out.println(nv);
	}
	
	public static String intstring (int a,String gn)
	{
		gn=Integer.toString(a);
		return gn;
	}

}
