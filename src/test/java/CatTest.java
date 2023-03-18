import com.example.Cat;
import com.example.Feline;
import org.junit.Test;
import java.util.List;

import static org.junit.Assert.*;

public class CatTest {
    Feline feline = new Feline();
    Cat cat = new Cat(feline);

    @Test
    public void getSoundShowsValidResult() {
        String expected = "Мяу";
        String actual = cat.getSound();
        assertEquals(expected, actual);
    }

   @Test
    public void getFoodPredatorFoodShowsValidResult() throws Exception {
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        List<String> actual = cat.getFood();
        assertEquals(expected, actual);
    }
}