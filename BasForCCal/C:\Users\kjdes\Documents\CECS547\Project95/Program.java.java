public class Program
{
    public static void main(String[] args)
    {
        System.out.println("OO-PIES validation code.");
        Class1 c1 = new Class1(true);

        c1.myFunc1(3, 4);
        if (c1.getmyBool())
            System.out.println(c1.getmyInt());
        Class3 c3 = new Class3();
        c3.myFunc1();
        c3.gather();

    }
}



/**
 * Summary description for Class1
 */
public class Class1
{
    private boolean myBool;
    public int myInt;
    protected double myDouble;
    
    public Class1(boolean mb)
    {
        myBool = mb;
        myInt = 0;
        myDouble = 0.0;
    }
    public void myFunc1(int A, int B){
        myInt = A + B + getmyInt();
    }
    public int getmyInt() {
        return myInt;
    }
    public double getmyDouble()
    {
        return myDouble;
    }
    public boolean getmyBool(){
        return myBool;
    }
}


/**
 * Summary description for Class2.
 */
public class Class2 extends Class1
{
    private int myInt2;
    public int AddMine2()
    {
        return myInt2 + super.getmyInt();
    }
    public Class2()
    {
        super(true);
        myInt2 = 5;
    }
}


/**
 * Summary description for Class3.
 */
public class Class3
{
    Class1 myClass1Obj;
    private int mynum1, mynum2;
    public Class3()
    {
        myClass1Obj = new Class1(false);
        mynum1 = 14;
        mynum2 = 5;
    }
    /* Delegate responsibility */
    public void myFunc1()
    {
        myClass1Obj.myFunc1(3, 8);
    }
    public void gather()
    {
        int W = myClass1Obj.getmyInt();
        myFunc1();
        System.out.println("Hello from Class 3");
        mynum1 = W;
    }
}
