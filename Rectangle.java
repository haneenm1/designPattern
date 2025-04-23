
public class Rectangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle");
    }

    @Override
    public String getDescription() {
        return "Rectangle";
    }
}
