package Lambda_functional;

@FunctionalInterface
interface Inter
{
	public void add(int a ,int b);
}

public class Test2 {
	public static void main(String []args)
	{
	
	Inter i=(a,b)->System.out.println("the sum by lambda expression is:"+(a+b));
 i.add(20,30);
 i.add(500, 200);
 
}
}