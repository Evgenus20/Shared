public class Circle extends Shape {
    private final float d;
    private final float PI = 3.14f;

    public Circle(int d) {
        this.d = d;
        System.out.println("Shape: Circle");
        System.out.println("Square of the circle: " + squareOfForm());
        System.out.println("Radius: " + getRadius());
        System.out.println("Diameter: " + this.d);
        System.out.println("Colour: " + colorOfForm());
        System.out.println("");
    }

    public float squareOfForm() {
        final float S = PI*d/2;
        return S;
    }

    public ColourList colorOfForm() {
        return ColourList.getRandom();
    }

    public float getRadius() {
        return d/2;
    }

}
