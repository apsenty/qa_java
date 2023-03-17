import com.example.Animal;
import org.junit.Test;
import java.util.List;
import static org.junit.Assert.*;

public class AnimalExceptionTest {
    Animal animal = new Animal();

    @Test
    public void getFoodCheckException() throws Exception {
        List<String> expectedPredatorFood = List.of("Животные", "Птицы", "Рыба");
        String expectedExceptionMessage = "Неизвестный вид животного, используйте значение Травоядное или Хищник";

        try {
            List<String> actualAnimalFood = animal.getFood("animalKind");
            assertEquals(expectedPredatorFood, actualAnimalFood);
        } catch (Exception exception) {
            String actualException = exception.getMessage();
            assertEquals(expectedExceptionMessage, actualException);
        }
    }
}