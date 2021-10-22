package Lambda_functional;
@FunctionalInterface
interface Intref
{
	public int getLength(String s);
	
}

public class Test3 {
	public static void main(String []args)
	{
   Intref f = s->s.length();
   System.out.println(f.getLength("Hello java8"));
   System.out.println(f.getLength("with lambda expression"));
  
		
}
}
