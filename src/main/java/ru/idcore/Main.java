package ru.idcore;

import javax.swing.plaf.TableHeaderUI;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ThreadGroup mainGroup = new ThreadGroup("ThreadMainGroup");
        Thread thread1 = new Thread(mainGroup, new MyThread());
        Thread thread2 = new Thread(mainGroup, new MyThread());
        Thread thread3 = new Thread(mainGroup, new MyThread());

        thread1.start();
        thread2.start();
        thread3.start();

        Thread.sleep(5000);
        mainGroup.interrupt();

    }
}
