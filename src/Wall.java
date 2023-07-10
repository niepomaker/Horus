import enums.Color;
import enums.Material;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Wall implements Structure, CompositeBlock {
    private static Wall instance;
    private List<Block> blocks;

    private Wall() {
        this.blocks = new ArrayList<>();
    }

    public static Wall getInstance() {
        if (instance == null) {
            instance = new Wall();
        }
        return instance;
    }

    @Override
    public Optional<Block> findBlockByColor(Color color) {
        return blocks.stream().filter(el -> el.getColor().equals(color.name())).findAny();
    }

    @Override
    public List<Block> findBlocksByMaterial(Material material) {
        return blocks.stream().filter(el -> el.getMaterial().equals(material.name())).collect(Collectors.toList());
    }

    @Override
    public int count() {
        return blocks.size();
    }

    @Override
    public List<Block> getBlocks() {
        return blocks;
    }

    @Override
    public String getColor() {
        throw new UnsupportedOperationException();
    }

    @Override
    public String getMaterial() {
        throw new UnsupportedOperationException();
    }

    public static class Builder {
        private final List<Block> blocks;

        public Builder() {
            blocks = new ArrayList<>();
        }

        public Builder addBlock(Block block) {
            blocks.add(block);
            return this;
        }

        public Wall build() {
            Wall wall = Wall.getInstance();
            wall.blocks = blocks;
            return wall;
        }
    }
}
