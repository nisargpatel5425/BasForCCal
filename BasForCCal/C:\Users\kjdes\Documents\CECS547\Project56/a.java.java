package anom_sda;
public abstract class Base {
    private int a, b;
    public void m1(int a){
        a = 7;
    }
    public void m2(){
        b = a + 5;
        System.out.println("In Base.m2, b=" + b);        
    }    
}
