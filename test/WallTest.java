import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class WallTest {
    List<Block> blocks = List.of(new SimpleBlock("Red", "Wood"),
                                 new SimpleBlock("Blue", "Brick"),
                                 new SimpleBlock("Green", "Wood"),
                                 new SimpleBlock("Red", "Brick"));

    Wall wall = new Wall.Builder()
            .addBlock(blocks.get(0))
            .addBlock(blocks.get(1))
            .addBlock(blocks.get(2))
            .addBlock(blocks.get(3))
            .build();

    @Test
    public void findBlockByRedColorTest(){
        Assert.assertEquals(wall.findBlockByColor("Red").get(), blocks.get(0));
    }

    @Test
    public void findBlockByBlueColorTest(){
        Assert.assertEquals(wall.findBlockByColor("Blue").get(), blocks.get(1));
    }

    @Test
    public void findBlockByGreenColorTest(){
        Assert.assertEquals(wall.findBlockByColor("Green").get(), blocks.get(2));
    }

    @Test
    public void findBlocksByBrickMaterialTest(){
        Assert.assertEquals(wall.findBlocksByMaterial("Brick"), List.of(blocks.get(1), blocks.get(3)));
    }

    @Test
    public void findBlocksByWoodMaterialTest(){
        Assert.assertEquals(wall.findBlocksByMaterial("Wood"), List.of(blocks.get(0), blocks.get(2)));
    }

    @Test
    public void countTest(){
        Assert.assertEquals(blocks.size(), wall.count());
    }

    @Test
    public void getBlocksTest(){
        Assert.assertEquals(blocks, wall.getBlocks());
    }

}
