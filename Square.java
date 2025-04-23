
public class Square extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a square");
    }

    @Override
    public String getDescription() {
        return "Square";
    }
}
