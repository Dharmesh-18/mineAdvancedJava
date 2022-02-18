package threads;

/**
 * 1. Use this file to write your first thread program using Runnable interface
 * 2. When you are done convert the same program by extending the Thread class
 * */
public class FirstThread extends Thread {
  public static void main(String[] args) throws InterruptedException {

//    Runnable runnable = new FirstThread();
//
//    Thread t1 = new Thread(runnable, "myThread-1");
//    t1.start();
//
//    Thread t2 = new Thread(runnable, "myThread-2");
//    t2.start();

    FirstThread t1 = new FirstThread();
    t1.start();
    t1.join();

    FirstThread t2 = new FirstThread();
    t2.start();
    t2.join();
  }

  @Override
  public void run() {
    String threadName = Thread.currentThread().getName();
    System.out.println("I am running in " + threadName+ " thread");
  }
}
