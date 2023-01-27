import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import static org.junit.Assert.*;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class LionMockTest {
    @Mock
    Feline feline;

    @Test
    public void getFoodShouldReturnMockListFood() throws Exception {
        Lion lion = new Lion("Самка", feline);
        List<String> expectedFood = List.of("Рыбка 1", "Рыбка 2");
        Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Рыбка 1", "Рыбка 2"));
        List<String> actualFood = lion.getFood();
        assertEquals(expectedFood, actualFood);
    }

    @Test
    public void getKittensShouldReturnMockKittens() throws Exception {
        Lion lion = new Lion("Самец", feline);
        int expectedKittens = 5;
        Mockito.when(feline.getKittens()).thenReturn(5);
        int actualKittens = lion.getKittens();
        assertEquals(expectedKittens, actualKittens);
    }
}