package Day_2025_11_04;

import java.util.Arrays;

class NoReturn {
    public static void main(String[] args) {
        //String
        String s="hello";
        stringFxn(s);//manipulated
        System.out.println("s->"+s);
        System.out.println("_".repeat(50));

        //StringBuilder
        StringBuilder sb= new StringBuilder("welcome");
        stringFxn(sb);
        System.out.println("sb->"+sb);
        System.out.println("_".repeat(50));



        //Array
        String[] sArr={"hello", "dear"};
        arrayFxn(sArr);//manipulated
        System.out.println("sArr->"+ Arrays.toString(sArr));
        System.out.println("_".repeat(50));

        //Object
        Student s1=new Student(777);//Pass by value only (the memory address is the value)
        objectFxn(s1);//manipulated
        System.out.println("s1.id->"+s1.id);
        System.out.println("_".repeat(50));


    }

    public static void stringFxn(String x){
        x=x+"NEW";
        System.out.println("local scope: x->"+x);
    }

    public static void stringFxn(StringBuilder x){
        x.append("NEW");
        System.out.println("local scope: x in String Builder->"+x);
    }

    public static void arrayFxn(String[] xx){
        xx[1]="how are you?";//the memory address pointing to the array sArr is copied to xx
    }

    public static void objectFxn(Student s){
        s.id++;
    }


}

class Student{
    int id;
    Student(int x){
        this.id=x;

    }
}


