package ex6;

import java.util.concurrent.*;

class TaskQueue {
    private final ExecutorService executor;

    public TaskQueue(int threadCount) {
        executor = Executors.newFixedThreadPool(threadCount);
    }

    public void submitTask(Runnable task) {
        executor.submit(task);
    }

    public void shutdown() {
        executor.shutdown();
    }
}