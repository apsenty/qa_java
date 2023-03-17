import com.example.Animal;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.*;
import java.util.List;

@RunWith(Parameterized.class)
public class AnimalParametrizedPositiveTest {
    private final String animalKind;

    public AnimalParametrizedPositiveTest(String animalKind) {
        this.animalKind = animalKind;
    }

    @Parameterized.Parameters
    public static Object[][] setAnimalKind() {
        return new Object[][] {
                {"Травоядное"},
                {"Хищник"},
        };
    }

    @Test
    public void getFoodCheckResult() throws Exception {
        Animal animal = new Animal();
        List<String> expectedHerbivoreFood = List.of("Трава", "Различные растения");
        List<String> expectedPredatorFood = List.of("Животные", "Птицы", "Рыба");

            List<String> actualAnimalFood = animal.getFood(animalKind);

            if (animalKind.equals("Травоядное")) {
                assertEquals(expectedHerbivoreFood, actualAnimalFood);
            } else if (animalKind.equals("Хищник")) {
                assertEquals(expectedPredatorFood, actualAnimalFood);
            }
    }
}