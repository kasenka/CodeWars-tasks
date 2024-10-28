package test.some;

public class square {
    public static long findNextSquare(long sq) {
        double sqrt = Math.sqrt(sq);
        if ((Math.pow((int)sqrt,2) == (double) sq)) {return (long) Math.pow(sqrt+1,2);}
        return (long) -1;
    }
}
