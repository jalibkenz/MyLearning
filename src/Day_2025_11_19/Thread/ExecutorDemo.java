import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class WorkerTask implements Runnable {

    private String taskName;

    public WorkerTask(String taskName) {
        this.taskName = taskName;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " started " + taskName);
        try {
            Thread.sleep(1000);   // Simulating some task
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " finished " + taskName);
    }
}

public class ExecutorDemo {

    public static void main(String[] args) {

        // Creating a thread pool of 3 threads
        ExecutorService executor = Executors.newFixedThreadPool(3);

        // Submitting 6 tasks (more tasks than threads)
        for (int i = 1; i <= 6; i++) {
            Runnable task = new WorkerTask("Task " + i);
            executor.submit(task);  // Add task to the pool
        }

        // Shutting down executor (no new tasks accepted)
        executor.shutdown();

        System.out.println("All tasks submitted...");
    }
}
