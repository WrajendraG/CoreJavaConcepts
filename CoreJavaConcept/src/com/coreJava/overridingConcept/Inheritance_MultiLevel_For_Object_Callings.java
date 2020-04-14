package com.coreJava.overridingConcept;

class Class1
{
    void method1()
    {

        System.out.println("I am Class1 Praent");

    }

}
class Class2 extends Class1
{
    void method2()
    {

        System.out.println("I am Class2 Child Of Class1");

    }


}
class Class3 extends Class2
{
    void method3()
    {

        System.out.println("I am Class3 child of Class2 And My grandfather is Class1");

    }



}
public class Inheritance_MultiLevel_For_Object_Callings
{

    public static void main(String[] args)
    {
        System.out.println("#######################################################################################################################################\n");
        System.out.println("================================ Four way to be Creating object in inheritance  ===========================================\n");
        System.out.println("#######################################################################################################################################\n");

        System.out.println("=========== 1) Creating parent obj you should call only parent itself (you can't call child or child of child======\n) ");
        Class1 obj1 = new Class1();
        obj1.method1();

        System.out.println("#######################################################################################################################################\n");


        System.out.println("========= 2) Creating child you can call only it self and parent (you cant call child of child) =========\n");
        Class2 obj2 = new Class2();
        obj2.method1();
        obj2.method2();

        System.out.println("#######################################################################################################################################\n");

        System.out.println("========= 2) Creating last Child obj call All Class to be extends ================");
        Class3 obj3 = new Class3();
        obj3.method1();
        obj3.method2();
        obj3.method3();
        System.out.println("========= This is Best Way to creat object Because you should Call All Class( extended Only)  ================");
        System.out.println("#######################################################################################################################################\n");

        System.out.println("===== 3) You should create new object using child class through parent referances but you can call only parent Method not child ==== \n");
        System.out.println("  Example:= class1 obj4 = new Class2(); \n");
        Class1 obj4 = new Class2();
        obj4.method1();
        System.out.println(" obj4.method1(); //you call this method because parent Referances (Class1)\n");
        System.out.println(" obj4.method2(); //Give error Can't found Symbol in Class1 \n");

        System.out.println("#######################################################################################################################################\n");

        System.out.println(" 4) You shoud not create new object using parent Class through child Referances \n");
        System.out.println("  Example:= class2 obj5 = new Class1(); \n");
        //Class2 obj5 = new Class1();
        System.out.println(" Class1(); is Parent class you cant give Referances to child Class2 \n");
        System.out.println(" That's why This error Is generated by JVM \n");
        System.out.println("\nException in thread main java.lang.Error: Unresolved compilation problems: ");
        System.out.println("\tType mismatch: cannot convert from Class1 to Class2");

        System.out.println("#######################################################################################################################################\n");

    }

}
/*
 * #######################################################################################################################################

================================ Four way to be Creating object in inheritance  ===========================================

#######################################################################################################################################

=========== 1) Creating parent obj you should call only parent itself (you can't call child or child of child======
) 
I am Class1 Praent
#######################################################################################################################################

========= 2) Creating child you can call only it self and parent (you cant call child of child) =========

I am Class1 Praent
I am Class2 Child Of Class1
#######################################################################################################################################

========= 2) Creating last Child obj call All Class to be extends ================
I am Class1 Praent
I am Class2 Child Of Class1
I am Class3 child of Class2 And My grandfather is Class1
========= This is Best Way to creat object Because you should Call All Class( extended Only)  ================
#######################################################################################################################################

===== 3) You should create new object using child class through parent referances but you can call only parent Method not child ==== 

  Example:= class1 obj4 = new Class2(); 

I am Class1 Praent
 obj4.method1(); //you call this method because parent Referances (Class1)

 obj4.method2(); //Give error Can't found Symbol in Class1 

#######################################################################################################################################

 4) You shoud not create new object using parent Class through child Referances 

  Example:= class2 obj5 = new Class1(); 

 Class1(); is Parent class you cant give Referances to child Class2 

 That's why This error Is generated by JVM 


Exception in thread main java.lang.Error: Unresolved compilation problems: 
	Type mismatch: cannot convert from Class1 to Class2
#######################################################################################################################################

 * */