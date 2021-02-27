package ru.idcore;

public class MyThread extends Thread {
    @Override
    public void run() {
        int i = 0;
        String threadName = Thread.currentThread().getName();
        System.out.printf("%s стартовал...\n", threadName);
        try {
            while (!isInterrupted()) {
                System.out.printf("%s: Сообщение %d\n", threadName, i);
                i++;
                Thread.sleep(2000);
            }

        } catch (InterruptedException e) {
            interrupt();
        } finally {
            System.out.printf("%s прерван...\n", threadName);
        }
    }
}
