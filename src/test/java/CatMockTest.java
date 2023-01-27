import com.example.Cat;
import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;
import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class CatMockTest {
    @Mock
    Feline feline;

    @Test
    public void getFoodShouldReturnMockList() throws Exception {
        Cat cat = new Cat(feline);
        List<String> expectedMockList = List.of("Сухой корм", "Влажный корм");
        Mockito.when(feline.eatMeat()).thenReturn(List.of("Сухой корм", "Влажный корм"));
        List<String> actualMockList = cat.getFood();
        assertEquals(expectedMockList, actualMockList);
    }
}