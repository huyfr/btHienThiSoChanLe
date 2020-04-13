public class TestThread {
    public static void main(String[] args) {
        OddThread oddThread = new OddThread();
        EvenThread evenThread = new EvenThread();

        oddThread.start();
        try {
            oddThread.join();
        } catch (InterruptedException ex){
            System.out.println(ex.getMessage());
        }
        evenThread.start();
    }
}