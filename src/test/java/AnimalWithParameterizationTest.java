import com.example.Animal;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;

import static Constant.Constants.ANIMAL_EXCEPTION_MESSAGE;

@RunWith(Parameterized.class)
public class AnimalWithParameterizationTest {

    private final String animalKind;

    private final List<String> expectedFood;

    public AnimalWithParameterizationTest(String animalKind, List<String> expectedFood) {
        this.animalKind = animalKind;
        this.expectedFood = expectedFood;
    }

    @Parameterized.Parameters
    public static Object[][] getFoodData() {
        return new Object[][]{
                {"Травоядное", List.of("Трава", "Различные растения")},
                {"Хищник", List.of("Животные", "Птицы", "Рыба")},
                {"Зерги", null}
        };
    }

    @Test
    public void getFoodTest() throws Exception {
        Animal animal = new Animal();
        if (animalKind.equals("Травоядное") || animalKind.equals("Хищник")){
            Assert.assertEquals (expectedFood, animal.getFood(animalKind));
        }else{
            Exception exception = Assert.assertThrows(Exception.class, () -> animal.getFood(animalKind));
            Assert.assertEquals(exception.getMessage(), ANIMAL_EXCEPTION_MESSAGE);
        }
    }
}
