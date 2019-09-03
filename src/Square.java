public class Square extends Shape {
    private final int a;

    public Square(int a) {
        this.a = a;
        System.out.println("Shape: Square");
        System.out.println("Square of the square: " + squareOfForm());
        System.out.println("Length of the sides: " + this.a);
        System.out.println("Colour: " + colorOfForm());
        System.out.println("");
    }

    public float squareOfForm() {
        final float S = a * a;
        return S;
    }

    public ColourList colorOfForm() {
        return ColourList.getRandom();
    }

}

