public class Shape implements ShapeMethodsImplement {
    @Override
    public float squareOfForm() {
        return 0;
    }

    @Override
    public ColourList colorOfForm() {
        return null;
    }


    public static void main(String[] args) {
        ShapeBuilder shapeBuilder = new ShapeBuilder();
        int rand = (int) (Math.random()*10) + 1;

        for (int i = 0; i < rand; i++) {
            shapeBuilder.create(ShapeList.getRandom());
        }
    }
}


