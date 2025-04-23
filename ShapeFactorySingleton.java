
public class ShapeFactorySingleton {
    private static ShapeFactorySingleton instance;
    private ShapeFactorySingleton() {}

    public static ShapeFactorySingleton getInstance() {
        if (instance == null) {
            instance = new ShapeFactorySingleton();
        }
        return instance;
    }

    public ShapeFactory getFactory(String osType) {
        if (osType.equalsIgnoreCase("Windows")) {
            return new WindowsShapeFactory();
        } else if (osType.equalsIgnoreCase("Linux")) {
            return new LinuxShapeFactory();
        }
        return null;
    }

    public Shape createShape(String osType, String shapeType) {
        ShapeFactory factory = getFactory(osType);
        if (factory == null) return null;

        if (shapeType.equalsIgnoreCase("Square")) {
            return factory.createSquare();
        } else if (shapeType.equalsIgnoreCase("Rectangle")) {
            return factory.createRectangle();
        } else if (shapeType.equalsIgnoreCase("Circle")) {
            return factory.createCircle();
        }
        return null;
    }
}
