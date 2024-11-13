public class FractionTester {
    public static void main(String[] args) {
        Fraction f = new Fraction(1, 2);
        // Der folgende Code funktioniert nur, wenn die Felder von Fraction nicht privat sind:
        // System.out.println(f.numerator + "/" + f.denominator);
        
        // toString():
        System.out.println(f.toString());

        // Encapsulation, Getter und Setter:
        f.setDenominator(3);
        f.setNumerator(9);

        // Copy-Konstruktor und equals():
        System.out.println(f.equals(f));

        // Klassen- und Instanzenmethoden:
        System.out.println(Fraction.numberOfFractions);

        // statische Variablen:
        final double PI = 3.14159;

    }

}
