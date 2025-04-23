
public class BorderSizeDecorator extends ShapeDecorator {
    private double borderSize;

    public BorderSizeDecorator(Shape decoratedShape, double borderSize) {
        super(decoratedShape);
        this.borderSize = borderSize;
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("Setting border size: " + borderSize);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", border size: " + borderSize;
    }
}
