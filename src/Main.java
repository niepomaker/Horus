import enums.Color;
import enums.Material;

import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        // Tworzenie ściany
        Wall wall = new Wall.Builder()
                .addBlock(new SimpleBlock(Color.RED, Material.BRICK))
                .addBlock(new SimpleBlock(Color.BLUE, Material.WOOD))
                .addBlock(new SimpleBlock(Color.GREEN, Material.WOOD))
                .addBlock(new SimpleBlock(Color.RED, Material.BRICK))
                .build();

        // Testowanie metod
        Optional<Block> foundBlock = wall.findBlockByColor(Color.GREEN);
        if (foundBlock.isPresent()) {
            System.out.println("Found block with color Green: " + foundBlock.get());
        } else {
            System.out.println("No block found with color Green");
        }

        List<Block> foundBlocks = wall.findBlocksByMaterial(Material.WOOD);
        StringBuilder stringBuilder = new StringBuilder();

        System.out.println("Blocks with material Wood:");
        for (Block block : foundBlocks) {
            stringBuilder.append(block);
            stringBuilder.append("\n");
        }
        System.out.println(stringBuilder);

        int blockCount = wall.count();
        System.out.println("Block count: " + blockCount);
    }
}
