
public abstract class Shape {
    protected String color;
    protected String borderColor;
    protected double borderSize;

    public void setColor(String color) {
        this.color = color;
    }

    public void setBorderColor(String borderColor) {
        this.borderColor = borderColor;
    }

    public void setBorderSize(double borderSize) {
        this.borderSize = borderSize;
    }

    public abstract void draw();
    public abstract String getDescription();
}
