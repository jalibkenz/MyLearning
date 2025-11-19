public class Volatile {
   volatile   boolean running = true; // NOT volatile
        int count=0;
    public void startTask() {
        Thread t = new Thread(() -> {
            while (running) {
                count++;
                System.out.println(count);
            }
            System.out.println("Stopped!");
        });
        t.start();

        try { Thread.sleep(1000); } catch (Exception e) { }
        running = false; // main thread updates
    }

    public static void main(String[] args) {
        new Volatile().startTask();
    }
}