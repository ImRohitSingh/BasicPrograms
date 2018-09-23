import static java.lang.System.out;
public class AbstractDriver 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		B bObj = new B();
		bObj.meth1();
		out.println(A.aVar);
		bObj.meth2();
		out.println(A.aVar);
	}

}
