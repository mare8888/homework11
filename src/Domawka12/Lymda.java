public class Lymda {
    public static void main(String[] args) {
        Monitor monitor = (x, y) -> x + y;
        Monitor monitor1 = (x, y) -> x - y;
        Monitor monitor2 = (x, y) -> x * y;
        Monitor monitor3 = (x, y) -> x / y;
        System.out.println(monitor.startMonitoring(20, 10));
        System.out.println(monitor1.startMonitoring(20, 10));
        System.out.println(monitor2.startMonitoring(20, 10));
        System.out.println(monitor3.startMonitoring(20, 10));

    }
}
