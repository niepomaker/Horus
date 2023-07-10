import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class WallTest {
    List<Block> blocks = List.of(new SimpleBlock(Color.RED, Material.BRICK),
            new SimpleBlock(Color.BLUE, Material.WOOD),
            new SimpleBlock(Color.GREEN, Material.WOOD),
            new SimpleBlock(Color.RED, Material.BRICK));

    Wall wall = new Wall.Builder()
            .addBlock(blocks.get(0))
            .addBlock(blocks.get(1))
            .addBlock(blocks.get(2))
            .addBlock(blocks.get(3))
            .build();

    @Test
    public void findBlockByRedColorTest() {
        Assert.assertEquals(wall.findBlockByColor(Color.RED).get(), blocks.get(0));
    }

    @Test
    public void findBlockByBlueColorTest() {
        Assert.assertEquals(wall.findBlockByColor(Color.BLUE).get(), blocks.get(1));
    }

    @Test
    public void findBlockByGreenColorTest() {
        Assert.assertEquals(wall.findBlockByColor(Color.GREEN).get(), blocks.get(2));
    }

    @Test
    public void findBlocksByBrickMaterialTest() {
        Assert.assertEquals(wall.findBlocksByMaterial(Material.BRICK), List.of(blocks.get(0), blocks.get(3)));
    }

    @Test
    public void findBlocksByWoodMaterialTest() {
        Assert.assertEquals(wall.findBlocksByMaterial(Material.WOOD), List.of(blocks.get(1), blocks.get(2)));
    }

    @Test
    public void countTest() {
        Assert.assertEquals(blocks.size(), wall.count());
    }

    @Test
    public void getBlocksTest() {
        Assert.assertEquals(blocks, wall.getBlocks());
    }

}
