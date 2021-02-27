package ru.idcore;

public class MyThread extends Thread {
    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        System.out.printf("%s стартовал...\n", threadName);
        try {
            while (!isInterrupted()) {
                System.out.printf("%s: сообщение...\n", threadName);
                Thread.sleep(2000);
            }

        } catch (InterruptedException e) {
            interrupt();
        } finally {
            System.out.printf("%s прерван...\n", threadName);
        }
    }
}
