public class Operation {

    public static int multiplication(int x, int y) {
        System.out.println("Bonjour"); // 👈 demandé dans le TP
        return x * y;
    }

    public static int soustraction(int x, int y) {
        return x - y;
    }

    public static int addition(int x, int y) {
        return x + y;
    }

    public static double division(int x, int y) {
        if (y != 0) {
            return (double) x / y;
        } else {
            System.out.println("⚠️ Division par 0 détectée !");
            return 0;
        }
    }
}

