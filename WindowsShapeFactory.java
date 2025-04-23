
public class WindowsShapeFactory implements ShapeFactory {
    @Override
    public Shape createSquare() {
        return new WindowsSquare();
    }

    @Override
    public Shape createRectangle() {
        return new WindowsRectangle();
    }

    @Override
    public Shape createCircle() {
        return new WindowsCircle();
    }
}
