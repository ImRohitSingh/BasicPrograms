
public class OverloadingDriver {

	public static void main(String[] args) 
	{
		MethodOverloading mo = new MethodOverloading();
		System.out.println(mo.add(4,5));
		System.out.println(mo.add(4,5f));
		System.out.println(mo.add(4f,5));
		System.out.println(mo.add("4","5"));
	}

}
