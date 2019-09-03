public class ShapeBuilder {
    public Shape create(ShapeList typeOfShape) {
        int rand1 = (int) (Math.random()*10) + 1;
        int rand2 = (int) (Math.random()*10) + 1;
        int rand3 = (int) (Math.random()*10) + 1;
        switch (typeOfShape) {
            case TRAPEZE : return new Triangle(rand1, rand2, rand3);
            case TRIANGLE : return new Circle(rand1);
            case CIRCLE : return new Trapeze(rand1, rand2, rand3);
            case SQUARE : return new Square(rand1);
            default: return null;
        }
    }
}
