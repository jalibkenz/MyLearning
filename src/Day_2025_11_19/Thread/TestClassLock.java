class ClassLockExample {

    public static synchronized void classLevelMethod() {
        System.out.println(Thread.currentThread().getName() + " entered class-level method");
        try { Thread.sleep(2000);
        } catch (Exception e) {}
        System.out.println(Thread.currentThread().getName() + " exiting class-level method");
    }
}

public class TestClassLock {
    public static void main(String[] args) {

        // STILL USING TWO DIFFERENT OBJECTS
        ClassLockExample obj1 = new ClassLockExample();
        ClassLockExample obj2 = new ClassLockExample();

        // Both threads call STATIC synchronized → SAME CLASS LOCK
        new Thread(() -> ClassLockExample.classLevelMethod(), "T1").start();
        new Thread(() -> ClassLockExample.classLevelMethod(), "T2").start();
    }
}
