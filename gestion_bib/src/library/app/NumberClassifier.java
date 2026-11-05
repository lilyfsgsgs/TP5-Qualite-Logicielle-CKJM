
package library.app;

public final class NumberClassifier {

    // Empêche la création d'objets de cette classe utilitaire
    private NumberClassifier() {
    }

    // Affiche la classification des nombres de 0 à n - 1
    public static void printClassification(int n) {

        for (int i = 0; i < n; i++) {

            if (i % 2 == 0) {
                System.out.println(i + " is even");

            } else if (i % 3 == 0) {
                System.out.println(i + " divisible by 3");

            } else {
                System.out.println(i + " something else");
            }
        }
    }
}
