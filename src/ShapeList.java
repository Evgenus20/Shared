import java.util.Random;

public enum ShapeList {
    TRIANGLE, SQUARE, TRAPEZE, CIRCLE;

        public static ShapeList getRandom()
        {
            Random random = new Random();
            int idx = random.nextInt(values().length);
            return values()[idx];
        }

}



