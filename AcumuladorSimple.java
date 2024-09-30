public class AcumuladorSimple {
    public static void main(String[] args) {
        int a = 1;
        int b = 1000;
        int c = 0;

        while (a <= b) {
            if (a % 2 == 0) {
                c += a;
            }
            a++;            
        }
        System.out.println("La suma total es: " + c);
    }
}