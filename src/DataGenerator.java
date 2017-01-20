import java.util.Random;

/**
 * Created by Ievgen.Korsun on 1/20/2017.
 */
public class DataGenerator {


    public static int getRandomNumberInRange(int min, int max) {
        if (min >= max) {
            throw new IllegalArgumentException("max must be greater than min");
        }
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }
}
