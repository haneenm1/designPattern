
public class LinuxSquare extends Square {
    @Override
    public void draw() {
        super.draw();
        System.out.println("Executing border light command for square.");
    }

    @Override
    public String getDescription() {
        return "Linux Square";
    }
}
