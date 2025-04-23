
public class LinuxShapeFactory implements ShapeFactory {
    @Override
    public Shape createSquare() {
        return new LinuxSquare();
    }

    @Override
    public Shape createRectangle() {
        return new LinuxRectangle();
    }

    @Override
    public Shape createCircle() {
        return new LinuxCircle();
    }
}
