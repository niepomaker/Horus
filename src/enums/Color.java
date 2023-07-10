package enums;

public enum Color {
    RED("Red"),
    BLUE("Blue"),
    GREEN("Green");

    public final String color;

    private Color(String color) {
        this.color = color;
    }
}