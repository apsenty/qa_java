import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import static org.junit.Assert.*;

public class LionExceptionTest {
    Feline feline = new Feline();

    @Test
    public void doesHaveManeCheckException() throws Exception {
        try {
            Lion lion = new Lion("sex", feline);
            assertTrue("Значение должно быть true", lion.doesHaveMane());

        } catch (Exception exception) {
            String expectedException = "Используйте допустимые значения пола животного - самец или самка";
            String actualException = exception.getMessage();
            assertEquals(expectedException, actualException);
        }
    }

}