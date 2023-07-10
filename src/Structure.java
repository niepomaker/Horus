import java.util.List;
import java.util.Optional;

public interface Structure {
    // zwraca dowolny element o podanym kolorze
    Optional<Block> findBlockByColor(Color color);

    // zwraca wszystkie elementy z danego materiału
    List<Block> findBlocksByMaterial(Material material);

    //zwraca liczbę wszystkich elementów tworzących strukturę
    int count();

}
