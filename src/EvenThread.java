public class EvenThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i <= 10; i += 2) {
            System.out.print(i + "\t");
            try {
                Thread.sleep(15);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}