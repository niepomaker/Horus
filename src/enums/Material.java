package enums;

public enum Material {
    WOOD("Wood"),
    BRICK("Brick");

    public final String material;

    private Material(String material) {
        this.material = material;
    }
}