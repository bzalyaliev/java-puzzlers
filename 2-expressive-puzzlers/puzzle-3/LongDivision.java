public class LongDivision {
    public static void main(String[] args) {

        //Also, it works
        //final long MICROS_PER_DAY = (long) 24 * 60 * 60 * 1000 * 1000;
        final long MICROS_PER_DAY = 24L * 60 * 60 * 1000 * 1000;
        final long MILLIS_PER_DAY = 24L * 60 * 60 * 1000;

        System.out.println(MICROS_PER_DAY);
        System.out.println(MILLIS_PER_DAY);

        System.out.println(MICROS_PER_DAY / MILLIS_PER_DAY);
    }
}
