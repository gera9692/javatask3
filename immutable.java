public class IntegerPair {
    private final int pairx;
    private final int pairy;

    IntegerPair(int pairx, int pairy) {
        this.pairx = pairx;
        this.pairy = pairy;
    }
}

IntegerPair p = new IntegerPair(5, 10);

p.pairx = 50;
// Compilation error: cannot assign a value to a final variable
