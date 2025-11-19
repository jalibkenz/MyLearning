package Day_2025_11_19.Thread;

class Counter {
        int count = 0;
         synchronized public void increment() {
              count++;
          }
    }

    public class RaceCondition {
        public static void main(String[] args) throws InterruptedException {
            Counter c = new Counter();
            Thread t1 = new Thread(() -> {
                for (int i = 0; i < 10; i++) {
                    System.out.println(i);
                    c.increment();}
            });
            Thread t2 = new Thread(() -> {
                for (int i = 0; i < 10; i++) {
                    System.out.println("     ("+i+")");
                    c.increment();}
            });
            t1.start();
            t2.start();

            System.out.println(c.count);
        }
    }

