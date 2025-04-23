
public class ShapeTest {
    public static void main(String[] args) {
        ShapeFactorySingleton factorySingleton = ShapeFactorySingleton.getInstance();

        Shape windowsSquare = factorySingleton.createShape("Windows", "Square");
        Shape linuxCircle = factorySingleton.createShape("Linux", "Circle");

        Shape decoratedWindowsSquare = new BorderSizeDecorator(new ColorDecorator(windowsSquare, "Red"), 2.0);
        Shape decoratedLinuxCircle = new BorderColorDecorator(linuxCircle, "Blue");

        Command drawWindowsSquare = new DrawCommand(decoratedWindowsSquare);
        Command drawLinuxCircle = new DrawCommand(decoratedLinuxCircle);

        drawWindowsSquare.execute();
        drawLinuxCircle.execute();
    }
}
