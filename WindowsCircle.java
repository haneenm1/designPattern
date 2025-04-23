
public class WindowsCircle extends Circle {
    @Override
    public void draw() {
        super.draw();
        System.out.println("Executing motion command for circle.");
    }

    @Override
    public String getDescription() {
        return "Windows Circle";
    }
}
