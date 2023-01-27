import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class LionParametrizedTest {
    private final String sex;

    public LionParametrizedTest(String sex) {
        this.sex = sex;
    }

    @Parameterized.Parameters
    public static Object[][] setLionSex() {
        return new Object[][] {
                {"Самец"},
                {"Самка"},
                {"Неизвестно"}
        };
    }

    @Test
    public void doesHaveManeCheckResultAndException() throws Exception {
        try {
            Feline feline = new Feline();
            Lion lion = new Lion(sex, feline);
            if (sex.equals("Самец")) {
                assertTrue("Значение должно быть true", lion.doesHaveMane());
            } else if (sex.equals("Самка")) {
                assertFalse("Значение должно быть false", lion.doesHaveMane());
            }
        } catch (Exception exception) {
            String expectedException = "Используйте допустимые значения пола животного - самец или самка";
            String actualException = exception.getMessage();
            assertEquals(expectedException, actualException);
        }
    }
}