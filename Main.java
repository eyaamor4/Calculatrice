public class Main {
    public static void main(String[] args) {
        int a = 2, b = 3;

        System.out.println("Bienvenue"); 

        System.out.println(a + " * " + b + " = " + Operation.multiplication(a, b));
        System.out.println(a + " - " + b + " = " + Operation.soustraction(a, b));
        System.out.println(a + " + " + b + " = " + Operation.addition(a, b));
        System.out.println(a + " / " + b + " = " + Operation.division(a, b));
        System.out.println(a + " / 0 = " + Operation.division(a, 0));

        System.out.println("Au revoir");
        System.out.println("Affichage supplémentaire depuis la branche calcul"); 
    }
}

