package assignments;

class A
{
	static int i =10;
	
	
	public void show()
			{
				//int a=10;
				//int b=20;
		System.out.println("value of a and b are "+a + "and" +b);
		//System.out.println("value of i is"+i);
			}
}

public class DifferenceBWClassAndInstance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A a=new A();
		a.show();

	}

}
