public class Main {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            System.out.println("This is the loop run number " + i);
            Thread.sleep(500);
        }
    }
}