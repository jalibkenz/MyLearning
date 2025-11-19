package Day_2025_11_04;



class A {
    int[] a={1,2,3,4,5};
    void display() {
        System.out.println("A");
    }


    void incA(int[] aaa){
        aaa[0]=55;
        System.out.println(aaa[0]+"->"+a[0]);
    }
    void checkA(){
        System.out.println(a[0]);
    }
}

class B extends A {
    void display() {

        System.out.println("B");
    }
}

public class Simply {
    public static void main(String[] args) throws Exception {
        String str="hello";
        A obj = new A();
        obj.checkA();
        obj.incA(obj.a);//10
        obj.checkA();

    }
}
