import java.util.Random;

public enum ColourList {
    RED, BLUE, YELLOW, WHITE, BLACK, GREEN;

    public static ColourList getRandom()
    {
        Random random = new Random();
        int idx = random.nextInt(values().length);
        return values()[idx];
    }

}
