public class Fraction {
    static int numberOfFractions;
    private int numerator, denominator;

    public Fraction(int numerator, int denominator) {
        this.setNumerator(numerator); 
        this.setDenominator(denominator); 
        numberOfFractions++;
    }
    
     public Fraction(Fraction f) {
         this(f.numerator, f.denominator);
     }

    public Fraction() {
         this(0, 1);
     }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public void setDenominator(int denominator) {
        if (denominator == 0) {
            throw new ArithmeticException("Division by zero");
        } else {
             this.denominator = denominator;
        }
    }

     // dynamic method
     public void add(Fraction f) {
         this.setNumerator(this.numerator * f.denominator + this.denominator * f.numerator);
         this.setDenominator(this.denominator * f.denominator);
     }

    // static method
    public static Fraction add(Fraction f, Fraction g) {
        return new Fraction(f.numerator * g.denominator + f.denominator * g.numerator, f.denominator * g.denominator);
    }
    
    public boolean equals(Fraction f) {
        return this.numerator * f.denominator == this.denominator * f.numerator;
    }
    public Fraction multiply(Fraction f) {
        return new Fraction(f.numerator*this.numerator, f.denominator*this.denominator);

    }

    public static Fraction multiply(Fraction f, Fraction g) {
        return new Fraction(f.numerator*g.numerator, f.denominator*g.denominator);
    }

}
/*
 * 
 * Fraction
 * # numerator
 * # denominator
 * + numberOfFractions
 * ------------------
 * + Fraction(numerator: int, denominator: int)
 * + Fraction(f: Fraction)
 * + Fraction()
 * + getNumerator()
 * + getDenominator()
 * + setNumerator(numerator: int)
 * + setDenominator(denominator: int)
 * + add(f: Fraction)
 * + add(f: Fraction, g: Fraction)
 * + equals(f: Fraction)
 * 
 */