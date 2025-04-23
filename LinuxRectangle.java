
public class LinuxRectangle extends Rectangle {
    @Override
    public void draw() {
        super.draw();
        System.out.println("Executing border light command for rectangle.");
    }

    @Override
    public String getDescription() {
        return "Linux Rectangle";
    }
}
