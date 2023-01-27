import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import java.util.List;
import static org.junit.Assert.*;

public class LionTest {
    Feline feline = new Feline();

    @Test
    public void getKittensKittensCount1ShouldReturn1() throws Exception {
        Lion lion = new Lion("Самка", feline);
        int expected = 1;
        int actual = lion.getKittens();
        assertEquals(expected, actual);
    }

   @Test
    public void getFoodShouldReturnPredatorFoodList() throws Exception {
        Lion lion = new Lion("Самец", feline);
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        List<String> actualFood = lion.getFood();
        assertEquals(expectedFood, actualFood);
    }
}