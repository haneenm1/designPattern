
public class ColorDecorator extends ShapeDecorator {
    private String color;

    public ColorDecorator(Shape decoratedShape, String color) {
        super(decoratedShape);
        this.color = color;
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("Filling shape with color: " + color);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", filled with color: " + color;
    }
}
