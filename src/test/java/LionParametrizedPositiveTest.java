import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class LionParametrizedPositiveTest {
    private final String sex;

    public LionParametrizedPositiveTest(String sex) {
        this.sex = sex;
    }

    @Parameterized.Parameters
    public static Object[][] setLionSex() {
        return new Object[][] {
                {"Самец"},
                {"Самка"},
        };
    }

    @Test
    public void doesHaveManeCheckResult() throws Exception {

            Feline feline = new Feline();
            Lion lion = new Lion(sex, feline);
            if (sex.equals("Самец")) {
                assertTrue("Значение должно быть true", lion.doesHaveMane());
            } else if (sex.equals("Самка")) {
                assertFalse("Значение должно быть false", lion.doesHaveMane());
            }

    }
}