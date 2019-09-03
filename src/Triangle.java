
public class Triangle extends Shape {

    private final int h, cathet1, cathet2;


    public Triangle(int h, int cathet1, int cathet2) {
        this.h = h;
        this.cathet1 = cathet1;
        this.cathet2 = cathet2;
        System.out.println("Shape: Triangle");
        System.out.println("Square of the triangle: " + squareOfForm());
        System.out.println("High of the triangle: " + this.h);
        System.out.println("Hypotenuse: " + getHypotenuseLength());
        System.out.println("Colour: " + colorOfForm());
        System.out.println("");
    }


    public float squareOfForm() {
        final float S = (cathet1 * h)/2;
        return S;
    }


    public ColourList colorOfForm() {
        return ColourList.getRandom();
    }

    public double getHypotenuseLength() {
        double hypotenuse = Math.sqrt((int)Math.pow(cathet1, 2) + (int)Math.pow(cathet2, 2));

        return hypotenuse;
    }
}
