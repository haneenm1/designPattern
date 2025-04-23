
public class BorderColorDecorator extends ShapeDecorator {
    private String borderColor;

    public BorderColorDecorator(Shape decoratedShape, String borderColor) {
        super(decoratedShape);
        this.borderColor = borderColor;
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("Setting border color: " + borderColor);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", border color: " + borderColor;
    }
}
