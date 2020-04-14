package com.coreJava.InnerClassAndInterfaces;

/**
 * Created by WrajendraG on 3/11/2017.
 */

interface I
{
	
	void m2();
	
	class C{
		
		public void m()
		{
			
				System.out.print("\n I am from interface inner class ");
		}
		
	}
	
	C objc= new C();
}

class  A implements I
{
    void m1()
    {

        System.out.print("\nI am Outer In Inner class and Method ");
        class B
        {
            void m2()
            {
                System.out.print("\n I am Local class In Method ");
            }
           
        }

        B obj1 = new B();// Object Should be create here
        obj1.m2();
    }

	@Override
	public void m2() {
		 System.out.print("\n I am interface overiden method class In Method ");
		
	}

}

public class LocalInnerclass
{
    public static void main(String args[])
    {
            A obj2 = new A();
            obj2.m1();
            obj2.objc.m();   // we can create class in interface and we have to create object of that class within that interface for available in inheritance  .
            
    }

}

/*

I am Outer In Inner class and Method 
 I am Local class In Method 
 I am from interface inner class 
 */

