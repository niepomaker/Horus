import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        // Tworzenie ściany
        Wall wall = new Wall.Builder()
                .addBlock(new SimpleBlock("Red", "Wood"))
                .addBlock(new SimpleBlock("Blue", "Brick"))
                .addBlock(new SimpleBlock("Green", "Wood"))
                .addBlock(new SimpleBlock("Red", "Brick"))
                .build();

        // Testowanie metod
        Optional<Block> foundBlock = wall.findBlockByColor("Green");
        if (foundBlock.isPresent()) {
            System.out.println("Found block with color Green: " + foundBlock.get());
        } else {
            System.out.println("No block found with color Green");
        }

        List<Block> foundBlocks = wall.findBlocksByMaterial("Wood");
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
