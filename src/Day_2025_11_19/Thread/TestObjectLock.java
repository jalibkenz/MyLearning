class ObjectLockExample {

    public synchronized void objectLevelMethod() {
        System.out.println(Thread.currentThread().getName() + " entered object-level method");
        try { Thread.sleep(2000);
        } catch (Exception e) {}
        System.out.println(Thread.currentThread().getName() + " exiting object-level method");
    }
}

public class TestObjectLock {
    public static void main(String[] args) {

        // TWO DIFFERENT OBJECTS
        ObjectLockExample obj1 = new ObjectLockExample();
        ObjectLockExample obj2 = new ObjectLockExample();

        // Each thread works on DIFFERENT OBJECT → no blocking
        new Thread(() -> obj1.objectLevelMethod(), "T1").start();
        new Thread(() -> obj2.objectLevelMethod(), "T2").start();
    }
}
