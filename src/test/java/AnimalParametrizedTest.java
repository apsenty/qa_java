import com.example.Animal;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.*;

import java.util.List;

@RunWith(Parameterized.class)
public class AnimalParametrizedTest {
    private final String animalKind;

    public AnimalParametrizedTest(String animalKind) {
        this.animalKind = animalKind;
    }

    @Parameterized.Parameters
    public static Object[][] setAnimalKind() {
        return new Object[][] {
                {"Травоядное"},
                {"Хищник"},
                {"Всеядное"}
        };
    }

    @Test
    public void getFoodCheckResultAndException() throws Exception {
        Animal animal = new Animal();
        List<String> expectedHerbivoreFood = List.of("Трава", "Различные растения");
        List<String> expectedPredatorFood = List.of("Животные", "Птицы", "Рыба");
        String expectedExceptionMessage = "Неизвестный вид животного, используйте значение Травоядное или Хищник";

        try {
            List<String> actualAnimalFood = animal.getFood(animalKind);

            if (animalKind.equals("Травоядное")) {
                assertEquals(expectedHerbivoreFood, actualAnimalFood);
            } else if (animalKind.equals("Хищник")) {
                assertEquals(expectedPredatorFood, actualAnimalFood);
            }
        } catch (Exception exception) {
            String actualException = exception.getMessage();
            assertEquals(expectedExceptionMessage, actualException);
        }
    }
}