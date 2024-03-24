import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static Constant.Constants.LION_EXCEPTION_MESSAGE;
import static org.junit.Assert.assertEquals;


@RunWith(Parameterized.class)
public class LionWithParameterizationTest {

    private final String gender;

    private final boolean expectedGender;

    public LionWithParameterizationTest(String gender, boolean expectedGender) {
        this.gender = gender;
        this.expectedGender = expectedGender;
    }

    @Parameterized.Parameters (name = "Test data: {gender}, {expectedGender}")
    public static Object[][] getGenderData() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false},
                {"КотоПёс", true}
        };
    }

    @Test
    public void lionTest(){
        try {
            Feline feline = new Feline();
            Lion lion = new Lion(gender, feline);
            lion.doesHaveMane();
            Assert.assertEquals(expectedGender, lion.doesHaveMane());
        } catch (Exception e) {
            assertEquals(LION_EXCEPTION_MESSAGE, e.getMessage());

        }

    }

}