public record SimpleBlock(Color color, Material material) implements Block {

    @Override
    public String getColor() {
        return color.name();
    }

    @Override
    public String getMaterial() {
        return material.name();
    }
}
