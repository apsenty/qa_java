import com.example.Animal;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.*;
import java.util.List;

@RunWith(Parameterized.class)
public class AnimalParametrizedPositiveTest {
    private final String animalKind;
    private final List<String> listOfFood;

    public AnimalParametrizedPositiveTest(String animalKind, List<String> listOfFood) {
        this.animalKind = animalKind;
        this.listOfFood = listOfFood;
    }

    @Parameterized.Parameters
    public static Object[][] setAnimalKind() {
        return new Object[][] {
                {"Травоядное", List.of("Трава", "Различные растения")},
                {"Хищник", List.of("Животные", "Птицы", "Рыба")},
        };
    }

    @Test
    public void getFoodCheckResult() throws Exception {
        Animal animal = new Animal();

        assertEquals(listOfFood, animal.getFood(animalKind));
    }
}