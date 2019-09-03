public class Trapeze extends Shape {
    private final int h, a, b;

    public Trapeze(int h, int a, int b) {
        this.h = h;
        this.a = a;
        this.b = b;
        System.out.println("Shape: Trapeze");
        System.out.println("Square of the trapeze: " + squareOfForm());
        System.out.println("High of the trapeze: " + this.h);
        System.out.println("Colour: " + colorOfForm());
        System.out.println("");
    }

    public float squareOfForm() {
        final float S = ((a + b)*h)/2;
        return S;
    }

    public ColourList colorOfForm() {
        return ColourList.getRandom();
    }


}
