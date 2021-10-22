package Lambda_functional;
@FunctionalInterface
interface Interf
{
	public void m1();
	}
class Test
{
public static void main(String []args)
{
	Interf i=()->System.out.println("Lambda expression implementation");
	i.m1();
	
	
}

}


