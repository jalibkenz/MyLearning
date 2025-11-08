package Day_2025_11_04;



class X
{
    int m = 1111;

    {
        //m = ++m; //1111(1112)

        System.out.println(m);
    }
    X(){
        System.out.println("X".repeat(3));
    }

}

class Y extends X
{
    {
        System.out.println(methodOfY());
    }

    int methodOfY()
    {
        return m-- + --m; //1111(1110) +1109(1109)= 2220
    }
    void doIT(){
        super.m=2; //can be done anywhere, even in kachara...
        //super(); //cannot be done in some method, it has to be done only in constructor
    }
}

public class Blank {
    public static void main(String[] args)
    {
        Y y = new Y();
        System.out.println(y.m);
        y.doIT();

    }
}
