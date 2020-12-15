package ic_tester;
public abstract class Base implements YYYY{
    String s;
    abstract  public void set();
    public void use(){
        System.out.println("S=" + s);
    }
    public int useINT(){
        System.out.println("S=" + s);
    }
    public float useFloat(){
        System.out.println("S=" + s);
    }
}
