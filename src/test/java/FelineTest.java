import com.example.Feline;
import org.junit.Test;
import java.util.List;
import static org.junit.Assert.*;

public class FelineTest {
    Feline feline = new Feline();

    @Test
    public void eatMeatShouldReturnPredatorFoodList() throws Exception {
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        List<String> actualFood = feline.eatMeat();
        assertEquals(expectedFood,actualFood);
    }

    @Test
    public void getFamilyShouldReturnFelineFamily() {
        String expectedFamily = "Кошачьи";
        String actualFamily = feline.getFamily();
        assertEquals(expectedFamily, actualFamily);
    }

    @Test
    public void getKittensShouldReturnOne() {
        int expectedKittenCount = 1;
        int actualKittenCount = feline.getKittens();
        assertEquals(expectedKittenCount, actualKittenCount);
    }

    @Test
    public void getKittensKittensCountFiveReturnFive() {
        int expectedKittenCount = 5;
        int actualKittenCount = feline.getKittens(5);
        assertEquals(expectedKittenCount, actualKittenCount);
    }

}