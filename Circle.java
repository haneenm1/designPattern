
public class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }

    @Override
    public String getDescription() {
        return "Circle";
    }
}
