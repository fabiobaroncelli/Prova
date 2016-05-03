
public class Hello {
	
	public Hello()
	{
		Fabio f = new Fabio("pippo");
		System.out.println(f.getName());
	}
	
	public int calculate(int i)
	{
		return i*2;
	}
	
	public static void main(String[] args) 
	{ 
		Hello h = new Hello();
		System.out.println("Hello, World");
	}
}
