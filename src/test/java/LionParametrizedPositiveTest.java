import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class LionParametrizedPositiveTest {
    private final String sex;
    private final boolean isHasMane;

    public LionParametrizedPositiveTest(String sex, boolean isHasMane) {
        this.sex = sex;
        this.isHasMane = isHasMane;
    }

    @Parameterized.Parameters
    public static Object[][] setLionSex() {
        return new Object[][] {
                {"Самец", true},
                {"Самка", false},
        };
    }

    @Test
    public void doesHaveManeCheckResult() throws Exception {

            Feline feline = new Feline();
            Lion lion = new Lion(sex, feline);

            assertEquals(isHasMane, lion.doesHaveMane());
    }
}