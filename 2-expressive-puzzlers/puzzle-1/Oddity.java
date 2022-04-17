public class Oddity {

    //It's a tricky because i might be negative and zero, so that is the reason why we compare %2 with 0
    public static boolean isOdd(int i) {
        return i % 2 != 0;
    }

    //It's faster than % 2
    public static boolean isAlsoOdd(int i) {
        return (i & 1) != 0;
    }

    public static void main(String[] args) {
        Long startTimeIsOdd = System.nanoTime();
        isOdd(23);
        Long endTimeIsOdd = System.nanoTime();
        System.out.println("isOdd works: " + (endTimeIsOdd-startTimeIsOdd) + " ns");

        Long startTimeIsAlsoOdd = System.nanoTime();
        isAlsoOdd(23);
        Long endTimeIsAlsoOdd = System.nanoTime();
        System.out.println("isAlsoOdd works: " + (endTimeIsAlsoOdd-startTimeIsAlsoOdd) + " ns");
    }
}
