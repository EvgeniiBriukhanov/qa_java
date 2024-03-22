import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    Feline feline = new Feline();
    Lion lion = new Lion(feline);


    @Test
    public void getKittensTest() {
        lion.getKittens();
        Assert.assertEquals(1, lion.getKittens());
    }

    @Test
    public void getFoodTest() throws Exception {
        lion.getFood();
        Assert.assertEquals(List.of("Животные", "Птицы", "Рыба"), lion.getFood());
    }
}