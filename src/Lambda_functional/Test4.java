package Lambda_functional;

@FunctionalInterface
interface Interc
{
public int squareIt(int x);
}

public class Test4 {

	
	public static void main(String[] args) {
		
		
		 Interc p=x->x*x;
		 System.out.println(p.squareIt(10));
		 System.out.println(p.squareIt(5));
	}

}
