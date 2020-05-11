public class Clock extends Thread{
    public boolean running = true;

    public void run() {
       while (running) {
           try {
               sleep(1000);
               Generation.nextGen();
           } catch (InterruptedException e) {
               e.printStackTrace();
           }

       }
    }
}
