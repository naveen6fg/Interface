package interfaces;

interface Interfac1
{
	 int num1=5;
	 void method1();
	static void method2()
	{
	 System.out.println("I'm m2 static concreate method from Interface1");	
	}
	
}

interface Interfac2
{
	int num2=6;
	void method3();
	static void method4()
	{
	 System.out.println("I'm m4 static concreate method from Interface2");	
	}
}
class NormalClass
{
	public NormalClass()  //constructor
	{
	   System.out.println("Hi, I'm constructor from Normal class");
	}
	void method5()
	{
		System.out.println("I'm method5 from normal class ");
	}
}


class ImpExtend extends  NormalClass implements Interfac1, Interfac2  //multiple inheritance achieved by interface 
{
	 public ImpExtend() 
	 {
		 System.out.println("Hi, I'm constructor from ImpExtend class");
	 }
		
	
	public void method1()
	{
		System.out.println("Implementation of m1 by Interface1");
	}
	public void method3()
	{
		System.out.println("Implementation of m1 by Interface2");
	}
}
public class multipleInterface 
{

	public static void main(String[] args) 
	{

     ImpExtend i= new ImpExtend();
     i.method1();
     Interfac1.method2();
     i.method3();
     Interfac2.method4();
     System.out.println(Interfac1.num1);
     System.out.println(Interfac2.num2);
     
     i.method5();
     
	}

}
