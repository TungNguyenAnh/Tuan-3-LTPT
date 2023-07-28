public class Main {
    public static void main(String[] args) throws InterruptedException {
        lop1 nop1 = new lop1();
        lop2 nop2 = new lop2();
        nop1.start();
        nop1.join();
        nop2.start();
    }
}